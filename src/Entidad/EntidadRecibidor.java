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
public class EntidadRecibidor {

    private String temporada;
    private String codigorec;
    private String nombre;

    public EntidadRecibidor() {
    }

    public EntidadRecibidor(String temporada, String codigorec, String nombre) {
        this.temporada = temporada;
        this.codigorec = codigorec;
        this.nombre = nombre;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getCodigorec() {
        return codigorec;
    }

    public void setCodigorec(String codigorec) {
        this.codigorec = codigorec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return this.codigorec + " - " + this.nombre;
    }
    
}
