
package lavadora_1;
import Libreria.LLfunciones;
import java.util.Scanner;

public class lavadora_1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("La ropa es blanca o de color");
        System.out.println("Presiona 1-ropa blanca / 2- ropa de color");
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("Cuantos kilos de ropa");
        int kilos = entrada.nextInt();
        
        LLfunciones mensajero = new LLfunciones(kilos, TipoDeRopa);
        mensajero.setTipoDeRopa(2);
        System.out.println("El tipo de ropa es: "+ mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();
    }
}
