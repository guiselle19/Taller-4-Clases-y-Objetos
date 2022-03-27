
package Punto2.Modelo;


public class Cuenta {
    
    private int noCuenta;
    private String nombreCliente;
    private double saldo;
    
    
    public Cuenta(int noCuenta, String nombreCliente, double saldo){
        
        this.noCuenta=noCuenta;
        this.nombreCliente=nombreCliente;
        this.saldo=saldo; 
        
    }
                
    
    /**
     * @return the noCuenta
     */
    
    
    public int getNoCuenta() {
        return noCuenta;
    }

    /**
     * @param noCuenta the noCuenta to set
     */
    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    public  boolean consignar (double monto){
        boolean c;
        if (monto<this.saldo){
            c=true;   
        }else{
            c=false;
        }  
         return c;   
    }
    
    
    public boolean retirar (double monto){

    boolean r;
    
        if (monto<this.saldo){
            r=true;
        }else{
            r=false;
        }
        return r;
    }
}

