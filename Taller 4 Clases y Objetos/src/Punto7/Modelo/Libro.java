
package Punto7.Modelo;


public class Libro {
    private String titulo;
    private String prin;
    private String segn;
    private String pria;
    private String isbn;
    private int pag;
    private String edi;
    private String ciudad;
    private String pais;
    private String fecha;
    public String editorial = "Prentice-Hall";
    
    public Libro(String titulo, String prin, String segn, String pria, String isbn, int pag, String edi, String ciudad, String pais, String fecha ){
        this.titulo=titulo;
        this.prin=prin;
        this.segn=segn;
        this.pria=pria;
        this.isbn=isbn;
        this.pag=pag;
        this.edi=edi;
        this.ciudad=ciudad;
        this.pais=pais;
        this.fecha=fecha;
        this.editorial="Prentice-Hall";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrin() {
        return prin;
    }

    public void setPrin(String prin) {
        this.prin = prin;
    }

    public String getSegn() {
        return segn;
    }

    public void setSegn(String segn) {
        this.segn = segn;
    }

    public String getPria() {
        return pria;
    }

    public void setPria(String pria) {
        this.pria = pria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public String getEdi() {
        return edi;
    }

    public void setEdi(String edi) {
        this.edi = edi;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
    
    
}

