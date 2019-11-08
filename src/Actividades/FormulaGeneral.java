package Actividades;

import java.util.ArrayList;
import java.util.List;

public class FormulaGeneral {
    public List<Double> raiz(double a, double b, double c){
        double r1 = (-b+Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
        double r2 = (-b-Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
        List<Double> list = new ArrayList<>();
        list.add(r1);
        list.add(r2);
        return list;
    }
}
