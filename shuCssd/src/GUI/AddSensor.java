/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

//import static binclasses.NewJFrame.FILE_NAME_Products;

//import java.io.IOException;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableModel;
//import javax.swing.table.TableRowSorter;
//import serialization.Serialization;
import static GUI.MyProfile.theUsers;
import binclasses.Clock;
import binclasses.Location;
import binclasses.MotherShipObserverImp;
import binclasses.Mothership;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import serialization.Serialization;
import binclasses.Sensor;
import binclasses.SensorMonitor;
import binclasses.SetOfLocation;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import userclasses.SetOfUsers;
import userclasses.User;

/**
 *
 * @author Piyu
 */
public class AddSensor extends javax.swing.JFrame {

    /**
     * Creates new form AddSensor
     */
    
     public static Sensor sensors = new Sensor();
    public static final String FILE_NAME_Sensor = "DataFiles/BinSensors.txt";
    public static final String FILE_NAME_Location = "DataFiles/BinSensorsLocation.txt";
    public static final String FILE_NAME_Users = "DataFiles/Users.txt";
    public static final String  FILE_NAME_Observer = "DataFiles/ObserverUsers.txt"; 
    private  SensorMonitor sensorSet = new SensorMonitor();
    private SetOfLocation locationSet = new SetOfLocation();
     public static SetOfUsers theUsers = new SetOfUsers();
      public static SetOfUsers theUsersObserver = new SetOfUsers();
    private Double setLatitude;
    private Double setLongitude;
    private SensorMonitor notMobile=new SensorMonitor();
    public  Clock clock ;
    
    
                      
    public AddSensor()  {
        initComponents();

               load();
               loadLocation();
               loadUser();
               loadObserver();
               clock = Clock.getInstance();
               
    }
    
