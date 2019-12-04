package co.grandcircus.SpringAPIProject.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="price_ranges")
@JsonIgnoreProperties(ignoreUnknown=true)
public class PriceRanges {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Double min;
	private Double max;
	
	@ManyToOne
	private Event eventAssigned;
	
	public PriceRanges() {
		super();
	}

	public PriceRanges(Integer id, Double min, Double max) {
		super();
		this.id = id;
		this.min = min;
		this.max = max;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Event getEventAssigned() {
		return eventAssigned;
	}

	public void setEventAssigned(Event eventAssigned) {
		this.eventAssigned = eventAssigned;
	}
	
	
	
	
}
