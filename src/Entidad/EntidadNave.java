/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author AxelFabianCarrenoMun
 */
public class EntidadNave {
    
    private String temporada;
    private int correlativo;
    private String codigonave;
    private String nombrenave;
    private int viaje;

    public EntidadNave() {
    }

    public EntidadNave(String temporada, int correlativo, String codigonave, String nombrenave, int viaje) {
        this.temporada = temporada;
        this.correlativo = correlativo;
        this.codigonave = codigonave;
        this.nombrenave = nombrenave;
        this.viaje = viaje;
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

    public int getViaje() {
        return viaje;
    }

    public void setViaje(int viaje) {
        this.viaje = viaje;
    }

    @Override
    public String toString(){
        String nro = "";
        nro = String.valueOf(correlativo);
        return nro + " - " + this.nombrenave;
    }    

}
