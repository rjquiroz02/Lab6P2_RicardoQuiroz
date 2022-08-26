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
public class Objeto {
    protected Color color;
    protected String descripcion, marca, calidad;
    protected Persona persona;
    protected int tamano;

    public Objeto() {
    }

    public Objeto(Color color, String descripcion, String marca, String calidad, Persona persona, int tamano) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.calidad = calidad;
        this.persona = persona;
        this.tamano = tamano;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Objeto{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", calidad=" + calidad + ", persona=" + persona + ", tamano=" + tamano + '}';
    }
    
    
    
    
}
