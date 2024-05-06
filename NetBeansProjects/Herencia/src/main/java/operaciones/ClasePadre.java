
package operaciones;
import java.util.Scanner;

public class ClasePadre {
    protected int valor_uno, valor_dos, resultado;
    Scanner entrada = new Scanner(System.in);
    //Este metodo solicita los valores al usuario
    public void SolicitarDatos(){
        System.out.print("Introduce el primer valor: ");
        valor_uno = entrada.nextInt();
        
        System.out.print("Introduce el segundo valor: ");
        valor_dos = entrada.nextInt();       
    }
    
    //Este metodo muestra el resultado
    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
