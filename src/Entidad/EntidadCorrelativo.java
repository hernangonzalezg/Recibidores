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
public class EntidadCorrelativo {
    
    private String temporada;
    private int correlativo;
    private String codigonave;
    private String nombrenave;

    public EntidadCorrelativo() {
    }

    public EntidadCorrelativo(String temporada, int correlativo, String codigonave, String nombrenave) {
        this.temporada = temporada;
        this.correlativo = correlativo;
        this.codigonave = codigonave;
        this.nombrenave = nombrenave;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }

    public String getCodigonave() {
        return codigonave;
    }

    public void setCodigonave(String codigonave) {
        this.codigonave = codigonave;
    }

    public String getNombrenave() {
        return nombrenave;
    }

    public void setNombrenave(String nombrenave) {
        this.nombrenave = nombrenave;
    }
    
    @Override
    public String toString(){
        return this.nombrenave;
    }
}
