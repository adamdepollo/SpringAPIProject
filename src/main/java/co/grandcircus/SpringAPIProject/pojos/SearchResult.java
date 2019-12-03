package co.grandcircus.SpringAPIProject.pojos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SearchResult {

	private ArrayList<Event> _embedded;
	
	public SearchResult() {
		super();
	}

	public SearchResult(ArrayList<Event> _embedded) {
		super();
		this._embedded = _embedded;
	}

	public ArrayList<Event> get_embedded() {
		return _embedded;
	}

	public void set_embedded(ArrayList<Event> _embedded) {
		this._embedded = _embedded;
	}
	
	
}
