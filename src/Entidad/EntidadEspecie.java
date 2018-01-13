/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author hgonzalez
 */
public class EntidadEspecie {
    
    private String temporada;
    private String codigoesp;
    private String descripcion;

    public EntidadEspecie() {
    }

    public EntidadEspecie(String temporada, String codigoesp, String descripcion) {
        this.temporada = temporada;
        this.codigoesp = codigoesp;
        this.descripcion = descripcion;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getCodigoesp() {
        return codigoesp;
    }

    public void setCodigoesp(String codigoesp) {
        this.codigoesp = codigoesp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
    @Override
    public String toString(){
        return this.descripcion;
    }
}
