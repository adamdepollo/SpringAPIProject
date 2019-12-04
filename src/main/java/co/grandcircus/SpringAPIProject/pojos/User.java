package co.grandcircus.SpringAPIProject.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String username;
	
	@OneToOne
	private BucketList bl;
	
	public User() {
		super();
	}

	public User(Integer id, String username, BucketList bl) {
		super();
		this.id = id;
		this.username = username;
		this.bl = bl;
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

	public BucketList getBl() {
		return bl;
	}

	public void setBl(BucketList bl) {
		this.bl = bl;
	}
	
}
