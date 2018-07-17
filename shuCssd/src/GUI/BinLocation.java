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
     private  SensorMonitor sensorSet = new SensorMonitor();
      private SetOfLocation locationFullBin = new SetOfLocation();
        private SetOfLocation locationNotFullBin = new SetOfLocation();
        Sensor sensor;
    public BinLocation() {
        initComponents();
        loadSensor();
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblanpSensor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1585, 853));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/binMap.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1377, 853));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1250, 866);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("All Bin Locations");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1250, 0, 320, 870);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                       sensor  = sensorSet.getSensorFromID( location.getSensorID()).firstElement();
                      if( sensor.getfrequency() >= 100 ){
                          locationFullBin.addNewSensor(location);
                      }
                      else{
                          locationNotFullBin.addNewSensor(location);
                      }
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
        
        
        
        
         

                if (locationNotFullBin.size() != 0) {
                for (Location location : locationNotFullBin) {
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
                
                       if (locationFullBin.size() != 0) {
                for (Location location : locationFullBin) {
                            Random rand = new Random();
                            System.out.println("New Field...");
                            Container contentPane = getContentPane();
                            JLabel label = new JLabel (Integer.toString(location.getSensorID()));
                            label.setIcon(new ImageIcon(
                                "C:/Users/wolf/Documents/GitHub/shu-cssd/shuCssd/src/Images/Untitled-2.png"));

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
        
        
      public void loadSensor(){
        try { 
             for (Sensor sensors : Serialization.deserializeBinSensors()) {
                         sensorSet.addNewSensor(sensors);
              
            }
        } catch (IOException | ClassNotFoundException  ex) {
            JOptionPane.showMessageDialog(this, ex);
        
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblanpSensor;
    // End of variables declaration//GEN-END:variables
}
