/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author nahinfarhan
 */
public class Login_Teacher extends javax.swing.JFrame {

    /**
     * Creates new form Login_Teacher
     */
    public Login_Teacher() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();

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

        jPasswordField1.setBackground(new java.awt.Color(223, 227, 237));
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(50, 140, 340, 30);

        jTextField1.setBackground(new java.awt.Color(223, 227, 237));
        jTextField1.setToolTipText("Username");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(50, 60, 340, 30);

        label2.setAlignment(1);
        label2.setBackground(new java.awt.Color(242, 242, 242));
        label2.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        label2.setText("Password");
        jPanel2.add(label2);
        label2.setBounds(50, 110, 80, 23);

        label4.setAlignment(1);
        label4.setBackground(new java.awt.Color(242, 242, 242));
        label4.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        label4.setText("Username");
        jPanel2.add(label4);
        label4.setBounds(50, 30, 80, 23);

        jButton1.setBackground(new java.awt.Color(47, 110, 186));
        jButton1.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Sign In");
        jPanel2.add(jButton1);
        jButton1.setBounds(50, 190, 75, 25);

        jButton2.setBackground(new java.awt.Color(242, 242, 242));
        jButton2.setFont(new java.awt.Font("Chakra Petch", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(47, 110, 186));
        jButton2.setText("Forget Password");
        jPanel2.add(jButton2);
        jButton2.setBounds(260, 190, 130, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(200, 80, 440, 250);

        label3.setAlignment(1);
        label3.setBackground(new java.awt.Color(148, 169, 216));
        label3.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        label3.setText("TEACHER LOGIN");
        jPanel1.add(label3);
        label3.setBounds(330, 30, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 148, 800, 426);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/CUET_Vector_ogo.svg.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 6, 122, 132);

        label1.setFont(new java.awt.Font("Baloo Bhaijaan", 0, 28)); // NOI18N
        label1.setText("Chittagong University of Engineering & Technology");
        getContentPane().add(label1);
        label1.setBounds(132, 44, 656, 47);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
