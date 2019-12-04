package co.grandcircus.SpringAPIProject.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VenueResults {
	
	@JsonProperty("_embedded")
	private FirstLayerVenue emb;

	public FirstLayerVenue getEmb() {
		return emb;
	}

	public void setEmb(FirstLayerVenue emb) {
		this.emb = emb;
	}

	public VenueResults(FirstLayerVenue emb) {
		super();
		this.emb = emb;
	}

	public VenueResults() {
		super();
		// TODO Auto-generated constructor stub
	}

}
