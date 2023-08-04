
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Addstudent extends javax.swing.JDialog {

    public Addstudent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fees = new javax.swing.JTextField();
        rollno = new javax.swing.JTextField();
        fathername = new javax.swing.JTextField();
        classs = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        exit1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 0, 45));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUDENT MANAGEMENT SYSTEM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 740, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\Student_Management_System\\img\\image-removebg-preview-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2023-08-04 155440.png")));
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 160));

        submit.setBackground(new java.awt.Color(0, 102, 102));
        submit.setFont(new java.awt.Font("Segoe UI", 0, 24));
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("SUBMIT");
        submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 130, 40));

        reset.setBackground(new java.awt.Color(0, 102, 102));
        reset.setFont(new java.awt.Font("Segoe UI", 0, 24));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, 120, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20));
        jLabel3.setText("ADDRESS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20));
        jLabel5.setText("ROLL_NO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20));
        jLabel6.setText("FATHER_NAME ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 150, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20));
        jLabel8.setText("FEES");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 100, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20));
        jLabel9.setText("NAME");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 90, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20));
        jLabel10.setText("CLASS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 90, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20));
        jLabel12.setText("DATE OF BIRTH");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 170, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20));
        jLabel11.setText("CONTACT");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 100, -1));

        fees.setFont(new java.awt.Font("Segoe UI", 0, 18));
        getContentPane().add(fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 160, -1));

        rollno.setFont(new java.awt.Font("Segoe UI", 0, 18));
        getContentPane().add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 160, -1));

        fathername.setFont(new java.awt.Font("Segoe UI", 0, 18));
        getContentPane().add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 160, -1));

        classs.setFont(new java.awt.Font("Segoe UI", 0, 18));
        getContentPane().add(classs, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 160, -1));

        contact.setFont(new java.awt.Font("Segoe UI", 0, 18));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 160, -1));

        name.setFont(new java.awt.Font("Segoe UI", 0, 18));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 160, -1));

        dob.setFont(new java.awt.Font("Segoe UI", 0, 18));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 160, -1));

        address.setFont(new java.awt.Font("Segoe UI", 0, 18));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 160, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 0, 45));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STUDENT MANAGEMENT SYSTEM");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 740, 100));

        jLabel13.setFont(new java.awt.Font("Serif", 0, 45));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("STUDENT MANAGEMENT SYSTEM");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 740, 100));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 32));
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("ADD STUDENT INFORMATION");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 460, 90));

        exit1.setBackground(new java.awt.Color(0, 102, 102));
        exit1.setFont(new java.awt.Font("Segoe UI", 0, 24));
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setText("EXIT");
        exit1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 670, 120, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background3.png")));
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 156, 1130, 610));

        pack();
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {
        if (name.getText().length() <= 0
                || rollno.getText().length() <= 0 || name.getText().length() <= 0
                || fathername.getText().length() <= 0 || classs.getText().length() <= 0
                || contact.getText().length() <= 0 || address.getText().length() <= 0 || dob.getText().length() <= 0
                || fees.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, " Enter All Valid Information");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student",
                        "root", "2412");
                String sql = "insert into std values(?,?,?,?,?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, Integer.parseInt(rollno.getText()));
                pstmt.setString(2, name.getText());
                pstmt.setString(3, fathername.getText());
                pstmt.setString(4, address.getText());
                pstmt.setString(5, classs.getText());
                pstmt.setString(6, dob.getText());
                pstmt.setString(7, contact.getText());
                pstmt.setInt(8, Integer.parseInt(fees.getText()));
                pstmt.executeUpdate();
                name.setText(null);
                fathername.setText(null);
                rollno.setText(null);
                classs.setText(null);
                contact.setText(null);
                address.setText(null);
                dob.setText(null);
                fees.setText(null);
                JOptionPane.showMessageDialog(null, "Insertion Successfull");
                con.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, null, 0);
            }
        }
    }

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {
        name.setText(null);
        fathername.setText(null);
        rollno.setText(null);
        classs.setText(null);
        contact.setText(null);
        address.setText(null);
        dob.setText(null);
        fees.setText(null);
    }

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {
        new Home();
        dispose();
    }

    public Addstudent() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Addstudent dialog = new Addstudent(new javax.swing.JFrame(), true);
                dialog.setLocation(450, 130);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private javax.swing.JTextField address;
    private javax.swing.JTextField classs;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField dob;
    private javax.swing.JButton exit1;
    private javax.swing.JTextField fathername;
    private javax.swing.JTextField fees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JButton reset;
    private javax.swing.JTextField rollno;
    private javax.swing.JButton submit;

}
