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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lcsan
 */
public class Vendedor{

    public Vendedor() {
    }
    
    public boolean RevisarDatosCliente(JTable tabla, String Nombre, String Apellido){
        Conexion conexion = Conexion.getInstancia();
        DefaultTableModel modelo;
        String[] titulo = {"IdCliente","Nombre","Apellido","Cedula","Celular","Correo","Direccion","Empresa", "Cargo", "DirTra", "TelfTra","EstadoCivil","NumHijos"};
        modelo = new DefaultTableModel(null, titulo);
        
        String[] registros = new String[13];
        try{
            ResultSet rs = conexion.consultar("SELECT IdCliente,Nombre,Apellido,Cedula,Celular,Direccion,Correo,Empresa,Cargo,DirTra,TelfTra,EstadoCivil,NumHijos FROM Cliente WHERE Nombre = '" + Nombre + "' and Apellido = '"+Apellido+"'");
            while (rs.next()) {
                for (int i = 0; i < 13; i++) {
                    registros[i] = rs.getString(i + 1);
                }
                modelo.addRow(registros);
            }
            tabla.setModel(modelo);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void EnviarPDFCasaPre(String Correo){
        System.out.println("El PDf fue enviado con exito");
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
    
    
    
}