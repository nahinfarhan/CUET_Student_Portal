/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.io.File;
import javax.swing.JFileChooser;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JFrame;
import java.sql.PreparedStatement;

public class account_page_student extends javax.swing.JFrame {
    String contactNumber;
    String email;
    String firstName;
    String lastName;
            
    Connection conn = null;
    ResultSet rs = null;
    private String username;
    public void setUsername(String username) {
    this.username = username;
    setStudentInfoFromDatabaseAndFullName();
}
    public account_page_student() {
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
    public void setStudentInfoFromDatabaseAndFullName() {
    try {
        String query = "SELECT Contact_Number, Email, dpt_name, First_Name, Last_Name FROM student WHERE Student_ID = ?";
        PreparedStatement pst = conn.prepareStatement(query);
        
        // Set the Student_ID parameter to retrieve the information for a specific student (you can change this to match your use case)
        pst.setString(1, username); // Assuming 'username' is the student ID
        
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            
            
             contactNumber = rs.getString("Contact_Number");
            email = rs.getString("Email");
            firstName = rs.getString("First_Name");
            lastName = rs.getString("Last_Name");
            
            student_contactnumber.setText(contactNumber);
            student_email.setText(email);
            student_first_name.setText(firstName);
            student_last_name.setText(lastName);
        } else {
           
            student_contactnumber.setText("Contact Number not found");
            student_email.setText("Email not found");
            student_first_name.setText("Name not found");
            student_last_name.setText("Name not found");
        }
        
        // Close the result set, statement, and connection
        rs.close();
        pst.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        settings_button = new javax.swing.JButton();
        Dashboard_button = new javax.swing.JButton();
        courses_button = new javax.swing.JButton();
        accout_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
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
        student_name_show = new javax.swing.JTextField();
        student_dept_show = new javax.swing.JTextField();
        student_email_show = new javax.swing.JTextField();
        student_contactnumber_show = new javax.swing.JTextField();
        student_hall_show = new javax.swing.JTextField();
        student_advisor_show = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jFrame1 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        settings_button1 = new javax.swing.JButton();
        Dashboard_button1 = new javax.swing.JButton();
        courses_button1 = new javax.swing.JButton();
        accout_button1 = new javax.swing.JButton();
        logout_button1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Contact_number2 = new javax.swing.JLabel();
        Contact_number3 = new javax.swing.JLabel();
        Advisor_name1 = new javax.swing.JLabel();
        student_id_show1 = new javax.swing.JTextField();
        student_name_show1 = new javax.swing.JTextField();
        student_dept_show1 = new javax.swing.JTextField();
        student_email_show1 = new javax.swing.JTextField();
        student_contactnumber_show1 = new javax.swing.JTextField();
        student_hall_show1 = new javax.swing.JTextField();
        student_advisor_show1 = new javax.swing.JTextField();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        CUET_logo = new javax.swing.JLabel();
        CUET_name = new java.awt.Label();
        jFrame2 = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        settings_button2 = new javax.swing.JButton();
        Dashboard_button2 = new javax.swing.JButton();
        courses_button2 = new javax.swing.JButton();
        accout_button2 = new javax.swing.JButton();
        logout_button2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Contact_number4 = new javax.swing.JLabel();
        Contact_number5 = new javax.swing.JLabel();
        Advisor_name2 = new javax.swing.JLabel();
        student_id_show2 = new javax.swing.JTextField();
        student_name_show2 = new javax.swing.JTextField();
        student_dept_show2 = new javax.swing.JTextField();
        student_email_show2 = new javax.swing.JTextField();
        student_contactnumber_show2 = new javax.swing.JTextField();
        student_hall_show2 = new javax.swing.JTextField();
        student_advisor_show2 = new javax.swing.JTextField();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jTabbedPane12 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        CUET_logo1 = new javax.swing.JLabel();
        CUET_name1 = new java.awt.Label();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog3 = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        Dashboard_button3 = new javax.swing.JButton();
        terms_button = new javax.swing.JButton();
        accout_button3 = new javax.swing.JButton();
        logout_button3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane13 = new javax.swing.JTabbedPane();
        jTabbedPane14 = new javax.swing.JTabbedPane();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Contact_number6 = new javax.swing.JLabel();
        student_first_name = new javax.swing.JTextField();
        student_email = new javax.swing.JTextField();
        student_contactnumber = new javax.swing.JTextField();
        student_last_name = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        req_modify_button = new javax.swing.JButton();
        jTabbedPane15 = new javax.swing.JTabbedPane();
        jTabbedPane16 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        CUET_logo2 = new javax.swing.JLabel();
        CUET_name2 = new java.awt.Label();

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 380));
        jPanel1.setLayout(null);

