package conneectAndResponse.repository;

import conneectAndResponse.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface JpaRepo extends JpaRepository<Regions,Integer> {

    @Query("select count(*) from Regions")
    String dual();
}
