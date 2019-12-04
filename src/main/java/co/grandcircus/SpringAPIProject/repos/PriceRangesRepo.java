package co.grandcircus.SpringAPIProject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.SpringAPIProject.pojos.PriceRanges;

public interface PriceRangesRepo extends JpaRepository<PriceRanges, Integer>{

}
