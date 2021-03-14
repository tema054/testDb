package conneectAndResponse.service;


import conneectAndResponse.dao.RegionsDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ServiceData {
    @Autowired
    RegionsDAO regionsDAO;

    public String getDual(){
        System.out.println("Request");
        //String string = .toString();
     //   System.out.println("Response  " + jdbcTemplate.queryForObject("select count(*) from regions",Integer.class));
        System.out.println(regionsDAO.count());
        return "string";

    }


}
