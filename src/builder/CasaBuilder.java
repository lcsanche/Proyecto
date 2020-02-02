/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import creacional.Casa;
/**
 *definirNumPisos
 * @author Hp
 */
public abstract class CasaBuilder {
    protected Casa casa;
    
    public Casa getCasa(){
        return casa;
    }
    public abstract void definirMetros2();
    public abstract void definirNumPisos();
    public abstract void esEsquinera();
    public abstract void orientacion();
    public abstract void tamanioPatio();
    public abstract void definirNumHab();
    public abstract void definirNumBanos();
    
}
