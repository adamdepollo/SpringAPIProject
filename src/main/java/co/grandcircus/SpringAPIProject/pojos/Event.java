package co.grandcircus.SpringAPIProject.pojos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Event {

	private String url;
	private String name;
	private ArrayList<PriceRanges> priceRanges;
	
	
	public Event(String url, String name, ArrayList<PriceRanges> priceRanges) {
		super();
		this.url = url;
		this.name = name;
		this.priceRanges = priceRanges;
	}
	public ArrayList<PriceRanges> getPriceRanges() {
		return priceRanges;
	}
	public void setPriceRanges(ArrayList<PriceRanges> priceRanges) {
		this.priceRanges = priceRanges;
	}
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
