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
public class Gerente extends Persona{
    private String usuario, contrasena, cargo;

    public Gerente() {
    }

    public Gerente(String usuario, String contrasena, String cargo, String id, String nombre, String ecivil, String sexo, int edad, int altura, int peso) {
        super(id, nombre, ecivil, sexo, edad, altura, peso);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "usuario=" + usuario + ", contrasena=" + contrasena + ", cargo=" + cargo + '}';
    }
    
    
    
    
    
}
