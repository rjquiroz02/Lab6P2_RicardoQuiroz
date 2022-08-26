/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_ricardoquiroz;

/**
 *
 * @author rjqer
 */
public class Personalg extends Persona{
    private String ocupacion, horario;
    private int ttrabajando, sueldo;

    public Personalg() {
    }

    public Personalg(String ocupacion, String horario, int ttrabajando, int sueldo, String id, String nombre, String ecivil, String sexo, int edad, int altura, int peso) {
        super(id, nombre, ecivil, sexo, edad, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.ttrabajando = ttrabajando;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTtrabajando() {
        return ttrabajando;
    }

    public void setTtrabajando(int ttrabajando) {
        this.ttrabajando = ttrabajando;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Personalg{" + "ocupacion=" + ocupacion + ", horario=" + horario + ", ttrabajando=" + ttrabajando + ", sueldo=" + sueldo + '}';
    }
    
    
    
    
    
    
}
