/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;

/**
 *
 * @author lunar
 */
public class rectangulo {
    
    private int base,altura,area;
    
    public rectangulo(int base, int altura){
       this.base = base;
       this.altura = altura;
    }
    
    public void Calculo_Area(){
        area = base * altura;
    }
    
    public void Resultado(){
        Calculo_Area();
        System.out.println("El resultado es: "+ area);
    }
}
