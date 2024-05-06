package main;
import operaciones.Clasehija_suma;
import operaciones.Clasehija_resta;

public class ClaseMain {
    public static void main(String[] args) {
        
       Clasehija_suma suma = new Clasehija_suma();
       suma.SolicitarDatos();
       suma.Sumar();
       System.out.println("El resultado de la suma:");
       suma.MostrarResultado();
       
       Clasehija_resta resta = new Clasehija_resta();
       resta.SolicitarDatos();
       resta.Restar();
       System.out.print("El resultado de la resta es: ");
       resta.MostrarResultado();
       
    }
}
