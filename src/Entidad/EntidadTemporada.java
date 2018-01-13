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
public class EntidadTemporada {
    
    private String temporada;
    private String descripcion;
    private String estado;

    public EntidadTemporada() {
    }

    public EntidadTemporada(String temporada, String descripcion, String estado) {
        this.temporada = temporada;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return this.descripcion;
    }
    
}
