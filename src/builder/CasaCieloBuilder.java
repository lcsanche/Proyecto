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
public class CasaCieloBuilder extends CasaBuilder{

    @Override
    public void definirMetros2() {
        casa.setM2(150);
    }

    @Override
    public void definirNumPisos() { 
        casa.setNumPisos(2);
    }

    @Override
    public void EsEsquinera() {
        casa.setEsEsquinera(true);
    }

    @Override
    public void Orientacion() {
        casa.setOrientacion("Norte");
    }

    @Override
    public void tamanioPatio() {
        casa.setPatio("Grande");
    }

    @Override
    public void definirNumHab() {
        casa.setNumHabitaciones(4);
    }

    @Override
    public void definirNumBanos() {
        casa.setNumBanos(3);
    }
    
}
