package co.grandcircus.SpringAPIProject.pojos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SecondLayer {

	private ArrayList<Venue> venues;
	
	public SecondLayer() {
		super();
	}

	public SecondLayer(ArrayList<Venue> venues) {
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
