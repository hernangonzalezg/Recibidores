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
public class EntidadGastos {
    
    private String temporada;
    private String codigorec;
    private String codigogges;
    private String codigogasto;
    private String nombregasto;

    public EntidadGastos() {
    }

    public EntidadGastos(String temporada, String codigorec, String codigogges, String codigogasto, String nombregasto) {
        this.temporada = temporada;
        this.codigorec = codigorec;
        this.codigogges = codigogges;
        this.codigogasto = codigogasto;
        this.nombregasto = nombregasto;
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

    public String getCodigogges() {
        return codigogges;
    }

    public void setCodigogges(String codigogges) {
        this.codigogges = codigogges;
    }

    public String getCodigogasto() {
        return codigogasto;
    }

    public void setCodigogasto(String codigogasto) {
        this.codigogasto = codigogasto;
    }

    public String getNombregasto() {
        return nombregasto;
    }

    public void setNombregasto(String nombregasto) {
        this.nombregasto = nombregasto;
    }
       
}
