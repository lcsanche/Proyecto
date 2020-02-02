/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;


/**
 *
 * @author DELL
 */
public abstract class AcabadoDecorator implements Acabado {
   
    protected Acabado decoratedAcabado;

    public AcabadoDecorator(Acabado decoratedAcabado) {
        this.decoratedAcabado = decoratedAcabado;
    }

    public void anadirDecoracion() {
        decoratedAcabado.anadirDecoracion();
    }

}
