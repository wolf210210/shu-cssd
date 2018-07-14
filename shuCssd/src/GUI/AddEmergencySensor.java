/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Emergencyclasses.Clock;
import Emergencyclasses.Location;
import Emergencyclasses.Sensor;
import Emergencyclasses.SensorMonitor;
import Emergencyclasses.SetOfLocation;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import serialization.Serialization;
import userclasses.SetOfUsers;


/**
 *
 * @author Piyu
 */
public class AddEmergencySensor extends javax.swing.JFrame {

    /**
     * Creates new form AddEmergencySensor
     */
    public static Sensor sensors = new Sensor();
    public static final String FILE_NAME_Sensor = "DataFiles/EmergencySensors.txt";
    public static final String FILE_NAME_Location = "DataFiles/EmergencySensorsLocation.txt";
    private  SensorMonitor sensorSet = new SensorMonitor();
    private SetOfLocation locationSet = new SetOfLocation();
    public static SetOfUsers theUsers = new SetOfUsers();
    public static SetOfUsers theUsersObserver = new SetOfUsers();
    private Double setLatitude;
    private Double setLongitude;
    private SensorMonitor notMobile=new SensorMonitor();
    public  Clock clock ;
    
    
    
    public AddEmergencySensor() {
        initComponents();
         load();
         loadLocation();            
         clock = Clock.getInstance();
               
    }
    
