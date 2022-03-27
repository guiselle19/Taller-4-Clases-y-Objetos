
package Punto4.Vista;

import Punto4.Modelo.Habitacion;


public class PruebaHabitacion {
    
    
    public static void main(String[] args) {
        
       
        Habitacion hab = new Habitacion();
        imprimirHabitacion(hab);
       
    }
    
    public static void  imprimirHabitacion(Habitacion h){
        
        System.out.println("Largo: " + h.getlargo() + " Metros");
        System.out.println("Ancho: " +h.getancho() + " Metros");
        System.out.println("Alto: " + h.getaltura() + " Metros");
        System.out.println("Enchape: " + h.enchape()+" metros cuadrados");
        System.out.println("Tapizado: " + h.tapizParedes()+" metros cuadrados");
        
    }
}
