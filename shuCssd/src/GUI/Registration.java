/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Piyu
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        password1 = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstName1 = new javax.swing.JTextField();
        firstName2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 830));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel8.setText("First Name         ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(490, 280, 170, 30);

        firstName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        firstName.setForeground(new java.awt.Color(102, 102, 102));
        firstName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(firstName);
        firstName.setBounds(690, 280, 240, 30);

        lastName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lastName.setForeground(new java.awt.Color(102, 102, 102));
        lastName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        jPanel1.add(lastName);
        lastName.setBounds(690, 320, 240, 29);

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel19.setText("Last Name           ");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(490, 320, 170, 30);

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel23.setText("Address            ");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(490, 360, 170, 30);

        address.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(102, 102, 102));
        address.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(690, 360, 240, 29);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setText("Sensor Type");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 600, 160, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bin Sensor", "Emergency Service", "Flood Sensor" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(690, 600, 240, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kk.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(510, 40, 380, 180);

        city.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        city.setForeground(new java.awt.Color(102, 102, 102));
        city.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        jPanel1.add(city);
        city.setBounds(690, 400, 240, 29);

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel28.setText("City                     ");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(490, 400, 170, 30);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 20, 30, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("www.Elegantro.com/Registration.html");
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(170, 20, 280, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Registration");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(640, 220, 190, 60);

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel29.setText("Email                    ");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(490, 440, 170, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setText("Mobile Number        ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(490, 480, 200, 30);

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel30.setText("Password             ");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(490, 520, 170, 30);

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel31.setText("Confirm Password     ");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(490, 560, 200, 30);

        password1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        password1.setForeground(new java.awt.Color(102, 102, 102));
        password1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(password1);
        password1.setBounds(690, 560, 240, 29);

        password.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(password);
        password.setBounds(690, 520, 240, 29);

        mobile.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mobile.setForeground(new java.awt.Color(102, 102, 102));
        mobile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        jPanel1.add(mobile);
        mobile.setBounds(690, 480, 240, 29);

        email.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(690, 440, 240, 29);

        add.setBackground(new java.awt.Color(0, 102, 153));
        add.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Sign Up");
        add.setContentAreaFilled(false);
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(690, 650, 110, 40);

        reset.setBackground(new java.awt.Color(0, 102, 153));
        reset.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
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
        reset.setBounds(810, 650, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1411, 815));
        jLabel2.setMinimumSize(new java.awt.Dimension(1411, 815));
        jLabel2.setPreferredSize(new java.awt.Dimension(1411, 815));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1360, 800);

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel9.setText("First Name         ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(690, 270, 170, 30);

        firstName1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        firstName1.setForeground(new java.awt.Color(102, 102, 102));
        firstName1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(firstName1);
        firstName1.setBounds(890, 270, 240, 30);

        firstName2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        firstName2.setForeground(new java.awt.Color(102, 102, 102));
        firstName2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(firstName2);
        firstName2.setBounds(880, 250, 240, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel10.setText("First Name         ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(680, 250, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped
       
    }//GEN-LAST:event_mobileKeyTyped

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        
    }//GEN-LAST:event_addMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
  
    }//GEN-LAST:event_resetMouseClicked

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Home h = new Home();
        h.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField firstName1;
    private javax.swing.JTextField firstName2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField password;
    private javax.swing.JTextField password1;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}