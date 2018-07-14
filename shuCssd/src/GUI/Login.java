/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import javax.swing.JOptionPane;
import serialization.Serialization;
import userclasses.SetOfUsers;
import userclasses.User;

/**
 *
 * @author Piyu
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
      SetOfUsers userList = new SetOfUsers();
    public static final String FILE_NAME_Users = "DataFiles/Users.txt";
    
    public Login() {
        initComponents();
             try {
            for (User user : Serialization.deserializeUsers()) {
                userList.addUser(user);
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 830));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel7.setText("User name     :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 370, 150, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kk.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 60, 370, 230);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel8.setText("Password       :");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(480, 420, 150, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("www.Elegantro.com/Login.html");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(170, 20, 240, 40);

        userName.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        userName.setForeground(new java.awt.Color(102, 102, 102));
        userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(userName);
        userName.setBounds(650, 370, 290, 30);

        password.setFont(new java.awt.Font("Segoe UI Semilight", 0, 15)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        password.setCaretColor(new java.awt.Color(102, 102, 102));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(650, 420, 290, 30);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 30, 30, 30);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Login");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(690, 290, 90, 60);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel11.setText("Forgot password");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(650, 530, 150, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel12.setText("Create new account");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(810, 530, 180, 30);

        add.setBackground(new java.awt.Color(0, 102, 153));
        add.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Login");
        add.setContentAreaFilled(false);
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(650, 470, 130, 40);

        reset.setBackground(new java.awt.Color(0, 102, 153));
        reset.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Cancle");
        reset.setContentAreaFilled(false);
        reset.setOpaque(true);
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(810, 470, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 810);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-2, -3, 1360, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
      ForgotPassword f = new ForgotPassword();
      f.setVisible(true);
      
      
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
      Registration r = new Registration();
      r.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
  if (!userName.getText().isEmpty() && !password.getText().isEmpty()) {
            String username = userName.getText().trim();
            String Password = password.getText().trim();
            try {
                String userLevels = "", userID = "", email = "";

                String str = userList.userAuthontication(username, Password);
                String[] splited = str.split("\\s+");
                userLevels = splited[0];
                userID = splited[1];
                email = splited[2];
                
                System.out.println(userLevels);

                userList.removeAll(userList);

                if (userLevels.equals("PasswordIncorrect")) {
                    JOptionPane.showMessageDialog(this, "Password incorrect... Please try again later", "Error", JOptionPane.ERROR_MESSAGE);

                } else if (userLevels.equals("UsernameIncorrect")) {
                    JOptionPane.showMessageDialog(this, "Username incorrect... Please try again with correct username", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (userLevels.equals("user")) {
                    LoginType a = new LoginType();
                    a.setVisible(true);
                    
                    //JOptionPane.showMessageDialog(this, "Username log", "Error", JOptionPane.ERROR_MESSAGE);
//                    userMain u = new userMain(userID, userLevels, email);
//                    u.setVisible(true);
//                    this.hide();
                } else if (userLevels.equals("admin")) {
//                    adminMain a = new adminMain(userID, userLevels, email);
//                    a.setVisible(true);
//                    this.hide();
                }

            } catch (Exception ex) {

                System.out.println(ex.getMessage());
            }
        } else {

            JOptionPane.showMessageDialog(this, "Username or password not given... Please try again with correct username and password", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_addMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked

    }//GEN-LAST:event_resetMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      Home h = new Home();
      h.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
