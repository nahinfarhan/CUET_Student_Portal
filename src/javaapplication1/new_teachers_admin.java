package javaapplication1;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class new_teachers_admin extends javax.swing.JFrame {

    String departmentName = "";
    String selectedTeacher = "";
    int teacherID = 0;
    Connection conn = null;
    ResultSet rs = null;
    private String username;

    public void setUsername(String username) {
        this.username = username;
        try {
            String query = "SELECT dpt_name FROM Admin WHERE User_Id = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, username);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                departmentName = rs.getString("dpt_name");

                teacher_dept_show.setText(departmentName);
            } else {

                teacher_dept_show.setText("Department not found");
            }
            
            rs.close();
            pst.close();
        } catch (Exception e) {
            // Handle the SQL exception (e.g., log the error, show an error message)
            e.printStackTrace();
            // Optionally, display an error message to the user
            teacher_dept_show.setText("Error fetching department name");
        }
        teacher_dept_show.setEditable(false);
    }

    public new_teachers_admin() {
        initComponents();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CUET_Students_Project?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Students_button_admin = new javax.swing.JButton();
        Teachers_button_admin = new javax.swing.JButton();
        courses_button_admin = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Contact_number = new javax.swing.JLabel();
        teacher_id_show = new javax.swing.JTextField();
        teacher_dept_show = new javax.swing.JTextField();
        teacher_email_show = new javax.swing.JTextField();
        teacher_contactnumber_show = new javax.swing.JTextField();
        new_student_button = new javax.swing.JButton();
        Search_student_button = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        name_show = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        CUET_logo = new javax.swing.JLabel();
        CUET_name = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1260, 850));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 380));
        jPanel1.setLayout(null);

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

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jLabel1.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel1.setText("Teacher ID");

        jLabel3.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel3.setText("Department");

        jLabel4.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel4.setText("E-mail");

        Contact_number.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Contact_number.setText("Contact Number");

        teacher_id_show.setBackground(new java.awt.Color(242, 242, 242));
        teacher_id_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacher_id_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teacher_id_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_id_showActionPerformed(evt);
            }
        });

        teacher_dept_show.setBackground(new java.awt.Color(242, 242, 242));
        teacher_dept_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacher_dept_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teacher_dept_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_dept_showActionPerformed(evt);
            }
        });

        teacher_email_show.setBackground(new java.awt.Color(242, 242, 242));
        teacher_email_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacher_email_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teacher_email_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_email_showActionPerformed(evt);
            }
        });

        teacher_contactnumber_show.setBackground(new java.awt.Color(242, 242, 242));
        teacher_contactnumber_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacher_contactnumber_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teacher_contactnumber_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_contactnumber_showActionPerformed(evt);
            }
        });

        new_student_button.setBackground(new java.awt.Color(57, 110, 186));
        new_student_button.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        new_student_button.setForeground(new java.awt.Color(255, 255, 255));
        new_student_button.setText("Add");
        new_student_button.setBorder(null);
        new_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_student_buttonActionPerformed(evt);
            }
        });

        Search_student_button.setBackground(new java.awt.Color(57, 110, 186));
        Search_student_button.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        Search_student_button.setForeground(new java.awt.Color(255, 255, 255));
        Search_student_button.setText("Search");
        Search_student_button.setBorder(null);
        Search_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_student_buttonActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        name.setText("Name");

        name_show.setBackground(new java.awt.Color(242, 242, 242));
        name_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(teacher_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(344, 344, 344))
                                .addComponent(Search_student_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(37, 37, 37)
                                .addComponent(teacher_dept_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(new_student_button, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Contact_number)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(teacher_email_show)
                                    .addComponent(teacher_contactnumber_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(teacher_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Search_student_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacher_dept_show, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacher_email_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacher_contactnumber_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(new_student_button)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(190, 30, 1040, 630);

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

    private void teacher_id_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_id_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_id_showActionPerformed

    private void teacher_dept_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_dept_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_dept_showActionPerformed

    private void teacher_email_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_email_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_email_showActionPerformed

    private void teacher_contactnumber_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_contactnumber_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_contactnumber_showActionPerformed

    private void new_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_student_buttonActionPerformed

        try {
            // Get the information for the new student from your JTextFields or other input components
            String teacherID = teacher_id_show.getText();
//            String advisor = selectedTeacher;
            
            String contactNumber = teacher_contactnumber_show.getText();
            String email = teacher_email_show.getText();
//        String departmentName = student_dept_show.getText();
            String Name = name_show.getText();
            
            
            String T_password = teacherID;
//            int teacherIDInt = Integer.parseInt(teacherID);
            int TeacherIDint = Integer.parseInt(teacherID);
            
            int contactnumberint = Integer.parseInt(contactNumber);
            

            String query = "INSERT INTO teacher ( Contact_Number, Email, dpt_name, Teacher_name, Teacher_ID, T_Password, User_Id) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
//            pst.setString(1, advisor);
//            pst.setString(2, hall);
            pst.setInt(1, contactnumberint);
            pst.setString(2, email);
            pst.setString(3, departmentName);
            pst.setString(4, Name);
//            pst.setString(7, lastName);
            pst.setInt(5, TeacherIDint);
            pst.setString(6, T_password);
//            pst.setInt(10, semesterint);
            
            pst.setString(7, username);

            // Execute the update
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                // Insert successful
                JOptionPane.showMessageDialog(this, "New teacher added successfully!");
            } else {
                // Insert failed
                JOptionPane.showMessageDialog(this, "Failed to add new teacher.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Close the statement
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding new teacher.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_new_student_buttonActionPerformed

    private void Search_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_student_buttonActionPerformed
        String SID = teacher_id_show.getText();
        try {
            String query = "SELECT Contact_Number, Email, Teacher_name  FROM Teacher WHERE Teacher_ID = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, SID);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
//            String advisor = rs.getString("Advisor");
//            String hall = rs.getString("Hall");
                String contactNumber = rs.getString("Contact_Number");
                String email = rs.getString("Email");
                
                String Name = rs.getString("Teacher_name");

                teacher_contactnumber_show.setText(contactNumber);
                teacher_email_show.setText(email);
//                teacher_dept_show.setText(departmentName);
                name_show.setText(Name);
            } else {
                teacher_contactnumber_show.setText("Contact Number not found");
                teacher_email_show.setText("Email not found");
//                teacher_dept_show.setText("Department not found");
                name_show.setText("Name not found");
            }

            rs.close();
            pst.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Search_student_buttonActionPerformed

    private void name_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_showActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_teachers_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CUET_logo;
    private java.awt.Label CUET_name;
    private javax.swing.JLabel Contact_number;
    private javax.swing.JButton Search_student_button;
    private javax.swing.JButton Students_button_admin;
    private javax.swing.JButton Teachers_button_admin;
    private javax.swing.JButton courses_button_admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton logout_button;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_show;
    private javax.swing.JButton new_student_button;
    private javax.swing.JTextField teacher_contactnumber_show;
    private javax.swing.JTextField teacher_dept_show;
    private javax.swing.JTextField teacher_email_show;
    private javax.swing.JTextField teacher_id_show;
    // End of variables declaration//GEN-END:variables
}
