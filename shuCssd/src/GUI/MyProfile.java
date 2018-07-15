/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import serialization.Serialization;
import userclasses.SetOfUsers;
import userclasses.User;

/**
 *
 * @author Piyu
 */
public class MyProfile extends javax.swing.JFrame {

    /**
     * Creates new form MyProfile
     */
     String username, userLevel;
    public static SetOfUsers theUsers = new SetOfUsers();
    public static SetOfUsers searchUsers = new SetOfUsers();
    public static final String FILE_NAME_Users = "DataFiles/Users.txt";
    public MyProfile() {
        initComponents();
         try {
            for (User member : Serialization.deserializeUsers()) {
                theUsers.addUser(member);
                member.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        TableLoad(jTable1, theUsers);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userID = new javax.swing.JLabel();
        comboUserLevel = new javax.swing.JComboBox();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 830));
        getContentPane().setLayout(null);

        userID.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        userID.setForeground(new java.awt.Color(102, 102, 102));
        userID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(userID);
        userID.setBounds(320, 190, 240, 30);

        comboUserLevel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        comboUserLevel.setForeground(new java.awt.Color(102, 102, 102));
        comboUserLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Customer", "Administrator" }));
        comboUserLevel.setBorder(null);
        comboUserLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUserLevelActionPerformed(evt);
            }
        });
        getContentPane().add(comboUserLevel);
        comboUserLevel.setBounds(320, 240, 240, 29);

        firstName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        firstName.setForeground(new java.awt.Color(102, 102, 102));
        firstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(firstName);
        firstName.setBounds(320, 290, 240, 29);

        lastName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lastName.setForeground(new java.awt.Color(102, 102, 102));
        lastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lastName);
        lastName.setBounds(320, 340, 240, 29);

        address.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(102, 102, 102));
        address.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(address);
        address.setBounds(320, 390, 240, 29);

        city.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        city.setForeground(new java.awt.Color(102, 102, 102));
        city.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(city);
        city.setBounds(320, 440, 240, 29);

        email.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(320, 490, 240, 29);

        password.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(password);
        password.setBounds(320, 540, 240, 29);

        mobile.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mobile.setForeground(new java.awt.Color(102, 102, 102));
        mobile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        getContentPane().add(mobile);
        mobile.setBounds(320, 590, 240, 29);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Mobile Number   :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 590, 140, 30);

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Password            :");
        jLabel30.setToolTipText("");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(170, 540, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kk.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 50, 410, 150);

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Email                  :");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(170, 490, 140, 30);

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("City                    :");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(170, 430, 140, 40);

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Address              :");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(170, 390, 140, 30);

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Last Name          : ");
        jLabel19.setToolTipText("");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(170, 340, 140, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("First Name          :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 290, 140, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("User Level           :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 240, 140, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("User ID               :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(170, 190, 140, 30);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setForeground(new java.awt.Color(153, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setFillsViewportHeight(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(585, 275, 610, 270);

        add.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        add.setForeground(new java.awt.Color(102, 102, 102));
        add.setText("Add User");
        add.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add.setContentAreaFilled(false);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(605, 555, 120, 30);

        update.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        update.setForeground(new java.awt.Color(102, 102, 102));
        update.setText("Update User");
        update.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        update.setContentAreaFilled(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(735, 555, 120, 30);

        delete.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        delete.setForeground(new java.awt.Color(102, 102, 102));
        delete.setText("Delete User");
        delete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        delete.setContentAreaFilled(false);
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(865, 555, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped
      
    }//GEN-LAST:event_mobileKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // when user click on tbInfo table, all the information what in user selected row will want to show on Update tab
        //  load info to update tab
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        int row = jTable1.getSelectedRow();

        userID.setText(jTable1.getValueAt(row, 0).toString());
        firstName.setText(jTable1.getValueAt(row, 1).toString());
        address.setText(jTable1.getValueAt(row, 2).toString());
        email.setText(jTable1.getValueAt(row, 3).toString());
        mobile.setText(jTable1.getValueAt(row, 4).toString());
        User user = theUsers.getMemberFromNumber(Integer.parseInt(userID.getText())).firstElement();
        password.setText(user.getPassword());
        city.setText(user.getCity());
        lastName.setText(user.getLastName());
        String userLevels = user.getUserLevel();

        if (userLevels.equals("user")) {
            comboUserLevel.setSelectedItem("Customer");
        } else {
            comboUserLevel.setSelectedItem("Administrator");
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        String firstname, lastname, Address, City, Email, Mobile, Password, Password1;
        if (firstName.getText().isEmpty() || lastName.getText().isEmpty() || address.getText().isEmpty() || city.getText().isEmpty()
            || email.getText().isEmpty() || mobile.getText().isEmpty() || password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide all the details...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
//            if () {
                firstname = firstName.getText();
                lastname = lastName.getText();
                Address = address.getText();
                City = city.getText();
                Email = email.getText();
                Mobile = mobile.getText();
                Password = password.getText();
                String Levels = comboUserLevel.getSelectedItem().toString();
                String userLevels;

                if (Levels.equals("Customer")) {
                    userLevels = "user";
                } else {
                    userLevels = "admin";
                }

                String status = registerUser(firstname, lastname, Address, City, Email, Mobile, Password, userLevels);
                if (status.equals("success")) {
                    JOptionPane.showMessageDialog(this, "You have registered successful", "Congradulations", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    TableLoad(jTable1, theUsers);

                } else {
                    JOptionPane.showMessageDialog(this, "Registration unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Please provide a valied email address...", "Error", JOptionPane.ERROR_MESSAGE);
//
//            }
        }
    }//GEN-LAST:event_addMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        String firstname, lastname, Address, City, Email, Mobile, Password, Password1;
        if (firstName.getText().isEmpty() || lastName.getText().isEmpty() || address.getText().isEmpty() || city.getText().isEmpty()
            || email.getText().isEmpty() || mobile.getText().isEmpty() || password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide all the details...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
//            if (validations.isEmail(email.getText())) {
                firstname = firstName.getText();
                lastname = lastName.getText();
                Address = address.getText();
                City = city.getText();
                Email = email.getText();
                Mobile = mobile.getText();
                Password = password.getText();
                String Levels = comboUserLevel.getSelectedItem().toString();
                String userLevels;

                if (Levels.equals("Customer")) {
                    userLevels = "user";
                } else {
                    userLevels = "admin";
                }

                User user = theUsers.getMemberFromNumber(Integer.parseInt(userID.getText())).firstElement();
                String status = theUsers.updatedetails(user, firstname, lastname, Address, City, Email, Mobile, Password, userLevels);
                if (status.equals("success")) {
                    JOptionPane.showMessageDialog(this, "You have updated successful", "Congradulations", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        Serialization.Serialize(theUsers, FILE_NAME_Users);
                    } catch (IOException ex) {
                        Logger.getLogger(MyProfile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    clear();
                    TableLoad(jTable1, theUsers);

                } else {
                    JOptionPane.showMessageDialog(this, "Update unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Please provide a valied email address...", "Error", JOptionPane.ERROR_MESSAGE);
//
//            }
        }
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int userNum;
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Confirm", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            if (userID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select a user to delete...", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                userNum = Integer.parseInt(userID.getText());

                User user = theUsers.getMemberFromNumber(Integer.parseInt(userID.getText())).firstElement();
                boolean status = theUsers.removeUser(user);
                if (status) {
                    try {
                        Serialization.Serialize(theUsers, FILE_NAME_Users);
                    } catch (IOException ex) {
                        Logger.getLogger(MyProfile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "You have deleted successful", "Congradulations", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    TableLoad(jTable1, theUsers);

                } else {
                    JOptionPane.showMessageDialog(this, "Delete unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void comboUserLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUserLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUserLevelActionPerformed

   
    public void TableLoad(JTable table, SetOfUsers searchList) {
        String[] colName = {"User ID", "First Name", "Address", "Email", "Mobile Number","Availabiliy"};
        Object[][] object = new Object[searchList.size()][6];
        int i = 0;
        if (searchList.size() != 0) {
            for (User member : searchList) {
                object[i][0] = member.getMemberNumber();
                object[i][1] = member.getName();
                object[i][2] = member.getAddress();
                object[i][3] = member.getUsername();
                object[i][4] = member.getMobile();
                object[i][5] = member.getAvailabiliy();

                i++;

            }
        }

        DefaultTableModel model = new DefaultTableModel(object, colName) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;//This causes all cells to be not editable
            }
        };
        table.setModel(model);
        table.setRowSorter(new TableRowSorter<>(model));
        table.setAutoscrolls(true);
        table.getTableHeader().setReorderingAllowed(false);
    }
    
       public String registerUser(String firstName, String lastName, String address, String city, String email, String mobile, String password, String userLevels) {
        String status = "";
        new User.SingletonBuilder(firstName, lastName, address, userLevels, email, mobile, password).city(city).build();
        theUsers.addUser(User.getInstance());
        try {
            Serialization.Serialize(theUsers, FILE_NAME_Users);
            status = "success";
        } catch (Exception ex) {
            status = "fail";
            System.out.println(ex.getMessage());
        }

        return status;
    }
           public void clear() {
        userID.setText("");
        comboUserLevel.setSelectedItem("Customer");
        firstName.setText("");
        lastName.setText("");
        address.setText("");
        city.setText("");
        email.setText("");
        password.setText("");
        mobile.setText("");
       

        theUsers.removeAll(theUsers);
        try {
            for (User user : Serialization.deserializeUsers()) {
                theUsers.addUser(user);
                user.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
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
            java.util.logging.Logger.getLogger(MyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox comboUserLevel;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField password;
    private javax.swing.JButton update;
    private javax.swing.JLabel userID;
    // End of variables declaration//GEN-END:variables
}
