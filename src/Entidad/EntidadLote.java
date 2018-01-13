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
public class EntidadLote {
        
    private String temporada;
    private int correlativo;
    private int numeroov;
    private int nunerolote;
    private String recibidor;
    private String especie;
    private String grupo;
    private String subgrupo;
    private String variedad;
    private String peso;
    private String dimension;
    private String tipoenvase;
    private String categoria;
    private String embalaje;
    private String etiqueta;
    private String condicion;
    private String tipofrio;
    private String calibre;
    private int cajas;

    public EntidadLote() {
    }

    public EntidadLote(String temporada, int correlativo, int numeroov, int nunerolote, String recibidor, String especie, String grupo, String subgrupo, String variedad, String peso, String dimension, String tipoenvase, String categoria, String embalaje, String etiqueta, String condicion, String tipofrio, String calibre, int cajas) {
        this.temporada = temporada;
        this.correlativo = correlativo;
        this.numeroov = numeroov;
        this.nunerolote = nunerolote;
        this.recibidor = recibidor;
        this.especie = especie;
        this.grupo = grupo;
        this.subgrupo = subgrupo;
        this.variedad = variedad;
        this.peso = peso;
        this.dimension = dimension;
        this.tipoenvase = tipoenvase;
        this.categoria = categoria;
        this.embalaje = embalaje;
        this.etiqueta = etiqueta;
        this.condicion = condicion;
        this.tipofrio = tipofrio;
        this.calibre = calibre;
        this.cajas = cajas;
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

    public int getNumeroov() {
        return numeroov;
    }

    public void setNumeroov(int numeroov) {
        this.numeroov = numeroov;
    }

    public int getNunerolote() {
        return nunerolote;
    }

    public void setNunerolote(int nunerolote) {
        this.nunerolote = nunerolote;
    }

    public String getRecibidor() {
        return recibidor;
    }

    public void setRecibidor(String recibidor) {
        this.recibidor = recibidor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSubgrupo() {
        return subgrupo;
    }

    public void setSubgrupo(String subgrupo) {
        this.subgrupo = subgrupo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getTipoenvase() {
        return tipoenvase;
    }

    public void setTipoenvase(String tipoenvase) {
        this.tipoenvase = tipoenvase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmbalaje() {
        return embalaje;
    }

    public void setEmbalaje(String embalaje) {
        this.embalaje = embalaje;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getTipofrio() {
        return tipofrio;
    }

    public void setTipofrio(String tipofrio) {
        this.tipofrio = tipofrio;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public int getCajas() {
        return cajas;
    }

    public void setCajas(int cajas) {
        this.cajas = cajas;
    }

 
    
}
