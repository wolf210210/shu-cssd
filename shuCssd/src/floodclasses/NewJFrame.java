/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binclasses;

import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import serialization.Serialization;

/**
 *
 * @author wolf
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
        public static Sensor sensors = new Sensor();
    public static final String FILE_NAME_Products = "DataFiles/Products.txt";
    private SensorMonitor sensorSet = new SensorMonitor();
    public NewJFrame() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblanpProduct = new javax.swing.JTable();
        txtanpId = new javax.swing.JTextField();
        txtanpName = new javax.swing.JTextField();
        txtanpDes = new javax.swing.JTextField();
        btnancSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        tblanpProduct.setForeground(new java.awt.Color(153, 153, 153));
        tblanpProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblanpProduct.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblanpProduct.setFillsViewportHeight(true);
        tblanpProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblanpProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblanpProduct);

        txtanpId.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtanpId.setForeground(new java.awt.Color(102, 102, 102));
        txtanpId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtanpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanpIdActionPerformed(evt);
            }
        });

        txtanpName.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtanpName.setForeground(new java.awt.Color(102, 102, 102));
        txtanpName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtanpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanpNameActionPerformed(evt);
            }
        });

        txtanpDes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtanpDes.setForeground(new java.awt.Color(102, 102, 102));
        txtanpDes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnancSave.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnancSave.setForeground(new java.awt.Color(102, 102, 102));
        btnancSave.setText("Add");
        btnancSave.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnancSave.setContentAreaFilled(false);
        btnancSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnancSaveMouseClicked(evt);
            }
        });
        btnancSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnancSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtanpId, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtanpName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtanpDes, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnancSave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(txtanpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtanpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtanpDes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(btnancSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblanpProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblanpProductMouseClicked

        //        DefaultTableModel dtm = (DefaultTableModel) tblanpProduct.getModel();
        //
        //        int row = tblanpProduct.getSelectedRow();
        //
        //        txtanpId.setText(tblanpProduct.getValueAt(row, 0).toString());
        //        txtanpName.setText(tblanpProduct.getValueAt(row, 1).toString());
        //        txtanpDes.setText(tblanpProduct.getValueAt(row, 2).toString());
        //
        //        for (ProductsImp products : productSet) {
            //            if (products.getProductNo() == Integer.parseInt(txtanpId.getText())) {
                //                BufferedImage bufferedImage = null;
                //                try {
                    //                    InputStream inputStream = new ByteArrayInputStream(products.getImage());
                    //                    bufferedImage = ImageIO.read(inputStream);
                    //                } catch (IOException ex) {
                    //                    System.out.println(ex.getMessage());
                    //                }
                //                Image img = bufferedImage;
                //                Image newimg = img.getScaledInstance(imageIcon.getWidth(), imageIcon.getHeight(), java.awt.Image.SCALE_SMOOTH);
                //                ImageIcon imi = new ImageIcon(newimg);
                //                imageIcon.setIcon(imi);
                //
                //                break;
                //            }
            //
            //            products.print();
            //        }
    }//GEN-LAST:event_tblanpProductMouseClicked

    private void txtanpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanpIdActionPerformed

    private void txtanpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanpNameActionPerformed

    private void btnancSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnancSaveMouseClicked
        String name, description;
        if (txtanpName.getText().isEmpty()) {
            //            JOptionPane.showMessageDialog(this, "Please provide the name...", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Please provide the name...");
        } else {
            name = txtanpName.getText();
            description = txtanpDes.getText();
            //            Icon icon = imageIcon.getIcon();

            sensorSet.registerObserver(new Sensor(name, description, 6, 5.00, "No"));

            try {
                Serialization.Serialize(sensorSet, FILE_NAME_Products);

                System.out.println("Add Sucsessfully");

            } catch (IOException ex) {
                //                Logger.getLogger(AddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
                //                JOptionPane.showMessageDialog(this, "Unsuccessful...", "Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Add Sucsessfully");
            }

            loadAddProduct(sensorSet);

        }
    }//GEN-LAST:event_btnancSaveMouseClicked

    private void btnancSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnancSaveActionPerformed

    }//GEN-LAST:event_btnancSaveActionPerformed

    
    
    
        private void loadAddProduct(SensorMonitor products) {

        String[] colName = {"SensorID", "Name", "Status", "Description",  "Frequency"};
        Object[][] object = new Object[products.size()][6];
        int i = 0;
        if (products.size() != 0) {
            for (Sensor product : products) {
                object[i][0] = product.getProductNo();
                object[i][1] = product.getName();
                object[i][2] = product.getStatus();
                object[i][3] = product.getdescription();
                object[i][4] = product.getAvalability();
                i++;

            }
        }

        DefaultTableModel model = new DefaultTableModel(object, colName) {
            public boolean isCellEditable(int row, int column) {
                return false;//This causes all cells to be not editable
            }
        };
        tblanpProduct.setModel(model);
        tblanpProduct.setRowSorter(new TableRowSorter<TableModel>(model));
        tblanpProduct.setAutoscrolls(true);
        tblanpProduct.getTableHeader().setReorderingAllowed(false);

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnancSave;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblanpProduct;
    private javax.swing.JTextField txtanpDes;
    private javax.swing.JTextField txtanpId;
    private javax.swing.JTextField txtanpName;
    // End of variables declaration//GEN-END:variables
}