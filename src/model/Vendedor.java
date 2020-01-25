/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author lcsan
 */
public class Vendedor{
    
    public void DiseñarCasa(){
        //Definir el Metodo
    }
    
    public void RevisarDatosCliente(String user){
        Conexion conexion = new Conexion();
        try{
            ResultSet resultado = conexion.consultar("SELECT Nombre,Apellido,Cedula,Correo FROM Cliente WHERE IdCliente = '" + user + "'" );
            resultado.last();
            if (resultado.getRow() > 0){
               String Nombre = resultado.getString("Nombre");
               String Apellido = resultado.getString("Apellido");
               int Cedula = resultado.getInt("Cedula");
               String Correo = resultado.getString("Correo");
               Cliente Cliente = new Cliente(Nombre,Apellido,Cedula,Correo);
               JOptionPane.showMessageDialog(null, "Datos encontrados\n"+"Nombre: "+Nombre+" "+Apellido+"\n"+"Nro. Cedula: "+Cedula+" Correo: "+Correo);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void RevisarCasaCliente(){
        //Definir Metodo
    }
    
    public void EnviarPDFCasaPre(){
        //Defini Metodo
    }
    
}
