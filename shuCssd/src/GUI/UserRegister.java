/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Validations.Validation;
import java.io.IOException;
import javax.swing.JOptionPane;
import serialization.Serialization;
import userclasses.SetOfUsers;
import userclasses.User;

/**
 *
 * @author wolf
 */
public class UserRegister extends javax.swing.JFrame {

    /**
     * Creates new form UserRegister
     */
      private static SetOfUsers theUsers = new SetOfUsers();
       private static final String FILE_NAME_Users = "DataFiles/Users.txt";
    public UserRegister() {
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

        add = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        password1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        add.setBackground(new java.awt.Color(0, 102, 153));
        add.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Sign Up");
        add.setContentAreaFilled(false);
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(680, 630, 130, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setText("Mobile Number  :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 480, 170, 30);

        lastName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lastName.setForeground(new java.awt.Color(102, 102, 102));
        lastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lastName);
        lastName.setBounds(660, 310, 240, 29);

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel30.setText("Password           :");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(490, 530, 170, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel8.setText("First Name         :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 260, 170, 30);

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel23.setText("Address             :");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(490, 360, 170, 30);

        password.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(password);
        password.setBounds(660, 530, 240, 29);

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel19.setText("Last Name         :");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(490, 310, 170, 30);

        city.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        city.setForeground(new java.awt.Color(102, 102, 102));
        city.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(city);
        city.setBounds(660, 400, 240, 29);

        email.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(email);
        email.setBounds(660, 440, 240, 29);

        mobile.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mobile.setForeground(new java.awt.Color(102, 102, 102));
        mobile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        getContentPane().add(mobile);
        mobile.setBounds(660, 480, 240, 29);

        password1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        password1.setForeground(new java.awt.Color(102, 102, 102));
        password1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(password1);
        password1.setBounds(660, 580, 240, 29);

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel28.setText("City                   :");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(490, 400, 170, 30);

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel29.setText("Email                 :");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(490, 440, 170, 30);

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel31.setText("Confirm Password:");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(490, 580, 170, 30);

        firstName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        firstName.setForeground(new java.awt.Color(102, 102, 102));
        firstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(firstName);
        firstName.setBounds(660, 260, 240, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kk.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 60, 400, 130);

        address.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(102, 102, 102));
        address.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(address);
        address.setBounds(660, 360, 240, 29);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Registration");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(610, 200, 190, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 810);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        String firstname, lastname, Address, City, Email, Mobile, Password, Password1;
        if (firstName.getText().isEmpty() || lastName.getText().isEmpty() || address.getText().isEmpty() || city.getText().isEmpty()
            || email.getText().isEmpty() || mobile.getText().isEmpty() || password.getText().isEmpty() || password1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide all the details...", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
           if (Validation.isEmail(email.getText())) {
                firstname = firstName.getText();
                lastname = lastName.getText();
                Address = address.getText();
                City = city.getText();
                Email = email.getText();
                Mobile = mobile.getText();
                Password = password.getText();
                Password1 = password1.getText();

                if (Password.equals(Password1)) {
                    String status = registerUser(firstname, lastname, Address, "user", City, Email, Mobile, Password);
                    if (status.equals("success")) {
                        JOptionPane.showMessageDialog(this, "You have registered successful", "Congradulations", JOptionPane.INFORMATION_MESSAGE);
                        clear();
                        try {
                            for (User user : Serialization.deserializeUsers()) {
                                user.print();

                            }
                        } catch (IOException | ClassNotFoundException ex) {
//                            Logger.getLogger(registerUser.class.getName()).log(Level.SEVERE, null, ex);
                                System.err.println(ex);
                        }
                        Login l = new Login();
                        l.setVisible(true);
                        this.hide();

                    } else {
                        JOptionPane.showMessageDialog(this, "Registration Failed", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Confirmation password must be same as the password...", "Error", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(this, "Please provide a valied email address...", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_addMouseClicked

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped
        Validation.validateNumber(mobile, evt);
         
         char enter =evt.getKeyChar();
            if((!Character.isDigit(enter)) || mobile.getText().length()>=10)
               {
                  evt.consume();
               }    
    }//GEN-LAST:event_mobileKeyTyped

    /**
     * @param args the command line arguments
     */
    
      public String registerUser(String firstName, String lastName, String address, String userLevel, String city, String email, String mobile, String password) {
        String status = "";
        new User.SingletonBuilder(firstName, lastName, address, "user", email, mobile, password).city(city).build();
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
        firstName.setText("");
        lastName.setText("");
        address.setText("");
        city.setText("");
        email.setText("");
        mobile.setText("");
        password.setText("");
        password1.setText("");

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
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField password;
    private javax.swing.JTextField password1;
    // End of variables declaration//GEN-END:variables
}
