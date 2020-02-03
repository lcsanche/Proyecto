/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Singleton.Conexion;
import creacional.Casa;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lcsan
 */
public class Vendedor{
    
    
    
    public void RevisarDatosCliente(String user){
        Conexion conexion = Conexion.getInstancia();
        try{
            ResultSet rs = conexion.consultar("SELECT Nombre,Apellido,Cedula,Correo FROM Cliente WHERE IdCliente = '" + user + "'" );
            rs.last();
            if (rs.getRow() > 0){
                Clients Cliente = new Clients(rs.getString("Nombre"),rs.getString("Apellido"),rs.getInt("Cedula"),rs.getString("Correo"));
                JOptionPane.showMessageDialog(null, "Datos encontrados\n"+"Nombre: "+rs.getString("Nombre")+" "
                +rs.getString("Apellido")+"\n"+"Nro. Cedula: "+rs.getInt("Cedula")+" Correo: "+rs.getString("Correo"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void RevisarCasaCliente(String user){
        Conexion conexion = Conexion.getInstancia();
        ArrayList<Casa> Casas = new ArrayList();
        try{
            ResultSet rs = conexion.consultar("SELECT * FROM CasasDiseñadas WHERE IdCliente = '" + user + "'" );
            if (rs.getRow() > 0){
                while (rs.next()){
                    String Nombre = rs.getString("Nombre");
                    int Metros2 = rs.getInt("Metros2");
                    int nPisos = rs.getInt("nPisos");
                    boolean Esquinera = rs.getBoolean("Esquinera");
                    String Orientacion = rs.getString("Orientacion");
                    String TPatio = rs.getString("TPatio");
                    int nHabitaciones = rs.getInt("nHabitaciones");
                    int nBaños = rs.getInt("nBaños");
                    Casa Casa = new Casa(Metros2,nPisos,Esquinera,Orientacion,TPatio,nHabitaciones,nBaños);
                    Casas.add(Casa);
                }
                //agregar al jTable
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void EnviarPDFCasaPre(String Correo){
        //Defini Metodo
    }
    
}