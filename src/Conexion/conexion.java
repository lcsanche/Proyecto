/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author lcsan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private final String database = "MyHomeDB";
    private final String hostname = "127.0.0.1";
    private final String port = "3306";
    private final String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
    private final String username = "root";
    private final String password = "root";

    public Connection ConexionDB() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(url, username, password);
            System.out.println("La Conexión ha sido Exitosa");
        } catch (SQLException e) {
            System.out.println("No se ha podido realizar la Conexión");
            System.out.println("Error: "+e.getMessage());
        }
        return conexion;
    }

}
