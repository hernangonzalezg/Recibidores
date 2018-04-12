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
public class EntidadLiquidacionLote {

    private String Temporada;
    private String Recibidor;
    private int Nliquidacion;
    private int Nlote;

    public EntidadLiquidacionLote() {
    }

    public EntidadLiquidacionLote(String Temporada, String Recibidor, int Nliquidacion, int Nlote) {
        this.Temporada = Temporada;
        this.Recibidor = Recibidor;
        this.Nliquidacion = Nliquidacion;
        this.Nlote = Nlote;
    }

    public String getTemporada() {
        return Temporada;
    }

    public void setTemporada(String Temporada) {
        this.Temporada = Temporada;
    }

    public String getRecibidor() {
        return Recibidor;
    }

    public void setRecibidor(String Recibidor) {
        this.Recibidor = Recibidor;
    }

    public int getNliquidacion() {
        return Nliquidacion;
    }

    public void setNliquidacion(int Nliquidacion) {
        this.Nliquidacion = Nliquidacion;
    }

    public int getNlote() {
        return Nlote;
    }

    public void setNlote(int Nlote) {
        this.Nlote = Nlote;
    }
    
    
    
}
