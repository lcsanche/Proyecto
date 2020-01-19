/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional;

import model.Orientacion;
import model.TipoPatio;

/**
 *
 * @author Karina Ortega - Luis Sánchez - Jocelyn Chicaiza
 */
public class Casa {
     public float m2;
     public int numPisos;
     public boolean esEsquinera;
     public Orientacion orientacion;
     public TipoPatio patio;
     public int numHabitaciones;
     public int numBanos;
     
     public Casa(){}

    public Casa(float m2, int numPisos, boolean esEsquinera, Orientacion orientacion, TipoPatio patio, int numHabitaciones, int numBanos) {
        this.m2 = m2;
        this.numPisos = numPisos;
        this.esEsquinera = esEsquinera;
        this.orientacion = orientacion;
        this.patio = patio;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    public float getM2() {
        return m2;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public boolean isEsEsquinera() {
        return esEsquinera;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public TipoPatio getPatio() {
        return patio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public void setEsEsquinera(boolean esEsquinera) {
        this.esEsquinera = esEsquinera;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public void setPatio(TipoPatio patio) {
        this.patio = patio;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }
     
     
}
