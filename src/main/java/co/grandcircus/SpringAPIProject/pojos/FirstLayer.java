package co.grandcircus.SpringAPIProject.pojos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FirstLayer {
	
	ArrayList<Event>events;

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	public FirstLayer(ArrayList<Event> events) {
		super();
		this.events = events;
	}

	public FirstLayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FirstLayer [events=" + events + "]";
	}
	
}
