
package suma;


public class Suma {
    
        private int vUno, vDos, Resultado;
        
        public Suma(int Valor1, int Valor2){
            this.vUno= Valor1;
            this.vDos= Valor2;
            /*Cuando se utiliza POO, podemos acceder a 
            variables que se encuentran en otras clases
            
            solo es posible si creamos una instancia entre las clases.
            La instancia de clases, es cuando se hace que dos clases interactuen entre si 
            
            esto se logra utilizando la palabra this ya que nos va a indicar 
            si se estan utilizando variables de instancia o variables de la clase
            
            desde el cual estamos accediendo.
            */
        }
        
        public void Operacion(){
            Resultado = vUno + vDos;
        }
        public void Imprimir(){
            Operacion();
            System.out.println("El resultado de la suma es :" + Resultado);
        }
    
}
