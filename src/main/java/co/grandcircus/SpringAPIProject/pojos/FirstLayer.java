package co.grandcircus.SpringAPIProject.pojos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FirstLayer {
	
	ArrayList<Event>events;
	
}
