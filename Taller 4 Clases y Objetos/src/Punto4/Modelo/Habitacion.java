
package Punto4.Modelo;


public class Habitacion {
    
    private int largo;
    private int ancho;
    private int altura;

    
    public Habitacion(){
        this.largo=25;
        this.ancho=15;
        this.altura=30;
    }
    
    
    public int getlargo(){
        return this.largo;
    }
    
    public int getancho(){
        return this.ancho;
    }
    
    public int getaltura(){
        return this.altura;
    }
    
    public void setlargo(int largo){
        this.largo = largo;
    }
    
    public void setancho(int ancho){
        this.ancho = ancho;
    }
    
    public void setaltura(int altura){
        this.altura = altura;
    }
    
    
    public int enchape(){
        return this.largo * this.ancho;
    }
    
    public int tapizParedes(){
        return 2*(this.altura*this.ancho) + 2 * (this.altura*this.largo);
    }
    
}
