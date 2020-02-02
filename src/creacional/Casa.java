/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional;

import decorator.Acabado;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Karina Ortega - Luis Sánchez - Jocelyn Chicaiza
 */
public class Casa {
     private int m2;
     private int numPisos;
     private boolean esEsquinera;
     private String orientacion;
     private String patio;
     private int numHabitaciones;
     private int numBanos;
     private List<Acabado> acabados;
     private float precio;
     
     public Casa(){this.acabados = new LinkedList<>();
}

    public Casa(int m2, int numPisos, boolean esEsquinera, String orientacion, String patio, int numHabitaciones, int numBanos) {
        this.acabados = new LinkedList<>();
        this.m2 = m2;
        this.numPisos = numPisos;
        this.esEsquinera = esEsquinera;
        this.orientacion = orientacion;
        this.patio = patio;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }
    
    public int getM2() {
        return m2;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public boolean isEsEsquinera() {
        return esEsquinera;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public String getPatio() {
        return patio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public void setEsEsquinera(boolean esEsquinera) {
        this.esEsquinera = esEsquinera;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    public LinkedList<Acabado> getAcabados() {
        return (LinkedList<Acabado>) acabados;
    }

    public float getPrecio() {
        return precio;
    }

    public void setAcabados(List<Acabado> acabados) {
        this.acabados = acabados;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
     
     
}
