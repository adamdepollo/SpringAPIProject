package co.grandcircus.SpringAPIProject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.SpringAPIProject.pojos.Event;

public interface EventRepo extends JpaRepository<Event, Integer>{
	Event findById(String id);

}
