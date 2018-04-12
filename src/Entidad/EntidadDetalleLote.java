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
public class EntidadDetalleLote {
    
    private String Temporada;
    private String Recibidor;
    private int Nliquidacion;
    private String Gastogenerico;
    private String Gasto;
    private int Vparidad;
    private int Vgasto;

    public EntidadDetalleLote() {
    }

    public EntidadDetalleLote(String Temporada, String Recibidor, int Nliquidacion, String Gastogenerico, String Gasto, int Vparidad, int Vgasto) {
        this.Temporada = Temporada;
        this.Recibidor = Recibidor;
        this.Nliquidacion = Nliquidacion;
        this.Gastogenerico = Gastogenerico;
        this.Gasto = Gasto;
        this.Vparidad = Vparidad;
        this.Vgasto = Vgasto;
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

    public String getGastogenerico() {
        return Gastogenerico;
    }

    public void setGastogenerico(String Gastogenerico) {
        this.Gastogenerico = Gastogenerico;
    }

    public String getGasto() {
        return Gasto;
    }

    public void setGasto(String Gasto) {
        this.Gasto = Gasto;
    }

    public int getVparidad() {
        return Vparidad;
    }

    public void setVparidad(int Vparidad) {
        this.Vparidad = Vparidad;
    }

    public int getVgasto() {
        return Vgasto;
    }

    public void setVgasto(int Vgasto) {
        this.Vgasto = Vgasto;
    }
    
    
}
