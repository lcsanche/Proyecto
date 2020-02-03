/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author lcsan
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    protected final String database = "MyHomeDB";
    protected final String hostname = "192.168.99.100";
    protected final String port = "33061";
    protected final String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
    protected final String username = "root";
    protected final String password = "root";
    protected static Conexion Instancia;

    protected Conexion(){};
    
    public static Conexion getInstancia(){
        if(Instancia==null){
            Instancia = new Conexion();
        }
        return Instancia;
    }
    
    public Connection ConexionDB() {
        Connection con = null;
        try{
            con = DriverManager.getConnection(url, username, password);
            System.err.println("La Conexion ha sido Exitosa");
        } catch (SQLException ex) {
            System.err.println("No se ha podido realizar la Conexion");
            System.err.println("Error: "+ex.getMessage());
        }
        return con;
    }
    
    public ResultSet consultar(String sql) throws SQLException {
        ResultSet resultado;
        try(Statement sentencia = DriverManager.getConnection(url, username, password).createStatement()) {
           resultado = sentencia.executeQuery(sql);
        }
        return resultado;
    }
    
    public boolean Actualizar(String SQL1,String SQL2) {
        try {
            ResultSet resultado = consultar(SQL1);
            resultado.last();
            if (resultado.getRow() > 0){
                return false;
            }else{
                Statement sentencia = DriverManager.getConnection(url, username, password).createStatement();
                sentencia.executeUpdate(SQL2);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
