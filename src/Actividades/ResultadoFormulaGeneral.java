package Actividades;

import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResultadoFormulaGeneral {

    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un a :"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un b :"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un c :"));
        BeanFactory beanf;
        beanf=new ClassPathXmlApplicationContext("Actividades/contexto.xml");
        FormulaGeneral formgen = beanf.getBean("formgen",FormulaGeneral.class);
        List<Double> raices = formgen.raiz(a, b, c);
        JOptionPane.showMessageDialog(null, "Raices: " + raices.get(0) + " " + raices.get(1));
    }
    
}
