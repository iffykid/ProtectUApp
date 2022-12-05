/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProtectU;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author shaun
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();
    }

    public void scaledImage(){
        ImageIcon icon1 = new ImageIcon("/Users/shaun/Desktop/ProtectULogocopy.png");
        Image img1 = icon1.getImage();
        Image imgScaled1 = img1.getScaledInstance(logo.getWidth(),logo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(imgScaled1);
        logo.setIcon(scaledIcon1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        loadingbar = new javax.swing.JProgressBar();
        loadingt = new javax.swing.JLabel();
        loadingp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(430, 640));
        setMinimumSize(new java.awt.Dimension(430, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProtectU/PU_Logo.png"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(70, 110, 300, 290);

        loadingbar.setBackground(new java.awt.Color(0, 0, 0));
        loadingbar.setForeground(new java.awt.Color(0, 0, 0));
        loadingbar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(loadingbar);
        loadingbar.setBounds(90, 440, 230, 30);

        loadingt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loadingt.setText("LOADING...");
        jPanel1.add(loadingt);
        loadingt.setBounds(90, 420, 230, 17);

        loadingp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loadingp.setText("00%");
        jPanel1.add(loadingp);
        loadingp.setBounds(330, 450, 40, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
        
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(95);
                loadingp.setText(i + "%");
                
                if(i == 10){
                    loadingt.setText("turining on modules..");
                }
                if(i == 25){
                    loadingt.setText("loading modules...");
                }
                if(i == 50){
                    loadingt.setText("tracking infomation...");
                }
                if(i == 70){
                    loadingt.setText("connecting to services...");
                }
                if(i == 80){
                    loadingt.setText("connected successfully...");    
                }
                if(i == 90){
                    loadingt.setText("launching application...");
                }
                loadingbar.setValue(i);
                
                if(i == 100){
                    Login log = new Login();
                    log.setVisible(true);
                    new Loading().dispose();
                    Loading loading = new Loading();
                    loading.setVisible(false);
                }
            }
        } catch (Exception e) {
        }
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JProgressBar loadingbar;
    private static javax.swing.JLabel loadingp;
    private static javax.swing.JLabel loadingt;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
