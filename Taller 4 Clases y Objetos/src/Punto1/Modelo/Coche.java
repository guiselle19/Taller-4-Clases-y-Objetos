
package Punto1.Modelo;


public class Coche {
    
    
    private String color;
    private String marca;
    private int modelo;
    private int numcaballos;
    private int numpuertas;
    private String matricula;
    
    //Constructor por default
    public Coche(){
        this.color="Verde";
        this.marca="Kia";
        this.modelo=2010;
        this.numcaballos=260;
        this.numpuertas=4;
        this.matricula="JKL-122";
    }
    
    //Constructor Sobrecargado 1 
    public Coche(String color, String marca, int modelo, String matricula, int numcaballos){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        this.numcaballos=numcaballos;
        this.numpuertas=4;
    }
    
    //Constructor Sobrecargado 2
    public Coche(String color, String marca, int modelo){
        
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.numcaballos=100;
        this.numpuertas=2;
        this.matricula="QWE-789";
        
    }
    
    //Constructor sobrecargado 3
    public Coche(int numcaballos, int numpuertas){
        
        this.color="Negro";
        this.marca="Ford";
        this.modelo=2005;
        this.numcaballos=numcaballos;
        this.numpuertas=numpuertas;
        this.matricula="JKL-147";
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the numcaballos
     */
    public int getNumcaballos() {
        return numcaballos;
    }

    /**
     * @param numcaballos the numcaballos to set
     */
    public void setNumcaballos(int numcaballos) {
        this.numcaballos = numcaballos;
    }

    /**
     * @return the numpuertas
     */
    public int getNumpuertas() {
        return numpuertas;
    }

    /**
     * @param numpuertas the numpuertas to set
     */
    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
}