        settings_button.setBackground(new java.awt.Color(215, 215, 215));
        settings_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        settings_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/setting_icon.png"))); // NOI18N
        settings_button.setText("Settings");
        settings_button.setIconTextGap(10);
        settings_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(settings_button);
        settings_button.setBounds(10, 640, 170, 40);

        Dashboard_button.setBackground(new java.awt.Color(148, 169, 216));
        Dashboard_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        Dashboard_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/dashboars_icon.png"))); // NOI18N
        Dashboard_button.setText("Dashboard");
        Dashboard_button.setIconTextGap(10);
        Dashboard_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Dashboard_button);
        Dashboard_button.setBounds(10, 30, 170, 40);

        courses_button.setBackground(new java.awt.Color(148, 169, 216));
        courses_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        courses_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/course_icon.png"))); // NOI18N
        courses_button.setText("Terms");
        courses_button.setIconTextGap(10);
        courses_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courses_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(courses_button);
        courses_button.setBounds(10, 90, 170, 40);

        accout_button.setBackground(new java.awt.Color(148, 169, 216));
        accout_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        accout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/account_icon.png"))); // NOI18N
        accout_button.setText("Account");
        accout_button.setBorder(null);
        accout_button.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        accout_button.setIconTextGap(10);
        accout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accout_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(accout_button);
        accout_button.setBounds(10, 150, 170, 40);

        logout_button.setBackground(new java.awt.Color(148, 169, 216));
        logout_button.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/logout_icon.png"))); // NOI18N
        logout_button.setText("Logout");
        logout_button.setIconTextGap(10);
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(logout_button);
        logout_button.setBounds(10, 210, 170, 40);

        jLabel1.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel1.setText("Student ID");

        jLabel2.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel2.setText("Student Name");

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

        student_name_show.setBackground(new java.awt.Color(242, 242, 242));
        student_name_show.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_name_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_name_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_name_showActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(student_email_show, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addComponent(student_name_show)
                            .addComponent(student_dept_show)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Contact_number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Contact_number1)
                            .addComponent(Advisor_name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_advisor_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_hall_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_contactnumber_show, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_id_show, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_name_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_dept_show, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_email_show, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(351, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(190, 30, 1040, 630);
        jPanel1.add(jTabbedPane2);
        jTabbedPane2.setBounds(180, -30, 0, 1);
        jPanel1.add(jTabbedPane4);
        jTabbedPane4.setBounds(170, -20, 0, 1);

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setMinimumSize(new java.awt.Dimension(965, 619));
        jFrame1.setResizable(false);

        jPanel3.setPreferredSize(new java.awt.Dimension(800, 380));
        jPanel3.setLayout(null);

        settings_button1.setBackground(new java.awt.Color(215, 215, 215));
        settings_button1.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        settings_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/setting_icon.png"))); // NOI18N
        settings_button1.setText("Settings");
        settings_button1.setIconTextGap(10);
        settings_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_button1ActionPerformed(evt);
            }
        });
        jPanel3.add(settings_button1);
        settings_button1.setBounds(10, 640, 170, 40);

        Dashboard_button1.setBackground(new java.awt.Color(148, 169, 216));
        Dashboard_button1.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        Dashboard_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/dashboars_icon.png"))); // NOI18N
        Dashboard_button1.setText("Dashboard");
        Dashboard_button1.setIconTextGap(10);
        Dashboard_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard_button1ActionPerformed(evt);
            }
        });
        jPanel3.add(Dashboard_button1);
        Dashboard_button1.setBounds(10, 30, 170, 40);

        courses_button1.setBackground(new java.awt.Color(148, 169, 216));
        courses_button1.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        courses_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/course_icon.png"))); // NOI18N
        courses_button1.setText("Terms");
        courses_button1.setIconTextGap(10);
        courses_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courses_button1ActionPerformed(evt);
            }
        });
        jPanel3.add(courses_button1);
        courses_button1.setBounds(10, 90, 170, 40);

        accout_button1.setBackground(new java.awt.Color(148, 169, 216));
        accout_button1.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        accout_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/account_icon.png"))); // NOI18N
        accout_button1.setText("Account");
        accout_button1.setBorder(null);
        accout_button1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        accout_button1.setIconTextGap(10);
        accout_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accout_button1ActionPerformed(evt);
            }
        });
        jPanel3.add(accout_button1);
        accout_button1.setBounds(10, 150, 170, 40);

        logout_button1.setBackground(new java.awt.Color(148, 169, 216));
        logout_button1.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        logout_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/logout_icon.png"))); // NOI18N
        logout_button1.setText("Logout");
        logout_button1.setIconTextGap(10);
        logout_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_button1ActionPerformed(evt);
            }
        });
        jPanel3.add(logout_button1);
        logout_button1.setBounds(10, 210, 170, 40);

        jLabel5.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel5.setText("Student ID");

        jLabel6.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel6.setText("Student Name");

        jLabel7.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel7.setText("Department");

        jLabel8.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel8.setText("E-mail");

        Contact_number2.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Contact_number2.setText("Contact Number");

        Contact_number3.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Contact_number3.setText("Hall");

        Advisor_name1.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Advisor_name1.setText("Advisor");

        student_id_show1.setBackground(new java.awt.Color(242, 242, 242));
        student_id_show1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_id_show1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_id_show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_id_show1ActionPerformed(evt);
            }
        });

        student_name_show1.setBackground(new java.awt.Color(242, 242, 242));
        student_name_show1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_name_show1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_name_show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_name_show1ActionPerformed(evt);
            }
        });

        student_dept_show1.setBackground(new java.awt.Color(242, 242, 242));
        student_dept_show1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_dept_show1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_dept_show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_dept_show1ActionPerformed(evt);
            }
        });

        student_email_show1.setBackground(new java.awt.Color(242, 242, 242));
        student_email_show1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_email_show1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_email_show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_email_show1ActionPerformed(evt);
            }
        });

        student_contactnumber_show1.setBackground(new java.awt.Color(242, 242, 242));
        student_contactnumber_show1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_contactnumber_show1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_contactnumber_show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_contactnumber_show1ActionPerformed(evt);
            }
        });

        student_hall_show1.setBackground(new java.awt.Color(242, 242, 242));
        student_hall_show1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_hall_show1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_hall_show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_hall_show1ActionPerformed(evt);
            }
        });

        student_advisor_show1.setBackground(new java.awt.Color(242, 242, 242));
        student_advisor_show1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_advisor_show1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_advisor_show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_advisor_show1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(student_email_show1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addComponent(student_name_show1)
                            .addComponent(student_dept_show1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Contact_number2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Contact_number3)
                            .addComponent(Advisor_name1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_advisor_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_hall_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_contactnumber_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_id_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_name_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_dept_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_email_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_number2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_contactnumber_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_number3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_hall_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Advisor_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_advisor_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(190, 30, 1040, 630);
        jPanel3.add(jTabbedPane7);
        jTabbedPane7.setBounds(180, -30, 0, 1);
        jPanel3.add(jTabbedPane8);
        jTabbedPane8.setBounds(170, -20, 0, 1);

        CUET_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/CUET_Vector_ogo.svg.png"))); // NOI18N
        CUET_logo.setText("jLabel1");

        CUET_name.setFont(new java.awt.Font("Baloo Bhaijaan", 0, 32)); // NOI18N
        CUET_name.setText("Chittagong University of Engineering & Technology");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CUET_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(CUET_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(CUET_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CUET_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE))
        );

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame2.setMinimumSize(new java.awt.Dimension(965, 619));
        jFrame2.setResizable(false);

        jPanel6.setPreferredSize(new java.awt.Dimension(800, 380));
        jPanel6.setLayout(null);

        settings_button2.setBackground(new java.awt.Color(215, 215, 215));
        settings_button2.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        settings_button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/setting_icon.png"))); // NOI18N
        settings_button2.setText("Settings");
        settings_button2.setIconTextGap(10);
        settings_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_button2ActionPerformed(evt);
            }
        });
        jPanel6.add(settings_button2);
        settings_button2.setBounds(10, 640, 170, 40);

        Dashboard_button2.setBackground(new java.awt.Color(148, 169, 216));
        Dashboard_button2.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        Dashboard_button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/dashboars_icon.png"))); // NOI18N
        Dashboard_button2.setText("Dashboard");
        Dashboard_button2.setIconTextGap(10);
        Dashboard_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dashboard_button2ActionPerformed(evt);
            }
        });
        jPanel6.add(Dashboard_button2);
        Dashboard_button2.setBounds(10, 30, 170, 40);

        courses_button2.setBackground(new java.awt.Color(148, 169, 216));
        courses_button2.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        courses_button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/course_icon.png"))); // NOI18N
        courses_button2.setText("Terms");
        courses_button2.setIconTextGap(10);
        courses_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courses_button2ActionPerformed(evt);
            }
        });
        jPanel6.add(courses_button2);
        courses_button2.setBounds(10, 90, 170, 40);

        accout_button2.setBackground(new java.awt.Color(148, 169, 216));
        accout_button2.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        accout_button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/account_icon.png"))); // NOI18N
        accout_button2.setText("Account");
        accout_button2.setBorder(null);
        accout_button2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        accout_button2.setIconTextGap(10);
        accout_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accout_button2ActionPerformed(evt);
            }
        });
        jPanel6.add(accout_button2);
        accout_button2.setBounds(10, 150, 170, 40);

        logout_button2.setBackground(new java.awt.Color(148, 169, 216));
        logout_button2.setFont(new java.awt.Font("Chakra Petch", 1, 18)); // NOI18N
        logout_button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/logout_icon.png"))); // NOI18N
        logout_button2.setText("Logout");
        logout_button2.setIconTextGap(10);
        logout_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_button2ActionPerformed(evt);
            }
        });
        jPanel6.add(logout_button2);
        logout_button2.setBounds(10, 210, 170, 40);

        jLabel9.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel9.setText("Student ID");

        jLabel10.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel10.setText("Student Name");

        jLabel11.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel11.setText("Department");

        jLabel12.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel12.setText("E-mail");

        Contact_number4.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Contact_number4.setText("Contact Number");

        Contact_number5.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Contact_number5.setText("Hall");

        Advisor_name2.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Advisor_name2.setText("Advisor");

        student_id_show2.setBackground(new java.awt.Color(242, 242, 242));
        student_id_show2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_id_show2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_id_show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_id_show2ActionPerformed(evt);
            }
        });

        student_name_show2.setBackground(new java.awt.Color(242, 242, 242));
        student_name_show2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_name_show2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_name_show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_name_show2ActionPerformed(evt);
            }
        });

        student_dept_show2.setBackground(new java.awt.Color(242, 242, 242));
        student_dept_show2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_dept_show2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_dept_show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_dept_show2ActionPerformed(evt);
            }
        });

        student_email_show2.setBackground(new java.awt.Color(242, 242, 242));
        student_email_show2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_email_show2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_email_show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_email_show2ActionPerformed(evt);
            }
        });

        student_contactnumber_show2.setBackground(new java.awt.Color(242, 242, 242));
        student_contactnumber_show2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_contactnumber_show2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_contactnumber_show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_contactnumber_show2ActionPerformed(evt);
            }
        });

        student_hall_show2.setBackground(new java.awt.Color(242, 242, 242));
        student_hall_show2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_hall_show2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_hall_show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_hall_show2ActionPerformed(evt);
            }
        });

        student_advisor_show2.setBackground(new java.awt.Color(242, 242, 242));
        student_advisor_show2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_advisor_show2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_advisor_show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_advisor_show2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(student_email_show2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addComponent(student_name_show2)
                            .addComponent(student_dept_show2)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Contact_number4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Contact_number5)
                            .addComponent(Advisor_name2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_advisor_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_hall_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_contactnumber_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(student_id_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTabbedPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_id_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_name_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_dept_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_email_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_number4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_contactnumber_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_number5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_hall_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Advisor_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_advisor_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7);
        jPanel7.setBounds(190, 30, 1040, 630);
        jPanel6.add(jTabbedPane11);
        jTabbedPane11.setBounds(180, -30, 0, 1);
        jPanel6.add(jTabbedPane12);
        jTabbedPane12.setBounds(170, -20, 0, 1);

        CUET_logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/icons/CUET_Vector_ogo.svg.png"))); // NOI18N
        CUET_logo1.setText("jLabel1");

        CUET_name1.setFont(new java.awt.Font("Baloo Bhaijaan", 0, 32)); // NOI18N
        CUET_name1.setText("Chittagong University of Engineering & Technology");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CUET_logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(CUET_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(CUET_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CUET_logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1260, 850));
        setMinimumSize(new java.awt.Dimension(1260, 850));
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

        jLabel14.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel14.setText("First Name");

        jLabel16.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel16.setText("E-mail");

        Contact_number6.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        Contact_number6.setText("Contact Number");

        student_first_name.setBackground(new java.awt.Color(242, 242, 242));
        student_first_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_first_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_first_nameActionPerformed(evt);
            }
        });

        student_email.setBackground(new java.awt.Color(242, 242, 242));
        student_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_emailActionPerformed(evt);
            }
        });

        student_contactnumber.setBackground(new java.awt.Color(242, 242, 242));
        student_contactnumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_contactnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_contactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_contactnumberActionPerformed(evt);
            }
        });

        student_last_name.setBackground(new java.awt.Color(242, 242, 242));
        student_last_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        student_last_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        student_last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_last_nameActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Chakra Petch", 1, 15)); // NOI18N
        jLabel17.setText("Last Name");

        req_modify_button.setFont(new java.awt.Font("Chakra Petch", 1, 14)); // NOI18N
        req_modify_button.setText("Modify");
        req_modify_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req_modify_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jTabbedPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(student_first_name)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(student_last_name))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(Contact_number6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(student_email, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(student_contactnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(362, 362, 362)))
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(req_modify_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(student_email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact_number6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_contactnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(req_modify_button)
                .addContainerGap(422, Short.MAX_VALUE))
        );

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
                .addContainerGap(152, Short.MAX_VALUE)
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

    private void settings_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settings_buttonActionPerformed

    private void Dashboard_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard_buttonActionPerformed
        JFrame studentDashboardFrame = new Dashboard_student();
        studentDashboardFrame.setVisible(true);

        // Close the current dashboard window
        dispose();
    }//GEN-LAST:event_Dashboard_buttonActionPerformed

    private void courses_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courses_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courses_buttonActionPerformed

    private void accout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accout_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accout_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        JFrame studentLoginFrame = new Login_Student();
        studentLoginFrame.setVisible(true);

        // Close the current dashboard window
        dispose();
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void student_id_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id_showActionPerformed

    private void student_name_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_name_showActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_name_showActionPerformed

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

    private void settings_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settings_button1ActionPerformed

    private void Dashboard_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard_button1ActionPerformed
        JFrame studentDashboardFrame = new Dashboard_student();
        studentDashboardFrame.setVisible(true);

        // Close the current dashboard window
        dispose();
    }//GEN-LAST:event_Dashboard_button1ActionPerformed

    private void courses_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courses_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courses_button1ActionPerformed

    private void accout_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accout_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accout_button1ActionPerformed

    private void logout_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_button1ActionPerformed
        JFrame studentLoginFrame = new Login_Student();
        studentLoginFrame.setVisible(true);

        // Close the current dashboard window
        dispose();
    }//GEN-LAST:event_logout_button1ActionPerformed

    private void student_id_show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id_show1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id_show1ActionPerformed

    private void student_name_show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_name_show1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_name_show1ActionPerformed

    private void student_dept_show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_dept_show1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_dept_show1ActionPerformed

    private void student_email_show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_email_show1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_email_show1ActionPerformed

    private void student_contactnumber_show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_contactnumber_show1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_contactnumber_show1ActionPerformed

    private void student_hall_show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_hall_show1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_hall_show1ActionPerformed

    private void student_advisor_show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_advisor_show1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_advisor_show1ActionPerformed

    private void settings_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settings_button2ActionPerformed

    private void Dashboard_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard_button2ActionPerformed
        JFrame studentDashboardFrame = new Dashboard_student();
        studentDashboardFrame.setVisible(true);

        // Close the current dashboard window
        dispose();
    }//GEN-LAST:event_Dashboard_button2ActionPerformed

    private void courses_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courses_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courses_button2ActionPerformed

    private void accout_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accout_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accout_button2ActionPerformed

    private void logout_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_button2ActionPerformed
        Login_Student studentLoginFrame = new Login_Student();
        studentLoginFrame.setVisible(true);

        // Close the current dashboard window
        dispose();
    }//GEN-LAST:event_logout_button2ActionPerformed

    private void student_id_show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_id_show2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_id_show2ActionPerformed

    private void student_name_show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_name_show2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_name_show2ActionPerformed

    private void student_dept_show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_dept_show2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_dept_show2ActionPerformed

    private void student_email_show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_email_show2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_email_show2ActionPerformed

    private void student_contactnumber_show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_contactnumber_show2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_contactnumber_show2ActionPerformed

    private void student_hall_show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_hall_show2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_hall_show2ActionPerformed

    private void student_advisor_show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_advisor_show2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_advisor_show2ActionPerformed

    private void Dashboard_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dashboard_button3ActionPerformed
        Dashboard_student studentDashboardFrame = new Dashboard_student();
        studentDashboardFrame.setVisible(true);
        studentDashboardFrame.setUsername(username); 

        // Close the current dashboard window
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

        // Close the current dashboard window
        dispose();
    }//GEN-LAST:event_logout_button3ActionPerformed

    private void student_first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_first_nameActionPerformed

    private void student_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_emailActionPerformed

    private void student_contactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_contactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_contactnumberActionPerformed

    private void student_last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_last_nameActionPerformed

    private void req_modify_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req_modify_buttonActionPerformed

    try {
        String newContactNumber = student_contactnumber.getText();
        String newEmail = student_email.getText();
        String newFirstName = student_first_name.getText();
        String newLastName = student_last_name.getText();
        
        String updateQuery = "UPDATE Student SET Contact_Number=?, Email=?, First_Name=?, Last_Name=? WHERE Student_ID=?";
        PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
        
        // Set parameters
        updateStatement.setString(1, newContactNumber);
        updateStatement.setString(2, newEmail);
        updateStatement.setString(3, newFirstName);
        updateStatement.setString(4, newLastName);
        updateStatement.setString(5, username); // Assuming 'username' is the student ID
        
        // Execute update
        int rowsAffected = updateStatement.executeUpdate();
        
        if (rowsAffected > 0) {
            // Update successful
            System.out.println("Student information updated successfully.");
        } else {
            // Update failed
            System.out.println("Failed to update student information.");
        }
        
        // Close the statement
        updateStatement.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_req_modify_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(account_page_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(account_page_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(account_page_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(account_page_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new account_page_student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Advisor_name;
    private javax.swing.JLabel Advisor_name1;
    private javax.swing.JLabel Advisor_name2;
    private javax.swing.JLabel CUET_logo;
    private javax.swing.JLabel CUET_logo1;
    private javax.swing.JLabel CUET_logo2;
    private java.awt.Label CUET_name;
    private java.awt.Label CUET_name1;
    private java.awt.Label CUET_name2;
    private javax.swing.JLabel Contact_number;
    private javax.swing.JLabel Contact_number1;
    private javax.swing.JLabel Contact_number2;
    private javax.swing.JLabel Contact_number3;
    private javax.swing.JLabel Contact_number4;
    private javax.swing.JLabel Contact_number5;
    private javax.swing.JLabel Contact_number6;
    private javax.swing.JButton Dashboard_button;
    private javax.swing.JButton Dashboard_button1;
    private javax.swing.JButton Dashboard_button2;
    private javax.swing.JButton Dashboard_button3;
    private javax.swing.JButton accout_button;
    private javax.swing.JButton accout_button1;
    private javax.swing.JButton accout_button2;
    private javax.swing.JButton accout_button3;
    private javax.swing.JButton courses_button;
    private javax.swing.JButton courses_button1;
    private javax.swing.JButton courses_button2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane12;
    private javax.swing.JTabbedPane jTabbedPane13;
    private javax.swing.JTabbedPane jTabbedPane14;
    private javax.swing.JTabbedPane jTabbedPane15;
    private javax.swing.JTabbedPane jTabbedPane16;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton logout_button1;
    private javax.swing.JButton logout_button2;
    private javax.swing.JButton logout_button3;
    private javax.swing.JButton req_modify_button;
    private javax.swing.JButton settings_button;
    private javax.swing.JButton settings_button1;
    private javax.swing.JButton settings_button2;
    private javax.swing.JTextField student_advisor_show;
    private javax.swing.JTextField student_advisor_show1;
    private javax.swing.JTextField student_advisor_show2;
    private javax.swing.JTextField student_contactnumber;
    private javax.swing.JTextField student_contactnumber_show;
    private javax.swing.JTextField student_contactnumber_show1;
    private javax.swing.JTextField student_contactnumber_show2;
    private javax.swing.JTextField student_dept_show;
    private javax.swing.JTextField student_dept_show1;
    private javax.swing.JTextField student_dept_show2;
    private javax.swing.JTextField student_email;
    private javax.swing.JTextField student_email_show;
    private javax.swing.JTextField student_email_show1;
    private javax.swing.JTextField student_email_show2;
    private javax.swing.JTextField student_first_name;
    private javax.swing.JTextField student_hall_show;
    private javax.swing.JTextField student_hall_show1;
    private javax.swing.JTextField student_hall_show2;
    private javax.swing.JTextField student_id_show;
    private javax.swing.JTextField student_id_show1;
    private javax.swing.JTextField student_id_show2;
    private javax.swing.JTextField student_last_name;
    private javax.swing.JTextField student_name_show;
    private javax.swing.JTextField student_name_show1;
    private javax.swing.JTextField student_name_show2;
    private javax.swing.JButton terms_button;
    // End of variables declaration//GEN-END:variables
}
