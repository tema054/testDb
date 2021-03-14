package conneectAndResponse.repository;

import conneectAndResponse.entity.Regions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public interface CrudRepo extends CrudRepository <Regions,Integer> {

    @Query("select count(*) from Regions")
    String dual();
}
