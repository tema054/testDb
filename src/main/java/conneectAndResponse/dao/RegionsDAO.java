package conneectAndResponse.dao;

import conneectAndResponse.entity.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;


@Repository
public interface RegionsDAO extends JpaRepository<Regions,Integer> {

    @Query("select count(*) from Regions")
    String dual();
}
