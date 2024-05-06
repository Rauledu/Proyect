/*
    Clase para funciones logicas de una lavadora

*/
package llfunciones;

public class LLfunciones {
    
    private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;
    
    
    public LLfunciones(int kilos, int TipoDeRopa){
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    }
    
    private void Llenado(){//metodo para llenado
        if (kilos <= 12){
            llenadoCompleto = 1;
            System.out.println("Llenando.....");
            System.out.println("Llenado completo.");
        }else{
            System.out.println("La carga es muy pesada, por favor reduce la carga");
        }
    }
    
    private void Lavado(){ //metodo para lavado
        Llenado();
        if(llenadoCompleto == 1){
            if(TipoDeRopa == 1){
                System.out.println("Ropa blanca / Lavado suave.");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else if(TipoDeRopa == 2){
                System.out.println("Ropa de color / lavado intenso.");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else{
                System.out.println("El tipo de ropa no esta disponible.");
                System.out.println("se lavara como ropa de color / Lavado intenso.");
                lavadoCompleto =1;
            }
        }
    }
    private  void Secado(){//metodo para secado
        Lavado();
        if(lavadoCompleto == 1){
            System.out.println("Secando....");
            secadoCompleto = 1;
        }
    }
     public void CicloFinalizado(){ //metodo de finalizado.
         Secado();
         if(secadoCompleto == 1){
             
             System.out.println("Tu ropa esta lista!.");
         }
     }
    
}
