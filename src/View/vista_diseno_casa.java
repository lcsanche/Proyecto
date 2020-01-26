
package View;

public class vista_diseno_casa extends javax.swing.JFrame {

    
    public vista_diseno_casa() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BDiseñarCielo = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        BDiseñarOasis = new javax.swing.JButton();
        BDiseñarParaiso = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(300, 100));
        setMaximumSize(new java.awt.Dimension(900, 580));
        setMinimumSize(new java.awt.Dimension(900, 580));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa cielo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 60, 290, 210);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        jLabel2.setText("Casa Paraiso ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 20, 140, 40);

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jButton1.setText("Ver caracteristicas ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 380, 160, 60);

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jButton2.setText("Consultar presuspuesto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(650, 300, 160, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa paraiso.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 60, 290, 210);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa oasis.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 60, 283, 210);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        jLabel5.setText("Casa Cielo ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(670, 20, 120, 40);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        jLabel6.setText("Casa Oasis ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 20, 120, 40);

        jButton3.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jButton3.setText("Consultar presuspuesto");
        jButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButton3ItemStateChanged(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 300, 160, 60);

        jButton4.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jButton4.setText("Consultar presuspuesto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(360, 300, 160, 60);

        BDiseñarCielo.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        BDiseñarCielo.setText("Diseñar");
        BDiseñarCielo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDiseñarCieloActionPerformed(evt);
            }
        });
        getContentPane().add(BDiseñarCielo);
        BDiseñarCielo.setBounds(650, 460, 160, 60);

        jButton6.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jButton6.setText("Ver caracteristicas ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(360, 380, 160, 60);

        jButton7.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        jButton7.setText("Ver caracteristicas ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(70, 380, 160, 60);

        BDiseñarOasis.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        BDiseñarOasis.setText("Diseñar");
        BDiseñarOasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDiseñarOasisActionPerformed(evt);
            }
        });
        getContentPane().add(BDiseñarOasis);
        BDiseñarOasis.setBounds(70, 460, 160, 60);

        BDiseñarParaiso.setFont(new java.awt.Font("Tw Cen MT", 2, 14)); // NOI18N
        BDiseñarParaiso.setText("Diseñar");
        BDiseñarParaiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDiseñarParaisoActionPerformed(evt);
            }
        });
        getContentPane().add(BDiseñarParaiso);
        BDiseñarParaiso.setBounds(360, 460, 160, 60);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 270, 90, 30);
        jLabel7.getAccessibleContext().setAccessibleName("pres");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 270, 70, 30);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(700, 270, 60, 30);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 100, 2, 2);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BDiseñarCieloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDiseñarCieloActionPerformed
        vista_casa_cielo cCielo= new vista_casa_cielo();
       cCielo.setVisible(true);
       dispose();
    }//GEN-LAST:event_BDiseñarCieloActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void BDiseñarOasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDiseñarOasisActionPerformed
       vista_casa_oasis cOasis= new vista_casa_oasis();
       cOasis.setVisible(true);
       dispose();
    }//GEN-LAST:event_BDiseñarOasisActionPerformed

    private void BDiseñarParaisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDiseñarParaisoActionPerformed
        vista_casa_paraiso cparaiso= new vista_casa_paraiso();
       cparaiso.setVisible(true);
       dispose();
    }//GEN-LAST:event_BDiseñarParaisoActionPerformed

    private void jButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButton3ItemStateChanged
      
    }//GEN-LAST:event_jButton3ItemStateChanged
    
    boolean visible=false;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(visible==false){
          jLabel7.setText("$ 70.000");
          jButton3.setText("Ocultar presupuesto");
          visible=true;
          
        }else{
            jLabel7.setText("");
           jButton3.setText("Consultar presupuesto");
           visible=false;
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    boolean visible2=false;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(visible2==false){
          jLabel8.setText("$ 90.000");
          jButton4.setText("Ocultar presupuesto");
          visible2=true;
          
        }else{
            jLabel8.setText("");
           jButton4.setText("Consultar presupuesto");
           visible2=false;
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    boolean visible3=false;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(visible3==false){
          jLabel9.setText("$ 120.000");
          jButton2.setText("Ocultar presupuesto");
          visible3=true;
          
        }else{
            jLabel9.setText("");
           jButton2.setText("Consultar presupuesto");
           visible3=false;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(vista_diseno_casa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_diseno_casa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_diseno_casa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_diseno_casa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_diseno_casa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDiseñarCielo;
    private javax.swing.JButton BDiseñarOasis;
    private javax.swing.JButton BDiseñarParaiso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

