/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Singleton.Conexion;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lcsan
 */
public class Admin {
    
    public Admin(){}
    
    public boolean RegistrarEmpleado(String user, String password,String nombre,String apellido,String cedula,String Celular, String correo, String Direccion, String TelfTra, String EstadoCivil, String Cargo){
        Conexion conexion = Conexion.getInstancia();
        try{
            String SQL1 = "SELECT * FROM Empleados WHERE IdEmpleado = '"+user+"'";
            String SQL2 = "INSERT Empleados(IdEmpleado,Contraseña,Nombre,Apellido,Cedula,Celular,Correo,Direccion,telTrabajo,EstadoCivil,Cargo) VALUES ('"+user+"','"+password+"','"+nombre+"','"+apellido+"','"+cedula+"','"+Celular+"','"+correo+"','"+Direccion+"','"+TelfTra+"','"+EstadoCivil+"','"+Cargo+"')";
            if(conexion.Actualizar(SQL1, SQL2)){
                return true;
            }else{return false;}
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean AgregarCasaPre(String Nombre, String Metros2, String nPisos, String Esquinera, String Orientacion, String TPatio, String nHabitaciones, String nBaños){
        Conexion conexion = Conexion.getInstancia();
        try{
            String SQL1 = "SELECT * FROM CasasPre WHERE Nombre = '"+Nombre+"'";
            String SQL2 = "INSERT CasasPre(Nombre,Metros2,nPisos,Esquinera,Orientacion,TPatio,nHabitaciones,nBaños) VALUES ('"+Nombre+"','"+Metros2+"','"+nPisos+"','"+Esquinera+"','"+Orientacion+"','"+TPatio+"','"+nHabitaciones+"','"+nBaños+"')";
            if(conexion.Actualizar(SQL1, SQL2)){
                return true;
            }else{return false;}
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
        
    }
    
    public boolean RevisarDatosEmpleado(JTable tabla, String Nombre, String Apellido){
        Conexion conexion = Conexion.getInstancia();
        DefaultTableModel modelo;
        String[] titulo = {"IdEmpleado","Nombre","Apellido","Cedula","Celular","Correo","Direccion","TelfTra","EstadoCivil","Cargo"};
        modelo = new DefaultTableModel(null, titulo);
        
        String[] registros = new String[10];
        try{
            ResultSet rs = conexion.consultar("SELECT * FROM Cliente WHERE Nombre = '" + Nombre + "' and Apellido = '"+Apellido+"'");
            while (rs.next()) {
                for (int i = 0; i < 10; i++) {
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
    
    public boolean BuscarCasasPre(JTable tabla, String Nombre){
        Conexion conexion = Conexion.getInstancia();
        DefaultTableModel modelo;
        String[] titulo = {"Nombre","Metros2","nPisos","Esquinera","Orientacion","TPatio","nHabitaciones","nBaños"};
        modelo = new DefaultTableModel(null, titulo);
        
        String[] registros = new String[8];
        try{
            ResultSet rs = conexion.consultar("SELECT * FROM CasasPre WHERE Nombre = '" + Nombre +"'");
            while (rs.next()) {
                for (int i = 0; i < 8; i++) {
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
    


}
