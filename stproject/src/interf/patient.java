/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interf;

import com.sun.glass.events.KeyEvent;
import database.DBconnect;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author Akila Sachin
 */
public class patient extends javax.swing.JFrame {
        Connection con=null;
        PreparedStatement pst = null;
        PreparedStatement pst1 = null;
        ResultSet rst=null;
        ResultSet rst1=null;
        int i=0;
        
        
    /**
     * Creates new form patient
     */
    public patient() {
        initComponents();
        groupButton();
        //connect to db
        con=DBconnect.connect();
        wardn.setVisible(false);
        jLabel10.setVisible(false);
        jPanel6.setVisible(false);
      
        Toolkit tk=Toolkit.getDefaultToolkit();
            int xsize=(int) tk.getScreenSize().getWidth();
            int ysize=(int) tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
    }
    
    private void groupButton(){
        ButtonGroup bg1=new ButtonGroup();
        bg1.add(ward);
        bg1.add(noac);
        bg1.add(ac);
    }
    public void checkempty(){
        if (PID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Patient ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if (fname.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter First Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if (lname.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Last Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if ((gender.getSelectedItem().toString()).equals("")) {
                JOptionPane.showMessageDialog( this, "Please Select Gender","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if (dob.getDate().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Date of Birth","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if ((m_status.getSelectedItem().toString()).equals("")) {
                JOptionPane.showMessageDialog( this, "Please select Maritial Status","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if ((b_group.getSelectedItem().toString()).equals("")) {
                JOptionPane.showMessageDialog( this, "Please select Blood Group","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if (NIC.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter NIC","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if (add.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if (city.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter City","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if (con_no.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Contact Number","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         if (disease.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Disease","Error", JOptionPane.ERROR_MESSAGE);
                return;
         }
         if ((dname.getText()).equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Doctor Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
         }
         if ((wardn.getText()).equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Ward Name","Error", JOptionPane.ERROR_MESSAGE);
                return;    
         } 
         if ((rno.getText()).equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Room Number or bed Number","Error", JOptionPane.ERROR_MESSAGE);
                return;               
            }
         if (cname.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Contact Number Name","Error", JOptionPane.ERROR_MESSAGE);
                return;               
            }
         if (cNIC.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Contact Person NIC","Error", JOptionPane.ERROR_MESSAGE);
                return;               
            }
         if (cnumber.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Contact Person's Contact Number","Error", JOptionPane.ERROR_MESSAGE);
                return;               
            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        P_ID = new javax.swing.JLabel();
        reg_date = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        tDOB = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        M_state = new javax.swing.JLabel();
        B_group = new javax.swing.JLabel();
        Diseasel = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        m_status = new javax.swing.JComboBox<>();
        b_group = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        disease = new javax.swing.JTextArea();
        add = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        con_no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NIC = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        regd = new javax.swing.JTextField();
        PID = new javax.swing.JTextField();
        generate = new javax.swing.JButton();
        age = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ward = new javax.swing.JRadioButton();
        noac = new javax.swing.JRadioButton();
        ac = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        priced = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dname = new javax.swing.JTextField();
        wardn = new javax.swing.JTextField();
        rno = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        cNIC = new javax.swing.JTextField();
        cnumber = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        update = new javax.swing.JButton();
        Get = new javax.swing.JButton();
        insert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/log.png"))); // NOI18N
        jLabel7.setText("Patient Registration");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        P_ID.setText("Patient ID");

        reg_date.setText("Registration Date");

        firstname.setText("First Name");

        lastname.setText("Last Name");

        Gender.setText("Gender");

        tDOB.setText("Date of Birth");

        Age.setText("Age");

        M_state.setText("Marital Status");

        B_group.setText("Blood Group");

        Diseasel.setText("Remarks");

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Male", "Female" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        m_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "Single", "Married", " " }));

        b_group.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        jLabel1.setText("Address");

        jLabel2.setText("City");

        jLabel3.setText("Contact No.");

        disease.setColumns(20);
        disease.setRows(5);
        jScrollPane1.setViewportView(disease);

        con_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                con_noKeyTyped(evt);
            }
        });

        jLabel8.setText("NIC");

        regd.setEditable(false);
        regd.setEditable(false);
        regd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regdMouseClicked(evt);
            }
        });
        regd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regdKeyTyped(evt);
            }
        });

        generate.setText("Generate");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        age.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P_ID)
                    .addComponent(reg_date)
                    .addComponent(firstname)
                    .addComponent(lastname)
                    .addComponent(Gender)
                    .addComponent(tDOB)
                    .addComponent(Age)
                    .addComponent(M_state)
                    .addComponent(B_group)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(Diseasel))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(city)
                    .addComponent(add)
                    .addComponent(NIC)
                    .addComponent(b_group, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lname)
                    .addComponent(fname)
                    .addComponent(regd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generate))
                    .addComponent(con_no, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(age)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P_ID)
                    .addComponent(PID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reg_date)
                    .addComponent(jLabel9)
                    .addComponent(regd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastname)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tDOB)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M_state)
                    .addComponent(m_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_group)
                    .addComponent(b_group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(con_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Diseasel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room's Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        ward.setText("Ward");
        ward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardActionPerformed(evt);
            }
        });

        noac.setText("Non-A/C Room");
        noac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noacActionPerformed(evt);
            }
        });

        ac.setText("AC Room");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ward)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ac)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ward)
                    .addComponent(noac)
                    .addComponent(ac))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel4.setText("Room No/Bed No");

        jLabel5.setText("Doctor");

        jLabel6.setText("Price per Day");

        jLabel10.setText("Ward ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priced, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(dname)
                            .addComponent(wardn)
                            .addComponent(rno))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(wardn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Person Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel11.setText("Name");

        jLabel12.setText("NIC");

        jLabel13.setText("Contact Number");

        cnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnumberKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cname)
                    .addComponent(cNIC)
                    .addComponent(cnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Room/Ward Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doctor Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        Get.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Get.setText("Get");
        Get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetActionPerformed(evt);
            }
        });

        insert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        insert.setText("Add");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insert)
                        .addGap(18, 18, 18)
                        .addComponent(Get)
                        .addGap(18, 18, 18)
                        .addComponent(update)
                        .addGap(18, 18, 18)
                        .addComponent(clear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insert)
                            .addComponent(update)
                            .addComponent(clear)
                            .addComponent(Get)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // Check empty fields
         checkempty();
         //insert patient
        String pid=PID.getText();            
        String rdate=regd.getText();
        String f_name=fname.getText();
        String l_name=lname.getText();
        String gen=gender.getSelectedItem().toString();
        //dob
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date bdate;
            bdate=dob.getDate();
            //
        String Dob=df.format(bdate);
        String bAge=age.getText();
        String mstates=m_status.getSelectedItem().toString();
        String bgroup=b_group.getSelectedItem().toString();
        String nic=NIC.getText();
        String Add=add.getText();
        String City=city.getText();
        String contac=con_no.getText();
        String dises=disease.getText();
        //room info
        String rid=rno.getText();

        String docid=dname.getText();
        String wardnam=wardn.getText();
        //contact person
        String Cname=cname.getText();
        String CNIC=cNIC.getText();
        String Cnumber=cnumber.getText();
        
        try {
            String que="INSERT reg_patient (PID,reg_date,fname,lname,dob,gender,age,m_states,b_group,NIC,address,city,con_no,disease,cname,cNIC,cnumber) values ('"+ pid +"','"+ rdate +"','"+ f_name +"','"+ l_name +"','"+ Dob +"','"+ gen +"','"+ bAge +"','"+ mstates +"','"+ bgroup +"','"+ nic +"','"+ Add +"','"+ City +"','"+ contac +"','"+ dises +"','"+ Cname +"','"+ CNIC +"','"+ Cnumber +"')";
        pst=con.prepareStatement(que);
        pst.execute();

            if(noac.isSelected() || ac.isSelected()){
                String que1="INSERT admitroom (RID,PID,did,admitdate,disease) values ('"+ rid +"','"+ pid +"','"+ docid +"','"+ rdate +"','"+ dises +"')";
                pst=con.prepareStatement(que1);
                pst.execute();

                 String s="Recerved";
                 String que2="UPDATE room_info set status=? where RID=? ";
                 pst=con.prepareStatement(que2);
                 pst.setString(1,s);
                 pst.setString(2,rid);
                 pst.execute();
                 
            }
           
            if(ward.isSelected()){
        String que1="INSERT admitward (bedno,PID,did,admitdate,disease,wardname) values ('"+ rid +"','"+ pid +"','"+ docid +"','"+ rdate +"','"+ dises +"','"+wardnam+"')";
        pst=con.prepareStatement(que1);
        pst.execute();
        
                    
                 String que2="UPDATE ward_info set status=? where bedno=? ";
                 pst=con.prepareStatement(que2);
                 pst.setString(1, "Recerved");
                 pst.setString(2, rid);
                 pst.execute();
                 
                 clear();
        
            }
            
        
            JOptionPane.showMessageDialog(this,"Successfully Registered","Patient",JOptionPane.INFORMATION_MESSAGE);
        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this,"Error","Patient",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_insertActionPerformed

    private void GetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetActionPerformed
        // TODO add your handling code here:
        
        ward.setSelected(false);
        ac.setSelected(false);
        noac.setSelected(false);
       
        
        if("".equals(NIC.getText()))
        {
            JOptionPane.showMessageDialog(null,"Please enter patient NIC");
        }
        else{
            try {
                String nic=NIC.getText();
                
                String que="select * from reg_patient where NIC=? ";
                pst=con.prepareStatement(que);
                pst.setString(1, nic);
                rst=pst.executeQuery();

            if(rst.next()){
                PID.setText(rst.getString("PID")); 
                regd.setText(rst.getString("reg_date")); 
                fname.setText(rst.getString("fname"));
                lname.setText(rst.getString("lname"));
                gender.setSelectedItem(rst.getString("gender"));
                age.setText(rst.getString("age"));
                m_status.setSelectedItem(rst.getString("m_states"));
                b_group.setSelectedItem(rst.getString("b_group"));
                NIC.setText(rst.getString("NIC"));
                add.setText(rst.getString("address"));
                city.setText(rst.getString("city"));
                con_no.setText(rst.getString("con_no"));
                disease.setText(rst.getString("disease"));
                //
                String r=(rst.getString("dob"));
                DateFormat f=new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                Date d=f.parse(r);
                dob.setDate(d);
                //
                cname.setText(rst.getString("cname"));
                cNIC.setText(rst.getString("cNIC"));
                cnumber.setText(rst.getString("cnumber"));
                
                }
            
            }
             catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Invalid ID");
            }
            
            try {
                String id=PID.getText();

                        String que1="SELECT * from admitward where PID=? ";
                        pst=con.prepareStatement(que1);
                        pst.setString(1, id);
                        rst=pst.executeQuery();

                             if(rst.next()){
                                    
                                    dname.setText(rst.getString("did"));
                                    wardn.setText(rst.getString("wardname"));
                                    rno.setText(rst.getString("bedno")); 
                                    
                                    
                               }
                              
                        String que2="SELECT * from admitroom where PID=? ";
                        pst=con.prepareStatement(que2);
                        pst.setString(1, id);
                        rst=pst.executeQuery();
                           
                             if(rst.next()){
                                    
                                    dname.setText(rst.getString("did"));
                                    rno.setText(rst.getString("RID"));
                                    
                             }
                             String b=rno.getText();
                             if(b.charAt(0)=='R'){
                                 ward.setSelected(false);
                             }
                             else{
                                 ward.setSelected(true);
                             }
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Admit Details Faild to load");
            }
            try {
                if(ward.isSelected()){
                    String b=rno.getText();
                    System.out.println(b);
                    String que2="SELECT * from ward_info where bedno=? ";
                        pst=con.prepareStatement(que2);
                        pst.setString(1, b);
                        rst=pst.executeQuery();

                             if(rst.next()){
                                    priced.setText(rst.getString("price"));
                               }
                }
                else {
                        String b=rno.getText();
                        String que3="SELECT * from room_info where RID=? ";
                        pst=con.prepareStatement(que3);
                        pst.setString(1, b);
                        rst=pst.executeQuery();
                        
                        String c=null;

                             if(rst.next()){
                                    
                                    priced.setText(rst.getString("price"));
                                    c=rst.getString("type");
                             }
                             
                             if("AC".equals(c)){
                                    ac.setSelected(true);
                                    
                                }
                             else{
                                 noac.setSelected(true);   
                             }
                             
                               }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Room price faild to load");
            }

        }
        
    }//GEN-LAST:event_GetActionPerformed

    private void regdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regdKeyTyped
        char c=evt.getKeyChar();
