/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionlecturarapida;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author lucas
 */
public class Ppm extends javax.swing.JFrame {

    private double palabra;
    private double tiempo;
    
    Operacion operar=new Operacion();
    public Ppm() {
        initComponents();
      
        setResizable(false);
        setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/imagenes/ls.png")).getImage();
        setIconImage(icon);
        
    }
    public void resultar(){
        try {
        palabra=Double.parseDouble(txtPalabra.getText());
        tiempo=Double.parseDouble(txtTiempo.getText());
        } catch (Exception e) {
            System.out.println("Error por "+e.getMessage());
        }
        
        
    }
    public void limpiar(){
        txtPalabra.setText("");
        txtTiempo.setText("");
        labelResultado.setText("0");
        
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        labelResultado = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 34, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(186, 174, 73));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 195, 120));
        jLabel1.setText("SPEED-READING PPM");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 190, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 195, 120));
        jLabel2.setText("TIEMPO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 195, 120));
        jLabel3.setText("PALABRAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, 20));

        txtPalabra.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPalabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });
        jPanel1.add(txtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 116, 160, -1));

        txtTiempo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 146, 160, -1));

        jPanel4.setBackground(new java.awt.Color(65, 62, 42));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 22));

        labelResultado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        labelResultado.setForeground(new java.awt.Color(255, 255, 255));
        labelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResultado.setText("0");
        jPanel4.add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 160, 20));

        btnCalcular.setBackground(new java.awt.Color(35, 34, 25));
        btnCalcular.setForeground(new java.awt.Color(204, 195, 120));
        btnCalcular.setText("PPM");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel4.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, 20));

        btnCerrar.setBackground(new java.awt.Color(35, 34, 25));
        btnCerrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(204, 195, 120));
        btnCerrar.setText("x");
        btnCerrar.setBorderPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        resultar();
        operar.calcular(palabra, tiempo);
        labelResultado.setText(String.valueOf(operar.resultado));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();

    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ppm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ppm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ppm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ppm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ppm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JTextField txtPalabra;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
