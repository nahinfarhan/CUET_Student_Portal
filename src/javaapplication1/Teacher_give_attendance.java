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

public class Teacher_give_attendance extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public Teacher_give_attendance() {
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
        Connection con = getConnection();
        Statement ps = null;
        ResultSet rs = null;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String s = "SELECT * FROM `TeacherCountsAttendense` Where Course_No = '" + selectedCourse + "' AND Batch = '" + selectedBatch + "' ORDER BY Student_ID ASC";

        try {
            ps = con.createStatement();
            rs = ps.executeQuery(s);

            while (rs.next()) {
                // Create an array to hold row data
                Object[] row = new Object[model.getColumnCount()];

                // Add the existing columns to the row
                row[0] = rs.getInt("Student_ID");
                row[1] = rs.getString("Batch");
                row[2] = rs.getString("Course_No");
                row[3] = rs.getString("Semester");
                row[4] = rs.getFloat("Percentage");

                // Add the dynamic columns to the row
                for (int i = 5; i < model.getColumnCount(); i++) {
                    String dynamicColumnName = "Class" + (i - 4);
                    row[i] = rs.getString(dynamicColumnName);
                }

                // Add the row array to the table model
                model.addRow(row);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
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
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    try {
        con.setAutoCommit(false);  // Disable auto-commit for batch processing
        StringBuilder updateQuery = new StringBuilder("UPDATE TeacherCountsAttendense SET ");

        // Build the SET clause for the update query
        for (int i = 1; i <= totalClassCount; i++) {
            String dynamicColumnName = "Class" + i;
            updateQuery.append(dynamicColumnName).append("=?");

            if (i < totalClassCount) {
                updateQuery.append(",");
            }
        }

        updateQuery.append(", Percentage=?"); // Add Percentage column to the SET clause
        updateQuery.append(" WHERE Student_ID=? AND Course_No=? AND Batch=?");

        pst = con.prepareStatement(updateQuery.toString());

        // Iterate through jTable1 rows and update the table
        for (int rowIndex = 0; rowIndex < model.getRowCount(); rowIndex++) {
            int id = Integer.parseInt(model.getValueAt(rowIndex, 0).toString());

            // Set values for dynamic columns in the prepared statement
            int presentCount = 0;  // Count of "P" or "p"

            for (int colIndex = 5; colIndex < totalClassCount + 5; colIndex++) {
                String dynamicColumnName = "Class" + (colIndex - 4);
                Object columnObject = model.getValueAt(rowIndex, colIndex);
                String columnValue = (columnObject != null) ? columnObject.toString() : "";

                pst.setString(colIndex - 4, columnValue);

                // Count "P" or "p" occurrences
                if ("P".equalsIgnoreCase(columnValue)) {
                    presentCount++;
                }
            }

            // Calculate percentage and set values for WHERE clause
            double percentage = (double) presentCount / totalClassCount * 100;
            pst.setDouble(totalClassCount + 1, percentage);
            pst.setInt(totalClassCount + 2, id);
            pst.setString(totalClassCount + 3, selectedCourse);
            pst.setString(totalClassCount + 4, selectedBatch);

            // Add the update query to the batch
            pst.addBatch();
        }

        // Execute the batch update
        int[] updatedRows = pst.executeBatch();

        con.commit();  // Commit the changes
        con.setAutoCommit(true);  // Enable auto-commit after batch processing

        System.out.println(updatedRows.length + " rows updated");
    } catch (SQLException ex) {
        try {
            con.rollback();  // Rollback changes in case of an exception
        } catch (SQLException rollbackEx) {
            System.err.println("Rollback failed: " + rollbackEx.getMessage());
        }
        Logger.getLogger(StudentAttendance.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        CourseComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Batch", "Course", "Semester", "Percentage"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        jButton1.setText("Add New Class");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        jLabel1.setText("Courses");

        jButton2.setBackground(new java.awt.Color(57, 110, 186));
        jButton2.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Attendance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(230, 180, 1060, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String selectedCourse;
    private String selectedBatch;
    private int totalClassCount;
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ++totalClassCount;
        Connection con = getConnection();
        Statement statement = null;
        PreparedStatement pst = null;

        // Generate the new column name
        String columnName = "Class" + (totalClassCount);

        try {
            // Check if the column already exists in the table
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet resultSet = metaData.getColumns(null, null, "TeacherCountsAttendense", columnName);

            if (!resultSet.next()) {
                // Column does not exist, add it
                statement = con.createStatement();

                // Execute the ALTER TABLE statement to add a new VARCHAR(1) column
                statement.executeUpdate("ALTER TABLE TeacherCountsAttendense ADD COLUMN " + columnName + " TEXT(1)");

            }
            // Add the new column to the jTable1 model
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.addColumn(columnName);

            // Update ClassCount in the teachercourse table
            pst = con.prepareStatement("UPDATE TeacherTakesCourse SET ClassCount = ? WHERE Batch = ? AND Course_No = ? AND Teacher_ID = ?");
            pst.setInt(1, totalClassCount);
            pst.setString(2, selectedBatch);
            pst.setString(3, selectedCourse);
            pst.setString(4, username);
            pst.executeUpdate();

            // Refresh the table data
            clearTable();
            fillTable();

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            // Close resources in the finally block
            try {
                if (pst != null) {
                    pst.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CourseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBoxActionPerformed
        // TODO add your handling code here:
        selectedCourse = CourseComboBox.getSelectedItem().toString();
        Connection con = getConnection();
        PreparedStatement ps = null;
        ResultSet countResultSet = null;

        try {
            // Get the total class count from a specific course
            String countQuery = "SELECT SUM(ClassCount) AS TotalClassCount, Batch FROM `TeacherTakesCourse` WHERE Course_No = ?";
            ps = con.prepareStatement(countQuery);
            ps.setString(1, selectedCourse);
            countResultSet = ps.executeQuery();

            totalClassCount = 0;
            String batch = null;

            if (countResultSet.next()) {
                totalClassCount = countResultSet.getInt("TotalClassCount");
                batch = countResultSet.getString("Batch");
            }

            // Clear existing columns from jTable1 model
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setColumnCount(5); // Keep the first 5 column (ID), remove others

            // Add the new columns to the jTable1 model
            for (int i = 1; i <= totalClassCount; i++) {
                String columnName = "Class" + i;
                dtm.addColumn(columnName);
            }

            // Now you can use the 'batch' variable for further processing or storage
            System.out.println("Batch for " + selectedCourse + ": " + batch);
            selectedBatch = batch;
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        updateTable();
        clearTable();
        fillTable();
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Teacher_give_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_give_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_give_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_give_attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_give_attendance().setVisible(true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout_button;
    // End of variables declaration//GEN-END:variables
}
