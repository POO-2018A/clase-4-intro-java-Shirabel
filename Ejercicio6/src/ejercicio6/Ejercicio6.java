/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author HOME USER
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scan = new Scanner(System.in);
         
         boolean EstaLloviendo = true;
         boolean EstaNevando = true;
         
         System.out.println("Ingrese a que temperatura estamos");
         
         double Temperatura = scan.nextDouble();
         System.out.println("la temperatura es: "+Temperatura+"grados");
         
         if(EstaLloviendo && EstaNevando && Temperatura<=10){
             
             System.out.println("Esta nevando o lloviendo");
             System.out.println("Nos quedamos en casa!");
         
         }else{
         
             System.out.println("Vamos afuera");
         }
         
         
    }
    
}
