/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import creacional.Casa;

/**
 *
 * @author DELL
 */
public class AddAcabadoDecorador extends AcabadoDecorator {
    public Casa casa;
    public float precio;
    
    public AddAcabadoDecorador(Acabado decoratedAcabado) {
        super(decoratedAcabado);
    }

     public void anadirDecoracion() {
        decoratedAcabado.anadirDecoracion();
        setAcabado(decoratedAcabado);
    }

    private void setAcabado(Acabado decoratedAcabado) {
         casa.getAcabados().add(decoratedAcabado);
         casa.setPrecio(casa.getPrecio()+precio);
    }
}
