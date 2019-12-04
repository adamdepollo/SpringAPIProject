package co.grandcircus.SpringAPIProject.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventResults {
	
	@JsonProperty("_embedded")
	FirstLayer emb;

	public FirstLayer getEmb() {
		return emb;
	}

	public void setEmb(FirstLayer emb) {
		this.emb = emb;
	}

	public EventResults(FirstLayer emb) {
		super();
		this.emb = emb;
	}

	public EventResults() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EventResults [emb=" + emb + "]";
	}

	

	

}
