package co.grandcircus.SpringAPIProject.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PriceRanges {
	private Double min;
	private Double max;
	
	public PriceRanges() {
		super();
	}

	public PriceRanges(Double min, Double max) {
		super();
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
	
	
}
