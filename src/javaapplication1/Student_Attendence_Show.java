
package javaapplication1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Student_Attendence_Show extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    private String username;
    public void setUsername(String username) {
    this.username = username;
    }
//    String selectedID = username;
    private int totalColumns;
    public Student_Attendence_Show() {
        initComponents();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CUET_Students_Project?zeroDateTimeBehavior=CONVERT_TO_NULL","root",""); 
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT COUNT(*) AS total_columns FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'TeacherCountsAttendense';");
       

            // Iterate over the result set
            while (rs.next()) {
                totalColumns = rs.getInt("total_columns");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
//        System.out.println(totalC olumns);
         for (int i = 0; i < totalColumns - 5; i++) {
            String columnName = "Class" + (i + 1);
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.addColumn(columnName);
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CUET_Students_Project?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
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

        String s = "SELECT * FROM `TeacherCountsAttendense` Where Student_ID = '" + username + "'" + " AND Semester = '" + selectedSemester + "'";

        try {
            ps = con.createStatement();
            rs = ps.executeQuery(s);

            while (rs.next()) {
                // Create an array to hold row data // 
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        Dashboard_button3 = new javax.swing.JButton();
        terms_button = new javax.swing.JButton();
        accout_button3 = new javax.swing.JButton();
        logout_button3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane13 = new javax.swing.JTabbedPane();
        jTabbedPane14 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane15 = new javax.swing.JTabbedPane();
        jTabbedPane16 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        CUET_logo2 = new javax.swing.JLabel();
        CUET_name2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel9.setPreferredSize(new java.awt.Dimension(800, 380));
        jPanel9.setLayout(null);

        Dashboard_button3.setBackground(new java.awt.Color(148, 169, 216));
        Dashboard_button3.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        Dashboard_button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/dashboars_icon.png"))); // NOI18N
        Dashboard_button3.setText("Dashboard");
        Dashboard_button3.setIconTextGap(10);
        Dashboard_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard_button3ActionPerformed(evt);
            }
        });
        jPanel9.add(Dashboard_button3);
        Dashboard_button3.setBounds(10, 30, 170, 40);

        terms_button.setBackground(new java.awt.Color(148, 169, 216));
        terms_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        terms_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/course_icon.png"))); // NOI18N
        terms_button.setText("Terms");
        terms_button.setIconTextGap(10);
        terms_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terms_buttonActionPerformed(evt);
            }
        });
        jPanel9.add(terms_button);
        terms_button.setBounds(10, 90, 170, 40);

        accout_button3.setBackground(new java.awt.Color(148, 169, 216));
        accout_button3.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        accout_button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/account_icon.png"))); // NOI18N
        accout_button3.setText("Account");
        accout_button3.setBorder(null);
        accout_button3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        accout_button3.setIconTextGap(10);
        accout_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accout_button3ActionPerformed(evt);
            }
        });
        jPanel9.add(accout_button3);
        accout_button3.setBounds(10, 150, 170, 40);

        logout_button3.setBackground(new java.awt.Color(148, 169, 216));
        logout_button3.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        logout_button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/logout_icon.png"))); // NOI18N
        logout_button3.setText("Logout");
        logout_button3.setIconTextGap(10);
        logout_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_button3ActionPerformed(evt);
            }
        });
        jPanel9.add(logout_button3);
        logout_button3.setBounds(10, 210, 170, 40);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jTabbedPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 0, 1030, -1));
        jPanel10.add(jTabbedPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        jLabel1.setText("Semester");
        jPanel10.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level-1 Term-1", "Level-1 Term-2", "Level-2 Term-1", "Level-2 Term-2", "Level-3 Term-1", "Level-3 Term-2", "Level-4 Term-1", "Level-4 Term-2" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 160, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Batch", "Course", "Semester", "Percentage"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 990, 550));

        jPanel9.add(jPanel10);
        jPanel10.setBounds(190, 30, 1040, 630);
        jPanel9.add(jTabbedPane15);
        jTabbedPane15.setBounds(180, -30, 0, 1);
        jPanel9.add(jTabbedPane16);
        jTabbedPane16.setBounds(170, -20, 0, 1);

        CUET_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/CUET_Vector_ogo.svg.png"))); // NOI18N
        CUET_logo2.setText("jLabel1");

        CUET_name2.setFont(new java.awt.Font("Baloo Bhaijaan", 0, 32)); // NOI18N
        CUET_name2.setText("Chittagong University of Engineering & Technology");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CUET_logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(CUET_name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(CUET_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CUET_logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Dashboard_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard_button3ActionPerformed
        Dashboard_student studentDashboardFrame = new Dashboard_student();
        studentDashboardFrame.setVisible(true);
        studentDashboardFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_Dashboard_button3ActionPerformed

    private void terms_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terms_buttonActionPerformed
        Student_terms studentTermsFrame = new Student_terms();
        studentTermsFrame.setVisible(true);
        studentTermsFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_terms_buttonActionPerformed

    private void accout_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accout_button3ActionPerformed
        account_page_student studentAccountFrame = new account_page_student();
        studentAccountFrame.setVisible(true);
        studentAccountFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_accout_button3ActionPerformed

    private void logout_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_button3ActionPerformed
        Login_Student studentLoginFrame = new Login_Student();
        studentLoginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_button3ActionPerformed

    private String selectedSemester;
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        String sem = jComboBox1.getSelectedItem().toString();
        if (sem == "Level-1 Term-1") {
            selectedSemester = "1";
        } else if (sem == "Level-1 Term-2") {
            selectedSemester = "2";
        } else if (sem == "Level-2 Term-1") {
            selectedSemester = "3";
        } else if (sem == "Level-2 Term-2") {
            selectedSemester = "4";
        } else if (sem == "Level-3 Term-1") {
            selectedSemester = "5";
        } else if (sem == "Level-3 Term-2") {
            selectedSemester = "6";
        } else if (sem == "Level-4 Term-1") {
            selectedSemester = "7";
        } else if (sem == "Level-4 Term-2") {
            selectedSemester = "8";
        }

        System.out.println(sem + "\n" + selectedSemester);
        System.out.println(username + "\n");
        System.out.println(totalColumns + "\n");
        clearTable();
        fillTable();
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Attendence_Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Attendence_Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Attendence_Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Attendence_Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Attendence_Show().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CUET_logo2;
    private java.awt.Label CUET_name2;
    private javax.swing.JButton Dashboard_button3;
    private javax.swing.JButton accout_button3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane13;
    private javax.swing.JTabbedPane jTabbedPane14;
    private javax.swing.JTabbedPane jTabbedPane15;
    private javax.swing.JTabbedPane jTabbedPane16;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout_button3;
    private javax.swing.JButton terms_button;
    // End of variables declaration//GEN-END:variables
}
