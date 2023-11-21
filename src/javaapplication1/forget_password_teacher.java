package javaapplication1;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class forget_password_teacher extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;

    public forget_password_teacher() {
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
        name = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        dashboard = new javax.swing.JButton();
        cotact_number = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        teacher_id = new javax.swing.JTextField();
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

        name.setBackground(new java.awt.Color(223, 227, 237));
        name.setToolTipText("Username");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name);
        name.setBounds(150, 40, 300, 30);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(242, 242, 242));
        label4.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Name");
        jPanel2.add(label4);
        label4.setBounds(80, 40, 60, 30);

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

        cotact_number.setBackground(new java.awt.Color(223, 227, 237));
        cotact_number.setToolTipText("Username");
        cotact_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotact_numberActionPerformed(evt);
            }
        });
        jPanel2.add(cotact_number);
        cotact_number.setBounds(150, 80, 300, 30);

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(new java.awt.Color(242, 242, 242));
        label5.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Contact Number");
        jPanel2.add(label5);
        label5.setBounds(20, 80, 120, 30);

        teacher_id.setBackground(new java.awt.Color(223, 227, 237));
        teacher_id.setToolTipText("Username");
        teacher_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_idActionPerformed(evt);
            }
        });
        jPanel2.add(teacher_id);
        teacher_id.setBounds(150, 120, 300, 30);

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(new java.awt.Color(242, 242, 242));
        label6.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("TeacherID");
        jPanel2.add(label6);
        label6.setBounds(70, 120, 70, 30);

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
        label3.setText("TEACHER LOGIN");
        jPanel1.add(label3);
        label3.setBounds(330, 10, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 148, 800, 426);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        try {
            String contact_number = cotact_number.getText(); // Get advisor value from the text field
            String Name = name.getText(); // Get hall value from the text field
            String TeacherID = teacher_id.getText(); // Get studentID value from the text field

            // Check if all required fields are not empty
            if (contact_number.isEmpty() || Name.isEmpty() || TeacherID.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit method if any field is empty
            }

            // Query the database to check if the provided credentials are correct
            String query = "SELECT T_Password FROM teacher WHERE Contact_Number = ? AND Teacher_name = ? AND Teacher_ID = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, contact_number);
            pst.setString(2, Name);
            pst.setString(3, TeacherID);

            ResultSet rs = pst.executeQuery();

            // If there is a matching record
            if (rs.next()) {
                String password = rs.getString("T_Password");
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

    private void cotact_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotact_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cotact_numberActionPerformed

    private void teacher_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_idActionPerformed

    private void get_password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_get_password1ActionPerformed
            Login_Teacher dashboardStudent = new Login_Teacher();
            dashboardStudent.setVisible(true);
    }//GEN-LAST:event_get_password1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new forget_password_teacher().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cotact_number;
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
    private javax.swing.JTextField name;
    private javax.swing.JTextField teacher_id;
    // End of variables declaration//GEN-END:variables
}
