//package conneectAndResponse;
//
//
//
//
//import oracle.jdbc.datasource.OracleDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//
//@Configuration
//@Profile("oracle")
//public class OracleConfiguration {
//
//    @Bean
//    public DataSource dataSource() throws SQLException {
//
//        OracleDataSource dataSource = new OracleDataSource();
//        dataSource.setUser("hr");
//        dataSource.setPassword("HR");
//        dataSource.setURL("jdbc:oracle:thin:@//localhost:1521/xe");
//        dataSource.setImplicitCachingEnabled(true);
//        dataSource.setFastConnectionFailoverEnabled(true);
//        dataSource.setImplicitCachingEnabled(true);
//        dataSource.setConnectionCachingEnabled(true);
//        return dataSource;
//    }
//
//
//}