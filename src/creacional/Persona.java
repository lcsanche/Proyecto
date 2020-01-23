/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional;

/**
 *
 * @author Hp
 */
public class Persona {
    protected String user;
    protected String password;
    protected String Nombre;
    protected String Cedula;
    protected String Email;
    protected String nCelular;
    

    public Persona() {
        this.user = user;
        this.password = password;
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.nCelular = nCelular;
        this.Email = Email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getnCelular() {
        return nCelular;
    }

    public void setnCelular(String nCelular) {
        this.nCelular = nCelular;
    }

    
}