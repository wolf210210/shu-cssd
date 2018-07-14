/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import floodclasses.Clock;
import floodclasses.Location;
import floodclasses.MotherShipObserverImp;
import floodclasses.Sensor;
import floodclasses.SensorMonitor;
import floodclasses.SetOfLocation;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import serialization.Serialization;
import userclasses.SetOfUsers;
import userclasses.User;

/**
 *
 * @author Piyu
 */
public class AddFloodSensor extends javax.swing.JFrame {

    
        public static Sensor sensors = new Sensor();
        public static final String FILE_NAME_Sensor = "DataFiles/FloodSensors.txt";
        public static final String FILE_NAME_Location = "DataFiles/FloodSensorsLocation.txt";
//        public static final String FILE_NAME_Users = "DataFiles/Users.txt";
//        public static final String  FILE_NAME_Observer = "DataFiles/ObserverUsers.txt"; 
        private  SensorMonitor sensorSet = new SensorMonitor();
        private SetOfLocation locationSet = new SetOfLocation();
        public static SetOfUsers theUsers = new SetOfUsers();
        public static SetOfUsers theUsersObserver = new SetOfUsers();
        private Double setLatitude;
        private Double setLongitude;
        private SensorMonitor notMobile=new SensorMonitor();
        public  Clock clock ;
    /**
     * Creates new form AddFloodSensor
     */
    public AddFloodSensor() {
        initComponents();
        
               load();
               loadLocation();
               clock = Clock.getInstance();
    }
    
    public AddFloodSensor( Double setLatitudes ,Double setLongitudes) {
        initComponents();

               load();
               loadLocation();
               this.setLatitude = setLatitudes;
               this.setLongitude = setLongitudes;
               System.err.println(this.setLatitude);
               System.err.println(this.setLongitude);
                clock = Clock.getInstance();
    }

//    AddFloodSensor(Double setLatitudes, Double setLongitudes) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblanpSensor = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        frequencyText = new javax.swing.JTextField();
        statusText = new javax.swing.JTextField();
        desText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 830));
        getContentPane().setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kk.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(510, 80, 450, 120);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel7.setText("Description");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 380, 140, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(760, 350, 270, 30);

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
        tblanpSensor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblanpSensorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblanpSensor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(530, 400, 760, 230);

        jButton5.setText("observer");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1180, 160, 150, 25);

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
        getContentPane().add(remove);
        remove.setBounds(340, 560, 130, 40);

        add1.setBackground(new java.awt.Color(0, 102, 153));
        add1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        add1.setForeground(new java.awt.Color(255, 255, 255));
        add1.setText("Add");
        add1.setContentAreaFilled(false);
        add1.setOpaque(true);
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
        });
        getContentPane().add(add1);
        add1.setBounds(40, 560, 130, 40);

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
        getContentPane().add(update);
        update.setBounds(190, 560, 130, 40);

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });
        getContentPane().add(idText);
        idText.setBounds(190, 290, 250, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel11.setText("SensorID");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 290, 140, 30);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 30, 30, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("www.Elegantro.com/AddFloodSensor.html");
        jLabel15.setToolTipText("");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(170, 20, 320, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel9.setText("Search");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(640, 350, 120, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1080, 340, 45, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 330, 140, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel5.setText("Status");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 430, 120, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setText("Frequency");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 480, 130, 30);
        getContentPane().add(frequencyText);
        frequencyText.setBounds(190, 480, 250, 30);
        getContentPane().add(statusText);
        statusText.setBounds(190, 430, 250, 30);

        desText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desTextActionPerformed(evt);
            }
        });
        getContentPane().add(desText);
        desText.setBounds(190, 390, 250, 30);

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        getContentPane().add(nameText);
        nameText.setBounds(190, 340, 250, 30);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 250, 520, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("    Bin Sensor");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(410, 240, 160, 50);

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Flood Sensor");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(790, 240, 190, 50);

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Emergency Sensor");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(580, 240, 200, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
          Sensor sensor = sensorSet.getSensorFromID(Integer.parseInt(idText.getText())).firstElement();
                System.out.println("delete sensor" + sensor);
                
                  if (sensorSet.remove(sensor)) {
                    try {
                        Serialization.Serialize(sensorSet, FILE_NAME_Sensor);
                    } catch (IOException ex) {
                        Logger.getLogger(AddSensor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loadAddFloodSensor(sensorSet);
                    JOptionPane.showMessageDialog(this, "Delete Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
                

                } else {
                    JOptionPane.showMessageDialog(this, "Delete unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_removeMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
     
    }//GEN-LAST:event_jLabel3MouseClicked

    private void desTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desTextActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
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
                //                Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                //                JOptionPane.showMessageDialog(this, "Unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Unsuccessful...");
            }

            loadAddFloodSensor(sensorSet);

            
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
    }//GEN-LAST:event_add1MouseClicked

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
                    loadAddFloodSensor(sensorSet);

                } else {
                    JOptionPane.showMessageDialog(this, "Update unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_updateMouseClicked

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void tblanpSensorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblanpSensorMouseClicked
       
           DefaultTableModel dtModel= (DefaultTableModel) tblanpSensor.getModel();
           int row = tblanpSensor.getSelectedRow();
           idText.setText(tblanpSensor.getValueAt(row, 0).toString());
           nameText.setText(tblanpSensor.getValueAt(row, 1).toString());
           desText.setText(tblanpSensor.getValueAt(row, 3).toString());
           frequencyText.setText(tblanpSensor.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblanpSensorMouseClicked

    /**
     * @param args the command line arguments
     */
    
    private void loadAddFloodSensor(SensorMonitor sensorMoni) {

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
        tblanpSensor.setModel(model);
        tblanpSensor.setRowSorter(new TableRowSorter<TableModel>(model));
        tblanpSensor.setAutoscrolls(true);
        tblanpSensor.getTableHeader().setReorderingAllowed(false);

    }
    
       
        public void load(){
        try { 
             for (Sensor sensors : Serialization.deserializeFloodSensors()) {
                         sensorSet.addNewSensor(sensors);
                       
//                          products.print();
            }
        } catch (IOException | ClassNotFoundException  ex) {
            JOptionPane.showMessageDialog(this, ex);
        
        }
       
          loadAddFloodSensor(sensorSet);
    }  
        
        
        
    public void loadLocation(){
        try { 
             for (Location location : Serialization.deserializeFloodSensorsLocation()) {
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
            java.util.logging.Logger.getLogger(AddFloodSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFloodSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFloodSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFloodSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFloodSensor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    private javax.swing.JTextField desText;
    private javax.swing.JTextField frequencyText;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton remove;
    private javax.swing.JTextField statusText;
    private javax.swing.JTable tblanpSensor;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
