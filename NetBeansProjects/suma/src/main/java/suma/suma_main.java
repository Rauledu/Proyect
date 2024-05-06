
package suma;

import java.util.Scanner;



public class suma_main {
    
    
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el primer valor: ");
        int Valor1 = entrada.nextInt();
        
        System.out.println("Dame el segundo valor: ");
        int Valor2 = entrada.nextInt();
        
        Suma valores = new Suma(Valor1, Valor2);
        valores.Imprimir();
        
    }
    
}
