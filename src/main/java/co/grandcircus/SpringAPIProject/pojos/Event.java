package co.grandcircus.SpringAPIProject.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Event {

	private String url;
	private String name;
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Event(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Event [url=" + url + ", name=" + name + "]";
	}
	
	
}
