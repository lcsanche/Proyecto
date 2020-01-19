/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import creacional.Casa;

/**
 *
 * @author Hp
 */
public class CasaDirector {
    protected CasaBuilder builder;

    public CasaDirector(CasaBuilder builder) {
        this.builder = builder;
    }
    public void construirCasa() {
        builder.definir_m2();
        builder.definir_numPisos();
        builder.indicar_esEsquinera();
        builder.indicar_orientacion();
        builder.indicar_tamanioPatio();
        builder.definir_numHab();
        builder.definir_numBanos();
    }
    public void changeBuilder(CasaBuilder ab){
        this.builder=ab;
    
    }

    public Casa getCasa() {
        return builder.getCasa();
    }
}
