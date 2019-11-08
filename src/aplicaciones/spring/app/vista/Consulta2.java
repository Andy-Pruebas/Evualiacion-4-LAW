package aplicaciones.spring.app.vista;
import aplicaciones.spring.app.db.AccesoDB;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class Consulta2 {
    public static void main(String[] args) {
        AccesoDB x=new AccesoDB();
        JdbcTemplate jdbc=x.Conexion();
        String sql="select country_name, count(employee_id)from employees inner join country on depart.country_id=employees.country_id group by country_name";
        List lista=jdbc.queryForList(sql);
        System.out.println("Numero de empleados: "+lista);
    }
    
}
