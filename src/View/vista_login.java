/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Users;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Singleton.Conexion;

/**
 *
 * @author PC-4
 */
public class vista_login extends javax.swing.JFrame {
    Users usuarioactual;
    /**
     * Creates new form vista_login
     */
    public vista_login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(360, 230, 210, 40);

        jPasswordField1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(360, 360, 210, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton2.setText("Atras");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2atras(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 460, 100, 40);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton3.setText("Ingresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(690, 460, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 2, 36)); // NOI18N
        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 230, 190, 50);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 2, 36)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 360, 190, 50);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        jLabel2.setText("Ingresar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 60, 240, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-50, -60, 980, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2atras(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2atras
        vista_principal vp = new vista_principal();
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2atras

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String user = jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());
        if (user.length() > 0 && password.length() > 0 ){
            validarLogin(user, password);
        }else{
            JOptionPane.showMessageDialog(null, "Los Campos son Obligatorios");
        }        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public void validarLogin(String user, String password){
        if(LoginCliente(user, password)){
            JOptionPane.showMessageDialog(null, "Inicio de Sesion Exitoso");
            vista_diseno_casa dc = new vista_diseno_casa();
            dc.setVisible(true);
            dispose();
        }else if("Admin".equals(LoginEmpleado(user, password))){
            JOptionPane.showMessageDialog(null, "Inicio de Sesion Exitoso");
            vista_admin a= new vista_admin();
            a.setVisible(true);
            dispose();
        }else if ("Vendedor".equals(LoginEmpleado(user, password))){
            JOptionPane.showMessageDialog(null, "Inicio de Sesion Exitoso");
            vista_vendedor v= new vista_vendedor();
            v.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contrasenia no son validos.");
        }    
    }

    public boolean LoginCliente(String user, String password){
        Conexion conexion = Conexion.getInstancia();
        try{
            ResultSet resultado = conexion.consultar("SELECT IdCliente FROM Cliente WHERE IdCliente = '" + user + "' and Contraseña = '" + password + "'" );
            resultado.last();
            if (resultado.getRow() > 0){
                usuarioactual = new Users(user,"Null");
                return true;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public String LoginEmpleado(String user, String password){
        Conexion conexion = Conexion.getInstancia();
        try{
            ResultSet resultado = conexion.consultar("SELECT Cargo FROM Empleados WHERE IdEmpleado = '" + user + "' and Contraseña = '" + password + "'" );
            resultado.last();
            if (resultado.getRow() > 0){
                usuarioactual = new Users(user,resultado.getString("Cargo"));
                return resultado.getString("Cargo");
            }   
        }catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
}
