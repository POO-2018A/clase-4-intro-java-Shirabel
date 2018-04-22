/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
/**
 *
 * @author HOME USER
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = scan.nextInt();
        
        if(edad >=18){
        System.out.println("Eres mayor de edad");
        }else{
        System.out.println("Eres menor de edad");
        }
        
     
    }
    
}
