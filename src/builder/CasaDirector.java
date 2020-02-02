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
        builder.definirMetros2();
        builder.definirNumPisos();
        builder.esEsquinera();
        builder.orientacion();
        builder.tamanioPatio();
        builder.definirNumHab();
        builder.definirNumBanos();
    }
    public void changeBuilder(CasaBuilder ab){
        this.builder=ab;
    
    }

    public Casa getCasa() {
        return builder.getCasa();
    }
}
