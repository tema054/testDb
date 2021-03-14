package conneectAndResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
@EnableJpaAuditing

public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
