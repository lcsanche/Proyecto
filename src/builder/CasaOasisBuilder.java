/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Karina Ortega - Luis Sánchez - Jocelyn Chicaiza
 */
public class CasaOasisBuilder extends CasaBuilder{
    
    @Override
    public void definir_m2() {
        casa.setM2(90);
    }

    @Override
    public void definir_numPisos() { 
        casa.setNumPisos(1);
    }

    @Override
    public void indicar_esEsquinera() {
        casa.setEsEsquinera(false);
    }

    @Override
    public void indicar_orientacion() {
        casa.setOrientacion("Sur");
    }

    @Override
    public void indicar_tamanioPatio() {
        casa.setPatio("Pequeño");
    }

    @Override
    public void definir_numHab() {
        casa.setNumHabitaciones(2);
    }

    @Override
    public void definir_numBanos() {
        casa.setNumBanos(2);
    }

}
