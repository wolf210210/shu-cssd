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
public class FeedBack extends javax.swing.JFrame {

    /**
     * Creates new form FeedBack
     */
    public FeedBack() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comment = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 830));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Feedback Form");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 260, 270, 48);

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel15.setText("Thank you for completing our online feedback form.");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(310, 320, 600, 32);

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel22.setText("Your feedback helps us understand what we do well and where we can improve.");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(310, 360, 810, 32);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Name                :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(310, 400, 170, 28);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setText("Email                :");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(310, 450, 170, 28);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        getContentPane().add(jButton2);
        jButton2.setBounds(710, 620, 120, 40);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save");
        getContentPane().add(jButton3);
        jButton3.setBounds(870, 620, 110, 40);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 620, 120, 40);

        email.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(480, 450, 250, 26);

        name.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(name);
        name.setBounds(480, 410, 250, 26);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton2.setText("Good");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(770, 490, 71, 33);

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton3.setText("Neutral");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(860, 490, 85, 33);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Very Good");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(640, 490, 109, 33);

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton4.setText("Poor");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(970, 490, 65, 33);

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton5.setText("Very Poor");
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(1050, 490, 103, 33);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setText("Additional Comments");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(310, 530, 223, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 70, 180, 180);

        comment.setColumns(20);
        comment.setRows(5);
        jScrollPane1.setViewportView(comment);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(540, 540, 440, 70);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setText("Please describe your experience");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(310, 490, 330, 28);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1416, 810);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1074, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1074, 711);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedBack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea comment;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
