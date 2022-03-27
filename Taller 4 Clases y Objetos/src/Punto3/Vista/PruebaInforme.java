
package Punto3.Vista;

import Punto3.Modelo.Informe;

public class PruebaInforme {
    
    public static void main(String[] args) {
        
    
    
    Informe inf = new Informe (12);
    
    int [] infmensu = new int [12];
    
    infmensu[0]=100;
    infmensu[1]=200;
    infmensu[2]=300;
    infmensu[3]=400;
    infmensu[4]=500;
    infmensu[5]=600;
    infmensu[6]=700;
    infmensu[7]=800;
    infmensu[8]=900;
    infmensu[9]=1000;
    infmensu[10]=1100;
    infmensu[11]=1200;
    
    
    
    for (int i=0; i<12; i++){
        
    inf.agregar(infmensu[i]);
    
        System.out.println(infmensu[i]);
    }
    
    System.out.println("EL promedio de ventas del año fue de: " + inf.promVentas());
    System.out.println("El mes de menor ventas fue el mes número: " + inf.menosVentas());
    System.out.println("El mes de menor ventas fue el mes número: " + inf.masVentas());
    System.out.println("El acumulado de ventas del año fue de: " + inf.acumVentas());
    }
    
    
}
