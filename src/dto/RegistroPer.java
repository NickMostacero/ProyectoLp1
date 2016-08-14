/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Tupac
 */
public class RegistroPer {
    
    int idpersona;
    String Nombre;
    String Apellido;
    int Edad;
    int NumCel;
    String Correo;
    String Cargo;

    public RegistroPer() {
    }

    public RegistroPer(String Nombre, String Apellido, int Edad, int NumCel, String Correo, String Cargo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.NumCel = NumCel;
        this.Correo = Correo;
        this.Cargo = Cargo;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getNumCel() {
        return NumCel;
    }

    public void setNumCel(int NumCel) {
        this.NumCel = NumCel;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
    
}
