package co.grandcircus.SpringAPIProject.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="events")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Event {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer event_id;
	
	private String id;
	private String url;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PriceRanges[] priceRanges;
	
	
	public Event() {
		super();
	}


	public Event(String id, String url, String name, PriceRanges[] priceRanges) {
		super();
		this.id = id;
		this.url = url;
		this.name = name;
		this.priceRanges = priceRanges;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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
