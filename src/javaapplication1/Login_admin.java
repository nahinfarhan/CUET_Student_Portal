
package javaapplication1;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Login_admin extends javax.swing.JFrame {

   Connection conn = null;
   ResultSet rs = null;
    public Login_admin() {
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

        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        admin_pass_field = new javax.swing.JPasswordField();
        admin_username_text = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        SignInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 574));
        setMinimumSize(new java.awt.Dimension(800, 574));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/CUET_Vector_ogo.svg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 6, 122, 132);

        label1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        label1.setText("Chittagong University of Engineering & Technology");
        getContentPane().add(label1);
        label1.setBounds(120, 40, 680, 50);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(148, 169, 216));
        label3.setFocusable(false);
        label3.setText("ADMIN LOGIN");
        getContentPane().add(label3);
        label3.setBounds(320, 140, 150, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        admin_pass_field.setBackground(new java.awt.Color(223, 227, 237));
        jPanel2.add(admin_pass_field);
        admin_pass_field.setBounds(50, 140, 340, 30);

        admin_username_text.setBackground(new java.awt.Color(223, 227, 237));
        admin_username_text.setToolTipText("Username");
        admin_username_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_username_textActionPerformed(evt);
            }
        });
        jPanel2.add(admin_username_text);
        admin_username_text.setBounds(50, 60, 340, 30);

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

        SignInButton.setBackground(new java.awt.Color(47, 110, 186));
        SignInButton.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        SignInButton.setForeground(new java.awt.Color(242, 242, 242));
        SignInButton.setText("Sign In");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SignInButton);
        SignInButton.setBounds(50, 190, 75, 25);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 190, 440, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin_username_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_username_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_username_textActionPerformed

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        try{
        String enteredUsername = admin_username_text.getText();
        String enteredPassword = new String(admin_pass_field.getPassword());
        String query = "select * from Admin where User_Id = ? and A_password = ?";
        PreparedStatement st = conn.prepareStatement(query);
        st.setString(1, enteredUsername);
        st.setString(2, new String(enteredPassword));
        rs = st.executeQuery();
        if (rs.next()) {
            // Successful login
            JOptionPane.showMessageDialog(this, "Login Successful!");
            students_admin studentsAdmin = new students_admin();
            studentsAdmin.setUsername(enteredUsername);
            studentsAdmin.setVisible(true);

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
    }//GEN-LAST:event_SignInButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login_admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignInButton;
    private javax.swing.JPasswordField admin_pass_field;
    private javax.swing.JTextField admin_username_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
