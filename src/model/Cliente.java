/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lcsan
 */
public class Cliente extends Persona {
    private String Empresa;
    private String dirTrabajo;
    private String nHijos;
    private String Cargo;

    public Cliente() {
        super();
        this.Empresa = Empresa;
        this.dirTrabajo = dirTrabajo;
        this.nHijos = nHijos;
        this.Cargo = Cargo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getDirTrabajo() {
        return dirTrabajo;
    }

    public void setDirTrabajo(String dirTrabajo) {
        this.dirTrabajo = dirTrabajo;
    }

    public String getnHijos() {
        return nHijos;
    }

    public void setnHijos(String nHijos) {
        this.nHijos = nHijos;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
}
