package javaapplication1;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Logger;
import java.util.logging.Level;
import javaapplication1.Courses_admin;
import javaapplication1.Dashboard_teacher;
import javaapplication1.Login_Teacher;
import javaapplication1.Login_admin;
import javaapplication1.account_page_teacher;
import javaapplication1.students_admin;
import javaapplication1.teacher_courses_page;
import javaapplication1.teachers_admin;

public class Teacher_give_term_final extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public Teacher_give_term_final() {
        initComponents();
        //fillTable();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CUET_Students_Project?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CUET_Students_Project?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);  // Remove all rows from the table
    }

    public void fillTable() {
        Connection con = getConnection(); // Assuming you have a method to get a database connection
        Statement ps = null;
        ResultSet rs = null;
        String c = "SELECT * FROM `TeacherPublishesFinalResult` WHERE Course_No = '" + selectedCourse + "' ORDER BY Student_ID ASC";
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            ps = con.createStatement();
            rs = ps.executeQuery(c);

            while (rs.next()) {

                Object[] row = new Object[jTable1.getColumnCount()];
                row[0] = rs.getInt("Student_ID");
                row[1] = rs.getString("Batch");
                row[2] = rs.getString("Course_No");
                row[3] = rs.getInt("Semester");
                row[4] = rs.getInt("SectionA");
                row[5] = rs.getInt("SectionB");
                row[6] = rs.getInt("CTMarks");
                row[7] = rs.getInt("Attendance");
                row[8] = rs.getInt("TotalMarks");
                row[9] = rs.getFloat("Credit");
                row[10] = rs.getFloat("CGPA");
                row[11] = rs.getString("Grade");

                model.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                // Close the ResultSet, Statement, and Connection
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void updateTable() {
        Connection con = getConnection();
        PreparedStatement pst = null;
        PreparedStatement psct = null;
        PreparedStatement psatt = null;
        ResultSet rsct = null;
        ResultSet rsatt = null;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            con.setAutoCommit(false);  // Disable auto-commit for batch processing
            String updateQuery = "UPDATE TeacherPublishesFinalResult SET Semester=?, SectionA=?, SectionB=?, CTMarks=?, Attendance=?, TotalMarks=?, Credit=?, CGPA=?, Grade=? WHERE Student_ID=? AND Batch=? AND Course_No=?";

            pst = con.prepareStatement(updateQuery);

            for (int i = 0; i < model.getRowCount(); i++) {
                // Handle potential null values
                int id = getIntegerValue(model.getValueAt(i, 0));
                String batches = getStringValue(model.getValueAt(i, 1));
                String course = getStringValue(model.getValueAt(i, 2));
                String semester = getStringValue(model.getValueAt(i, 3));
                int secA = getIntegerValue(model.getValueAt(i, 4));
                int secB = getIntegerValue(model.getValueAt(i, 5));
                int ct = getIntegerValue(model.getValueAt(i, 6));
                int att = getIntegerValue(model.getValueAt(i, 7));
                int tm = getIntegerValue(model.getValueAt(i, 8));
                double crt = getDoubleValue(model.getValueAt(i, 9));
                double cg = getDoubleValue(model.getValueAt(i, 10));
                String grade = getStringValue(model.getValueAt(i, 11));

                // For CT Marks:
                String countct = "SELECT `BestCount` FROM `TeacherGivesCTMark` WHERE Student_ID = ? AND Course_No = ?";
                psct = con.prepareStatement(countct);
                psct.setInt(1, id);
                psct.setString(2, course);
                rsct = psct.executeQuery();

                if (rsct.next()) {
                    ct = rsct.getInt("BestCount");
                }

                // For Attendance Marks:
                int attpr = 0;
                String countatt = "SELECT `Percentage` FROM `TeacherCountsAttendense` WHERE Student_ID = ? AND Course_No = ?";
                psatt = con.prepareStatement(countatt);
                psatt.setInt(1, id);
                psatt.setString(2, course);
                rsatt = psatt.executeQuery();

                if (rsatt.next()) {
                    attpr = rsatt.getInt("Percentage");
                }

                 if (attpr >= 90) {
                    att = (int)credit * 10;
                } else if (attpr <= 89 && attpr >= 85) {
                    att = ((int)credit * 10 - (int)credit);
                } else if (attpr <= 84 && attpr >= 80) {
                    att = ((int)credit * 10 - 2 * (int)credit);
                } else if (attpr <= 79 && attpr >= 75) {
                    att = ((int)credit * 10 - 3 * (int)credit);
                } else if (attpr <= 74 && attpr >= 70) {
                    att = ((int)credit * 10 - 4 * (int)credit);
                } else if (attpr <= 69 && attpr >= 65) {
                    att = ((int)credit * 10 - 5 * (int)credit);
                } else if (attpr <= 64 && attpr >= 60) {
                    att = ((int)credit * 10 - 6 * (int)credit);
                } else {
                    attpr=0;
                }
                crt = credit;

                // Calculate the sum of secA secB ct att
                int[] cts = {secA, secB, ct, att};
                tm = 0;
                for (int x = 0; x < 4; x++) {
                    tm += cts[x];
                }

                // Calculate CGPA and Grade based on tm and credit
                // ...
                

                // CG Count:
                int cgpr = 0;
                double credit10 = credit*100.0;
                cgpr = (tm * 100) / (int)(credit10);
                if (cgpr >= 80) {
                    cg = 4.0;
                    grade = "A+";
                } else if (cgpr <= 79 && cgpr >= 75) {
                    cg = 3.75;
                    grade = "A";

                } else if (cgpr <= 74 && cgpr >= 70) {
                    cg = 3.5;
                    grade = "A-";

                } else if (cgpr <= 69 && cgpr >= 65) {
                    cg = 3.25;
                    grade = "B+";

                } else if (cgpr <= 64 && cgpr >= 60) {
                    cg = 3.00;
                    grade = "B";

                } else if (cgpr <= 59 && cgpr >= 55) {
                    cg = 2.75;
                    grade = "B-";

                } else if (cgpr <= 54 && cgpr >= 50) {
                    cg = 2.5;
                    grade = "C+";

                } else if (cgpr <= 49 && cgpr >= 45) {
                    cg = 2.25;
                    grade = "C";

                } else if (cgpr <= 44 && cgpr >= 40) {
                    cg = 2.0;
                    grade = "D";

                } else {
                    cg = 0.0;
                    grade = "F";
                }

                pst.setString(1, semester);
                pst.setInt(2, secA);
                pst.setInt(3, secB);
                pst.setInt(4, ct);
                pst.setInt(5, att);
                pst.setInt(6, tm);
                pst.setDouble(7, crt);
                pst.setDouble(8, cg);
                pst.setString(9, grade);
                pst.setInt(10, id);
                pst.setString(11, batches);
                pst.setString(12, course);

                pst.addBatch();
            }

            // Execute the batch update
            int[] updatedRows = pst.executeBatch();

            // Commit the changes
            con.commit();

            // Enable auto-commit after batch processing
            con.setAutoCommit(true);

            System.out.println(updatedRows.length + " rows updated");

        } catch (SQLException ex) {
            try {
                // Rollback changes in case of an exception
                con.rollback();
            } catch (SQLException rollbackEx) {
                System.err.println("Rollback failed: " + rollbackEx.getMessage());
            }
            Logger.getLogger(Update_All_MySQL_Data_Using_JTable.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                // Close resources
                if (rsct != null) {
                    rsct.close();
                }
                if (rsatt != null) {
                    rsatt.close();
                }
                if (pst != null) {
                    pst.close();
                }
                con.close();
            } catch (SQLException closeEx) {
                System.err.println("Error closing resources: " + closeEx.getMessage());
            }
        }
    }

// Helper method to handle potential null values when getting integer values
    private int getIntegerValue(Object value) {
        return (value != null && value.toString().matches("\\d+")) ? Integer.valueOf(value.toString()) : 0;
    }

// Helper method to handle potential null values when getting string values
    private String getStringValue(Object value) {
        return (value != null) ? value.toString() : "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CUET_logo4 = new javax.swing.JLabel();
        CUET_name4 = new java.awt.Label();
        Dashboard_button = new javax.swing.JButton();
        courses_button = new javax.swing.JButton();
        accout_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CourseComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1260, 850));
        getContentPane().setLayout(null);

        CUET_logo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/CUET_Vector_ogo.svg.png"))); // NOI18N
        CUET_logo4.setText("jLabel1");
        getContentPane().add(CUET_logo4);
        CUET_logo4.setBounds(170, 10, 122, 132);

        CUET_name4.setFont(new java.awt.Font("Baloo Bhaijaan", 0, 32)); // NOI18N
        CUET_name4.setForeground(new java.awt.Color(0, 0, 0));
        CUET_name4.setText("Chittagong University of Engineering & Technology");
        getContentPane().add(CUET_name4);
        CUET_name4.setBounds(330, 50, 827, 50);

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
        getContentPane().add(Dashboard_button);
        Dashboard_button.setBounds(20, 190, 170, 40);

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
        getContentPane().add(courses_button);
        courses_button.setBounds(20, 250, 170, 40);

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
        getContentPane().add(accout_button);
        accout_button.setBounds(20, 310, 170, 40);

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
        getContentPane().add(logout_button);
        logout_button.setBounds(20, 370, 170, 40);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        jLabel1.setText("Course");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 90, 40);

        CourseComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseComboBoxMouseClicked(evt);
            }
        });
        CourseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(CourseComboBox);
        CourseComboBox.setBounds(110, 10, 230, 30);

        jButton1.setBackground(new java.awt.Color(57, 110, 186));
        jButton1.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(480, 590, 140, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Batch", "Course", "Semester", "SectionA", "SectionB", "CTMarks", "Attendance", "TotalMarks", "Credit", "CGPA", "Grade"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(22, 52, 990, 530);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(230, 180, 1060, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String selectedCourse;
    private String selectedBatch;
    private double credit;

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

    private void CourseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBoxActionPerformed
        selectedCourse = CourseComboBox.getSelectedItem().toString();
        Connection con = getConnection();
        PreparedStatement ps = null;
        ResultSet countResultSet = null;
        try {
            // Get the total class count from a specific course
           // String countQuery = "SELECT Batch,Credit FROM `teachercourse` WHERE Course = ?";
            String countQuery = "SELECT Credit FROM `Course` WHERE Course_No = ?";
            ps = con.prepareStatement(countQuery);
            ps.setString(1, selectedCourse);
            countResultSet = ps.executeQuery();
            credit = 0.0;
            //String batch = null;

            if (countResultSet.next()) {
                credit = countResultSet.getDouble("Credit");
               // batch = countResultSet.getString("Batch");
            }

            // Now you can use the 'batch' variable for further processing or storage
            //System.out.println("Batch for " + selectedCourse + ": " + batch);
            System.out.println("Credit for " + selectedCourse + ": " + credit);
            //selectedBatch = batch;
            clearTable();
            fillTable();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            // Close resources in the finally block
            try {
                if (countResultSet != null) {
                    countResultSet.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_CourseComboBoxActionPerformed

    private void CourseComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseComboBoxMouseClicked
       
        try {
            
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT Course_No FROM `TeacherTakesCourse` WHERE Teacher_ID = '" + username + "'");
            Set<String> uniqueCourses = new HashSet<>();

            // Iterate over the result set .      
            CourseComboBox.removeAllItems();
            while (rs.next()) {
                // Retrieve the "Course" value from the current row
                String name = rs.getString("Course_No");

                // Add the course to the set (ignores duplicates)
                uniqueCourses.add(name);
            }

            // Add unique courses to the JComboBox (jComboBox1)
            for (String course : uniqueCourses) {
                CourseComboBox.addItem(course);
            }
            
        } catch (Exception e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_CourseComboBoxMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateTable();
        clearTable();
        fillTable();
        clearTable();
        fillTable();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher_give_term_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_give_term_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_give_term_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_give_term_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_give_term_final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CUET_logo4;
    private java.awt.Label CUET_name4;
    private javax.swing.JComboBox<String> CourseComboBox;
    private javax.swing.JButton Dashboard_button;
    private javax.swing.JButton accout_button;
    private javax.swing.JButton courses_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout_button;
    // End of variables declaration//GEN-END:variables

    private double getDoubleValue(Object valueAt) {
        try {
            if (valueAt != null) {
                return Double.parseDouble(valueAt.toString());
            }
        } catch (NumberFormatException e) {
            // Handle the exception (e.g., log an error message)
        }
        return 0.0;
    }
}
