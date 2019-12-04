package co.grandcircus.SpringAPIProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.SpringAPIProject.pojos.Event;
import co.grandcircus.SpringAPIProject.pojos.EventResults;
import co.grandcircus.SpringAPIProject.pojos.FirstLayer;
import co.grandcircus.SpringAPIProject.pojos.FirstLayerVenue;
import co.grandcircus.SpringAPIProject.pojos.VenueResults;
import co.grandcircus.SpringAPIProject.repos.EventRepo;

@Controller
public class HomeController {

	@Value("${ticketmaster.key}")
	String ticketmasterKey;

	RestTemplate rt = new RestTemplate();
	
	@Autowired
	EventRepo er;

	@RequestMapping("/search")
	public ModelAndView search() {
		return new ModelAndView("search");
	}

	@RequestMapping("/search-event")
	public ModelAndView searchResults(String name, String city) {
		String url;
		if (name == null) {
			url = "https://app.ticketmaster.com/discovery/v2/events.json?city=" + city + "&countryCode=US&apikey="
					+ ticketmasterKey;

		} else if (city == null) {
			url = "https://app.ticketmaster.com/discovery/v2/events.json?keyword=" + name + "&countryCode=US&apikey="
					+ ticketmasterKey;

		} else {
			url = "https://app.ticketmaster.com/discovery/v2/events.json?keyword=" + name + "&city=" + city
					+ "&countryCode=US&apikey=" + ticketmasterKey;

		}
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "test");

		ResponseEntity<EventResults> response = rt.exchange(url, HttpMethod.GET,
				new HttpEntity<String>("parameters", headers), EventResults.class);
		FirstLayer fl = response.getBody().getEmb();

		return new ModelAndView("results", "t", fl.getEvents());
	}

	@RequestMapping("/search-venue")
	public ModelAndView searchVenue(String venue) {
		String url = "https://app.ticketmaster.com/discovery/v2/venues.json?keyword=" + venue
				+ "&countryCode=US&apikey=" + ticketmasterKey;
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "test");

		ResponseEntity<VenueResults> response = rt.exchange(url, HttpMethod.GET,
				new HttpEntity<String>("parameters", headers), VenueResults.class);
		FirstLayerVenue fl = response.getBody().getEmb();

		return new ModelAndView("venue-results", "t", fl.getVenues());
	}

	@RequestMapping("/search-event-at-venue")
	public ModelAndView searchVenueEvents(String venueId) {
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?venueId=" + venueId
				+ "&countryCode=US&apikey=" + ticketmasterKey;
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "test");

		ResponseEntity<EventResults> response = rt.exchange(url, HttpMethod.GET,
				new HttpEntity<String>("parameters", headers), EventResults.class);
		FirstLayer fl = response.getBody().getEmb();

		return new ModelAndView("results", "t", fl.getEvents());
	}
	
	@RequestMapping("/save-event")
	public ModelAndView saveEvent(Event e) {
		er.save(e);
		return new ModelAndView("bucketlist", "events", er.findAll());
	}
	
	@RequestMapping("/delete-event")
	public ModelAndView deleteEvent(Event e) {
		er.deleteById(e.getId());
		return new ModelAndView("bucketlist", "events", er.findAll());
	}
}
