/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author PC-4
 */
public class vista_casa_cielo extends javax.swing.JFrame {

    /**
     * Creates new form Diseño_casa_oasis
     */
    public vista_casa_cielo() {
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

        Imagen = new javax.swing.JLabel();
        TipoCasa = new javax.swing.JLabel();
        bAtras = new javax.swing.JButton();
        bAtras1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(300, 100));
        setMinimumSize(new java.awt.Dimension(900, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa paraiso.jpg"))); // NOI18N
        getContentPane().add(Imagen);
        Imagen.setBounds(80, 80, 290, 260);

        TipoCasa.setFont(new java.awt.Font("Tw Cen MT", 2, 36)); // NOI18N
        TipoCasa.setForeground(new java.awt.Color(255, 0, 51));
        TipoCasa.setText("Casa Paraiso");
        getContentPane().add(TipoCasa);
        TipoCasa.setBounds(100, 30, 250, 50);

        bAtras.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        bAtras.setText("Guardar");
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(bAtras);
        bAtras.setBounds(710, 450, 100, 30);

        bAtras1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        bAtras1.setText("Atras");
        bAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtras1ActionPerformed(evt);
            }
        });
        getContentPane().add(bAtras1);
        bAtras1.setBounds(60, 450, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed
        vista_diseno_casa dcasa= new vista_diseno_casa();
        dcasa.setVisible(true);
        dispose();
    }//GEN-LAST:event_bAtrasActionPerformed

    private void bAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtras1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAtras1ActionPerformed

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
    private javax.swing.JButton bAtras;
    private javax.swing.JButton bAtras1;
    // End of variables declaration//GEN-END:variables
}
