package co.grandcircus.SpringAPIProject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.SpringAPIProject.pojos.BucketList;


public interface BucketListRepo extends JpaRepository<BucketList, Integer>  {

}