if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))
        {
            evt.consume();
            
            
        }
        
else {
    }
 

        // TODO add your handling code here:
    }//GEN-LAST:event_regdKeyTyped

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
          try {
        String sql = "SELECT PID+1 from reg_patient";
        pst=con.prepareStatement(sql);
        //pst.setString(1,EmployeeIDSearchField.getText());

        rst= pst.executeQuery(sql);
    while(rst.next()) { 
        PID.setText(rst.getString("PID+1"));
        }
    } catch (SQLException e ) {
    JOptionPane.showMessageDialog(null, e);
    }//GEN-LAST:event_generateActionPerformed
    }
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
            clear();
            
    }//GEN-LAST:event_clearActionPerformed

    private void wardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardActionPerformed
        // TODO add your handling code here:
      
        dname.setText(" ");
        wardn.setText(" ");
        rno.setText(" ");
        priced.setText(" ");
        jPanel6.setVisible(false);
        
        try {
                jLabel10.setVisible(true);
                wardn.setVisible(true);
                
            String que="Select * from ward_info where status='Available'";
            pst=con.prepareStatement(que);
            rst=pst.executeQuery();

                        jTable1.setModel(DbUtils.resultSetToTableModel(rst));
                
        
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_wardActionPerformed

    private void noacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noacActionPerformed
        // TODO add your handling code here:
        
                jPanel6.setVisible(true);
                
                jLabel10.setVisible(false);
                wardn.setVisible(false);
                dname.setText(" ");
                wardn.setText(" ");
                rno.setText(" ");
                priced.setText(" ");
        try {
           
            String que="Select * from room_info where type='Non-Ac' and status='Available'";
        pst=con.prepareStatement(que);
        rst=pst.executeQuery();
        
             jTable1.setModel(DbUtils.resultSetToTableModel(rst));
        
        } catch (SQLException e) {
            System.out.println(e);
        }
                
        try {
           
            String que1="Select dname from doctor";
        pst=con.prepareStatement(que1);
        rst=pst.executeQuery();
        
             jTable2.setModel(DbUtils.resultSetToTableModel(rst));
        
        } catch (SQLException e) {
            System.out.println(e);
        }
        
       
    }//GEN-LAST:event_noacActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        // TODO add your handling code here:
        
                jPanel6.setVisible(true);
                
                jLabel10.setVisible(false);
                wardn.setVisible(false);
                dname.setText(" ");
                wardn.setText(" ");
                rno.setText(" ");
                priced.setText(" ");
        try {
           
            String que="Select * from room_info where type='AC' and status='Available'";
        pst=con.prepareStatement(que);
        rst=pst.executeQuery();
        
             
        jTable1.setModel(DbUtils.resultSetToTableModel(rst));
        
        } catch (SQLException e) {
            System.out.println(e);
        }
           try {

                String que1="Select dname from doctor";
            pst=con.prepareStatement(que1);
            rst=pst.executeQuery();

                 jTable2.setModel(DbUtils.resultSetToTableModel(rst));

            } catch (SQLException e) {
                System.out.println(e);
            }
    }//GEN-LAST:event_acActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        try {
                        String id=PID.getText();
                        String room=null;
                        String que1="SELECT * from admitward where PID=? ";
                        pst=con.prepareStatement(que1);
                        pst.setString(1, id);
                        rst=pst.executeQuery();

                             if(rst.next()){
                                    room=rst.getString("bedno");     
                               }
                        String que2="SELECT * from admitroom where PID=? ";
                        pst=con.prepareStatement(que2);
                        pst.setString(1, id);
                        rst=pst.executeQuery();

                             if(rst.next()){
                                    room=rst.getString("RID");     
                               }
                             
            String s="Available";
            
            if(room.charAt(0)=='R'){
                 String que3="UPDATE room_info set status=? where RID=? ";
                 pst=con.prepareStatement(que3);
                 pst.setString(1,s);
                 pst.setString(2,room);
                 pst.execute();
            }
            else{
                String que4="UPDATE ward_info set status=? where bedno=? ";
                 pst=con.prepareStatement(que4);
                 pst.setString(1,s);
                 pst.setString(2,room);
                 pst.execute();         
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        if("".equals(NIC.getText()))
        {
            JOptionPane.showMessageDialog(null,"Please enter patient NIC and get data to UPDATE");
        }
        else{
            try {
                String id=PID.getText();
                String rdate=regd.getText();
                String f_name=fname.getText();
                String l_name=lname.getText();
                String gen=gender.getSelectedItem().toString();
                //dob
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    Date bdate;
                    bdate=dob.getDate();
                    //
                String Dob=df.format(bdate);
                String bAge=age.getText();
                String mstates=m_status.getSelectedItem().toString();
                String bgroup=b_group.getSelectedItem().toString();
                String nic=NIC.getText();
                String Add=add.getText();
                String City=city.getText();
                String contac=con_no.getText();
                String dises=disease.getText();
                String Cname=cname.getText();
                String CNIC=cNIC.getText();
                String Cnumber=cnumber.getText();
                
                String que= "UPDATE reg_patient SET reg_date=?,fname=?,lname=?,gender=?,age=?,m_states=?,b_group=?,NIC=?,address=?,city=?,con_no=?,disease=?,dob=?,cname=?,cNIC=?,cnumber=? WHERE PID=?";
            
                pst=con.prepareStatement(que);
                   
            pst.setString(1, rdate);
            pst.setString(2, f_name);
            pst.setString(3, l_name);
            pst.setString(4, gen);
            pst.setString(5, bAge);
            pst.setString(6, mstates);
            pst.setString(7, bgroup);
            pst.setString(8, nic);
            pst.setString(9, Add);
            pst.setString(10, City);
            pst.setString(11, contac);
            pst.setString(12, dises);        
            pst.setString(13, Dob);
            pst.setString(14, Cname);
            pst.setString(15, CNIC);
            pst.setString(16, Cnumber);
            pst.setString(17, id);

            pst.execute();
                JOptionPane.showMessageDialog(null,"Successfully Updated");
            }
             catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Update Failed");
            }
            
            try {
                String doc=dname.getText();
                String ad=regd.getText();
                String room=rno.getText();
                String di=disease.getText();
                String war=wardn.getText();
                String id=PID.getText();
                
            if(noac.isSelected() || ac.isSelected()){
                
                
                String que2="UPDATE admitroom set RID=?,did=?,admitdate=?,disease=? where PID=?";
                pst=con.prepareStatement(que2);
                pst.setString(1,room);
                pst.setString(2, doc);
                pst.setString(3,ad);
                pst.setString(4, di);
                pst.setString(5,id);
                
                pst.execute();

                    String s="Recerved";
                 String que3="UPDATE room_info set status=? where RID=? ";
                 pst=con.prepareStatement(que3);
                 pst.setString(1,s);
                 pst.setString(2,room);
                 pst.execute();
                 
            }
           
            if(ward.isSelected()){
        String que1="UPDATE admitward set bedno=?,did=?,admitdate=?,disease=?,wardname=? where PID=?";
        pst=con.prepareStatement(que1);
                pst.setString(1,room);
                pst.setString(2, doc);
                pst.setString(3,ad);
                pst.setString(4, di);
                pst.setString(5, war);
                pst.setString(6,id);
                
        pst.execute();
        
                    
                 String que2="UPDATE ward_info set status=? where bedno=? ";
                 pst=con.prepareStatement(que2);
                 pst.setString(1, "Recerved");
                 pst.setString(2, room);
                 pst.execute();
             
            } }catch (Exception e) {
            }    
        
            
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        
        if(ward.isSelected()){
                int r= jTable1.getSelectedRow();
                String bed=jTable1.getValueAt(r,0).toString();
                String wardname=jTable1.getValueAt(r,1).toString();
                String doc=jTable1.getValueAt(r,2).toString();
                String price=jTable1.getValueAt(r,4).toString();
        
                dname.setText(doc);
                wardn.setText(wardname);
                rno.setText(bed);
                priced.setText(price);
        
        }
        else if(noac.isSelected()){
                int r= jTable1.getSelectedRow();
                String room=jTable1.getValueAt(r,0).toString();
                String price=jTable1.getValueAt(r,2).toString();
                
                rno.setText(room);
                priced.setText(price);
        }
        else if(ac.isSelected()){
                int r= jTable1.getSelectedRow();
                String room=jTable1.getValueAt(r,0).toString();
                String price=jTable1.getValueAt(r,2).toString();
                
                rno.setText(room);
                priced.setText(price);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
                int r= jTable2.getSelectedRow();
                String doc=jTable2.getValueAt(r,0).toString();
                dname.setText(doc);
                System.out.println(doc);
    }//GEN-LAST:event_jTable2MouseClicked

    private void regdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regdMouseClicked
        // TODO add your handling code here:
         //local date
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDateTime now = LocalDateTime.now();
                String s1=(dtf.format(now));
                regd.setText(s1);
                    //local date end
    }//GEN-LAST:event_regdMouseClicked

    private void con_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_con_noKeyTyped
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         char c=evt.getKeyChar();
         
         if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACKSPACE) || (c== KeyEvent.VK_DELETE))
         {
             evt.consume();
         }
    }//GEN-LAST:event_con_noKeyTyped

    private void ageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageMouseClicked
        // TODO add your handling code here:
        Date bdate;
        bdate=dob.getDate();
            int year = bdate.getYear();
        Date s1=new Date();
            int year1 = s1.getYear();
            
            int a=year1-year;
            
         age.setText(Integer.toString(a));
            
        
        
    }//GEN-LAST:event_ageMouseClicked

    private void cnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnumberKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
         
         if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACKSPACE) || (c== KeyEvent.VK_DELETE))
         {
             evt.consume();
         }
    }//GEN-LAST:event_cnumberKeyTyped
   
    public void clear(){
        PID.setText("");
            regd.setText(""); 
            fname.setText("");
            lname.setText("");
            gender.setSelectedIndex(0);
            age.setText("");
            m_status.setSelectedIndex(0);
            b_group.setSelectedIndex(0);
            NIC.setText("");
            add.setText("");
            city.setText("");
            con_no.setText("");
            disease.setText("");
            dname.setText("");
            wardn.setText("");
            rno.setText("");
            priced.setText("");
            cname.setText("");
            cNIC.setText("");
            cnumber.setText("");
            
            ward.setSelected(false);
            ac.setSelected(false);
            noac.setSelected(false);
    }
    
    
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
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel B_group;
    private javax.swing.JLabel Diseasel;
    private javax.swing.JLabel Gender;
    private javax.swing.JButton Get;
    private javax.swing.JLabel M_state;
    private javax.swing.JTextField NIC;
    private javax.swing.JTextField PID;
    private javax.swing.JLabel P_ID;
    private javax.swing.JRadioButton ac;
    private javax.swing.JTextField add;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> b_group;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JTextField cNIC;
    private javax.swing.JTextField city;
    private javax.swing.JButton clear;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cnumber;
    private javax.swing.JTextField con_no;
    private javax.swing.JTextArea disease;
    private javax.swing.JTextField dname;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton generate;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField lname;
    private javax.swing.JComboBox<String> m_status;
    private javax.swing.JRadioButton noac;
    private javax.swing.JTextField priced;
    private javax.swing.JLabel reg_date;
    public javax.swing.JTextField regd;
    private javax.swing.JTextField rno;
    private javax.swing.JLabel tDOB;
    private javax.swing.JButton update;
    private javax.swing.JRadioButton ward;
    private javax.swing.JTextField wardn;
    // End of variables declaration//GEN-END:variables
}
