package conneectAndResponse.service;


import conneectAndResponse.repository.CrudRepo;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;


@Service
@AllArgsConstructor

public class ServiceData {
    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate ;
    @Autowired
    CrudRepo crudRepo;

    public String getDual(){
        System.out.println("Request");
        String string = jdbcTemplate.queryForObject("select count(*) from regions",Integer.class).toString();
        System.out.println("Response  " + string);
        System.out.println(crudRepo.count());
        return string;
    }
}
