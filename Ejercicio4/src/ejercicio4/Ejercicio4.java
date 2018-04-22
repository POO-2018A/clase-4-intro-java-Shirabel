/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;
/**
 *
 * @author HOME USER
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        
        double numero = scan.nextDouble();
        
        if(numero%2 ==0 ){
        System.out.println("El numero es par");
        }else{
        System.out.println("El numero es impar");
        }
        
        //
    }
    
}
