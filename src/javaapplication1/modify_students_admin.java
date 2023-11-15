package javaapplication1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
public class modify_students_admin extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    private String username;
    public void setUsername(String username) {
    this.username = username;    
}
    public modify_students_admin() {
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
        settings_button = new javax.swing.JButton();
        Students_button_admin = new javax.swing.JButton();
        Teachers_button_admin = new javax.swing.JButton();
        courses_button_admin = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Contact_number = new javax.swing.JLabel();
        Contact_number1 = new javax.swing.JLabel();
        Advisor_name = new javax.swing.JLabel();
        student_id_show = new javax.swing.JTextField();
        first_name_show = new javax.swing.JTextField();
        student_dept_show = new javax.swing.JTextField();
        student_email_show = new javax.swing.JTextField();
        student_contactnumber_show = new javax.swing.JTextField();
        student_hall_show = new javax.swing.JTextField();
        student_advisor_show = new javax.swing.JTextField();
        modify_student_button = new javax.swing.JButton();
        Search_student_button = new javax.swing.JButton();
        delete_student_button1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        last_name_show = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        CUET_logo = new javax.swing.JLabel();
        CUET_name = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1260, 850));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 380));
        jPanel1.setLayout(null);

        settings_button.setBackground(new java.awt.Color(215, 215, 215));
        settings_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        settings_button.setText("Settings");
        settings_button.setIconTextGap(10);
        settings_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(settings_button);
        settings_button.setBounds(10, 640, 170, 40);

        Students_button_admin.setBackground(new java.awt.Color(148, 169, 216));
        Students_button_admin.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        Students_button_admin.setText("Students");
        Students_button_admin.setIconTextGap(10);
        Students_button_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Students_button_adminActionPerformed(evt);
            }
        });
        jPanel1.add(Students_button_admin);
        Students_button_admin.setBounds(10, 30, 170, 40);

        Teachers_button_admin.setBackground(new java.awt.Color(148, 169, 216));
        Teachers_button_admin.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        Teachers_button_admin.setText("Teachers");
        Teachers_button_admin.setToolTipText("");
        Teachers_button_admin.setIconTextGap(10);
        Teachers_button_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teachers_button_adminActionPerformed(evt);
            }
        });
        jPanel1.add(Teachers_button_admin);
        Teachers_button_admin.setBounds(10, 90, 170, 40);

        courses_button_admin.setBackground(new java.awt.Color(148, 169, 216));
        courses_button_admin.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        courses_button_admin.setText("Courses");
        courses_button_admin.setBorder(null);
        courses_button_admin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        courses_button_admin.setIconTextGap(10);
        courses_button_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courses_button_adminActionPerformed(evt);
            }
        });
        jPanel1.add(courses_button_admin);
        courses_button_admin.setBounds(10, 150, 170, 40);

        logout_button.setBackground(new java.awt.Color(148, 169, 216));
        logout_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        logout_button.setText("Logout");
        logout_button.setIconTextGap(10);
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(logout_button);
        logout_button.setBounds(10, 210, 170, 40);
        jPanel1.add(jTabbedPane2);
        jTabbedPane2.setBounds(180, -30, 0, 1);
        jPanel1.add(jTabbedPane4);
        jTabbedPane4.setBounds(170, -20, 0, 1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jLabel1.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel1.setText("Student ID");

        jLabel2.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel3.setText("Department");

        jLabel4.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel4.setText("E-mail");

        Contact_number.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Contact_number.setText("Contact Number");

        Contact_number1.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Contact_number1.setText("Hall");

        Advisor_name.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Advisor_name.setText("Advisor");

        student_id_show.setBackground(new java.awt.Color(242, 242, 242));
        student_id_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_id_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_id_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_id_showActionPerformed(evt);
            }
        });

        first_name_show.setBackground(new java.awt.Color(242, 242, 242));
        first_name_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        first_name_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        first_name_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_name_showActionPerformed(evt);
            }
        });

        student_dept_show.setBackground(new java.awt.Color(242, 242, 242));
        student_dept_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_dept_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_dept_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_dept_showActionPerformed(evt);
            }
        });

        student_email_show.setBackground(new java.awt.Color(242, 242, 242));
        student_email_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_email_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_email_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_email_showActionPerformed(evt);
            }
        });

        student_contactnumber_show.setBackground(new java.awt.Color(242, 242, 242));
        student_contactnumber_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_contactnumber_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_contactnumber_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_contactnumber_showActionPerformed(evt);
            }
        });

        student_hall_show.setBackground(new java.awt.Color(242, 242, 242));
        student_hall_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_hall_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_hall_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_hall_showActionPerformed(evt);
            }
        });

        student_advisor_show.setBackground(new java.awt.Color(242, 242, 242));
        student_advisor_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_advisor_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_advisor_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_advisor_showActionPerformed(evt);
            }
        });

        modify_student_button.setBackground(new java.awt.Color(57, 110, 186));
        modify_student_button.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        modify_student_button.setForeground(new java.awt.Color(255, 255, 255));
        modify_student_button.setText("Modify");
        modify_student_button.setBorder(null);
        modify_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_student_buttonActionPerformed(evt);
            }
        });

        Search_student_button.setBackground(new java.awt.Color(57, 110, 186));
        Search_student_button.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        Search_student_button.setForeground(new java.awt.Color(255, 255, 255));
        Search_student_button.setText("Search");
        Search_student_button.setBorder(null);
        Search_student_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_student_buttonActionPerformed(evt);
            }
        });

        delete_student_button1.setBackground(new java.awt.Color(57, 110, 186));
        delete_student_button1.setFont(new java.awt.Font("Chakra Petch", 1, 24)); // NOI18N
        delete_student_button1.setForeground(new java.awt.Color(255, 255, 255));
        delete_student_button1.setText("Delete");
        delete_student_button1.setBorder(null);
        delete_student_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_student_button1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel5.setText("Last Name");

        last_name_show.setBackground(new java.awt.Color(242, 242, 242));
        last_name_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        last_name_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        last_name_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_name_showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Contact_number)
                                    .addComponent(Contact_number1)
                                    .addComponent(Advisor_name)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(student_email_show)
                                        .addComponent(student_dept_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(delete_student_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(modify_student_button, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(student_advisor_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(student_hall_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(student_contactnumber_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(first_name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(student_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Search_student_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(last_name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search_student_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(first_name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(last_name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_dept_show, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_email_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_number, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_contactnumber_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_number1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_hall_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Advisor_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_advisor_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_student_button)
                    .addComponent(delete_student_button1))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(190, 30, 1040, 630);

        CUET_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/CUET_Vector_ogo.svg.png"))); // NOI18N
        CUET_logo.setText("jLabel1");

        CUET_name.setFont(new java.awt.Font("Baloo Bhaijaan", 0, 32)); // NOI18N
        CUET_name.setText("Chittagong University of Engineering & Technology");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CUET_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(CUET_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(CUET_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CUET_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settings_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settings_buttonActionPerformed

    private void Students_button_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Students_button_adminActionPerformed
        students_admin studentDashboardFrame = new students_admin();
        studentDashboardFrame.setVisible(true);
        studentDashboardFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_Students_button_adminActionPerformed

    private void Teachers_button_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Teachers_button_adminActionPerformed
        teachers_admin studentTermsFrame;
        studentTermsFrame = new teachers_admin();
        studentTermsFrame.setVisible(true);
        studentTermsFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_Teachers_button_adminActionPerformed

    private void courses_button_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courses_button_adminActionPerformed
        Courses_admin studentAccountFrame = new Courses_admin();
        studentAccountFrame.setVisible(true);
        studentAccountFrame.setUsername(username);
        dispose();
    }//GEN-LAST:event_courses_button_adminActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        Login_admin studentLoginFrame = new Login_admin();
        studentLoginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void student_id_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id_showActionPerformed

    private void first_name_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_name_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_name_showActionPerformed

    private void student_dept_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_dept_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_dept_showActionPerformed

    private void student_email_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_email_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_email_showActionPerformed

    private void student_contactnumber_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_contactnumber_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_contactnumber_showActionPerformed

    private void student_hall_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_hall_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_hall_showActionPerformed

    private void student_advisor_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_advisor_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_advisor_showActionPerformed

    private void modify_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_student_buttonActionPerformed
        String SID = student_id_show.getText();
        try {
        String newContactNumber = student_contactnumber_show.getText();
        String newEmail = student_email_show.getText();
        String newFirstName = first_name_show.getText();
        String newLastName = last_name_show.getText();
        String newDept = student_dept_show.getText();
        String newHall = student_hall_show.getText();
        String newAdvisor = student_advisor_show.getText();
        
        
        String updateQuery = "UPDATE Student SET Contact_Number=?, Email=?, First_Name=?, Last_Name=?, Advisor=?, dpt_name=?, Hall=? WHERE Student_ID=?";
        PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
        
        // Set parameters
        updateStatement.setString(1, newContactNumber);
        updateStatement.setString(2, newEmail);
        updateStatement.setString(3, newFirstName);
        updateStatement.setString(4, newLastName);
        updateStatement.setString(5, newAdvisor);
        updateStatement.setString(6, newDept);
        updateStatement.setString(7, newHall);
        updateStatement.setString(8, SID); // Assuming 'username' is the student ID
        
        // Execute update
        int rowsAffected = updateStatement.executeUpdate();
        
        if (rowsAffected > 0) {
            // Update successful
            System.out.println("Student information updated successfully.");
        } else {
            // Update failed
            System.out.println("Failed to update student information.");
        }
        updateStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_modify_student_buttonActionPerformed

    private void Search_student_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_student_buttonActionPerformed
        String SID = student_id_show.getText();
        try {
        String query = "SELECT Advisor, Hall, Contact_Number, Email, dpt_name, First_Name, Last_Name FROM student WHERE Student_ID = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, SID); 
        
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            String advisor = rs.getString("Advisor");
            String hall = rs.getString("Hall");
            String contactNumber = rs.getString("Contact_Number");
            String email = rs.getString("Email");
            String departmentName = rs.getString("dpt_name");
            String firstName = rs.getString("First_Name");
            String lastName = rs.getString("Last_Name");
            
            student_advisor_show.setText(advisor);
            student_hall_show.setText(hall);
            student_contactnumber_show.setText(contactNumber);
            student_email_show.setText(email);
            student_dept_show.setText(departmentName);
            first_name_show.setText(firstName);
            last_name_show.setText(lastName);
        } else {
            // Handle the case where no student is found with the given Student_ID
            // You can clear the fields or show an error message
            student_advisor_show.setText("Advisor not found");
            student_hall_show.setText("Hall not found");
            student_contactnumber_show.setText("Contact Number not found");
            student_email_show.setText("Email not found");
            student_dept_show.setText("Department not found");
            first_name_show.setText("Name not found");
            last_name_show.setText("Name not found");
        }
        
        // Close the result set, statement, and connection
        rs.close();
        pst.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_Search_student_buttonActionPerformed

    private void delete_student_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_student_button1ActionPerformed
        try {
        String studentID = student_id_show.getText(); // Assuming 'student_id_show' is the JTextField displaying student ID
        String deleteAttendanceQuery = "DELETE FROM Attendance WHERE Student_ID=?";
        PreparedStatement deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, studentID);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        
        deleteAttendanceQuery = "DELETE FROM TeacherCountsAttendance WHERE Student_ID=?";
        deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, studentID);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        
        deleteAttendanceQuery = "DELETE FROM Student_Attendes_Course WHERE Student_ID=?";
        deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, studentID);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        
        deleteAttendanceQuery = "DELETE FROM TeacherTeachesStudent WHERE Student_ID=?";
        deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, studentID);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        
        deleteAttendanceQuery = "DELETE FROM CT WHERE Student_ID=?";
        deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, studentID);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        
        deleteAttendanceQuery = "DELETE FROM TeacherPublishesResult WHERE Student_ID=?";
        deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, studentID);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        
        deleteAttendanceQuery = "DELETE FROM TeacherGivesCTMarks WHERE Student_ID=?";
        deleteAttendanceStatement = conn.prepareStatement(deleteAttendanceQuery);
        deleteAttendanceStatement.setString(1, studentID);
        deleteAttendanceStatement.executeUpdate();
        deleteAttendanceStatement.close();
        // Deletion query
        String deleteQuery = "DELETE FROM Student WHERE Student_ID=?";
        
        PreparedStatement deleteStatement = conn.prepareStatement(deleteQuery);

        // Set the parameter
        deleteStatement.setString(1, studentID);

        // Execute deletion
        int rowsAffected = deleteStatement.executeUpdate();

        if (rowsAffected > 0) {
            // Deletion successful
            System.out.println("Student information deleted successfully.");
            student_advisor_show.setText("");
            student_hall_show.setText("");
            student_contactnumber_show.setText("");
            student_email_show.setText("");
            student_dept_show.setText("");
            first_name_show.setText("");
            last_name_show.setText("");
        } else {
            // Deletion failed
            System.out.println("Failed to delete student information.");
        }

        // Close the statement
        deleteStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_delete_student_button1ActionPerformed

    private void last_name_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_name_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_last_name_showActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modify_students_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Advisor_name;
    private javax.swing.JLabel CUET_logo;
    private java.awt.Label CUET_name;
    private javax.swing.JLabel Contact_number;
    private javax.swing.JLabel Contact_number1;
    private javax.swing.JButton Search_student_button;
    private javax.swing.JButton Students_button_admin;
    private javax.swing.JButton Teachers_button_admin;
    private javax.swing.JButton courses_button_admin;
    private javax.swing.JButton delete_student_button1;
    private javax.swing.JTextField first_name_show;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField last_name_show;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton modify_student_button;
    private javax.swing.JButton settings_button;
    private javax.swing.JTextField student_advisor_show;
    private javax.swing.JTextField student_contactnumber_show;
    private javax.swing.JTextField student_dept_show;
    private javax.swing.JTextField student_email_show;
    private javax.swing.JTextField student_hall_show;
    private javax.swing.JTextField student_id_show;
    // End of variables declaration//GEN-END:variables
}
