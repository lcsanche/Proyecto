/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import model.Orientacion;
import model.TipoPatio;

/**
 *
 * @author Karina Ortega - Luis Sánchez - Jocelyn Chicaiza
 */
public class CasaOasisBuilder extends CasaBuilder{
    
    @Override
    public void definir_m2() {
        casa.setM2(110);
    }

    @Override
    public void definir_numPisos() { 
        casa.setNumPisos(2);
    }

    @Override
    public void indicar_esEsquinera() {
        casa.setEsEsquinera(false);
    }

    @Override
    public void indicar_orientacion() {
        casa.setOrientacion(Orientacion.SUR);
    }

    @Override
    public void indicar_tamanioPatio() {
        casa.setPatio(TipoPatio.GRANDE);
    }

    @Override
    public void definir_numHab() {
        casa.setNumHabitaciones(3);
    }

    @Override
    public void definir_numBanos() {
        casa.setNumBanos(2);
    }

}