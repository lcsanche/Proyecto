package model;

public class Persona {
    protected String Nombre;
    protected String Cedula;
    protected String nCelular;
    protected String Email;
    protected String dirDomicilio;
    protected String estCivil;
    protected String telTrabajo;

    public Persona() {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.nCelular = nCelular;
        this.Email = Email;
        this.dirDomicilio = dirDomicilio;
        this.estCivil = estCivil;
        this.telTrabajo = telTrabajo;
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

    public String getnCelular() {
        return nCelular;
    }

    public void setnCelular(String nCelular) {
        this.nCelular = nCelular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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
    
    
    
    
}
