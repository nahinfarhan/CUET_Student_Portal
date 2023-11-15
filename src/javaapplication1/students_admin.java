package javaapplication1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.PreparedStatement;

public class students_admin extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    private String username;
    public void setUsername(String username) {
        
    this.username = username;  
}
    
    public students_admin() {
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
        Students_button_admin = new javax.swing.JButton();
        Teachers_button_admin = new javax.swing.JButton();
        courses_button_admin = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane13 = new javax.swing.JTabbedPane();
        jTabbedPane14 = new javax.swing.JTabbedPane();
        new_student_button = new javax.swing.JButton();
        modify_student_button = new javax.swing.JButton();
        student_search_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CUET_logo = new javax.swing.JLabel();
        CUET_name = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1260, 850));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 380));
        jPanel1.setLayout(null);

        settings_button.setBackground(new java.awt.Color(215, 215, 215));
        settings_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        settings_button.setText("Settings");
        settings_button.setIconTextGap(10);
        settings_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(settings_button);
        settings_button.setBounds(10, 640, 170, 40);

        Students_button_admin.setBackground(new java.awt.Color(148, 169, 216));
        Students_button_admin.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        Students_button_admin.setText("Students");
        Students_button_admin.setIconTextGap(10);
        Students_button_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Students_button_adminActionPerformed(evt);
            }
        });
        jPanel1.add(Students_button_admin);
        Students_button_admin.setBounds(10, 30, 170, 40);

        Teachers_button_admin.setBackground(new java.awt.Color(148, 169, 216));
        Teachers_button_admin.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        Teachers_button_admin.setText("Teachers");
        Teachers_button_admin.setToolTipText("");
        Teachers_button_admin.setIconTextGap(10);
        Teachers_button_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teachers_button_adminActionPerformed(evt);
            }
        });
        jPanel1.add(Teachers_button_admin);
        Teachers_button_admin.setBounds(10, 90, 170, 40);

        courses_button_admin.setBackground(new java.awt.Color(148, 169, 216));
        courses_button_admin.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        courses_button_admin.setText("Courses");
        courses_button_admin.setBorder(null);
        courses_button_admin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        courses_button_admin.setIconTextGap(10);
        courses_button_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courses_button_adminActionPerformed(evt);
            }
        });
        jPanel1.add(courses_button_admin);
        courses_button_admin.setBounds(10, 150, 170, 40);

        logout_button.setBackground(new java.awt.Color(148, 169, 216));
        logout_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        logout_button.setText("Logout");
        logout_button.setIconTextGap(10);
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(logout_button);
        logout_button.setBounds(10, 210, 170, 40);
        jPanel1.add(jTabbedPane2);
        jTabbedPane2.setBounds(180, -30, 0, 1);
        jPanel1.add(jTabbedPane4);
        jTabbedPane4.setBounds(170, -20, 0, 1);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jTabbedPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 0, 1030, -1));
        jPanel10.add(jTabbedPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        new_student_button.setBackground(new java.awt.Color(57, 110, 186));
        new_student_button.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        new_student_button.setForeground(new java.awt.Color(255, 255, 255));
        new_student_button.setText("New Student Add");
        new_student_button.setBorder(null);
        new_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_student_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(new_student_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 304, 38));

        modify_student_button.setBackground(new java.awt.Color(57, 110, 186));
        modify_student_button.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        modify_student_button.setForeground(new java.awt.Color(255, 255, 255));
        modify_student_button.setText("Modify Student");
        modify_student_button.setBorder(null);
        modify_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_student_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(modify_student_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 304, 38));

        student_search_button.setBackground(new java.awt.Color(57, 110, 186));
        student_search_button.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        student_search_button.setForeground(new java.awt.Color(255, 255, 255));
        student_search_button.setText("Search Student");
        student_search_button.setBorder(null);
        student_search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_search_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(student_search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 304, 38));

        jPanel1.add(jPanel10);
        jPanel10.setBounds(190, 30, 1040, 630);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
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

    private void Students_button_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Students_button_adminActionPerformed
        students_admin studentDashboardFrame = new students_admin();
        studentDashboardFrame.setVisible(true);
        studentDashboardFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_Students_button_adminActionPerformed

    private void Teachers_button_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Teachers_button_adminActionPerformed
        teachers_admin studentTermsFrame;
        studentTermsFrame = new teachers_admin();
        studentTermsFrame.setVisible(true);
        studentTermsFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_Teachers_button_adminActionPerformed

    private void courses_button_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courses_button_adminActionPerformed
        Courses_admin studentAccountFrame = new Courses_admin();
        studentAccountFrame.setVisible(true);
        studentAccountFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_courses_button_adminActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        Login_admin studentLoginFrame = new Login_admin();
        studentLoginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void new_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_student_buttonActionPerformed
        new_students_admin studentAccountFrame = new new_students_admin();
        studentAccountFrame.setVisible(true);
        studentAccountFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_new_student_buttonActionPerformed

    private void modify_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_student_buttonActionPerformed
        modify_students_admin studentAccountFrame = new modify_students_admin();
        studentAccountFrame.setVisible(true);
        studentAccountFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_modify_student_buttonActionPerformed

    private void student_search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_search_buttonActionPerformed
        search_students_admin studentAccountFrame = new search_students_admin();
        studentAccountFrame.setVisible(true);
        studentAccountFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_student_search_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(students_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(students_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(students_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(students_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new students_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CUET_logo;
    private java.awt.Label CUET_name;
    private javax.swing.JButton Students_button_admin;
    private javax.swing.JButton Teachers_button_admin;
    private javax.swing.JButton courses_button_admin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane13;
    private javax.swing.JTabbedPane jTabbedPane14;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton modify_student_button;
    private javax.swing.JButton new_student_button;
    private javax.swing.JButton settings_button;
    private javax.swing.JButton student_search_button;
    // End of variables declaration//GEN-END:variables
}
