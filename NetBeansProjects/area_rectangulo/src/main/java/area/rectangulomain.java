/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;
 import java.util.Scanner;
/**
 *
 * @author lunar
 */
public class rectangulomain {
    public static void main(String[]args){
    
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Dame el valor de la base: ");
        int base = entrada.nextInt();
        
        System.out.print("Dame el valor de la altura: ");
        int altura = entrada.nextInt();
        
        rectangulo mensajero = new rectangulo(base, altura);
        mensajero.Resultado();
    }
}
