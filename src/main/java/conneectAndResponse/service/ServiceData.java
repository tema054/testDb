package conneectAndResponse.service;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import lombok.extern.java.Log;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Log
@Service
public class ServiceData {

    private JdbcTemplate jdbcTemplate;
    public String getTime() {

        RestTemplate restTemplate = new RestTemplate();
        String time = this.jdbcTemplate.queryForObject("SELECT SYSDATE FROM DUAL", String.class);
        return time;
    }
}
