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
public class Emergency extends javax.swing.JFrame {

    /**
     * Creates new form Emergency
     */
    public Emergency() {
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

        jLabel2 = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 830));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("EMERGENCY SENSOR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 330, 530, 66);

        add2.setBackground(new java.awt.Color(0, 102, 153));
        add2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        add2.setForeground(new java.awt.Color(255, 255, 255));
        add2.setText("Manage Sensor Station");
        add2.setContentAreaFilled(false);
        add2.setOpaque(true);
        add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add2MouseClicked(evt);
            }
        });
        getContentPane().add(add2);
        add2.setBounds(550, 410, 290, 40);

        add.setBackground(new java.awt.Color(0, 102, 153));
        add.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Manage User Profile");
        add.setContentAreaFilled(false);
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(550, 550, 290, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel12.setText("Admin");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(610, 240, 120, 60);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(510, 250, 350, 40);

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Staff");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(710, 240, 90, 60);

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 30, 30, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("www.Elegantro.com/emergencysensor.html");
        jLabel13.setToolTipText("");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(170, 20, 330, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kk.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 110, 370, 150);

        reset.setBackground(new java.awt.Color(0, 102, 153));
        reset.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("View All Locations");
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
        getContentPane().add(reset);
        reset.setBounds(550, 480, 290, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1370, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MouseClicked
         EmergencySensorStation e = new EmergencySensorStation();
         e.setVisible(true);
         this.dispose();
         
    }//GEN-LAST:event_add2MouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked

    }//GEN-LAST:event_resetMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        MyProfile myProfile = new MyProfile();
        myProfile.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_addMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        UserHome admin = new UserHome();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Emergency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emergency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emergency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emergency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emergency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
