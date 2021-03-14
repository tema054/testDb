package conneectAndResponse.service;


import conneectAndResponse.repository.JpaRepo;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;


@Service

public class ServiceData {
//



    @Autowired
    JpaRepo jpaRepo;

    public String getDual(){
        System.out.println("Request");
        //String string = .toString();
     //   System.out.println("Response  " + jdbcTemplate.queryForObject("select count(*) from regions",Integer.class));
        System.out.println(jpaRepo.count());
        return "string";

    }


}
