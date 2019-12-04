package co.grandcircus.SpringAPIProject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.SpringAPIProject.pojos.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}
