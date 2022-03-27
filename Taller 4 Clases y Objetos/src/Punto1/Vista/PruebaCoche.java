
package Punto1.Vista;

import Punto1.Modelo.Coche;


public class PruebaCoche {
    
    public static void main(String[] args) {
        
        
        //coche 1
        Coche a = new Coche();
        imprimirCoches(a);
        
        
        
        //coche 2
        Coche b = new Coche("Fucsia","Aveo",2006,"TJI-256",1200);
        imprimirCoches(b);
        
        
        
        b.setColor("Rojo Carmesí");
        b.setMarca("Renault");
        System.out.print("Luego de 3 años\n\n");
        imprimirCoches(b);
        
        
        b.setColor("Azul");
        System.out.println("Luego de 10 años\n\n");
        
        imprimirCoches(b);
        
        //Coche 3
        Coche c= new Coche("Morado","Ford",2004);
        imprimirCoches(c);
        
        
        c.setColor("Amarillo");
        System.out.print("Luego de 5 años\n\n");
        imprimirCoches(c);
        
        c.setColor("Rosado");
        System.out.print("Luego de 10 años\n\n");
        imprimirCoches(c);
        
        // Coche 4
        Coche d= new Coche(156,2);
        imprimirCoches(d);  
        
    }
    
          
        public static void imprimirCoches(Coche c){
        System.out.println("Color: " + c.getColor());
        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: "+ c.getModelo());
        System.out.println("Número de caballos: " + c.getNumcaballos());
        System.out.println("Número de puertas: "+c.getNumpuertas());
        System.out.println("Matricula: " + c.getMatricula());
        System.out.println("--------------------------------");
        
    }
    }

