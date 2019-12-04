package co.grandcircus.SpringAPIProject.pojos;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SQLEvent {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	
	private String url;
	
	private String name;
	
	private PriceRanges[] priceRanges;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public SQLEvent(Integer id, String url, String name, PriceRanges[] priceRanges) {
		super();
		this.id = id;
		this.url = url;
		this.name = name;
		this.priceRanges = priceRanges;
	}
	public SQLEvent(String url, String name, PriceRanges[] priceRanges) {
		super();
		this.url = url;
		this.name = name;
		this.priceRanges = priceRanges;
	}
	public SQLEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SQLEvent [id=" + id + ", url=" + url + ", name=" + name + ", priceRanges="
				+ Arrays.toString(priceRanges) + "]";
	}
	
	
	
	
	
}
