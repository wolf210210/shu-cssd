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
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 830));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("EMERGENCY SENSOR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 330, 530, 66);

        add2.setBackground(new java.awt.Color(0, 102, 153));
        add2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        add2.setForeground(new java.awt.Color(255, 255, 255));
        add2.setText("Sensor Station");
        add2.setContentAreaFilled(false);
        add2.setOpaque(true);
        add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add2MouseClicked(evt);
            }
        });
        getContentPane().add(add2);
        add2.setBounds(550, 410, 290, 40);

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("www.Elegantro.com/Emergency.html");
        jLabel13.setToolTipText("");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(170, 20, 280, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kk.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 140, 370, 150);

        reset.setBackground(new java.awt.Color(0, 102, 153));
        reset.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Data Analysis");
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

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 810);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MouseClicked
         EmergencySensorStation e = new EmergencySensorStation();
         e.setVisible(true);
         
    }//GEN-LAST:event_add2MouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked

    }//GEN-LAST:event_resetMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

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
    private javax.swing.JButton add2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}