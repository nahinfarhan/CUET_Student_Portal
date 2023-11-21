package javaapplication1;


import java.awt.Label;
import javax.swing.table.DefaultTableModel;
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

public class Teacher_gives_attendance extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    private String username;
    public void setUsername(String username) {
    this.username = username;
    }
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netbeans?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
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

        String s = "SELECT * FROM `sattendance` Where Course = '" + selectedCourse + "' AND Batch = '" + selectedBatch + "'";

        try {
            ps = con.createStatement();
            rs = ps.executeQuery(s);

            while (rs.next()) {
                // Create an array to hold row data
                Object[] row = new Object[model.getColumnCount()];

                // Add the existing columns to the row
                row[0] = rs.getInt("ID");
                row[1] = rs.getString("Batch");
                row[2] = rs.getString("Course");
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
        StringBuilder updateQuery = new StringBuilder("UPDATE sattendance SET ");

        // Build the SET clause for the update query
        for (int i = 1; i <= totalClassCount; i++) {
            String dynamicColumnName = "Class" + i;
            updateQuery.append(dynamicColumnName).append("=?");

            if (i < totalClassCount) {
                updateQuery.append(",");
            }
        }

        updateQuery.append(", Percentage=?"); // Add Percentage column to the SET clause
        updateQuery.append(" WHERE ID=? AND Course=? AND Batch=?");

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
        Logger.getLogger(Teacher_gives_attendance.class.getName()).log(Level.SEVERE, null, ex);
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


    public Teacher_gives_attendance() {
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

        CourseComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Add New Class");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Batch", "Course", "Semester", "Percentage"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Courses");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Update Attendance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            ResultSet resultSet = metaData.getColumns(null, null, "sattendance", columnName);

            if (!resultSet.next()) {
                // Column does not exist, add it
                statement = con.createStatement();

                // Execute the ALTER TABLE statement to add a new VARCHAR(1) column
                statement.executeUpdate("ALTER TABLE sattendance ADD COLUMN " + columnName + " TEXT(1)");

            }
            // Add the new column to the jTable1 model
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.addColumn(columnName);

            // Update ClassCount in the teachercourse table
            pst = con.prepareStatement("UPDATE teachercourse SET ClassCount = ? WHERE Batch = ? AND Course = ? AND T_ID = ?");
            pst.setInt(1, totalClassCount);
            pst.setString(2, selectedBatch);
            pst.setString(3, selectedCourse);
            pst.setInt(4, 1);
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        updateTable();
        clearTable();
        fillTable();
    }//GEN-LAST:event_jButton2ActionPerformed
    private String selectedCourse;
    private String selectedBatch;
    private int totalClassCount;
    private void CourseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseComboBoxActionPerformed
        // TODO add your handling code here:
        selectedCourse = CourseComboBox.getSelectedItem().toString();
        Connection con = getConnection();
        PreparedStatement ps = null;
        ResultSet countResultSet = null;

        try {
            // Get the total class count from a specific course
            String countQuery = "SELECT SUM(ClassCount) AS TotalClassCount, Batch FROM `teachercourse` WHERE Course = ?";
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

    private void CourseComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseComboBoxMouseClicked
        try {
            
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT Course FROM `teachercourse` WHERE T_ID = '1' ");
            Set<String> uniqueCourses = new HashSet<>();

            // Iterate over the result set
            while (rs.next()) {
                // Retrieve the "Course" value from the current row
                String name = rs.getString("Course");

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
            java.util.logging.Logger.getLogger(StudentAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_gives_attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CourseComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
