/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import creacional.Casa;
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
    
    public void RevisarCasaCliente(String user){
        Conexion conexion = new Conexion();
        try{
            ResultSet resultado = conexion.consultar("SELECT * FROM Cliente WHERE CasasDiseñadas = '" + user + "'" );
            resultado.last();
            if (resultado.getRow() > 0){
                String Nombre = resultado.getString("Nombre");
                int Metros2 = resultado.getInt("Metros2");
                int nPisos = resultado.getInt("nPisos");
                boolean Esquinera = resultado.getBoolean("Esquinera");
                String Orientacion = resultado.getString("Orientacion");
                String TPatio = resultado.getString("TPatio");
                int nHabitaciones = resultado.getInt("nHabitaciones");
                int nBaños = resultado.getInt("nBaños");
                Casa Casa = new Casa(Metros2,nPisos,Esquinera,Orientacion,TPatio,nHabitaciones,nBaños);
                JOptionPane.showMessageDialog(null, "Datos encontrados\n"+"Usuario: "+user+"Nombre de la Casa: "+Nombre+"\n "+"Metros Cuadrados: "+Metros2+" nPisos: "+nPisos+" Es Esquinera: "+Esquinera+"\nTamaño del Patio: "+TPatio+" Numero de Habitaciones: "+nHabitaciones+" Numero de Baños: "+nBaños);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void EnviarPDFCasaPre(){
        //Defini Metodo
    }
    
}
