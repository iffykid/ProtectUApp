/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProtectU;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author shaun
 */
public class FileReport extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public FileReport() {
        initComponents();
        init();
        scaled();
    }
     public void scaled(){
        /*ImageIcon icon = new ImageIcon("location.png");
        Image img = icon.getImage();
        Image imgScaled = img.getScaledInstance(protectU.getWidth(), protectU.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScaled);
        protectU.setIcon(scaledIcon);
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
        fileM.setForeground(Color.white);
        sliderMenu.setSize(0, HEIGHT);
        //sliderMenu.setVisible(false);
        sliderMenu.setAlignmentX(430);
    }
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
        jLabel2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        crimeType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        crimeDescription = new javax.swing.JTextArea();
        label = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        fileReport = new javax.swing.JButton();
        areaLocation = new javax.swing.JTextField();
        crimeDate = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        reportP = new javax.swing.JLabel();
        profileP = new javax.swing.JLabel();
        sosP = new javax.swing.JLabel();
        mapRouteP = new javax.swing.JLabel();
        sos = new javax.swing.JLabel();
        reports = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        mapRoute = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(430, 640));
        setMinimumSize(new java.awt.Dimension(430, 640));
        setSize(new java.awt.Dimension(430, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel2.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Protect");
        sliderMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 110, -1));

        jPanel1.add(sliderMenu);
        sliderMenu.setBounds(250, 0, 180, 640);

        logo.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        logo.setText("MENU");
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        jPanel1.add(logo);
        logo.setBounds(350, 0, 70, 30);

        crimeType.setFont(new java.awt.Font("Noto Sans Oriya", 1, 14)); // NOI18N
        crimeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*", "Antisocial Behaviour", "Arson", "Burglary", "Childhood Abuse", "Crime Abroad", "Domestic Abuse", "Fraud", "Hate Crime", "Modern Slavery", "Murder", "Manslaughter", "Rape", "Sexual Assault", "Robbery", "Sexual Harassment", "Stalking", "Terrorism", "Violent Crime", "Protesting", "Looting", "Kidnapping", "Alcohol Abuse", "Hijacking", "Undefined" }));
        crimeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimeTypeActionPerformed(evt);
            }
        });
        jPanel1.add(crimeType);
        crimeType.setBounds(50, 130, 330, 30);

        crimeDescription.setColumns(20);
        crimeDescription.setRows(5);
        jScrollPane1.setViewportView(crimeDescription);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 250, 330, 140);

        label.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        label.setForeground(new java.awt.Color(255, 0, 0));
        label.setText("PLEASE ENTER THE DATE (YYYY-MM-DD)");
        jPanel1.add(label);
        label.setBounds(50, 400, 310, 14);

        label1.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 0, 0));
        label1.setText("PLEASE INDICATE THE CITY OF THE CRIME");
        jPanel1.add(label1);
        label1.setBounds(50, 170, 270, 14);

        label2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label2.setText("PLEASE PROVIDE ACCURATE INFORMATION");
        jPanel1.add(label2);
        label2.setBounds(80, 80, 270, 14);

        fileReport.setFont(new java.awt.Font("Noto Sans Oriya", 1, 20)); // NOI18N
        fileReport.setText("FILE REPORT");
        fileReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileReportActionPerformed(evt);
            }
        });
        jPanel1.add(fileReport);
        fileReport.setBounds(130, 470, 170, 30);
        jPanel1.add(areaLocation);
        areaLocation.setBounds(50, 190, 330, 30);
        jPanel1.add(crimeDate);
        crimeDate.setBounds(50, 420, 330, 30);

        label3.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 0, 0));
        label3.setText("PLEASE PROVIDE A DESCRIPTION OF THE REPORT");
        jPanel1.add(label3);
        label3.setBounds(50, 230, 310, 14);

        label4.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 0, 0));
        label4.setText("PLASE SELECT CRIME CATEGORY");
        jPanel1.add(label4);
        label4.setBounds(50, 110, 210, 14);

        label5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label5.setText("THIS REPORT WILL BE SUBMITTED TO THE");
        jPanel1.add(label5);
        label5.setBounds(90, 20, 250, 14);

        label6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label6.setText("RELEVENT POLICE STATION AND WILL BE ");
        jPanel1.add(label6);
        label6.setBounds(90, 40, 250, 14);

        label7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label7.setText("INVESTIGATED. ");
        jPanel1.add(label7);
        label7.setBounds(170, 60, 100, 14);

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

    private void crimeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crimeTypeActionPerformed

    private void fileReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileReportActionPerformed
        // TODO add your handling code here:
        ReportClass rc = new ReportClass();
        GPSClass gps = new GPSClass();
        int input = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO FILE THIS REPORT.");
        if(input == 0){
            //System.out.println(" " + crimeType.getSelectedItem().toString());
            rc.createReport(gps.areaCodeFinder(areaLocation.getText()), crimeType.getSelectedItem().toString(), crimeDescription.getText(), crimeDate.getText());
            ViewReport vr = new ViewReport();
            vr.setVisible(true);
            dispose();
        }

        
    }//GEN-LAST:event_fileReportActionPerformed

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

    private void signOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutMouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO SIGN OUT","SIGN OUT", JOptionPane.YES_NO_OPTION);
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

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        // TODO add your handling code here:

        sliderMenu.setSize(180, 640);
        sliderMenu.setVisible(true);
        sliderMenu.setAlignmentX(250);
    }//GEN-LAST:event_logoMouseClicked

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
            java.util.logging.Logger.getLogger(FileReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaLocation;
    private javax.swing.JTextField crimeDate;
    private javax.swing.JTextArea crimeDescription;
    private javax.swing.JComboBox<String> crimeType;
    public static javax.swing.JLabel fileM;
    private javax.swing.JButton fileReport;
    private javax.swing.JLabel home6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
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
    private static javax.swing.JPanel sliderMenu;
    private javax.swing.JLabel sos;
    public static javax.swing.JLabel sosM;
    private javax.swing.JLabel sosP;
    public static javax.swing.JLabel viewM;
    // End of variables declaration//GEN-END:variables
}
