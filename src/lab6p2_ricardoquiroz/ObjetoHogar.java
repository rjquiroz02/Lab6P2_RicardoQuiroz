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
public class ObjetoHogar extends Objeto{
    private String desclugar, instrucciones, tiempogarantia;

    public ObjetoHogar() {
    }

    public ObjetoHogar(String desclugar, String instrucciones, String tiempogarantia, Color color, String descripcion, String marca, String calidad, Persona persona, int tamano) {
        super(color, descripcion, marca, calidad, persona, tamano);
        this.desclugar = desclugar;
        this.instrucciones = instrucciones;
        this.tiempogarantia = tiempogarantia;
    }

    public String getDesclugar() {
        return desclugar;
    }

    public void setDesclugar(String desclugar) {
        this.desclugar = desclugar;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getTiempogarantia() {
        return tiempogarantia;
    }

    public void setTiempogarantia(String tiempogarantia) {
        this.tiempogarantia = tiempogarantia;
    }

    @Override
    public String toString() {
        return super.toString() + "ObjetoHogar{" + "desclugar=" + desclugar + ", instrucciones=" + instrucciones + ", tiempogarantia=" + tiempogarantia + '}';
    }
    
    
    
    
    
    
    
}