     public AddEmergencySensor( Double setLatitudes ,Double setLongitudes) {
        initComponents();

               load();
               loadLocation();
               this.setLatitude = setLatitudes;
               this.setLongitude = setLongitudes;
               System.err.println(this.setLatitude);
               System.err.println(this.setLongitude);
               clock = Clock.getInstance();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        desText = new javax.swing.JTextField();
        statusText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        frequencyText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 830));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel4.setText("Sensor ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 280, 140, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel15.setText("Description");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(40, 380, 140, 30);

        desText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desTextActionPerformed(evt);
            }
        });
        getContentPane().add(desText);
        desText.setBounds(190, 380, 250, 30);
        getContentPane().add(statusText);
        statusText.setBounds(190, 430, 250, 30);

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });
        getContentPane().add(idText);
        idText.setBounds(190, 280, 250, 30);

        add.setBackground(new java.awt.Color(0, 102, 153));
        add.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.setContentAreaFilled(false);
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(40, 540, 120, 40);

        update.setBackground(new java.awt.Color(0, 102, 153));
        update.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setContentAreaFilled(false);
        update.setOpaque(true);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(180, 540, 120, 40);

        remove.setBackground(new java.awt.Color(0, 102, 153));
        remove.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setText("Remove");
        remove.setContentAreaFilled(false);
        remove.setOpaque(true);
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
        });
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        getContentPane().add(remove);
        remove.setBounds(320, 540, 120, 40);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 30, 30, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 51));
        jLabel11.setText("www.Agrivi.com/AddEmergencySensor.html");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(170, 20, 331, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 330, 140, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel5.setText("Status");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 430, 120, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setText("Frequency");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 480, 130, 30);

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        getContentPane().add(nameText);
        nameText.setBounds(190, 330, 250, 30);
        getContentPane().add(frequencyText);
        frequencyText.setBounds(190, 480, 250, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(530, 370, 760, 230);

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel9.setText("Search");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(530, 320, 120, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(650, 320, 270, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(970, 310, 45, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kk.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(520, 80, 380, 120);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 210, 520, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("    Bin Sensor");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 200, 160, 50);

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Flood Sensor");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(780, 200, 190, 50);

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel13.setText("Emergency Sensor");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(610, 200, 220, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-5, 0, 1830, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
       String name, description , frequency;
        if (nameText.getText().isEmpty()) {
            //            JOptionPane.showMessageDialog(this, "Please provide the name...", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Please provide the name...");
        } else {
            name = nameText.getText();
            description = desText.getText();
            frequency =  frequencyText.getText();
            //            Icon icon = imageIcon.getIcon();

            sensorSet.addNewSensor(new Sensor(name, description, Double.parseDouble(frequency),statusText.getText()));

                clock.registerObserver(sensorSet);
            try {
                Serialization.Serialize(sensorSet, FILE_NAME_Sensor);

                System.out.println("Add Sucsessfully");

            } catch (IOException ex) {
               
                System.out.println("Unsuccessful...");
            }

            loadAddEmergencySensor(sensorSet);

            
            Sensor sensor = sensorSet.getSensorFromName(nameText.getText()).firstElement();
//            sensorSet.addNewSensorLocation(sensor.getSensorNo(), 55.2, 55.2);
            locationSet.addNewSensor(new Location(this.setLatitude,this.setLongitude,sensor.getSensorNo())); 
 
             try {
                Serialization.Serialize(locationSet, FILE_NAME_Location);

                System.out.println("Add Sucsessfully");

            } catch (IOException ex) {
                //                Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                //                JOptionPane.showMessageDialog(this, "Unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Unsuccessful...");
            }
            
        }
    }//GEN-LAST:event_addMouseClicked

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        
        Sensor sensor = sensorSet.getSensorFromID(Integer.parseInt(idText.getText())).firstElement();
                System.out.println("delete product" + sensor);
                
                  if (sensorSet.remove(sensor)) {
                    try {
                        Serialization.Serialize(sensorSet, FILE_NAME_Sensor);
                    } catch (IOException ex) {
                        Logger.getLogger(AddSensor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loadAddEmergencySensor(sensorSet);
                    JOptionPane.showMessageDialog(this, "Delete Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
                

                } else {
                    JOptionPane.showMessageDialog(this, "Delete unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_removeMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_removeActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        EmergencySensorStation h = new EmergencySensorStation();
        h.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void desTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desTextActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
         String name, description;
               double freq; 
              
              name = nameText.getText();
              description = desText.getText();
                     freq  = Double.parseDouble(frequencyText.getText());
        
           Sensor sensor = sensorSet.getSensorFromID(Integer.parseInt(idText.getText())).firstElement();

            String status = sensorSet.updateSensors(sensor, name, description , freq);
            System.out.println(status);
               if (status.equals("success")) {
                    try {
                        Serialization.Serialize(sensorSet, FILE_NAME_Sensor);
                    } catch (IOException ex) {
                        Logger.getLogger(AddSensor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "You have updated successful", "Congradulations", JOptionPane.INFORMATION_MESSAGE);
                  //  clear();
                    loadAddEmergencySensor(sensorSet);

                } else {
                    JOptionPane.showMessageDialog(this, "Update unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_updateMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            DefaultTableModel dtModel= (DefaultTableModel) jTable1.getModel();
            int row = jTable1.getSelectedRow();
            idText.setText(jTable1.getValueAt(row, 0).toString());
            nameText.setText(jTable1.getValueAt(row, 1).toString());
            desText.setText(jTable1.getValueAt(row, 3).toString());
            frequencyText.setText(jTable1.getValueAt(row, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    
    private void loadAddEmergencySensor(SensorMonitor sensorMoni) {

        String[] colName = {"SensorID", "Name", "Status", "Description",  "Frequency"};
        Object[][] object = new Object[sensorMoni.size()][6];
        int i = 0;
        if (sensorMoni.size() != 0) {
            for (Sensor sensors : sensorMoni) {
                object[i][0] = sensors.getSensorNo();
                object[i][1] = sensors.getName();
                object[i][2] = sensors.getStatus();
                object[i][3] = sensors.getdescription();
                object[i][4] = sensors.getfrequency();
                i++;

            }
        }

        DefaultTableModel model = new DefaultTableModel(object, colName) {
            public boolean isCellEditable(int row, int column) {
                return false;//This causes all cells to be not editable
            }
        };
         jTable1.setModel(model);
         jTable1.setRowSorter(new TableRowSorter<TableModel>(model));
         jTable1.setAutoscrolls(true);
         jTable1.getTableHeader().setReorderingAllowed(false);

    }
    
    public void load(){
        try { 
             for (Sensor sensors : Serialization.deserializeEmergencySensors()) {
                         sensorSet.addNewSensor(sensors);
                       
//                          products.print();
            }
        } catch (IOException | ClassNotFoundException  ex) {
            JOptionPane.showMessageDialog(this, ex);
        
        }
       
          loadAddEmergencySensor(sensorSet);
    }
    
     public void loadLocation(){
        try { 
             for (Location location : Serialization.deserializeEmergencySensorsLocation()) {
                         locationSet.addNewSensor(location);
//                          products.print();
            }
        } catch (IOException | ClassNotFoundException  ex) {
            JOptionPane.showMessageDialog(this, ex);
        
        }
         
//          loadAddSensor(sensorSet);
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
            java.util.logging.Logger.getLogger(AddEmergencySensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmergencySensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmergencySensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmergencySensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmergencySensor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField desText;
    private javax.swing.JTextField frequencyText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton remove;
    private javax.swing.JTextField statusText;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
