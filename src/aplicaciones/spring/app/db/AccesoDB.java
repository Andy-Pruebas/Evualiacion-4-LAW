package aplicaciones.spring.app.db;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AccesoDB {
    public JdbcTemplate jdbctemplate;
    public JdbcTemplate Conexion(){
        DriverManagerDataSource datasource=new DriverManagerDataSource();
        datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        datasource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        datasource.setUsername("hr");
        datasource.setPassword("hr");
        jdbctemplate= new JdbcTemplate(datasource);
        return jdbctemplate;
    }
}