package javaapplication1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class modify_course extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    private String username;
    public void setUsername(String username) {
    this.username = username;    
}
    public modify_course() {
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
        Students_button_admin = new javax.swing.JButton();
        Teachers_button_admin = new javax.swing.JButton();
        courses_button_admin = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        modify_student_button = new javax.swing.JButton();
        delete_student_button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        course_id_show = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        course_name_show = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        credit_show = new javax.swing.JTextField();
        semester_label = new javax.swing.JLabel();
        semester = new javax.swing.JTextField();
        Search_button = new javax.swing.JButton();
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

        modify_student_button.setBackground(new java.awt.Color(57, 110, 186));
        modify_student_button.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        modify_student_button.setForeground(new java.awt.Color(255, 255, 255));
        modify_student_button.setText("Modify");
        modify_student_button.setBorder(null);
        modify_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_student_buttonActionPerformed(evt);
            }
        });

        delete_student_button1.setBackground(new java.awt.Color(57, 110, 186));
        delete_student_button1.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        delete_student_button1.setForeground(new java.awt.Color(255, 255, 255));
        delete_student_button1.setText("Delete");
        delete_student_button1.setBorder(null);
        delete_student_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_student_button1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel1.setText("Course ID");

        course_id_show.setBackground(new java.awt.Color(242, 242, 242));
        course_id_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        course_id_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        course_id_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_id_showActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel2.setText("Course Name");

        course_name_show.setBackground(new java.awt.Color(242, 242, 242));
        course_name_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        course_name_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        course_name_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_name_showActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel5.setText("Credit");

        credit_show.setBackground(new java.awt.Color(242, 242, 242));
        credit_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        credit_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        credit_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                credit_showActionPerformed(evt);
            }
        });

        semester_label.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        semester_label.setText("Semester");

        semester.setBackground(new java.awt.Color(242, 242, 242));
        semester.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        semester.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        Search_button.setBackground(new java.awt.Color(57, 110, 186));
        Search_button.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        Search_button.setForeground(new java.awt.Color(255, 255, 255));
        Search_button.setText("Search");
        Search_button.setBorder(null);
        Search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonActionPerformed(evt);
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
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(course_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(344, 344, 344))
                                .addComponent(Search_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(course_name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(credit_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(semester_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(delete_student_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(216, 216, 216)
                                .addComponent(modify_student_button, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(course_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Search_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(course_name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(credit_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semester_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_student_button)
                    .addComponent(delete_student_button1))
                .addContainerGap(373, Short.MAX_VALUE))
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
                .addGap(16, 16, 16)
                .addComponent(CUET_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
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

    private void modify_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_student_buttonActionPerformed
        String SID = course_id_show.getText();
        String CourseName = course_name_show.getText();
        String Credit = credit_show.getText();
        String Semester = semester.getText();
        try {
        String updateQuery = "UPDATE Course SET Course_Name = ?, Credit = ?, Semester = ? WHERE Course_No=?";
        PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
        
        // Set parameters
        updateStatement.setString(1, CourseName);
        updateStatement.setString(2, Credit);
        updateStatement.setString(3, Semester);
        updateStatement.setString(4, SID);
        
        // Execute update
        int rowsAffected = updateStatement.executeUpdate();
        
        if (rowsAffected > 0) {
            // Update successful
            System.out.println("Course information updated successfully.");
        } else {
            // Update failed
            System.out.println("Failed to update course information.");
        }
        updateStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
        
        try {
        
        String updateQuery = "UPDATE TeacherPublishesFinalResult SET Credit = ? WHERE Course_No=?";
        PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
        
        // Set parameters
        updateStatement.setString(1, Credit);
        updateStatement.setString(2, SID);        
        // Execute update
        int rowsAffected = updateStatement.executeUpdate();
        
        if (rowsAffected > 0) {
            // Update successful
            System.out.println("Course information updated successfully.");
        } else {
            // Update failed
            System.out.println("Failed to update course information.");
        }
        updateStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_modify_student_buttonActionPerformed

    private void delete_student_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_student_button1ActionPerformed
        try {
        String course_No = course_id_show.getText(); // Assuming 'student_id_show' is the JTextField displaying student ID
        String deleteAttendanceQuery = "DELETE FROM TeacherTakesCourse WHERE Course_No=?";
        PreparedStatement deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, course_No);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        
        deleteAttendanceQuery = "DELETE FROM TeacherGivesCTMark WHERE Course_No=?";
        deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, course_No);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        
        deleteAttendanceQuery = "DELETE FROM TeacherCountsAttendense WHERE Course_No=?";
        deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, course_No);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        
        deleteAttendanceQuery = "DELETE FROM TeacherPublishesFinalResult WHERE Course_No=?";
        deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, course_No);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        
        
        // Deletion query
        String deleteQuery = "DELETE FROM Course WHERE Course_No=?";
        
        PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);

        // Set the parameter
        deleteStatement.setString(1, course_No);

        // Execute deletion
        int rowsAffected = deleteStatement.executeUpdate();

        if (rowsAffected > 0) {
            // Deletion successful
            System.out.println("Course information deleted successfully.");
            course_id_show.setText("");
            course_name_show.setText("");
            credit_show.setText("");
            semester.setText("");
            
        } else {
            // Deletion failed
            System.out.println("Failed to delete course information.");
        }

        // Close the statement
        deleteStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_delete_student_button1ActionPerformed

    private void course_id_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_id_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_id_showActionPerformed

    private void course_name_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_name_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_name_showActionPerformed

    private void credit_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_credit_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_credit_showActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed

    private void Search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonActionPerformed
        String SID = course_id_show.getText();
        try {
            String query = "SELECT Course_Name, Credit, Semester FROM Course WHERE Course_No = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, SID);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String CourseName = rs.getString("Course_Name");
                String Credit = rs.getString("Credit");
                String Semester = rs.getString("Semester");

                semester.setText(Semester);
                course_name_show.setText(CourseName);
                credit_show.setText(Credit);
            } else {
                // Handle the case where no student is found with the given Student_ID
                // You can clear the fields or show an error message
                semester.setText("Semester not found");
                course_name_show.setText("Name not found");
                credit_show.setText("Credit not found");
            }

            // Close the result set, statement, and connection
            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Search_buttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modify_course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CUET_logo;
    private java.awt.Label CUET_name;
    private javax.swing.JButton Search_button;
    private javax.swing.JButton Students_button_admin;
    private javax.swing.JButton Teachers_button_admin;
    private javax.swing.JTextField course_id_show;
    private javax.swing.JTextField course_name_show;
    private javax.swing.JButton courses_button_admin;
    private javax.swing.JTextField credit_show;
    private javax.swing.JButton delete_student_button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton modify_student_button;
    private javax.swing.JTextField semester;
    private javax.swing.JLabel semester_label;
    // End of variables declaration//GEN-END:variables
}
