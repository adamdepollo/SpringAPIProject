package co.grandcircus.SpringAPIProject.pojos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FirstLayerVenue {
	
	private ArrayList<Venue> venues;

	public FirstLayerVenue() {
		super();
	}

	public FirstLayerVenue(ArrayList<Venue> venues) {
		super();
		this.venues = venues;
	}

	public ArrayList<Venue> getVenues() {
		return venues;
	}

	public void setVenues(ArrayList<Venue> venues) {
		this.venues = venues;
	}
	
	
	
}
