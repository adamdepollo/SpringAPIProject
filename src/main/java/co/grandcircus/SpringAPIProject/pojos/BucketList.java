package co.grandcircus.SpringAPIProject.pojos;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bucket_lists")
public class BucketList {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	private User userAssigned;
	
	private ArrayList<Event> bucketList;
	
	public BucketList() {
		super();
	}

	public BucketList(User userAssigned, ArrayList<Event> bucketList) {
		super();
		this.userAssigned = userAssigned;
		this.bucketList = bucketList;
	}

	public User getUserAssigned() {
		return userAssigned;
	}

	public void setUserAssigned(User userAssigned) {
		this.userAssigned = userAssigned;
	}

	public ArrayList<Event> getBucketList() {
		return bucketList;
	}

	public void setBucketList(ArrayList<Event> bucketList) {
		this.bucketList = bucketList;
	}
	
	
}
