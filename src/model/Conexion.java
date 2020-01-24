/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lcsan
 */
import java.sql.*;

public class Conexion {
    private final String database = "MyHomeDB";
    private final String hostname = "192.168.99.100";
    private final String port = "33061";
    private final String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
    private final String username = "root";
    private final String password = "root";

    public Connection ConexionDB() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("La Conexión ha sido Exitosa");
        } catch (SQLException e) {
            System.out.println("No se ha podido realizar la Conexión");
            System.out.println("Error: "+e.getMessage());
        }
        return con;
    }
    
    public ResultSet consultar(String sql) {
        ResultSet resultado;
        try {
            Statement sentencia = DriverManager.getConnection(url, username, password).createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return resultado;
    }

}
