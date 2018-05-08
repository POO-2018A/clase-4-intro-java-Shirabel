/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
import java.util.Date;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
       
/**
 *
 * @author HP
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String cedula;
    
    public Persona (){
    this.nombre ="anonimo";
    
    }
    
    public Persona (String nombre){
    this.nombre=nombre;
    }
    
    public Persona (String nombre, String apellido){
    this.nombre=nombre;
    this.apellido=apellido;
    }
    
    public Persona (String nombre, String apellido, Date fechaNacimiento){
    this.nombre=nombre;
    this.apellido=apellido;
    this.fechaNacimiento=fechaNacimiento;
    }
    
    //getters
    
    public String getNombre(){
    return this.nombre;
    }
    
    public String getApellido(){
    return this.apellido;
    }
    
    public Date getFechaNacimiento(){
    return this.fechaNacimiento;
    }
    
    //setters
    
    public void setNonmbre(String nombre){
    this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
    this.apellido=apellido;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
    this.fechaNacimiento=fechaNacimiento;
    }
    
    public void setCedula(String cedula){
        if(cedulaValida(cedula)){
        this.cedula=cedula;
        }else{
            System.out.println("cedula no valida");
        }
    }
    
    //privados
    
    private boolean cedulaValida (String cedula){
         int dig1;
          int multiplicador1;
          int dig2;
          int multiplicador2;
          int dig3;
          int multiplicador3;
          int dig4;
          int multiplicador4;
          int dig5;
          int multiplicador5;
          int dig6;
          int multiplicador6;
          int dig7;
          int multiplicador7;
          int dig8;
          int multiplicador8;
          int dig9;
          int multiplicador9;
          int suma = 0;
          int verificacion;
          int igual;
          
          char E;
          int contador = 0;
          boolean cadena = false;
          
          if (cedula.length() == 10 ){
              for (int i = 0; i < cedula.length(); i++){
                E = cedula.charAt(i);
                if(Character.isDigit(E)){
                contador++;
                    }
                if(contador == 10){
                dig1 =Integer.valueOf(cedula.substring(0, 1));
                dig2 =Integer.valueOf(cedula.substring(1, 2));
                dig3 =Integer.valueOf(cedula.substring(2, 3));
                dig4 =Integer.valueOf(cedula.substring(3, 4));
                dig5 =Integer.valueOf(cedula.substring(4, 5));
                dig6 =Integer.valueOf(cedula.substring(5, 6));
                dig7 =Integer.valueOf(cedula.substring(6, 7));
                dig8 =Integer.valueOf(cedula.substring(7, 8));
                dig9 =Integer.valueOf(cedula.substring(8, 9));
                
                verificacion = Integer.valueOf(cedula.substring(9, 10));
                
                if(dig3 < 6){
                    multiplicador1 = dig1 * 2;
                    if(multiplicador1 >= 10){
                        multiplicador1 -= 9;
                          }
                 
                    multiplicador2 = dig2 * 1;
                    if(multiplicador2 >= 10){
                        multiplicador2 -= 9;
                          }
                    
                    multiplicador3 = dig3 * 2;
                    if(multiplicador3 >= 10){
                        multiplicador3 -= 9;
                          }
                    
                    multiplicador4 = dig4 * 1;
                    if(multiplicador4 >= 10){
                        multiplicador4 -= 9;
                          }
                    
                    multiplicador5 = dig5 * 2;
                    if(multiplicador5 >= 10){
                        multiplicador5 -= 9;
                          }
                    
                    multiplicador6 = dig6 * 1;
                    if(multiplicador6 >= 10){
                        multiplicador6 -= 9;
                          }
                    
                    multiplicador7 = dig7 * 2;
                    if(multiplicador7 >= 10){
                        multiplicador7 -= 9;
                          }
                    
                    multiplicador8 = dig8 * 1;
                    if(multiplicador8 >= 10){
                        multiplicador8 -= 9;
                          }
                    
                    multiplicador9 = dig9 * 2;
                    if(multiplicador9 >= 10){
                        multiplicador9 -= 9;
                          }
                    
                suma = multiplicador1 + multiplicador2 + multiplicador3 + multiplicador4 + multiplicador5 + multiplicador6 + multiplicador7 + multiplicador8 + multiplicador9;      
                igual = suma % 10;
                    if(igual == 0){
                        if(igual == verificacion){
                         cadena = true;
                            } else {
                            cadena = false;
                                }
                        
                        } else{
                            igual = 10 - igual;
                            if(igual == verificacion){
                                cadena = true;
                                        } else{
                                            cadena = false;
                                            }
                                }
                
                    } else {
                        if(dig3 == 7 || dig3 == 0){
                            cadena = false;
                                } else {
                            
                            if(dig3 == 6){
                                } else {
                                    if (dig3 == 9){
                                        }
                                    } 
                                }
                            }
                
                    }else {
                        cadena = false;
                        }
                } 
            }else {
                        cadena = false;
                        }
          
          return cadena;
        
    //return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p=new Persona();
        System.out.println("el nombre de p es:"+p.nombre);
        
       p.apellido="Bonilla";
       p.nombre="Shira";
       p.fechaNacimiento =new Date("1995/07/26");
        System.out.println("el nombre de p es:"+p.nombre);
        
      Persona p1=new Persona("Bell");
        System.out.println("el nombre de p1 es: "+p1.nombre);
        System.out.println("el nombre de p es:"+p.nombre);
        
        p.nombre =p.nombre + "Shira";
        System.out.println("el nombre plus es:"+p.nombre);
        
        
        
        p.setCedula("1725199010");
        System.out.println("Cedula;"+p.cedula);
       
    }
    
}
