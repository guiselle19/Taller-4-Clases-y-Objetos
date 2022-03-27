
package Punto6.Vista;

import Punto6.Modelo.Ecuacion;
import java.util.Scanner;


public class PruebaEcuacion {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese valor para x=");
        int x = entrada.nextInt();
        
        Ecuacion a = new Ecuacion(6,3,4);
        
        a.imprimirecuacion(6, 3, 4, x);
       
        System.out.printf("Y(%d) = %.2f%n", x, a.evaluarEcuacion(x));
        
     
    }
}
