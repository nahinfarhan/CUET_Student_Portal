
package javaapplication1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import javax.swing.JFrame;

public class Student_terms extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    private String username;
    public void setUsername(String username) {
    this.username = username;
    }
    
    public Student_terms() {
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

        jPanel9 = new javax.swing.JPanel();
        Dashboard_button3 = new javax.swing.JButton();
        terms_button = new javax.swing.JButton();
        accout_button3 = new javax.swing.JButton();
        logout_button3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane13 = new javax.swing.JTabbedPane();
        jTabbedPane14 = new javax.swing.JTabbedPane();
        Leve1Term1_button = new javax.swing.JButton();
        Leve1Term2_button = new javax.swing.JButton();
        Leve2Term1_button = new javax.swing.JButton();
        Leve2Term2_button2 = new javax.swing.JButton();
        Leve4Term2_button = new javax.swing.JButton();
        Leve3Term2_button = new javax.swing.JButton();
        Leve3Term1_button1 = new javax.swing.JButton();
        Leve4Term1_button = new javax.swing.JButton();
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

        Leve1Term1_button.setBackground(new java.awt.Color(219, 217, 228));
        Leve1Term1_button.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve1Term1_button.setText("Level 1 Term 1");
        Leve1Term1_button.setBorder(null);
        Leve1Term1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve1Term1_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(Leve1Term1_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 304, 38));

        Leve1Term2_button.setBackground(new java.awt.Color(219, 217, 228));
        Leve1Term2_button.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve1Term2_button.setText("Level 1 Term 2");
        Leve1Term2_button.setBorder(null);
        Leve1Term2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve1Term2_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(Leve1Term2_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 304, 38));

        Leve2Term1_button.setBackground(new java.awt.Color(240, 203, 184));
        Leve2Term1_button.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve2Term1_button.setText("Level 2 Term 1");
        Leve2Term1_button.setBorder(null);
        Leve2Term1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve2Term1_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(Leve2Term1_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 304, 38));

        Leve2Term2_button2.setBackground(new java.awt.Color(240, 203, 184));
        Leve2Term2_button2.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve2Term2_button2.setText("Level 2 Term 2");
        Leve2Term2_button2.setBorder(null);
        Leve2Term2_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve2Term2_button2ActionPerformed(evt);
            }
        });
        jPanel10.add(Leve2Term2_button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 304, 38));

        Leve4Term2_button.setBackground(new java.awt.Color(251, 230, 168));
        Leve4Term2_button.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve4Term2_button.setText("Level 4 Term 2");
        Leve4Term2_button.setBorder(null);
        Leve4Term2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve4Term2_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(Leve4Term2_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 304, 38));

        Leve3Term2_button.setBackground(new java.awt.Color(182, 196, 237));
        Leve3Term2_button.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve3Term2_button.setText("Level 3 Term 2");
        Leve3Term2_button.setBorder(null);
        Leve3Term2_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve3Term2_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(Leve3Term2_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 304, 38));

        Leve3Term1_button1.setBackground(new java.awt.Color(182, 196, 237));
        Leve3Term1_button1.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve3Term1_button1.setText("Level 3 Term 1");
        Leve3Term1_button1.setBorder(null);
        Leve3Term1_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve3Term1_button1ActionPerformed(evt);
            }
        });
        jPanel10.add(Leve3Term1_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 304, 38));

        Leve4Term1_button.setBackground(new java.awt.Color(251, 230, 168));
        Leve4Term1_button.setFont(new java.awt.Font("Chakra Petch", 1, 16)); // NOI18N
        Leve4Term1_button.setText("Level 4 Term 1");
        Leve4Term1_button.setBorder(null);
        Leve4Term1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Leve4Term1_buttonActionPerformed(evt);
            }
        });
        jPanel10.add(Leve4Term1_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 304, 38));

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

    private void Leve1Term1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve1Term1_buttonActionPerformed
//        JFrame studentTermsFrame = new Students_terms_nextpage();
//        studentTermsFrame.setVisible(true);
//        dispose(); 13642
    }//GEN-LAST:event_Leve1Term1_buttonActionPerformed

    private void Leve1Term2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve1Term2_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Leve1Term2_buttonActionPerformed

    private void Leve2Term1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve2Term1_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Leve2Term1_buttonActionPerformed

    private void Leve2Term2_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve2Term2_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Leve2Term2_button2ActionPerformed

    private void Leve4Term2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve4Term2_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Leve4Term2_buttonActionPerformed

    private void Leve3Term2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve3Term2_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Leve3Term2_buttonActionPerformed

    private void Leve3Term1_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve3Term1_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Leve3Term1_button1ActionPerformed

    private void Leve4Term1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Leve4Term1_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Leve4Term1_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Student_terms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_terms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_terms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_terms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_terms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CUET_logo2;
    private java.awt.Label CUET_name2;
    private javax.swing.JButton Dashboard_button3;
    private javax.swing.JButton Leve1Term1_button;
    private javax.swing.JButton Leve1Term2_button;
    private javax.swing.JButton Leve2Term1_button;
    private javax.swing.JButton Leve2Term2_button2;
    private javax.swing.JButton Leve3Term1_button1;
    private javax.swing.JButton Leve3Term2_button;
    private javax.swing.JButton Leve4Term1_button;
    private javax.swing.JButton Leve4Term2_button;
    private javax.swing.JButton accout_button3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane13;
    private javax.swing.JTabbedPane jTabbedPane14;
    private javax.swing.JTabbedPane jTabbedPane15;
    private javax.swing.JTabbedPane jTabbedPane16;
    private javax.swing.JButton logout_button3;
    private javax.swing.JButton terms_button;
    // End of variables declaration//GEN-END:variables
}
