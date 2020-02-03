/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lcsan
 */
public class Users {
    private String User;
    static String Cargo;

    public Users() {
        this.User = User;
        this.Cargo = Cargo;
    }
    
    public Users(String User, String Cargo) {
        this.User = User;
        this.Cargo = Cargo;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
}
