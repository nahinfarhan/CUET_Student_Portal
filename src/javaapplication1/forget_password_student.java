package javaapplication1;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class forget_password_student extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;

    public forget_password_student() {
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

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        student_hall = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        dashboard = new javax.swing.JButton();
        student_advisor = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        student_id = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        get_password1 = new javax.swing.JButton();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 574));
        getContentPane().setLayout(null);

        label1.setFont(new java.awt.Font("Baloo Bhaijaan", 0, 28)); // NOI18N
        label1.setText("Chittagong University of Engineering & Technology");
        getContentPane().add(label1);
        label1.setBounds(132, 44, 656, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/CUET_Vector_ogo.svg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 6, 122, 132);

        jPanel1.setBackground(new java.awt.Color(239, 242, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 380));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        student_hall.setBackground(new java.awt.Color(223, 227, 237));
        student_hall.setToolTipText("Username");
        student_hall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_hallActionPerformed(evt);
            }
        });
        jPanel2.add(student_hall);
        student_hall.setBounds(110, 40, 300, 30);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(242, 242, 242));
        label4.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Hall");
        jPanel2.add(label4);
        label4.setBounds(40, 40, 60, 30);

        dashboard.setBackground(new java.awt.Color(47, 110, 186));
        dashboard.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        dashboard.setForeground(new java.awt.Color(242, 242, 242));
        dashboard.setText("Get Password");
        dashboard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dashboard.setOpaque(true);
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        jPanel2.add(dashboard);
        dashboard.setBounds(280, 180, 130, 25);

        student_advisor.setBackground(new java.awt.Color(223, 227, 237));
        student_advisor.setToolTipText("Username");
        student_advisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_advisorActionPerformed(evt);
            }
        });
        jPanel2.add(student_advisor);
        student_advisor.setBounds(110, 80, 300, 30);

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(242, 242, 242));
        label5.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Advisor");
        jPanel2.add(label5);
        label5.setBounds(40, 80, 60, 30);

        student_id.setBackground(new java.awt.Color(223, 227, 237));
        student_id.setToolTipText("Username");
        student_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_idActionPerformed(evt);
            }
        });
        jPanel2.add(student_id);
        student_id.setBounds(110, 120, 300, 30);

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(242, 242, 242));
        label6.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("StudentID");
        jPanel2.add(label6);
        label6.setBounds(30, 120, 70, 30);

        get_password1.setBackground(new java.awt.Color(47, 110, 186));
        get_password1.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        get_password1.setForeground(new java.awt.Color(242, 242, 242));
        get_password1.setText("Login");
        get_password1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        get_password1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        get_password1.setOpaque(true);
        get_password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                get_password1ActionPerformed(evt);
            }
        });
        jPanel2.add(get_password1);
        get_password1.setBounds(70, 180, 130, 25);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 60, 500, 320);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(148, 169, 216));
        label3.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        label3.setText("STUDENT LOGIN");
        jPanel1.add(label3);
        label3.setBounds(330, 10, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 148, 800, 426);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void student_hallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_hallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_hallActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        try {
            String advisor = student_advisor.getText(); // Get advisor value from the text field
            String hall = student_hall.getText(); // Get hall value from the text field
            String studentID = student_id.getText(); // Get studentID value from the text field

            // Check if all required fields are not empty
            if (advisor.isEmpty() || hall.isEmpty() || studentID.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit method if any field is empty
            }

            // Query the database to check if the provided credentials are correct
            String query = "SELECT S_passward FROM student WHERE Advisor = ? AND Hall = ? AND Student_ID = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, advisor);
            pst.setString(2, hall);
            pst.setString(3, studentID);

            ResultSet rs = pst.executeQuery();

            // If there is a matching record
            if (rs.next()) {
                String password = rs.getString("S_passward");
                // Provide the password to the user
                JOptionPane.showMessageDialog(this, "Your password is: " + password, "Password Retrieval", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Credentials don't match
                JOptionPane.showMessageDialog(this, "Invalid credentials. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }

            // Close the ResultSet and PreparedStatement
            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error retrieving password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_dashboardActionPerformed

    private void student_advisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_advisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_advisorActionPerformed

    private void student_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_idActionPerformed

    private void get_password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_get_password1ActionPerformed
            Login_Student dashboardStudent = new Login_Student();
            dashboardStudent.setVisible(true);
    }//GEN-LAST:event_get_password1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new forget_password_student().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboard;
    private javax.swing.JButton get_password1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTextField student_advisor;
    private javax.swing.JTextField student_hall;
    private javax.swing.JTextField student_id;
    // End of variables declaration//GEN-END:variables
}
