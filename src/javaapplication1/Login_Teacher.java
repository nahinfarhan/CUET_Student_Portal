/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Login_Teacher extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    public Login_Teacher() {
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
        jPanel2 = new javax.swing.JPanel();
        teacher_pass_field = new javax.swing.JPasswordField();
        teacher_username_text = new javax.swing.JTextField();
        password_label = new java.awt.Label();
        username_label = new java.awt.Label();
        signin_teacher = new javax.swing.JButton();
        forget_pass_button = new javax.swing.JButton();
        login_label = new java.awt.Label();
        uni_icon = new javax.swing.JLabel();
        university_name_label = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(800, 574));
        setMinimumSize(new java.awt.Dimension(800, 574));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(239, 242, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 380));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        teacher_pass_field.setBackground(new java.awt.Color(223, 227, 237));
        teacher_pass_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_pass_fieldActionPerformed(evt);
            }
        });
        jPanel2.add(teacher_pass_field);
        teacher_pass_field.setBounds(50, 140, 340, 30);

        teacher_username_text.setBackground(new java.awt.Color(223, 227, 237));
        teacher_username_text.setToolTipText("Username");
        teacher_username_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_username_textActionPerformed(evt);
            }
        });
        jPanel2.add(teacher_username_text);
        teacher_username_text.setBounds(50, 60, 340, 30);

        password_label.setAlignment(java.awt.Label.CENTER);
        password_label.setBackground(new java.awt.Color(242, 242, 242));
        password_label.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        password_label.setText("Password");
        jPanel2.add(password_label);
        password_label.setBounds(50, 110, 80, 23);

        username_label.setAlignment(java.awt.Label.CENTER);
        username_label.setBackground(new java.awt.Color(242, 242, 242));
        username_label.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        username_label.setText("Username");
        jPanel2.add(username_label);
        username_label.setBounds(50, 30, 80, 23);

        signin_teacher.setBackground(new java.awt.Color(47, 110, 186));
        signin_teacher.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        signin_teacher.setForeground(new java.awt.Color(242, 242, 242));
        signin_teacher.setText("Sign In");
        signin_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_teacherActionPerformed(evt);
            }
        });
        jPanel2.add(signin_teacher);
        signin_teacher.setBounds(50, 190, 75, 25);

        forget_pass_button.setBackground(new java.awt.Color(242, 242, 242));
        forget_pass_button.setFont(new java.awt.Font("Chakra Petch", 0, 13)); // NOI18N
        forget_pass_button.setForeground(new java.awt.Color(47, 110, 186));
        forget_pass_button.setText("Forget Password");
        jPanel2.add(forget_pass_button);
        forget_pass_button.setBounds(260, 190, 130, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(200, 80, 440, 250);

        login_label.setAlignment(java.awt.Label.CENTER);
        login_label.setBackground(new java.awt.Color(148, 169, 216));
        login_label.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        login_label.setText("TEACHER LOGIN");
        jPanel1.add(login_label);
        login_label.setBounds(330, 30, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 148, 800, 426);

        uni_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/CUET_Vector_ogo.svg.png"))); // NOI18N
        uni_icon.setText("jLabel1");
        getContentPane().add(uni_icon);
        uni_icon.setBounds(0, 6, 122, 132);

        university_name_label.setFont(new java.awt.Font("Baloo Bhaijaan", 0, 28)); // NOI18N
        university_name_label.setText("Chittagong University of Engineering & Technology");
        getContentPane().add(university_name_label);
        university_name_label.setBounds(132, 44, 656, 47);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teacher_username_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_username_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_username_textActionPerformed

    private void signin_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_teacherActionPerformed
        try{
        String enteredUsername = teacher_username_text.getText();
        String enteredPassword = new String(teacher_pass_field.getPassword());
        String query = "select * from Teacher where Teacher_ID = ? and T_password = ?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, enteredUsername);
        st.setString(2, new String(enteredPassword));
        rs = st.executeQuery();
        if (rs.next()) {
            // Successful login
            JOptionPane.showMessageDialog(this, "Login Successful!");

            // Create an instance of Dashboard_teacher
            Dashboard_teacher dashboardTeacher = new Dashboard_teacher();
            dashboardTeacher.setUsername(enteredUsername);
            dashboardTeacher.setVisible(true);

            // Close the current Login_Student JFrame
            dispose();
        } else {
            // Invalid credentials
            JOptionPane.showMessageDialog(this, "Invalid username or password. Try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }
    catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database query error.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_signin_teacherActionPerformed

    private void teacher_pass_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_pass_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_pass_fieldActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forget_pass_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label login_label;
    private java.awt.Label password_label;
    private javax.swing.JButton signin_teacher;
    private javax.swing.JPasswordField teacher_pass_field;
    private javax.swing.JTextField teacher_username_text;
    private javax.swing.JLabel uni_icon;
    private java.awt.Label university_name_label;
    private java.awt.Label username_label;
    // End of variables declaration//GEN-END:variables
}
