
package polimorfismo;

public class Class_Main {
    public static void main(String[] args){
        
        Classpolimorfismo mensajero_suma = new suma_clasehija();
        mensajero_suma.SolicitarDato();
        mensajero_suma.Operaciones();
        mensajero_suma.MostrarResultado();
        
        Classpolimorfismo mensajero_resta = new resta_Clasehija();
        mensajero_resta.SolicitarDato();
        mensajero_resta.Operaciones();
        mensajero_resta.MostrarResultado();
        
        
        
    }
}
