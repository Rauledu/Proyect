package polimorfismo;
import java.util.Scanner;


public abstract class Classpolimorfismo {
    
        protected int valor_uno, valor_dos, resultado;
        Scanner entrada = new Scanner(System.in);
        
        public void SolicitarDato(){
            System.out.print("Introduce el primer valor: ");
            valor_uno = entrada.nextInt();
            
            System.out.print("Introduce el segundo valor: ");
            valor_dos = entrada.nextInt();
        }
        
        public abstract void Operaciones();
        
        public void MostrarResultado(){
            System.out.print(resultado);
        }
        
    }
