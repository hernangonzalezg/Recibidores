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
public class EntidadOv {
   
    private String temporada;
    private int numeroov;

    public EntidadOv() {
    }

    public EntidadOv(String temporada, int numeroov) {
        this.temporada = temporada;
        this.numeroov = numeroov;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getNumeroov() {
        return numeroov;
    }

    public void setNumeroov(int numeroov) {
        this.numeroov = numeroov;
    }

    @Override
    public String toString(){
        String nro = "";
        nro = String.valueOf(numeroov);
        return nro;
    }       
}
