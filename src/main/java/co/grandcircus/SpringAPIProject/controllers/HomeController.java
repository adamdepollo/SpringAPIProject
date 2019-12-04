package co.grandcircus.SpringAPIProject.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.SpringAPIProject.pojos.EventResults;
import co.grandcircus.SpringAPIProject.pojos.FirstLayer;

@Controller
public class HomeController {

	@Value("${ticketmaster.key}")
	String ticketmasterKey;

	RestTemplate rt = new RestTemplate();

	@RequestMapping("/")
	public ModelAndView homePage() {

		String url = "https://app.ticketmaster.com/discovery/v2/events.json?countryCode=US&apikey=" + ticketmasterKey;

		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "test");

		ResponseEntity<EventResults> response = rt.exchange(url, HttpMethod.GET,
				new HttpEntity<String>("parameters", headers), EventResults.class);
		FirstLayer fl = response.getBody().getEmb();
		return new ModelAndView("index", "t", fl.getEvents());

	}
	@RequestMapping("/search")
	public ModelAndView search() {
		
		
		return new ModelAndView("search");
	}
}
