/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacional;

/**
 *
 * @author lcsan
 */
public class Usuario {
    private String user;
    private static Usuario Instancia;
    
    private Usuario() {
        this.user = user;
    }
    
    public static Usuario getInstancia(){
        if(Instancia==null){
            Instancia = new Usuario();
        }
        return Instancia;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}