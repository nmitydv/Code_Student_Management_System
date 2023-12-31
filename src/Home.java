
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JDialog {

    public Home(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        addstudent = new javax.swing.JButton();
        editstudent = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        searchingname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background3.png")));
        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 0, 45));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUDENT MANAGEMENT SYSTEM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 20, 740, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\Student_Management_System\\img\\image-removebg-preview-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 10, 110, 130));

        search.setBackground(new java.awt.Color(0, 102, 102));
        search.setFont(new java.awt.Font("Segoe UI", 0, 24));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\91975\\OneDrive\\Desktop\\MY_WORK\\Student_Management_System\\img\\SEARCH-removebg-preview.png")); // NOI18N
        search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 190, 60, 40));

        addstudent.setBackground(new java.awt.Color(0, 102, 102));
        addstudent.setFont(new java.awt.Font("Segoe UI", 0, 24));
        addstudent.setForeground(new java.awt.Color(255, 255, 255));
        addstudent.setText("ADD STUDENT");
        addstudent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudentActionPerformed(evt);
            }
        });
        getContentPane().add(addstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 190, 190, 40));

        editstudent.setBackground(new java.awt.Color(0, 102, 102));
        editstudent.setFont(new java.awt.Font("Segoe UI", 0, 24));
        editstudent.setForeground(new java.awt.Color(255, 255, 255));
        editstudent.setText("EDIT STUDENT ");
        editstudent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editstudentActionPerformed(evt);
            }
        });
        getContentPane().add(editstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 190, 190, 40));

        exit.setBackground(new java.awt.Color(0, 102, 102));
        exit.setFont(new java.awt.Font("Segoe UI", 0, 24));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 190, 120, -1));

        searchingname.setFont(new java.awt.Font("Segoe UI", 0, 24));
        getContentPane().add(searchingname, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 190, 170, 40));

        Table.setFont(new java.awt.Font("Segoe UI", 0, 14));
        Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "ROLL NO.", "NAME", "FATHER_NAME", "ADDRESS", "CLASS", "DATE_OF_BIRTH", "CONTACT", "FESS"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        Table.setAlignmentX(1.0F);
        Table.setAlignmentY(1.0F);
        jScrollPane1.setViewportView(Table);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student", "root",
                    "2412");
            String query2 = "Select * from std";
            PreparedStatement pst = con.prepareStatement(query2);
            ResultSet r = pst.executeQuery(query2);
            while (r.next()) {
                String roll_no = r.getString(1);
                String Name = r.getString(2);
                String fathername = r.getString(3);
                String address = r.getString(4);
                String classs = r.getString(5);
                String dob = r.getString(6);
                String contact = r.getString(7);
                String fees = r.getString(8);
                String tb[] = { roll_no, Name, fathername, address, classs, dob, contact, fees
                };
                DefaultTableModel tbm = (DefaultTableModel) Table.getModel();
                tbm.addRow(tb);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, null, 0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 280, 800, 400));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main__1_-removebg-preview.png")));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 320, 290));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2023-08-04 155440.png")));
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 160));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background3.png")));
        jLabel16.setText("jLabel15");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 156, 1150, 610));

        pack();
    }

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {
        if (searchingname.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "PLEASE ENTER STUDENT NAME");
        } else
            ((DefaultTableModel) Table.getModel()).setNumRows(0);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student", "root",
                    "2412");
            String query2 = "Select * from std where Name = '"
                    + searchingname.getText() + "'";
            PreparedStatement pst = con.prepareStatement(query2);
            ResultSet r = pst.executeQuery(query2);
            while (r.next()) {
                String roll_no = r.getString(1);
                String Name = r.getString(2);
                String fathername = r.getString(3);
                String address = r.getString(4);
                String classs = r.getString(5);
                String dob = r.getString(6);
                String contact = r.getString(7);
                String fees = r.getString(8);
                String tb[] = { roll_no, Name, fathername, address, classs, dob, contact, fees
                };
                DefaultTableModel tbm = (DefaultTableModel) Table.getModel();
                tbm.addRow(tb);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, null, 0);
        }
    }

    private void editstudentActionPerformed(java.awt.event.ActionEvent evt) {
        new EditstudentInformation();
        dispose();
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void addstudentActionPerformed(java.awt.event.ActionEvent evt) {
        new Addstudent();
        dispose();
    }

    public Home() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home dialog = new Home(new javax.swing.JFrame(), true);
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

    private javax.swing.JTable Table;
    private javax.swing.JButton addstudent;
    private javax.swing.JButton editstudent;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchingname;

}
