package conneectAndResponse.service;


import conneectAndResponse.repository.CrudRepo;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.SQLException;


@Service
@AllArgsConstructor

public class ServiceData {
//
    JdbcTemplate jdbcTemplate ;

    CrudRepo crudRepo;

    public String getDual(){
        System.out.println("Request");
        //String string = .toString();
     //   System.out.println("Response  " + jdbcTemplate.queryForObject("select count(*) from regions",Integer.class));
        System.out.println(crudRepo.count());
        return "string";

    }


}