     public AddSensor( Double setLatitudes ,Double setLongitudes) {
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

        frequencyText = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        userID = new javax.swing.JTextField();
        textStatus = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtanpName = new javax.swing.JTextField();
        txtanpId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtanpDes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblanpSensor = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 830));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(frequencyText);
        frequencyText.setBounds(190, 480, 250, 40);

        jButton7.setText("set observer sensor");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(1189, 120, 150, 25);

        jButton5.setText("observer user");
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
        jButton5.setBounds(1190, 170, 150, 25);

        jButton8.setText("Remove");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1200, 270, 140, 25);

        jButton9.setText("Remove From table ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(1200, 310, 140, 25);

        jButton6.setText("notifyObservers");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(1200, 230, 140, 25);

        jButton10.setText("save");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(1220, 360, 59, 25);

        jLabel13.setText("notify");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(870, 240, 140, 16);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(1020, 230, 150, 30);
        getContentPane().add(userID);
        userID.setBounds(1020, 170, 150, 30);
        getContentPane().add(textStatus);
        textStatus.setBounds(190, 432, 250, 30);

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
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(930, 420, 410, 230);

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(320, 90, 79, 25);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("sENSER ID");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 210, 140, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Name");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 320, 120, 30);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackgroundImage.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 768);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Description");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 370, 140, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Status");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 430, 120, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Frequency");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 480, 130, 30);
        getContentPane().add(txtanpName);
        txtanpName.setBounds(190, 320, 250, 30);

        txtanpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanpIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtanpId);
        txtanpId.setBounds(190, 210, 250, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Add Sensor");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 270, 200, 40);
        getContentPane().add(txtanpDes);
        txtanpDes.setBounds(190, 370, 250, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 540, 120, 40);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 540, 120, 40);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Remove");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(340, 540, 110, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(590, 70, 180, 190);

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
        jScrollPane1.setBounds(500, 370, 410, 230);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Search");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(530, 320, 120, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(650, 320, 270, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(970, 310, 45, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1360, 810);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Status");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 430, 120, 30);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 372, 250, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtanpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanpIdActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

   String name, description , frequency;
        if (txtanpName.getText().isEmpty()) {
            //            JOptionPane.showMessageDialog(this, "Please provide the name...", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Please provide the name...");
        } else {
            name = txtanpName.getText();
            description = txtanpDes.getText();
            frequency =  frequencyText.getText();
            //            Icon icon = imageIcon.getIcon();

            sensorSet.addNewSensor(new Sensor(name, description, Double.parseDouble(frequency),textStatus.getText()));

                clock.registerObserver(sensorSet);
            try {
                Serialization.Serialize(sensorSet, FILE_NAME_Sensor);

                System.out.println("Add Sucsessfully");

            } catch (IOException ex) {
                //                Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                //                JOptionPane.showMessageDialog(this, "Unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Unsuccessful...");
            }

            loadAddSensor(sensorSet);

            
            Sensor sensor = sensorSet.getSensorFromName(txtanpName.getText()).firstElement();
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
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
              String name, description;
               double freq; 
              
              name = txtanpName.getText();
              description = txtanpDes.getText();
                     freq  = Double.parseDouble(frequencyText.getText());
        
           Sensor sensor = sensorSet.getSensorFromID(Integer.parseInt(txtanpId.getText())).firstElement();

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
                    loadAddSensor(sensorSet);

                } else {
                    JOptionPane.showMessageDialog(this, "Update unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
           
        
        Sensor sensor = sensorSet.getSensorFromID(Integer.parseInt(txtanpId.getText())).firstElement();
                System.out.println("delete product" + sensor);
                
                  if (sensorSet.remove(sensor)) {
                    try {
                        Serialization.Serialize(sensorSet, FILE_NAME_Sensor);
                    } catch (IOException ex) {
                        Logger.getLogger(AddSensor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    loadAddSensor(sensorSet);
                    JOptionPane.showMessageDialog(this, "Delete Sucsessfully", "Message", JOptionPane.PLAIN_MESSAGE);
                

                } else {
                    JOptionPane.showMessageDialog(this, "Delete unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void tblanpSensorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblanpSensorMouseClicked
     
          DefaultTableModel dtModel= (DefaultTableModel) tblanpSensor.getModel();
           int row = tblanpSensor.getSelectedRow();
        txtanpId.setText(tblanpSensor.getValueAt(row, 0).toString());
        txtanpName.setText(tblanpSensor.getValueAt(row, 1).toString());
        txtanpDes.setText(tblanpSensor.getValueAt(row, 3).toString());
          frequencyText.setText(tblanpSensor.getValueAt(row, 4).toString());


    }//GEN-LAST:event_tblanpSensorMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            Location location = locationSet.getLocationFromSensorID(Integer.parseInt(txtanpId.getText())).firstElement();       
        System.err.println(location.getLatitude());
         System.err.println(location.getLongitude());
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  
            User user = theUsers.getMemberFromNumber(Integer.parseInt(userID.getText())).firstElement();
     
    
    //When you opt for option "Notify me when product is available".Below registerObserver method
    //get executed   
          
                notMobile.registerObserver(user);
                theUsersObserver.add(user);
                  try {
                Serialization.Serialize(theUsersObserver, FILE_NAME_Observer);

                System.out.println("Add Observer Sucsessfully");

            } catch (IOException ex) {
               
                System.out.println("Unsuccessful...");
            }
               // notMobile.registerObserver(johnPerson);
//                notMobile.registerObserver(piyumiPerson);
    
    //Now product is available
    //samsungMobile.setAvailability("Available");
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

            notMobile.setAvailability(jTextField2.getText());
           // System.out.println(arpitPerson.getAvailabiliy());
//                 try {
//                        Serialization.Serialize(theUsersObserver, FILE_NAME_Observer);
//                    } catch (IOException ex) {
//                        Logger.getLogger(MyProfile.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                 
                    TableLoad(theUsersObserver);
           
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String name, description , frequency;   
        name = txtanpName.getText();
        description = txtanpDes.getText();
        frequency =  frequencyText.getText();
        
        
        notMobile.addNewSensor(new Sensor(name, description, Double.parseDouble(frequency),textStatus.getText()));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
            User user = theUsersObserver.getMemberFromNumber(Integer.parseInt(userID.getText())).firstElement();
             notMobile.unregisterObserver(user);
             
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

                   
                 try {
                        Serialization.Serialize(theUsersObserver, FILE_NAME_Observer);
                         System.out.println("Serialize");
                    } catch (IOException ex) {
                        Logger.getLogger(MyProfile.class.getName()).log(Level.SEVERE, null, ex);
                         System.out.println("Error");
                    }
                 
                 
                 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         User user = theUsersObserver.getMemberFromNumber(Integer.parseInt(userID.getText())).firstElement();
             boolean status = theUsersObserver.removeUser(user);
                if (status) {
                      try {
                        Serialization.Serialize(theUsersObserver, FILE_NAME_Observer);
                    } catch (IOException ex) {
                        Logger.getLogger(MyProfile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "You have deleted successful", "Congradulations", JOptionPane.INFORMATION_MESSAGE);
                         clear();
                    loadObserver();

                } else {
                    JOptionPane.showMessageDialog(this, "Delete unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

       private void loadAddSensor(SensorMonitor sensorMoni) {

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
             for (Sensor sensors : Serialization.deserializeBinSensors()) {
                         sensorSet.addNewSensor(sensors);
                       
//                          products.print();
            }
        } catch (IOException | ClassNotFoundException  ex) {
            JOptionPane.showMessageDialog(this, ex);
        
        }
       
          loadAddSensor(sensorSet);
    }
        
    public void loadLocation(){
        try { 
             for (Location location : Serialization.deserializeBinSensorsLocation()) {
                         locationSet.addNewSensor(location);
//                          products.print();
            }
        } catch (IOException | ClassNotFoundException  ex) {
            JOptionPane.showMessageDialog(this, ex);
        
        }
         
//          loadAddSensor(sensorSet);
    }
    private void loadUser(){
           try {
            for (User member : Serialization.deserializeUsers()) {
                theUsers.addUser(member);
                //member.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    
        private void loadObserver() {
        try {
            for (User member : Serialization.deserializeObserver()) {
                 notMobile.registerObserver(member);
                 theUsersObserver.add(member);
                 TableLoad(theUsersObserver);
                member.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

           
    }
        
           public void TableLoad( SetOfUsers searchList) {
        String[] colName = {"User ID", "First Name", "Address", "Email", "Mobile Number","Availabiliy"};
        Object[][] object = new Object[searchList.size()][6];
        int i = 0;
        if (searchList.size() != 0) {
            for (User member : searchList) {
                object[i][0] = member.getMemberNumber();
                object[i][1] = member.getName();
                object[i][2] = member.getAddress();
                object[i][3] = member.getUsername();
                object[i][4] = member.getMobile();
                object[i][5] = member.getAvailabiliy();

                i++;

            }
        }

        DefaultTableModel model = new DefaultTableModel(object, colName) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;//This causes all cells to be not editable
            }
        };
        jTable1.setModel(model);
        jTable1.setRowSorter(new TableRowSorter<>(model));
        jTable1.setAutoscrolls(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
    }
             public void clear() {
        userID.setText("");
    

        theUsersObserver.removeAll(theUsersObserver);
        try {
            for (User user : Serialization.deserializeObserver()) {
                theUsersObserver.addUser(user);
                user.print();
            }
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(AddSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSensor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField frequencyText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tblanpSensor;
    private javax.swing.JTextField textStatus;
    private javax.swing.JTextField txtanpDes;
    private javax.swing.JTextField txtanpId;
    private javax.swing.JTextField txtanpName;
    private javax.swing.JTextField userID;
    // End of variables declaration//GEN-END:variables
}
