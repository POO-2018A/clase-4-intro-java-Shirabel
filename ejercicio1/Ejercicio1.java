/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1;

/**
 *
 * @author HP
 */
 
import java.util.Date;
import java.util.GregorianCalendar;
 
public class Ejercicio1 {
    
    /**
     * @param args the command line arguments
     */
     
    private String nombre;
    private String modo;
    private Date fecha;
    private String texto;
     
    public Ejercicio1(String nombre, int año, int mes, int dia){
        this.nombre=nombre;
        
        GregorianCalendar  calendario = new GregorianCalendar (año, mes-1, dia);
        fecha=calendario.getTime();
    }
     
    public Ejercicio1(String nombre, String tipo, int año, int mes, int dia){
        this.nombre=nombre;
        this.modo=modo;
        GregorianCalendar  calendario = new GregorianCalendar (año, mes-1, dia);
        fecha=calendario.getTime();
    }
     
    public Ejercicio1(String nombre, String tipo, int año, int mes, int dia, String contenido){
        this.nombre=nombre;
        this.modo=modo;
        GregorianCalendar  calendario = new GregorianCalendar (año, mes-1, dia);
        fecha=calendario.getTime();
        this.texto=texto;
    }
     
    public String getNombre(){
        return "Nombre del documento: "+nombre;
    }
    public String getTipo(){
        return "Tipo de archivo: "+modo;
    }
     
    public String getFechaCreacion(){
        return "Fecha de ultima modificacion: "+fecha;
    }
     
    public void setContenido(String contenido){
        this.texto=texto;
    }
    public String getContenido(){
        return "Texto: "+texto;
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ejercicio1 objeto1 = new Ejercicio1("Repaso",2018,05,07);
        System.out.println("Deber_Archivo_Clase_Atributos");
        System.out.println("Objeto 1");
        System.out.println();
        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getFechaCreacion());
         
        Ejercicio1 objeto2 = new Ejercicio1("Repaso en clase",27,02,2005);
        System.out.println("Objeto 2");
        System.out.println();
        System.out.println(objeto2.getNombre());
        System.out.println(objeto2.getTipo());
        System.out.println(objeto2.getFechaCreacion());
         
        Ejercicio1 objeto3 = new Ejercicio1("Deber",20,05,2017);
        System.out.println("Objeto 3");
        System.out.println();
        objeto3.setContenido("Siempre Sonrie");
        System.out.println(objeto3.getNombre());
        System.out.println(objeto3.getTipo());
        System.out.println(objeto3.getContenido());
        System.out.println(objeto3.getFechaCreacion());
         
    }
     
}
