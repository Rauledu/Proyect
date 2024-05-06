package polimorfismo;

public class suma_clasehija extends Classpolimorfismo {
    
    @Override //le estamos indicando  que se va a sobre escribir el metodo...
    public void Operaciones(){
      resultado = valor_uno + valor_dos;
      
    }
}
