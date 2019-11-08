package Actividades;

import javax.swing.JOptionPane;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Resultado {
    
    public static void main(String[] args) {
        long factorial=1;
        int numero;
        String tempo;
        tempo=JOptionPane.showInputDialog("Ingrese un numero :");
        numero= Integer.parseInt(tempo);
        
        BeanFactory beanf;
        beanf=new ClassPathXmlApplicationContext("Actividades/contexto.xml");
        Factorial fact=beanf.getBean("fact",Factorial.class);
        int facto=fact.calcular(numero, factorial);
        JOptionPane.showMessageDialog(null,"El Factorial de : "+numero+" es :"+facto);
    }
    
}
