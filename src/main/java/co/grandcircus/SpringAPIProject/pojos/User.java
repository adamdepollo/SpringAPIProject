package co.grandcircus.SpringAPIProject.pojos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String username;

	@ManyToMany
	@JoinTable(name = "bucketlist", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "event_id"))
	Set<SQLEvent> bucketlist;

	public User() {
		super();
	}

	public User(Integer id, String username, Set<SQLEvent> bucketlist) {
		super();
		this.id = id;
		this.username = username;
		this.bucketlist = bucketlist;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<SQLEvent> getBucketlist() {
		return bucketlist;
	}

	public void setBucketlist(Set<SQLEvent> bucketlist) {
		this.bucketlist = bucketlist;
	}

	

}
