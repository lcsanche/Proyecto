package model;

import creacional.Persona;

public class Empleado extends Persona{
    private String dirDomicilio;
    private String estCivil;
    private String telTrabajo;
    private String Cargo;

    
    public Empleado(){
        super();
        this.dirDomicilio = dirDomicilio;
        this.estCivil = estCivil;
        this.telTrabajo = telTrabajo;
        this.Cargo = Cargo;
    }

    public String getDirDomicilio() {
        return dirDomicilio;
    }

    public void setDirDomicilio(String dirDomicilio) {
        this.dirDomicilio = dirDomicilio;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getTelTrabajo() {
        return telTrabajo;
    }

    public void setTelTrabajo(String telTrabajo) {
        this.telTrabajo = telTrabajo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    
}
