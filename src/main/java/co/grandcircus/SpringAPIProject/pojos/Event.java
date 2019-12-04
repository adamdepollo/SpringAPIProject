package co.grandcircus.SpringAPIProject.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "eventAssigned", orphanRemoval = true)
	private List<PriceRanges> priceRanges;
	
	
	public Event() {
		super();
	}


	public Event(Integer event_id, String id, String url, String name, ArrayList<PriceRanges> priceRanges) {
		super();
		this.event_id = event_id;
		this.id = id;
		this.url = url;
		this.name = name;
		this.priceRanges = priceRanges;
	}


	public Integer getEvent_id() {
		return event_id;
	}


	public void setEvent_id(Integer event_id) {
		this.event_id = event_id;
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


	public List<PriceRanges> getPriceRanges() {
		return priceRanges;
	}


	public void setPriceRanges(List<PriceRanges> priceRanges) {
		this.priceRanges = priceRanges;
	}
	
	
	
}
