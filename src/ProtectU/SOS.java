/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProtectU;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author shaun
 */
public class SOS extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public SOS() {
        initComponents();
        init();
        scaled();
    }
    public static int SOSplayer = 0;
    public static boolean buttonState;
      public void scaled(){
        /*ImageIcon icon = new ImageIcon("location.png");
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScaled);
        jLabel1.setIcon(scaledIcon);
        */
        ImageIcon icon2 = new ImageIcon("SOS ICON.png");
        Image img2 = icon2.getImage();
        Image imgScaled2 = img2.getScaledInstance(sosP.getWidth(), sosP.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScaled2);
        sosP.setIcon(scaledIcon2);
        
        ImageIcon icon3 = new ImageIcon("MAP ICON.png");
        Image img3 = icon3.getImage();
        Image imgScaled3 = img3.getScaledInstance(mapRouteP.getWidth(), mapRouteP.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(imgScaled3);
        mapRouteP.setIcon(scaledIcon3);
        
        ImageIcon icon4 = new ImageIcon("REPORT ICON.png");
        Image img4 = icon4.getImage();
        Image imgScaled4 = img4.getScaledInstance(reportP.getWidth(), reportP.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon4 = new ImageIcon(imgScaled4);
        reportP.setIcon(scaledIcon4);
        
        ImageIcon icon5 = new ImageIcon("PROFILE ICON.png");
        Image img5 = icon5.getImage();
        Image imgScaled5 = img5.getScaledInstance(profileP.getWidth(), profileP.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon5 = new ImageIcon(imgScaled5);
        profileP.setIcon(scaledIcon5);
        
    }
    public void init(){
        signalOnOff.setSelected(buttonState);
        sosM.setForeground(Color.white);
        sliderMenu.setSize(0, HEIGHT);
        //sliderMenu.setVisible(false);
        sliderMenu.setAlignmentX(430);
    }
public static double now;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sliderMenu = new javax.swing.JPanel();
        signOut = new javax.swing.JLabel();
        mapM = new javax.swing.JLabel();
        viewM = new javax.swing.JLabel();
        fileM = new javax.swing.JLabel();
        profileM = new javax.swing.JLabel();
        home6 = new javax.swing.JLabel();
        sosM = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signalOnOff = new javax.swing.JToggleButton();
        usernameLabel = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        sortBy = new javax.swing.JComboBox<>();
        sosSignalStatus = new javax.swing.JLabel();
        sosNow = new javax.swing.JToggleButton();
        menu = new javax.swing.JPanel();
        reportP = new javax.swing.JLabel();
        profileP = new javax.swing.JLabel();
        sosP = new javax.swing.JLabel();
        mapRouteP = new javax.swing.JLabel();
        sos = new javax.swing.JLabel();
        reports = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        mapRoute = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        usernameLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(430, 640));
        setMinimumSize(new java.awt.Dimension(430, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        sliderMenu.setBackground(new java.awt.Color(0, 0, 0));
        sliderMenu.setMaximumSize(new java.awt.Dimension(180, 640));
        sliderMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signOut.setForeground(new java.awt.Color(204, 0, 0));
        signOut.setText("SIGN OUT");
        signOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutMouseClicked(evt);
            }
        });
        sliderMenu.add(signOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 90, -1));

        mapM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mapM.setForeground(new java.awt.Color(102, 102, 102));
        mapM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mapM.setText("MAP");
        mapM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mapM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapMMouseClicked(evt);
            }
        });
        sliderMenu.add(mapM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 40));

        viewM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        viewM.setForeground(new java.awt.Color(102, 102, 102));
        viewM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewM.setText("VIEW REPORTS");
        viewM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        viewM.setMaximumSize(new java.awt.Dimension(42, 24));
        viewM.setMinimumSize(new java.awt.Dimension(42, 24));
        viewM.setPreferredSize(new java.awt.Dimension(180, 40));
        viewM.setRequestFocusEnabled(false);
        viewM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMMouseClicked(evt);
            }
        });
        sliderMenu.add(viewM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 180, 40));

        fileM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fileM.setForeground(new java.awt.Color(102, 102, 102));
        fileM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fileM.setText("FILE REPORT");
        fileM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fileM.setMaximumSize(new java.awt.Dimension(180, 40));
        fileM.setMinimumSize(new java.awt.Dimension(180, 40));
        fileM.setPreferredSize(new java.awt.Dimension(180, 40));
        fileM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileMMouseClicked(evt);
            }
        });
        sliderMenu.add(fileM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        profileM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        profileM.setForeground(new java.awt.Color(102, 102, 102));
        profileM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileM.setText("PROFILE");
        profileM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profileM.setPreferredSize(new java.awt.Dimension(180, 40));
        profileM.setRequestFocusEnabled(false);
        profileM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMMouseClicked(evt);
            }
        });
        sliderMenu.add(profileM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        home6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        home6.setForeground(new java.awt.Color(0, 153, 0));
        home6.setText(">>>");
        home6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home6MouseClicked(evt);
            }
        });
        sliderMenu.add(home6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        sosM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sosM.setForeground(new java.awt.Color(102, 102, 102));
        sosM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sosM.setText("SOS");
        sosM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sosM.setPreferredSize(new java.awt.Dimension(180, 40));
        sosM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sosMMouseClicked(evt);
            }
        });
        sliderMenu.add(sosM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProtectU/PU_Small.png"))); // NOI18N
        sliderMenu.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Protect");
        sliderMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 110, -1));

        jPanel1.add(sliderMenu);
        sliderMenu.setBounds(250, 0, 180, 640);

        signalOnOff.setBackground(new java.awt.Color(255, 0, 0));
        signalOnOff.setFont(new java.awt.Font("Noto Sans Oriya", 1, 18)); // NOI18N
        signalOnOff.setForeground(new java.awt.Color(255, 255, 255));
        signalOnOff.setText("OFF");
        signalOnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signalOnOffActionPerformed(evt);
            }
        });
        jPanel1.add(signalOnOff);
        signalOnOff.setBounds(50, 340, 70, 40);

        usernameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usernameLabel.setText("SOS SIGNAL TRIGGER");
        jPanel1.add(usernameLabel);
        usernameLabel.setBounds(50, 410, 170, 17);

        usernameLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usernameLabel1.setText("INCASE OF EMERGENCY PRESS THIS BUTTON");
        jPanel1.add(usernameLabel1);
        usernameLabel1.setBounds(50, 50, 330, 17);

        sortBy.setFont(new java.awt.Font("Noto Sans Oriya", 1, 14)); // NOI18N
        sortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "WIDGET ON LOCK SCREEN", "SHAKE PHONE 4x", "PRESS POWER BUTTON 3x", "VOICE ACTIVATED" }));
        jPanel1.add(sortBy);
        sortBy.setBounds(50, 440, 330, 30);

        sosSignalStatus.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        sosSignalStatus.setForeground(new java.awt.Color(255, 0, 0));
        sosSignalStatus.setText("SOS ACTION CURRENTLY DISABLED");
        jPanel1.add(sosSignalStatus);
        sosSignalStatus.setBounds(110, 490, 220, 14);

        sosNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProtectU/SOS LArge.png"))); // NOI18N
        sosNow.setBorderPainted(false);
        sosNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sosNowMouseClicked(evt);
            }
        });
        sosNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sosNowActionPerformed(evt);
            }
        });
        jPanel1.add(sosNow);
        sosNow.setBounds(90, 70, 260, 240);

        menu.setBackground(new java.awt.Color(255, 255, 255));

        reportP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProtectU/REPORT ICON.png"))); // NOI18N
        reportP.setMaximumSize(new java.awt.Dimension(40, 40));
        reportP.setMinimumSize(new java.awt.Dimension(40, 40));
        reportP.setPreferredSize(new java.awt.Dimension(40, 40));
        reportP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportPMouseClicked(evt);
            }
        });

        profileP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProtectU/PROFILE ICON.png"))); // NOI18N
        profileP.setMaximumSize(new java.awt.Dimension(40, 40));
        profileP.setMinimumSize(new java.awt.Dimension(40, 40));
        profileP.setPreferredSize(new java.awt.Dimension(40, 40));
        profileP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilePMouseClicked(evt);
            }
        });

        sosP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProtectU/SOS ICON.png"))); // NOI18N
        sosP.setMaximumSize(new java.awt.Dimension(10, 10));
        sosP.setMinimumSize(new java.awt.Dimension(10, 10));
        sosP.setPreferredSize(new java.awt.Dimension(40, 40));
        sosP.setRequestFocusEnabled(false);
        sosP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sosPMouseClicked(evt);
            }
        });

        mapRouteP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProtectU/MAP ICON.png"))); // NOI18N
        mapRouteP.setPreferredSize(new java.awt.Dimension(40, 40));
        mapRouteP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapRoutePMouseClicked(evt);
            }
        });

        sos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sos.setForeground(new java.awt.Color(255, 0, 0));
        sos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sos.setText("SOS");

        reports.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reports.setText("REPORTS");

        profile.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        profile.setText("PROFILE");

        mapRoute.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mapRoute.setText("MAP ROUTE");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(sos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addComponent(mapRouteP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addComponent(mapRoute)
                        .addGap(40, 40, 40)))
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reports)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addComponent(reportP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(30, 30, 30)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addComponent(profileP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(34, 34, 34))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reportP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profileP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(profile)
                            .addComponent(reports)))
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(menuLayout.createSequentialGroup()
                            .addComponent(sosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sos))
                        .addGroup(menuLayout.createSequentialGroup()
                            .addComponent(mapRouteP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mapRoute))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(menu);
        menu.setBounds(0, 530, 430, 110);

        logo2.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        logo2.setText("MENU");
        logo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logo2MouseClicked(evt);
            }
        });
        jPanel1.add(logo2);
        logo2.setBounds(350, 0, 70, 30);

        usernameLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usernameLabel2.setText("SOS SIGNAL");
        jPanel1.add(usernameLabel2);
        usernameLabel2.setBounds(50, 310, 90, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signalOnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signalOnOffActionPerformed
        // TODO add your handling code here:
        if(signalOnOff.isSelected() == true){
            buttonState = true;
            signalOnOff.setBackground(Color.green);
            signalOnOff.setText("ON");
            sosSignalStatus.setText("SOS ACTION CURRENTLY ENABLED");
            sosSignalStatus.setForeground(Color.green);
        }else{
            buttonState = false;
            signalOnOff.setBackground(Color.red);
            signalOnOff.setText("OFF");
            sosSignalStatus.setText("SOS ACTION CURRENTLY DISABLED");
            sosSignalStatus.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_signalOnOffActionPerformed

    private void sosNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sosNowActionPerformed
        // TODO add your handling code here:
        try {
            
        UserClass uc = new UserClass();
        
        JOptionPane.showMessageDialog(null,"BROADCASTING SIGNAL TO NEARBY DEVICES. \n CONTACTING: " + uc.getEmergencyCellphoneNumber(),"SOS", JOptionPane.ERROR_MESSAGE);
        Long currentFrame;
        Clip clip;
        // current status of clip
        String status;
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("siren1.wav").getAbsoluteFile());
        // create clip reference
        clip = AudioSystem.getClip();
        // open audioInputStream to the clip
        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        
        
        
        if(SOSplayer == 0){
            SOSplayer = 1;
            clip.start();
            
        }
        else if (SOSplayer == 1){
            clip.stop();
            clip.close();
            SOSplayer = 0;
        }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_sosNowActionPerformed

    private void signOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutMouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO SIGN OUT");
        if(confirm == 0){
            dispose();
            Login log = new Login();
            log.setVisible(true);
        }
    }//GEN-LAST:event_signOutMouseClicked

    private void mapMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapMMouseClicked
        // TODO add your handling code here:
        Map map = new Map();
        map.setVisible(true);
        mapM.setForeground(Color.white);
        dispose();
    }//GEN-LAST:event_mapMMouseClicked

    private void viewMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMMouseClicked
        // TODO add your handling code here:
        ViewReport view = new ViewReport();
        view.setVisible(true);
        viewM.setForeground(Color.white);
        dispose();
    }//GEN-LAST:event_viewMMouseClicked

    private void fileMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMMouseClicked
        // TODO add your handling code here:
        FileReport file = new FileReport();
        file.setVisible(true);
        fileM.setForeground(Color.white);
        dispose();
    }//GEN-LAST:event_fileMMouseClicked

    private void profileMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMMouseClicked
        // TODO add your handling code here:
        Profile p = new Profile();
        p.setVisible(true);
        profileM.setForeground(Color.white);
        dispose();
    }//GEN-LAST:event_profileMMouseClicked

    private void home6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home6MouseClicked
        // TODO add your handling code here:
        sliderMenu.setSize(0, 0);
    }//GEN-LAST:event_home6MouseClicked

    private void sosMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sosMMouseClicked
        // TODO add your handling code here:
        SOS sos = new SOS();
        sos.setVisible(true);
        sosM.setForeground(Color.white);
        dispose();
    }//GEN-LAST:event_sosMMouseClicked

    private void reportPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportPMouseClicked
        // TODO add your handling code here:
        ViewReport vr = new ViewReport();
        vr.setVisible(true);
        dispose();
    }//GEN-LAST:event_reportPMouseClicked

    private void profilePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePMouseClicked
        // TODO add your handling code here:
        Profile p = new Profile();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_profilePMouseClicked

    private void sosPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sosPMouseClicked
        // TODO add your handling code here:
        SOS sos = new SOS();
        sos.setVisible(true);
        dispose();
    }//GEN-LAST:event_sosPMouseClicked

    private void mapRoutePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapRoutePMouseClicked
        // TODO add your handling code here:
        Map m = new Map();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_mapRoutePMouseClicked

    private void logo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logo2MouseClicked
        // TODO add your handling code here:

        sliderMenu.setSize(180, 640);
        sliderMenu.setVisible(true);
        sliderMenu.setAlignmentX(250);
    }//GEN-LAST:event_logo2MouseClicked

    private void sosNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sosNowMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sosNowMouseClicked

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
            java.util.logging.Logger.getLogger(SOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel fileM;
    private javax.swing.JLabel home6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    public static javax.swing.JLabel mapM;
    private javax.swing.JLabel mapRoute;
    private javax.swing.JLabel mapRouteP;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel profile;
    public static javax.swing.JLabel profileM;
    private javax.swing.JLabel profileP;
    private javax.swing.JLabel reportP;
    private javax.swing.JLabel reports;
    private javax.swing.JLabel signOut;
    private javax.swing.JToggleButton signalOnOff;
    private static javax.swing.JPanel sliderMenu;
    private javax.swing.JComboBox<String> sortBy;
    private javax.swing.JLabel sos;
    public static javax.swing.JLabel sosM;
    private javax.swing.JToggleButton sosNow;
    private javax.swing.JLabel sosP;
    private javax.swing.JLabel sosSignalStatus;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JLabel usernameLabel2;
    public static javax.swing.JLabel viewM;
    // End of variables declaration//GEN-END:variables
}
