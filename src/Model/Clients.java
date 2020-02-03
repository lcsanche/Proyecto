/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Singleton.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author PC-4
 */
public class Clients {

    public Clients() {
    }

    public boolean GuardarCasaDiseñada(String user, String Nombre, String m2, String numPisos, String esEsquinera, String orientacion, String patio, String numHabitaciones, String numBanos, String Tporce,String TGrife, String Tluz, String TBaño, String Ttecho){
        Conexion conexion = Conexion.getInstancia();
        try{
            String SQL1 = "SELECT * FROM CasasDiseñadas WHERE IdCliente = '"+user+"' and Nombre = '"+Nombre+"' and Metros2 = '"+m2+"' and nPisos = '"+numPisos+"' and Esquinera = '"+esEsquinera
                +"' and Orientacion = '"+orientacion+"' and TPatio = '"+patio+"' and nHabitaciones = '"+numHabitaciones+"' and nBaños = '"+numBanos+"' and tPorcelanato = '"+Tporce
                +"' and tGriferia = '"+TGrife+"' and tLuminacion = '"+Tluz+"' and TBaño = '"+TBaño+"' and tTecho = '"+Ttecho+"'";
            String SQL2 = "INSERT INTO CasasDiseñadas(IdCliente,Nombre,Metros2,nPisos,Esquinera,Orientacion,TPatio,nHabitaciones,nBaños,tPorcelanato,tGriferia,tLuminacion,TBaño,tTecho) VALUES ('"
                +user+"','"+Nombre+"','"+m2+"','"+numPisos+"','"+esEsquinera+"','"+orientacion+"','"+patio+"','"+numHabitaciones+"','"+numBanos+"','"+Tporce+"','"+TGrife+"','"+Tluz+"','"+TBaño+"','"+Ttecho+"')";
            if(conexion.Actualizar(SQL1, SQL2)){
                JOptionPane.showMessageDialog(null,"La Casa se ha guarda con Exito");
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"Una Casa con las mismas caracteristicas ya se encuentra registrada");
                return false;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}