package javaapplication1;

import javax.swing.JOptionPane;

public class Login_Student extends javax.swing.JFrame {

    /**
     * Creates new form Login_Student
     */
    public Login_Student() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        student_pass_field = new javax.swing.JPasswordField();
        student_username_text = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        signin_student = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 574));
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

        student_pass_field.setBackground(new java.awt.Color(223, 227, 237));
        jPanel2.add(student_pass_field);
        student_pass_field.setBounds(50, 140, 340, 30);

        student_username_text.setBackground(new java.awt.Color(223, 227, 237));
        student_username_text.setToolTipText("Username");
        student_username_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_username_textActionPerformed(evt);
            }
        });
        jPanel2.add(student_username_text);
        student_username_text.setBounds(50, 60, 340, 30);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(242, 242, 242));
        label2.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        label2.setText("Password");
        jPanel2.add(label2);
        label2.setBounds(50, 110, 80, 23);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(242, 242, 242));
        label4.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        label4.setText("Username");
        jPanel2.add(label4);
        label4.setBounds(50, 30, 80, 23);

        signin_student.setBackground(new java.awt.Color(47, 110, 186));
        signin_student.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        signin_student.setForeground(new java.awt.Color(242, 242, 242));
        signin_student.setText("Sign In");
        signin_student.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signin_student.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        signin_student.setOpaque(true);
        signin_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signin_studentActionPerformed(evt);
            }
        });
        jPanel2.add(signin_student);
        signin_student.setBounds(50, 190, 80, 25);

        jButton2.setBackground(new java.awt.Color(242, 242, 242));
        jButton2.setFont(new java.awt.Font("Chakra Petch", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(47, 110, 186));
        jButton2.setText("Forget Password");
        jPanel2.add(jButton2);
        jButton2.setBounds(260, 190, 130, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(200, 60, 440, 250);

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

    private void student_username_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_username_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_username_textActionPerformed

    private void signin_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signin_studentActionPerformed
    // Get the entered username and password
    String enteredUsername = student_username_text.getText();
    String enteredPassword = new String(student_pass_field.getPassword());

    // Check if the username and password are "admin"
    if (enteredUsername.equals("admin") && enteredPassword.equals("admin")) {
        // If the login is successful, create and display the Dashboard_student JFrame
        Dashboard_student dashboardStudent = new Dashboard_student();
        dashboardStudent.setVisible(true);

        // Close the current Login_Student JFrame
        dispose();
    } else {
        // If the login fails, show an error message
        JOptionPane.showMessageDialog(this, "Invalid username or password. Try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_signin_studentActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login_Student().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JButton signin_student;
    private javax.swing.JPasswordField student_pass_field;
    private javax.swing.JTextField student_username_text;
    // End of variables declaration//GEN-END:variables
}
