
package Punto5.Modelo;


public class Isosceles {
    private double base;
    private double altura;
    
    public Isosceles(double base, double altura){
        
        this.base=base;
        this.altura=altura;
       
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
     public double ladosIguales(){
         
        double b=getBase()/2;
        
        double b2=b*b;
        double a2=getAltura()*getAltura();
        
        double c2=a2+b2;
        
        double lado = Math.sqrt(c2);
        
        return lado;
        
    }
    
    public double calcularArea(){
     //((getBase()*Math.sqrt((ladosIguales()*ladosIguales())) - ((getBase()*getBase())/4)))/2;
    double area = (getBase()*getAltura())/2;
    return area;
    }
    
  
    
    public double calcularPerimetro(){
        double perimetro = 2*ladosIguales()+getBase();
        return perimetro;
    }
    
}
