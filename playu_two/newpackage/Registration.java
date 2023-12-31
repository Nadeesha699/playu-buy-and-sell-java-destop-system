
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package playu_two.newpackage;
import java.util.regex.Pattern;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
    }
     
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_country = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        rda_male = new javax.swing.JRadioButton();
        rda_female = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        lbl_vname = new javax.swing.JLabel();
        lbl_vcountry = new javax.swing.JLabel();
        lbl_vage = new javax.swing.JLabel();
        lbl_vnpwd = new javax.swing.JLabel();
        lbl_vgender = new javax.swing.JLabel();
        lbl_usere = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        txt_addr = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_conf = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        lbl_vaddress = new javax.swing.JLabel();
        lbl_vcpwd = new javax.swing.JLabel();
        lbl_vemail = new javax.swing.JLabel();
        lbl_vcity = new javax.swing.JLabel();
        lbl_male = new javax.swing.JLabel();
        lbl_female = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Country");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender");

        txt_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(255, 51, 102));
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });

        txt_age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_age.setForeground(new java.awt.Color(255, 51, 102));

        txt_country.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_country.setForeground(new java.awt.Color(255, 51, 102));

        txt_pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(255, 51, 102));

        rda_male.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        rda_male.setForeground(new java.awt.Color(255, 255, 255));
        rda_male.setText("Male");

        rda_female.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        rda_female.setForeground(new java.awt.Color(255, 255, 255));
        rda_female.setText("Female");

        jLabel13.setBackground(java.awt.Color.white);
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("User Registration");
        jLabel13.setEnabled(false);
        jLabel13.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel13.setPreferredSize(new java.awt.Dimension(80, 80));

        lbl_vname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vname.setForeground(new java.awt.Color(255, 51, 51));

        lbl_vcountry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vcountry.setForeground(new java.awt.Color(255, 51, 51));

        lbl_vage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vage.setForeground(new java.awt.Color(255, 51, 51));

        lbl_vnpwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vnpwd.setForeground(new java.awt.Color(255, 51, 51));

        lbl_vgender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vgender.setForeground(new java.awt.Color(255, 51, 51));

        lbl_usere.setText("jLabel12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_vage, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_vnpwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_age, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(txt_pass)
                                        .addComponent(lbl_vname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_vcountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_country))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rda_male, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rda_female, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lbl_vgender, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbl_usere, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_vname)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lbl_vnpwd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_vage)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_vcountry)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rda_male)
                    .addComponent(rda_female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_vgender)
                .addGap(56, 56, 56)
                .addComponent(lbl_usere, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 413));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 102));
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 102));
        jLabel6.setText("Confirm Password");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 102));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 102));
        jLabel8.setText("City");

        btn_exit.setBackground(new java.awt.Color(255, 51, 51));
        btn_exit.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("EXIT");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        txt_addr.setBackground(new java.awt.Color(255, 51, 102));
        txt_addr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_addr.setForeground(new java.awt.Color(255, 255, 255));
        txt_addr.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_addr.setDisabledTextColor(new java.awt.Color(102, 0, 102));

        txt_email.setBackground(new java.awt.Color(255, 51, 102));
        txt_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));

        txt_city.setBackground(new java.awt.Color(255, 51, 102));
        txt_city.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_city.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Play");
        jLabel10.setEnabled(false);
        jLabel10.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel10.setPreferredSize(new java.awt.Dimension(80, 80));

        txt_conf.setBackground(new java.awt.Color(255, 51, 102));
        txt_conf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_conf.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Snap ITC", 0, 45)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("U");

        btn_clear.setBackground(new java.awt.Color(0, 204, 204));
        btn_clear.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        lbl_vaddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vaddress.setForeground(new java.awt.Color(255, 51, 51));

        lbl_vcpwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vcpwd.setForeground(new java.awt.Color(255, 51, 51));

        lbl_vemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vemail.setForeground(new java.awt.Color(255, 51, 51));

        lbl_vcity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_vcity.setForeground(new java.awt.Color(255, 51, 51));

        btn_submit.setBackground(new java.awt.Color(0, 102, 255));
        btn_submit.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit.setText("SUBMIT");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_vcpwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_vaddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_conf, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(62, 62, 62)
                                            .addComponent(txt_city))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 60, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_vcity, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addComponent(lbl_vemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lbl_male, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_female, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addComponent(lbl_vaddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_conf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_vcpwd)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_vemail)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_vcity)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_male)
                    .addComponent(lbl_female))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear)
                    .addComponent(btn_exit)
                    .addComponent(btn_submit))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 390, 413));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_name.setText("");//clear
        txt_addr.setText("");
        txt_pass.setText("");
        txt_conf.setText("");
        txt_country.setText("");
        txt_email.setText("");
        txt_city.setText("");
        txt_age.setText("");
        rda_male.setSelected(false);
        rda_female.setSelected(false);
        
        lbl_vaddress.setText("");
        lbl_vage.setText("");
        lbl_vcity.setText("");
        lbl_vcountry.setText("");
        lbl_vcpwd.setText("");
        lbl_vname.setText("");
        lbl_vgender.setText("");
        lbl_vnpwd.setText("");
        lbl_vemail.setText("");
        
        
       
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        Login obj1 = new Login();
        obj1.show();
        this.dispose();
        
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
      try{ 
        if(txt_name.getText().isEmpty() || Pattern.matches("^[0-9]+",txt_name.getText()) || Pattern.matches(".*[0-9].*",txt_name.getText()))
        {
            lbl_vname.setText("cannot be empty or cannot enter number");
        }
        else if(txt_addr.getText().isEmpty() || Pattern.matches("^[0-9]+",txt_addr.getText()) || Pattern.matches(".*[0-9].*",txt_addr.getText()))
        {
           lbl_vaddress.setText("cannot be empty or cannot enter number");
        }
        else if(txt_pass.getPassword().equals("")) 
        {
            lbl_vnpwd.setText("cannot be empty");
        }
        else if(txt_conf.getPassword().equals("")) 
        {
           lbl_vcpwd.setText("cannot be empty"); 
        }
        else if(txt_conf.getPassword().equals(txt_pass.getPassword()))
        {
            lbl_vcpwd.setText("Not likeness password");
        }
        else if(txt_age.getText().isEmpty() || Pattern.matches("^[a-zA-Z]+",txt_age.getText()) || Pattern.matches(".*[a-zA-Z].*",txt_age.getText())) 
        {
            lbl_vage.setText("cannot be empty or cannot enter letter");
        }
        if(txt_email.getText().isEmpty()||Pattern.matches("!(\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b)",txt_email.getText())) 
        {
            lbl_vemail.setText("cannot be empty or unvalid email");
        }
        else if(txt_country.getText().isEmpty() || Pattern.matches("^[0-9]+",txt_country.getText()) || Pattern.matches(".*[0-9].*",txt_country.getText())) 
        {
            lbl_vcountry.setText("cannot be empty or cannot enter number");
        }
        else if(txt_city.getText().isEmpty() || Pattern.matches("^[0-9]+",txt_city.getText()) || Pattern.matches(".*[0-9].*",txt_city.getText())) 
        {
            lbl_vcity.setText("cannot be empty or cannot enter number");
        }
        else if(rda_male.isSelected()) 
        {   
          
            
            lbl_male.setText("Male");
            lbl_usere.setText("User");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/playu","root","");
        
            String query = "insert into employee(emp_name,emp_type,emp_address,emp_password,emp_age,emp_email,emp_country,emp_city,emp_gender) values(?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            pst.setString(1,txt_name.getText());
            pst.setString(2,lbl_usere.getText());
            pst.setString(3,txt_addr.getText());
            pst.setString(4,txt_conf.getText());
            pst.setString(5,txt_age.getText());
            pst.setString(6,txt_email.getText());
            pst.setString(7,txt_country.getText());
            pst.setString(8,txt_city.getText());
            pst.setString(9,lbl_male.getText());
            int a = pst.executeUpdate();
            if(a == 1)
            {
               JOptionPane.showMessageDialog(this,"Registration Successfull","Success",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(a==0)
            {
               JOptionPane.showMessageDialog(this,"Invalid Registration","Error",JOptionPane.ERROR_MESSAGE);
            }
           
            
            
        }
        else  if( rda_female.isSelected())
        {
           
            
            lbl_female.setText("Female");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/playu","root","");
        
            String query = "insert into employee(emp_name,emp_type,emp_address,emp_password,emp_age,emp_email,emp_country,emp_city,emp_gender) values(?,?,?,?,?,?,?,?)";
            pst.setString(1,txt_name.getText());
            pst.setString(2,lbl_usere.getText());
            pst.setString(3,txt_addr.getText());
            pst.setString(4,txt_conf.getText());
            pst.setString(5,txt_age.getText());
            pst.setString(6,txt_email.getText());
            pst.setString(7,txt_country.getText());
            pst.setString(8,txt_city.getText());
            pst.setString(9,lbl_male.getText());
            int a = pst.executeUpdate();
            if(a == 1)
            {
               JOptionPane.showMessageDialog(this,"Registration Successfull","Success",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(a==0)
            {
               JOptionPane.showMessageDialog(this,"Invalid Registration","Error",JOptionPane.ERROR_MESSAGE);
            }
              
             
             
             
           
        }
        else
        {
            lbl_vgender.setText("select your gender");
        }
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
        
        
        
    }//GEN-LAST:event_btn_submitActionPerformed

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped
           
    }//GEN-LAST:event_txt_nameKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lbl_usere.setVisible(false);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_female;
    private javax.swing.JLabel lbl_male;
    private javax.swing.JLabel lbl_usere;
    private javax.swing.JLabel lbl_vaddress;
    private javax.swing.JLabel lbl_vage;
    private javax.swing.JLabel lbl_vcity;
    private javax.swing.JLabel lbl_vcountry;
    private javax.swing.JLabel lbl_vcpwd;
    private javax.swing.JLabel lbl_vemail;
    private javax.swing.JLabel lbl_vgender;
    private javax.swing.JLabel lbl_vname;
    private javax.swing.JLabel lbl_vnpwd;
    private javax.swing.JRadioButton rda_female;
    private javax.swing.JRadioButton rda_male;
    private javax.swing.JTextField txt_addr;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_city;
    private javax.swing.JPasswordField txt_conf;
    private javax.swing.JTextField txt_country;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
