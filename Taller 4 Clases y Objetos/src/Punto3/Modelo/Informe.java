
package Punto3.Modelo;


public class Informe {
    
    
    private int [] informemensu;
    private int meses;
    private int pos;
    
    
    public Informe(int meses){
        informemensu = new int [meses];
    }

   
    
    
    

    /**
     * @return the informemensu
     */
    public int[] getInformemensu() {
        return informemensu;
    }

    /**
     * @param informemensu the informemensu to set
     */
    public void setInformemensu(int[] informemensu) {
        this.informemensu = informemensu;
    }

    /**
     * @return the meses
     */
    public int getMeses() {
        return meses;
    }

    /**
     * @param meses the meses to set
     */
    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    
    /**
     * @return the pos
     */
    public int getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(int pos) {
        this.pos = pos;
    }
    
    
    public void agregar(int ventas){
        
        for(int i=0; i<12; i++){
            informemensu[i] = ventas;
        }
        
       }
    
    public int promVentas() {
    
        int suma = 0;
        int prom = 0;
        
        for (int i = 0; i<12; i++ ){
        
        suma = suma + getInformemensu()[i];  
     } 
        prom = suma / 12; 
        return prom;
     
    }
    
    
    public int menosVentas(){
        
        int menor=informemensu[11], posmenor=0;
        
        for (int i=0; i<12; i++){
            
         if (getInformemensu()[i]<menor){
                
             menor = getInformemensu()[i];
             posmenor=i;
            }
        }
        return posmenor;
    }
    
    
    public int masVentas(){
        
        
        int mayor=100, posmayor=0;
        
        for (int i=0; i<12; i++){
            
         if (getInformemensu()[i]>mayor){
                
             mayor = getInformemensu()[i];
             posmayor=i;
            }
        }
        return posmayor;
        
    }
    
    
    
    public int acumVentas() {
    
        int suma = 0;
        
        for (int i = 0; i<12; i++ ){
        
        suma = suma + getInformemensu()[i];  
     } 
         
        return suma;
     
    }

    
       
}
