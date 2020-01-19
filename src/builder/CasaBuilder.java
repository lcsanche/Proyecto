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
public abstract class CasaBuilder {
    protected Casa casa;
    
    public Casa getCasa(){
        return casa;
    }
    public abstract void definir_m2();
    public abstract void definir_numPisos();
    public abstract void indicar_esEsquinera();
    public abstract void indicar_orientacion();
    public abstract void indicar_tamanioPatio();
    public abstract void definir_numHab();
    public abstract void definir_numBanos();
    
}
