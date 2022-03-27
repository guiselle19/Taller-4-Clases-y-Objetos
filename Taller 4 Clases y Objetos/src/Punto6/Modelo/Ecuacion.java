
package Punto6.Modelo;


public class Ecuacion {
    private int a;
    private int b;
    private int c;
    
    
    public Ecuacion(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
  
    public int getA(){
        return this.a;
    }
    
    public int getB(){
        return this.b;
    }
    
    public int getC(){
        return this.c;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public void setB(int b){
        this.b=b;
    }
    
    public void setC(int c){
        this.c=c;
    }
    
    public void imprimirecuacion(int a, int b, int c,int x){
        System.out.println(a+"*("+x+" elevado a la 2) + "+b+"*"+x+" + "+c+" = 0");
    }
    public double evaluarEcuacion(int x){
        
        double y = this.a * Math.pow(x, 2) + this.b*x + this.c;
        return y;
        
    }
}
