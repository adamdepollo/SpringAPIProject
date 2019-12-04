package co.grandcircus.SpringAPIProject.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Event {

	private String url;
	private String name;
	private PriceRanges[] priceRanges;
	
	
	public Event() {
		super();
	}


	public Event(String url, String name, PriceRanges[] priceRanges) {
		super();
		this.url = url;
		this.name = name;
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


	public PriceRanges[] getPriceRanges() {
		return priceRanges;
	}


	public void setPriceRanges(PriceRanges[] priceRanges) {
		this.priceRanges = priceRanges;
	}
	
	
	
	
}
