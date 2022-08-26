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
public class Zapato extends Objeto{
    private int talla, comodidad;
    private String descsuela;

    public Zapato() {
    }

    public Zapato(int talla, int comodidad, String descsuela, Color color, String descripcion, String marca, String calidad, Persona persona, int tamano) {
        super(color, descripcion, marca, calidad, persona, tamano);
        this.talla = talla;
        this.comodidad = comodidad;
        this.descsuela = descsuela;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    public String getDescsuela() {
        return descsuela;
    }

    public void setDescsuela(String descsuela) {
        this.descsuela = descsuela;
    }

    @Override
    public String toString() {
        return super.toString() + "Zapato{" + "talla=" + talla + ", comodidad=" + comodidad + ", descsuela=" + descsuela + '}';
    }
    
    
    
    
}
