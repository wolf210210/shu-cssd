/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import binclasses.Location;
import binclasses.Sensor;
import binclasses.SensorMonitor;
import binclasses.SetOfLocation;
import java.awt.Container;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import serialization.Serialization;

/**
 *
 * @author wolf
 */
public class BinLocation extends javax.swing.JFrame {

    /**
     * Creates new form BinLocation
     */
    
    private SetOfLocation locationSet = new SetOfLocation();
    public static final String FILE_NAME_Location = "DataFiles/BinSensorsLocation.txt";
    public BinLocation() {
        initComponents();
        loadLocation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblanpSensor = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtanpId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/binMap.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        tblanpSensor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblanpSensor);

        jButton2.setText("Remove");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtanpId, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtanpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                Random rand = new Random();
                System.out.println("New Field...");
                Container contentPane = getContentPane();
                JLabel label = new JLabel ();
                label.setIcon(new ImageIcon(
                    "C:/Users/wolf/Documents/GitHub/shu-cssd/shuCssd/src/Images/Untitled-1.png"));

            label.setBounds(10,10,50,50);
            label.setLocation( rand.nextInt(300),  rand.nextInt(300));

            //some random value that I know is in my dialog
            jLabel1.add(label);

            jLabel1.revalidate();
            jLabel1.repaint();
            this.pack();

    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
//            Location location = locationSet.getLocationFromSensorID(Integer.parseInt(txtanpId.getText())).firstElement();
//                System.out.println("delete location" + location);
//                
//                  if (locationSet.remove(location)) {
//                    try {
//                        Serialization.Serialize(locationSet, FILE_NAME_Location);
//                    } catch (IOException ex) {
//                        System.err.println(ex);
//                    }
//                    loadAddSensor(locationSet);
//                    JOptionPane.showMessageDialog(this, "Delete Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
//                
//
//                } else {
//                    JOptionPane.showMessageDialog(this, "Delete unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
//                }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    
            
    public void loadLocation(){
        try { 
             for (Location location : Serialization.deserializeBinSensorsLocation()) {
                         locationSet.addNewSensor(location);
//                          products.print();
            }
        } catch (IOException | ClassNotFoundException  ex) {
            JOptionPane.showMessageDialog(this, ex);
        
        }
        
                   loadAddSensor(locationSet);
    }
    
        private void loadAddSensor(SetOfLocation setOfLocation) {

        String[] colName = {"SensorID", "Name", "Status"};
        Object[][] object = new Object[setOfLocation.size()][4];
        int i = 0;
        if (setOfLocation.size() != 0) {
            for (Location location : setOfLocation) {
                object[i][0] = location.getSensorID();
                object[i][1] = location.getLatitude();
                object[i][2] = location.getLongitude();
             
                i++;

            }
        }

        DefaultTableModel model = new DefaultTableModel(object, colName) {
            public boolean isCellEditable(int row, int column) {
                return false;//This causes all cells to be not editable
            }
        };
        tblanpSensor.setModel(model);
        tblanpSensor.setRowSorter(new TableRowSorter<TableModel>(model));
        tblanpSensor.setAutoscrolls(true);
        tblanpSensor.getTableHeader().setReorderingAllowed(false);
        
        
        
        
         

                if (setOfLocation.size() != 0) {
                for (Location location : setOfLocation) {
                            Random rand = new Random();
                            System.out.println("New Field...");
                            Container contentPane = getContentPane();
                            JLabel label = new JLabel (Integer.toString(location.getSensorID()));
                            label.setIcon(new ImageIcon(
                                "C:/Users/wolf/Documents/GitHub/shu-cssd/shuCssd/src/Images/Untitled-1.png"));

                        label.setBounds(10,10,50,50);
                        label.setLocation( location.getLatitude().intValue(),  location.getLongitude().intValue());

                        //some random value that I know is in my dialog
                        jLabel1.add(label);

                        jLabel1.revalidate();
                        jLabel1.repaint();
                        this.pack();
             
                i++;

            }
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
            java.util.logging.Logger.getLogger(BinLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BinLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BinLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BinLocation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinLocation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblanpSensor;
    private javax.swing.JTextField txtanpId;
    // End of variables declaration//GEN-END:variables
}
