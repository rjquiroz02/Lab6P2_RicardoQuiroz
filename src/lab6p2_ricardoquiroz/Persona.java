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
public class Persona {
    protected String id, nombre, ecivil, sexo;
    protected int edad, altura, peso;

    public Persona() {
    }

    public Persona(String id, String nombre, String ecivil, String sexo, int edad, int altura, int peso) {
        this.id = id;
        this.nombre = nombre;
        this.ecivil = ecivil;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEcivil() {
        return ecivil;
    }

    public void setEcivil(String ecivil) {
        this.ecivil = ecivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", ecivil=" + ecivil + ", sexo=" + sexo + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
    
    
    
}
