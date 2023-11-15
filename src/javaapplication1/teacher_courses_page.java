/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import javax.swing.JFrame;

public class teacher_courses_page extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    private String username;
    public void setUsername(String username) {
    this.username = username;
    }
    public teacher_courses_page() {
        initComponents();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CUET_Students_Project?zeroDateTimeBehavior=CONVERT_TO_NULL","root",""); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        settings_button = new javax.swing.JButton();
        Dashboard_button = new javax.swing.JButton();
        courses_button = new javax.swing.JButton();
        accout_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        Leve1Term1_button = new javax.swing.JButton();
        Leve2Term1_button = new javax.swing.JButton();
        Leve3Term1_button1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CUET_logo = new javax.swing.JLabel();
        CUET_name = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1260, 850));
        setMinimumSize(new java.awt.Dimension(1260, 850));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 380));
        jPanel1.setLayout(null);

        settings_button.setBackground(new java.awt.Color(215, 215, 215));
        settings_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        settings_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/setting_icon.png"))); // NOI18N
        settings_button.setText("Settings");
        settings_button.setIconTextGap(10);
        settings_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(settings_button);
        settings_button.setBounds(10, 640, 170, 40);

        Dashboard_button.setBackground(new java.awt.Color(148, 169, 216));
        Dashboard_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        Dashboard_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/dashboars_icon.png"))); // NOI18N
        Dashboard_button.setText("Dashboard");
        Dashboard_button.setIconTextGap(10);
        Dashboard_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Dashboard_button);
        Dashboard_button.setBounds(10, 30, 170, 40);

        courses_button.setBackground(new java.awt.Color(148, 169, 216));
        courses_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        courses_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/course_icon.png"))); // NOI18N
        courses_button.setText("Courses");
        courses_button.setIconTextGap(10);
        courses_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courses_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(courses_button);
        courses_button.setBounds(10, 90, 170, 40);

        accout_button.setBackground(new java.awt.Color(148, 169, 216));
        accout_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        accout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/account_icon.png"))); // NOI18N
        accout_button.setText("Account");
        accout_button.setBorder(null);
        accout_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        accout_button.setIconTextGap(10);
        accout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accout_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(accout_button);
        accout_button.setBounds(10, 150, 170, 40);

        logout_button.setBackground(new java.awt.Color(148, 169, 216));
        logout_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/logout_icon.png"))); // NOI18N
        logout_button.setText("Logout");
        logout_button.setIconTextGap(10);
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(logout_button);
        logout_button.setBounds(10, 210, 170, 40);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        Leve1Term1_button.setBackground(new java.awt.Color(219, 217, 228));
        Leve1Term1_button.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve1Term1_button.setText("Course-1 ");
        Leve1Term1_button.setBorder(null);
        Leve1Term1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve1Term1_buttonActionPerformed(evt);
            }
        });

        Leve2Term1_button.setBackground(new java.awt.Color(240, 203, 184));
        Leve2Term1_button.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve2Term1_button.setText("Course-2");
        Leve2Term1_button.setBorder(null);
        Leve2Term1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve2Term1_buttonActionPerformed(evt);
            }
        });

        Leve3Term1_button1.setBackground(new java.awt.Color(182, 196, 237));
        Leve3Term1_button1.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve3Term1_button1.setText("Course-3");
        Leve3Term1_button1.setBorder(null);
        Leve3Term1_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve3Term1_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Leve1Term1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Leve2Term1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Leve3Term1_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(Leve1Term1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(Leve2Term1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(Leve3Term1_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(200, 30, 1026, 646);

        CUET_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/CUET_Vector_ogo.svg.png"))); // NOI18N
        CUET_logo.setText("jLabel1");

        CUET_name.setFont(new java.awt.Font("Baloo Bhaijaan", 0, 32)); // NOI18N
        CUET_name.setText("Chittagong University of Engineering & Technology");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CUET_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(CUET_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(CUET_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CUET_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settings_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settings_buttonActionPerformed

    private void Dashboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard_buttonActionPerformed
        Dashboard_teacher teacherDashboardFrame = new Dashboard_teacher();
        teacherDashboardFrame.setVisible(true);
        teacherDashboardFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_Dashboard_buttonActionPerformed

    private void courses_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courses_buttonActionPerformed
        teacher_courses_page teacherCourseFrame = new teacher_courses_page();
        teacherCourseFrame.setVisible(true);
        teacherCourseFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_courses_buttonActionPerformed

    private void accout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accout_buttonActionPerformed
        account_page_teacher teacherAccountFrame = new account_page_teacher();
        teacherAccountFrame.setVisible(true);
        teacherAccountFrame.setUsername(username);        
        dispose();
    }//GEN-LAST:event_accout_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        Login_Teacher teacherLoginFrame = new Login_Teacher();
        teacherLoginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void Leve1Term1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve1Term1_buttonActionPerformed
        JFrame studentTermsFrame = new Students_terms_nextpage();
        studentTermsFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_Leve1Term1_buttonActionPerformed

    private void Leve2Term1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve2Term1_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Leve2Term1_buttonActionPerformed

    private void Leve3Term1_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve3Term1_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Leve3Term1_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(teacher_courses_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacher_courses_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacher_courses_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacher_courses_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacher_courses_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CUET_logo;
    private java.awt.Label CUET_name;
    private javax.swing.JButton Dashboard_button;
    private javax.swing.JButton Leve1Term1_button;
    private javax.swing.JButton Leve2Term1_button;
    private javax.swing.JButton Leve3Term1_button1;
    private javax.swing.JButton accout_button;
    private javax.swing.JButton courses_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton settings_button;
    // End of variables declaration//GEN-END:variables
}
