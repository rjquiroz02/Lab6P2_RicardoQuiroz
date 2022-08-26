/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_ricardoquiroz;

import java.awt.Color;

/**
 *
 * @author rjqer
 */
public class Ropa extends Objeto{
    private String talla, tela, pais;

    public Ropa() {
    }

    public Ropa(String talla, String tela, String pais, Color color, String descripcion, String marca, String calidad, Persona persona, int tamano) {
        super(color, descripcion, marca, calidad, persona, tamano);
        this.talla = talla;
        this.tela = tela;
        this.pais = pais;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + "Ropa{" + "talla=" + talla + ", tela=" + tela + ", pais=" + pais + '}';
    }

    
    
    
    
}
