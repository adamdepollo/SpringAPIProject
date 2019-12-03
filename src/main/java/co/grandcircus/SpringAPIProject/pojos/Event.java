package co.grandcircus.SpringAPIProject.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Event {

	private String url;
	private String name;
}
