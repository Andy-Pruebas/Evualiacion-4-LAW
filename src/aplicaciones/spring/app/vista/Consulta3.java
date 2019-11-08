package aplicaciones.spring.app.vista;

import aplicaciones.spring.app.db.AccesoDB;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class Consulta3 {
    public static void main(String[] args) {
        AccesoDB x=new AccesoDB();
        JdbcTemplate jdbc=x.Conexion();
        String sql="select job_title as cargo, AVG(min_salary+max_salary) as promedio from jobs group by job_title";
        List lista=jdbc.queryForList(sql);
        System.out.println("Promedio salario Cargo: "+lista);
    }
}
