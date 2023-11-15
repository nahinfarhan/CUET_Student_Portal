
package javaapplication1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.PreparedStatement;


public class Dashboard_teacher extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    private String username;
    public void setUsername(String username) {
    this.username = username;
    teacher_id_show.setText(username);
    teacher_id_show.setEditable(false);
    setTeacherInfoFromDatabaseAndFullName();
}
    public Dashboard_teacher() {
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
    public void setTeacherInfoFromDatabaseAndFullName() {
    try {
        String query = "SELECT Teacher_name, Contact_Number, Email, dpt_name FROM Teacher WHERE Teacher_ID = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        
        // Set the Student_ID parameter to retrieve the information for a specific student (you can change this to match your use case)
        pst.setString(1, username); // Assuming 'username' is the student ID
        
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) { 
            String contactNumber = rs.getString("Contact_Number");
            String email = rs.getString("Email");
            String departmentName = rs.getString("dpt_name");
            String Name = rs.getString("Teacher_name");
            
            
            // Set the retrieved information in their respective JTextFields
            
            contactnumber_show.setText(contactNumber);
            email_show.setText(email);
            dept_show.setText(departmentName);
            teacher_name_show.setText(Name);
        } else {
            contactnumber_show.setText("Contact Number not found");
            email_show.setText("Email not found");
            dept_show.setText("Department not found");
            teacher_name_show.setText("Name not found");
        }
        
        // Close the result set, statement, and connection
        rs.close();
        pst.close();
        teacher_name_show.setEditable(false);
        contactnumber_show.setEditable(false);
        email_show.setEditable(false);
        dept_show.setEditable(false);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        CUET_logo = new javax.swing.JLabel();
        CUET_name = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        settings_button = new javax.swing.JButton();
        Dashboard_button = new javax.swing.JButton();
        courses_button = new javax.swing.JButton();
        accout_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        teacherID_label = new javax.swing.JLabel();
        teacherName_label = new javax.swing.JLabel();
        Department_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        Contact_number_label = new javax.swing.JLabel();
        teacher_id_show = new javax.swing.JTextField();
        teacher_name_show = new javax.swing.JTextField();
        dept_show = new javax.swing.JTextField();
        email_show = new javax.swing.JTextField();
        contactnumber_show = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1260, 850));
        setMinimumSize(new java.awt.Dimension(1260, 850));
        setResizable(false);

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

        teacherID_label.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        teacherID_label.setText("Teacher ID");

        teacherName_label.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        teacherName_label.setText("Teacher Name");

        Department_label.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Department_label.setText("Department");

        email_label.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        email_label.setText("E-mail");

        Contact_number_label.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Contact_number_label.setText("Contact Number");

        teacher_id_show.setBackground(new java.awt.Color(242, 242, 242));
        teacher_id_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacher_id_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teacher_id_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_id_showActionPerformed(evt);
            }
        });

        teacher_name_show.setBackground(new java.awt.Color(242, 242, 242));
        teacher_name_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacher_name_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teacher_name_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_name_showActionPerformed(evt);
            }
        });

        dept_show.setBackground(new java.awt.Color(242, 242, 242));
        dept_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dept_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dept_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept_showActionPerformed(evt);
            }
        });

        email_show.setBackground(new java.awt.Color(242, 242, 242));
        email_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_showActionPerformed(evt);
            }
        });

        contactnumber_show.setBackground(new java.awt.Color(242, 242, 242));
        contactnumber_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contactnumber_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contactnumber_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnumber_showActionPerformed(evt);
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
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Department_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(teacherName_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(email_show)
                                    .addComponent(teacher_name_show)
                                    .addComponent(dept_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(teacherID_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Contact_number_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contactnumber_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teacher_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherID_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacher_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacher_name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherName_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Department_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dept_show, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(email_show, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(email_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactnumber_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(390, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(200, 30, 1026, 646);

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

    private void teacher_id_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_id_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_id_showActionPerformed

    private void teacher_name_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_name_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_name_showActionPerformed

    private void dept_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dept_showActionPerformed

    private void email_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_showActionPerformed

    private void contactnumber_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnumber_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnumber_showActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CUET_logo;
    private java.awt.Label CUET_name;
    private javax.swing.JLabel Contact_number_label;
    private javax.swing.JButton Dashboard_button;
    private javax.swing.JLabel Department_label;
    private javax.swing.JButton accout_button;
    private javax.swing.JTextField contactnumber_show;
    private javax.swing.JButton courses_button;
    private javax.swing.JTextField dept_show;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_show;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton settings_button;
    private javax.swing.JLabel teacherID_label;
    private javax.swing.JLabel teacherName_label;
    private javax.swing.JTextField teacher_id_show;
    private javax.swing.JTextField teacher_name_show;
    // End of variables declaration//GEN-END:variables
}
