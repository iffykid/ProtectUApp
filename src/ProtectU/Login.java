/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProtectU;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author shaun
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        forgotPassword = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        signUp = new javax.swing.JButton();
        signin1 = new javax.swing.JButton();
        forgotPassword1 = new javax.swing.JLabel();
        TriS = new javax.swing.JLabel();
        google = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(430, 640));
        setMinimumSize(new java.awt.Dimension(430, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProtectU/PU_Logo.png"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(70, 10, 290, 280);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(80, 330, 270, 30);

        forgotPassword.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(0, 153, 255));
        forgotPassword.setText("NEW USER?");
        jPanel1.add(forgotPassword);
        forgotPassword.setBounds(20, 560, 80, 14);

        usernameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usernameLabel.setText("USERNAME");
        jPanel1.add(usernameLabel);
        usernameLabel.setBounds(80, 300, 79, 17);

        passwordLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        passwordLabel.setText("PASSWORD");
        jPanel1.add(passwordLabel);
        passwordLabel.setBounds(80, 370, 90, 17);
        jPanel1.add(password);
        password.setBounds(80, 390, 270, 30);

        signUp.setFont(new java.awt.Font("Noto Sans Oriya", 1, 20)); // NOI18N
        signUp.setText("SIGN UP");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        jPanel1.add(signUp);
        signUp.setBounds(20, 580, 120, 40);

        signin1.setFont(new java.awt.Font("Noto Sans Oriya", 1, 20)); // NOI18N
        signin1.setForeground(new java.awt.Color(0, 204, 102));
        signin1.setText("SIGN IN");
        signin1.setMaximumSize(new java.awt.Dimension(115, 35));
        signin1.setMinimumSize(new java.awt.Dimension(115, 35));
        signin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin1ActionPerformed(evt);
            }
        });
        jPanel1.add(signin1);
        signin1.setBounds(150, 460, 120, 40);

        forgotPassword1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        forgotPassword1.setForeground(new java.awt.Color(255, 0, 0));
        forgotPassword1.setText("FORGOT PASSWORD");
        jPanel1.add(forgotPassword1);
        forgotPassword1.setBounds(220, 430, 130, 14);

        TriS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProtectU/Tris Logo Small.png"))); // NOI18N
        TriS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TriSMouseClicked(evt);
            }
        });
        TriS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TriSKeyPressed(evt);
            }
        });
        jPanel1.add(TriS);
        TriS.setBounds(360, 570, 60, 60);

        google.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProtectU/Google Logo.png"))); // NOI18N
        google.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                googleMouseClicked(evt);
            }
        });
        google.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                googleKeyPressed(evt);
            }
        });
        jPanel1.add(google);
        google.setBounds(300, 570, 60, 60);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 70, 430, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        // TODO add your handling code here:
        SignUp su = new SignUp();
        su.setVisible(true);
        dispose();
    }//GEN-LAST:event_signUpActionPerformed

    private void signin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin1ActionPerformed
        // TODO add your handling code here:
        
        UserClass uclass = new UserClass(username.getText(), password.getText());
        if(uclass.Authenticate(username.getText(), password.getText()) == false){
            //incorrect 
            JOptionPane.showMessageDialog(null, "PASSWORD OR USERNAME IS INCORRECT.",null,JOptionPane.ERROR_MESSAGE);
        }
        else if (uclass.Authenticate(username.getText(), password.getText()) == true){
            JOptionPane.showMessageDialog(null, "WELCOME BACK " + uclass.getUsername().toUpperCase(),"WELCOME",JOptionPane.PLAIN_MESSAGE);
            Map map = new Map();
            map.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_signin1ActionPerformed

    private void googleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_googleKeyPressed
   
    }//GEN-LAST:event_googleKeyPressed

    private void TriSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TriSKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TriSKeyPressed

    private void TriSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TriSMouseClicked
        // TODO add your handling code here:
        try {
            URI uri = new URI("https://drive.google.com/drive/folders/1bTxfrS6SZokjVYISc8Y-fDSr6TlpJVbb");
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TriSMouseClicked

    private void googleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleMouseClicked
        // TODO add your handling code here:
        try {
            URI uri = new URI("https://www.google.com/");
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_googleMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TriS;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel forgotPassword1;
    private javax.swing.JLabel google;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton signUp;
    private javax.swing.JButton signin1;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
