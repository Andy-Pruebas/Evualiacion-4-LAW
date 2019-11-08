package aplicaciones.spring.app.vista;
import aplicaciones.spring.app.db.AccesoDB;
import org.springframework.jdbc.core.JdbcTemplate;

public class Consulta1 {
    public static void main(String[] args) {
        AccesoDB x=new AccesoDB();
        JdbcTemplate jdbc=x.Conexion();
        String sql="select count(employee_id) from employees";
        int num=jdbc.queryForObject(sql, Integer.class);
        System.out.println("Numero de Empleados: "+num);
    }
    
}
