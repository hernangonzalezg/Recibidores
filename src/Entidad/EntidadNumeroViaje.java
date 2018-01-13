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
public class EntidadNumeroViaje {
    
    private int codigo;
    private int numero;

    public EntidadNumeroViaje() {
    }

    public EntidadNumeroViaje(int codigo, int numero) {
        this.codigo = codigo;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        String nro = "";
        nro = String.valueOf(numero);
        return nro;
    }    
    
}
