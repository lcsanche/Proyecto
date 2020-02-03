/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Clients;
import Model.Users;

/**
 *
 * @author PC-4
 */
public class vista_casa_cielo extends javax.swing.JFrame {

    
    public vista_casa_cielo() {
        
        
        initComponents();
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Imagen = new javax.swing.JLabel();
        TipoCasa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bAtras = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        cbGriferia = new javax.swing.JComboBox<>();
        cbPiso1 = new javax.swing.JComboBox<>();
        cbIluminacion = new javax.swing.JComboBox<>();
        cbBanio = new javax.swing.JComboBox<>();
        cbTecho = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        piso = new javax.swing.JLabel();
        griferia = new javax.swing.JLabel();
        iluminacion = new javax.swing.JLabel();
        TipoCasa1 = new javax.swing.JLabel();
        banios = new javax.swing.JLabel();
        techo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(300, 100));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa cielo.png"))); // NOI18N
        getContentPane().add(Imagen);
        Imagen.setBounds(60, 80, 290, 260);

        TipoCasa.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        TipoCasa.setForeground(new java.awt.Color(204, 255, 255));
        TipoCasa.setText("Casa Cielo");
        getContentPane().add(TipoCasa);
        TipoCasa.setBounds(80, 10, 250, 70);

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButton1.setText("Diseñar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 330, 100, 30);

        bAtras.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        bAtras.setText("Atras");
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(bAtras);
        bAtras.setBounds(60, 520, 100, 30);

        bGuardar.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(bGuardar);
        bGuardar.setBounds(710, 520, 100, 30);

        cbGriferia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estandar", "Italina" }));
        getContentPane().add(cbGriferia);
        cbGriferia.setBounds(200, 430, 150, 30);
        cbGriferia.setVisible(false);

        cbPiso1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Porcelanato Nacional", "Porcelanato Importado" }));
        getContentPane().add(cbPiso1);
        cbPiso1.setBounds(10, 430, 160, 30);
        cbPiso1.setVisible(false);

        cbIluminacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tradicional", "Led" }));
        getContentPane().add(cbIluminacion);
        cbIluminacion.setBounds(380, 430, 130, 30);
        cbIluminacion.setVisible(false);

        cbBanio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Insonorizados", "Tradicionales" }));
        getContentPane().add(cbBanio);
        cbBanio.setBounds(540, 430, 130, 30);
        cbBanio.setVisible(false);

        cbTecho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aisalente Termico", "Normal" }));
        getContentPane().add(cbTecho);
        cbTecho.setBounds(700, 430, 150, 30);
        cbTecho.setVisible(false);

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Caracteristicas ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 70, 170, 20);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Metros cuadrados: 150");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 110, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de pisos: 2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 140, 170, 21);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de Habitaciones: 4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(460, 170, 220, 21);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Patio: grande");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 200, 160, 21);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Numero de baños: 3 ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(460, 230, 170, 21);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Orientación: Norte");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(460, 260, 150, 21);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Es esquinera: No");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 290, 150, 21);

        piso.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        piso.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(piso);
        piso.setBounds(40, 390, 90, 40);

        griferia.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        griferia.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(griferia);
        griferia.setBounds(230, 390, 120, 40);

        iluminacion.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        iluminacion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(iluminacion);
        iluminacion.setBounds(400, 390, 120, 40);

        TipoCasa1.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        TipoCasa1.setForeground(new java.awt.Color(204, 255, 255));
        TipoCasa1.setText("Casa Cielo");
        getContentPane().add(TipoCasa1);
        TipoCasa1.setBounds(80, 10, 250, 70);

        banios.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        banios.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(banios);
        banios.setBounds(550, 390, 110, 40);

        techo.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        techo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(techo);
        techo.setBounds(710, 390, 100, 40);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo);
        fondo.setBounds(0, -10, 920, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed
        vista_diseno_casa dcasa= new vista_diseno_casa();
        dcasa.setVisible(true);
        dispose();
    }//GEN-LAST:event_bAtrasActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        String Tporce = (String) cbPiso1.getSelectedItem();
        String TGrife = (String) cbGriferia.getSelectedItem();
        String Tluz = (String) cbIluminacion.getSelectedItem();
        String TBaño = (String) cbBanio.getSelectedItem();
        String Ttecho = (String) cbTecho.getSelectedItem();
        Users user = new Users();
        Clients Cliente = new Clients();
        Cliente.GuardarCasaDiseñada(user.getUser(),"Cielo","150","2","No","Norte","Grande","4","3",Tporce,TGrife,Tluz,TBaño,Ttecho);             
    }//GEN-LAST:event_bGuardarActionPerformed
     
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        piso.setText("Piso");
        griferia.setText("Griferia");
        iluminacion.setText("Iluminación");
        banios.setText("Baños");
        techo.setText("Techo");
        cbGriferia.setVisible(true);
        cbPiso1.setVisible(true);
        cbIluminacion.setVisible(true);
        cbBanio.setVisible(true);
        cbTecho.setVisible(true);
               
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(vista_casa_cielo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_casa_cielo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_casa_cielo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_casa_cielo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_casa_cielo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel TipoCasa;
    private javax.swing.JLabel TipoCasa1;
    private javax.swing.JButton bAtras;
    private javax.swing.JButton bGuardar;
    private javax.swing.JLabel banios;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbBanio;
    private javax.swing.JComboBox<String> cbGriferia;
    private javax.swing.JComboBox<String> cbIluminacion;
    private javax.swing.JComboBox<String> cbPiso1;
    private javax.swing.JComboBox<String> cbTecho;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel griferia;
    private javax.swing.JLabel iluminacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel piso;
    private javax.swing.JLabel techo;
    // End of variables declaration//GEN-END:variables
}