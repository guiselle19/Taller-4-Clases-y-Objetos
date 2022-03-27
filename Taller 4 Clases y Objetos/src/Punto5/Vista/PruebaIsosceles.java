
package Punto5.Vista;

import Punto5.Modelo.Isosceles;


public class PruebaIsosceles {
    public static void main(String[] args) {
        Isosceles triangulo = new Isosceles(10,12);
        
        datosTriangulo(triangulo);

     
    }
    
    public static void datosTriangulo(Isosceles i){
        
    
        System.out.println("\nDatos Triágulo Isosceles");
        System.out.println("Base: " + i.getBase() + " cm");
        System.out.println("Altura: " + i.getAltura() + " cm");
        System.out.println("Lados: " + i.ladosIguales() + " cm");
        System.out.println("Area: " + i.calcularArea() + " Centimetros Cuadrados");
        System.out.println("Perimetro: " + i.calcularPerimetro() + " cm");
    }
}
