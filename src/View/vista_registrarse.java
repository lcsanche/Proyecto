/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Singleton.Conexion;

/**
 *
 * @author PC-4
 */
public class vista_registrarse extends javax.swing.JFrame {

    /**
     * Creates new form vista_registrarse
     */
    public vista_registrarse() {
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

        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        cargo = new javax.swing.JTextField();
        estadoCivil = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tefTrabajo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 450, 300, 30);

        tfApellido.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        tfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(tfApellido);
        tfApellido.setBounds(140, 150, 300, 30);

        jTextField4.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(140, 210, 300, 30);

        jTextField5.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(140, 390, 300, 30);

        jTextField6.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(140, 270, 300, 30);

        tfNombre.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(tfNombre);
        tfNombre.setBounds(140, 90, 300, 30);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(570, 150, 300, 30);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(570, 210, 300, 30);

        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });
        getContentPane().add(cargo);
        cargo.setBounds(570, 90, 300, 30);
        getContentPane().add(estadoCivil);
        estadoCivil.setBounds(570, 270, 300, 30);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(570, 330, 300, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 330, 300, 30);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel9.setText("Dirección ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 370, 100, 40);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setText("Celular:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 270, 100, 40);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel7.setText("Cedula:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 200, 100, 40);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel6.setText("Apellidos:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 130, 110, 70);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setText("Email:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 320, 130, 40);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setText("Nombres:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 80, 110, 60);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Registrarse");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 0, 330, 70);

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel12.setText("Dir. de ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(480, 130, 130, 30);

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel13.setText("Empresa:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 450, 100, 30);

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel14.setText("Cargo:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(480, 90, 66, 27);

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel15.setText("Telf. del ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(480, 200, 100, 20);

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel16.setText("Estado ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(480, 260, 80, 20);

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel17.setText("Civil: ");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(480, 280, 60, 20);

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel18.setText("Domiciliar:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(40, 400, 150, 27);

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel19.setText("Trabajo:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(480, 160, 100, 16);

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel20.setText("Número");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(480, 310, 100, 30);

        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel21.setText("de Hijos:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(480, 330, 100, 30);

        tefTrabajo.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        tefTrabajo.setText("trabajo:");
        getContentPane().add(tefTrabajo);
        tefTrabajo.setBounds(480, 220, 90, 27);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton1.setText("Atras ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 520, 120, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(660, 520, 120, 40);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel10.setText("Usuario:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(480, 390, 90, 27);

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel11.setText("Contraseña:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(480, 450, 130, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(570, 390, 300, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(600, 450, 270, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro_1.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(-50, -210, 1060, 1100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidoActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void atras(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras
        vista_principal vp=new vista_principal();
        vp.setVisible(true);
        dispose();
    }//GEN-LAST:event_atras

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nombre = tfNombre.getText();
        String apellido = tfApellido.getText();
        String cedula =  jTextField4.getText();
        String correo = jTextField2.getText();
        String Direccion = jTextField5.getText();
        String celular = jTextField6.getText();
        String Empresa = jTextField1.getText();
        String Cargo = cargo.getText();
        String DirTra = jTextField8.getText();
        String TelfTra = jTextField9.getText();
        String EstadoCivil = estadoCivil.getText();
        String NumHijos = jTextField10.getText();
        String user = jTextField3.getText();
        String password = new String(jPasswordField1.getPassword());
        if (nombre.length() > 0 && apellido.length() > 0 && cedula.length() > 0 && celular.length() > 0 && Direccion.length() > 0 && correo.length() > 0 && Empresa.length() > 0 
            && Cargo.length() > 0 && DirTra.length() > 0 && TelfTra.length() > 0 && EstadoCivil.length() > 0 && NumHijos.length() > 0 &&user.length() > 0 && password.length() > 0 ){
            if(RegistrarCliente(user,password,nombre,apellido,cedula,celular,Direccion,correo,Empresa,Cargo,DirTra,TelfTra,EstadoCivil,NumHijos)){
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                vista_login vlog= new vista_login();
                vlog.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "El Usuario ya se encuentra registrado");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los Campos son Obligatorios");
        } 




// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(vista_registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cargo;
    private javax.swing.JTextField estadoCivil;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel tefTrabajo;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

    public boolean RegistrarCliente(String user, String password,String nombre,String apellido,String cedula,String Celular, String Direccion, String correo, String Empresa, String Cargo, String DirTra, String TelfTra, String EstadoCivil, String NumHijos){
        Conexion conexion = Conexion.getInstancia();
        try{
            String SQL1 = "SELECT * FROM Cliente WHERE IdCliente = '"+user+"'";
            String SQL2 = "INSERT INTO Cliente(IdCliente,Contraseña,Nombre,Apellido,Cedula,Celular,Direccion,Correo,Empresa,Cargo,DirTra,TelfTra,EstadoCivil,NumHijos) VALUES ('"+user+"','"+password+"','"+nombre+"','"+apellido+"','"+cedula+"','"+Celular+"','"+Direccion+"','"+correo+"','"+Empresa+"','"+Cargo+"','"+DirTra+"','"+TelfTra+"','"+EstadoCivil+"','"+NumHijos+"')";
            if(conexion.Actualizar(SQL1, SQL2)){
                return true;
            }else{return false;}
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}