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
    public void definirMetros2() {
        casa.setM2(90);
    }

    @Override
    public void definirNumPisos() { 
        casa.setNumPisos(1);
    }

    @Override
    public void EsEsquinera() {
        casa.setEsEsquinera(false);
    }

    @Override
    public void Orientacion() {
        casa.setOrientacion("Sur");
    }

    @Override
    public void tamanioPatio() {
        casa.setPatio("Pequeño");
    }

    @Override
    public void definirNumHab() {
        casa.setNumHabitaciones(2);
    }

    @Override
    public void definirNumBanos() {
        casa.setNumBanos(2);
    }

}
