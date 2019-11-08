package Actividades;
public class Factorial {
      
    public int calcular(int numero, long factorial){
        for(int i = numero; i>0 ; i--){
            factorial= factorial * i;
        }
        return (int) factorial;
    }
}
