
package Punto2.Vista;

import Punto2.Modelo.Cuenta;
import java.util.Scanner;

public class PruebaCuenta {
    
    
    static Scanner lector = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        int numcuenta;
        String nombre;
        double saldo;
        
        
        System.out.println("Ingrese número de cuenta: ");
        numcuenta=lector.nextInt();
        
        System.out.println("Ingrese nombre: ");
        nombre=lector.next();
            
        System.out.println("Ingrese saldo de la cuenta: ");
        saldo=lector.nextDouble();
        
        Cuenta a = new Cuenta(numcuenta, nombre, saldo);
        instanciacuenta(a);
       
    }

    
     
    public static void instanciacuenta(Cuenta c){
        
        int consig, retiro;
        
        System.out.println("Ingrese el valor a consignar:");
        consig = lector.nextInt();
        
        System.out.println("Ingrese el valor a retirar:");
        retiro = lector.nextInt();
        
        System.out.println("\nResultado de la transacción");
        System.out.println("Su número de Cuenta es: " + c.getNoCuenta());
        System.out.println("Su Nombre es: " + c.getNombreCliente());
        System.out.println("Su saldo es: " + c.getSaldo()+"\n");
        System.out.println("La consignación se efectuó de manera: "+ c.consignar(consig));
        System.out.println("El retiro se efectuó de manera: " + c.retirar(retiro));
        System.out.println("--------------------------------");
        
}
    
}
