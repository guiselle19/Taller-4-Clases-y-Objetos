
package Punto7.Vista;

import Punto7.Modelo.Libro;
import java.util.Scanner;


public class PruebaBiblioteca {
    
     static Libro regisLibro[]= new Libro[5];
     static String tit;
     static String prin;
     static String segn;
     static String pria;
     static String isbn;
     static int pag;
     static String edi;
     static String ciu;
     static String pais;
     static String fecha;
     static String edit = "Prentice-Hall";
     static Scanner lector = new Scanner (System.in);
     
    static void registrarLibro(){
       for (int i=0; i<5; i++){
                 System.out.println("\nRegistro del libro "+(i+1));
                 System.out.println("Titulo:");
                 tit=lector.next();
                 System.out.println("Primer nombre del Autor:");
                 prin=lector.next();
                 System.out.println("Segundo nombre del Autor:");
                 segn=lector.next();
                 System.out.println("Primer apellido del Autor:");
                 pria=lector.next();
                 System.out.println("ISBN:");
                 isbn=lector.next();
                 System.out.println("Número de páginas:");
                 pag=lector.nextInt();
                 System.out.println("Edición:");
                 edi=lector.next();
                 System.out.println("Ciudad:");
                 ciu=lector.next();
                 System.out.println("País:");
                 pais=lector.next();
                 System.out.println("Fecha");
                 fecha=lector.next();
                 
                 
                 regisLibro[i]=new Libro(tit, prin, segn, pria, isbn, pag, edi, ciu, pais, fecha);   
             }   
    }
    
    
    static void mostrarLibros(){
        System.out.println("\nInforme de los Libros");
        for (int i=0; i<5; i++){
            System.out.println("\nDatos libro "+(i+1));
            System.out.println("Titulo: "+regisLibro[i].getTitulo());
            System.out.println(regisLibro[i].getEdi()+" edición");
            System.out.println("Autor: "+regisLibro[i].getPria()+", "+regisLibro[i].getPrin()+" "+regisLibro[i].getSegn());
            System.out.println("ISBN: "+regisLibro[i].getIsbn());
            System.out.println(regisLibro[i].editorial);
            System.out.println(regisLibro[i].getCiudad()+"("+regisLibro[i].getPais()+"),"+ regisLibro[i].getFecha());
            System.out.println(regisLibro[i].getPag()+" páginas");
            
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
        registrarLibro();
        mostrarLibros();
        
    }
    
   
}
