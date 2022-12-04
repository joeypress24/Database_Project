package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Press, Joseph, and Watsy, Farah
 */
public class ManageRentals extends javax.swing.JFrame {
    myDBCon dbCon;
    ResultSet rs;
    Random rand = new Random();

    // constructor to create new employee
    public ManageRentals() {
        initComponents();
        this.setLocationRelativeTo(null); // center form in screen 

        dbCon = new myDBCon();
        
        populateFields();
    }

    private void populateFields() {
        try { 
            // clear the combo boxes
            cmbCurrentRentals.removeAllItems();
            cmbLicenseno.removeAllItems();
            cmbPlateno.removeAllItems();
            // refil the combo boxes
            dbCon = new myDBCon();
            rs = dbCon.executeStatement("SELECT license FROM cust ORDER BY license ASC");
            // populate licenseno combo box
            while (rs.next()) {
                cmbLicenseno.addItem(rs.getString("license"));
            }
            // get and populate available vehicles 
            rs = dbCon.executeStatement("SELECT plateno FROM vehicle where isavailable = 1 ORDER BY plateno ASC");
            while (rs.next()) {
                cmbPlateno.addItem(rs.getString("plateno"));
            }
            // get and populate rented vehicles
            rs = dbCon.executeStatement("SELECT plateno FROM rented ORDER BY plateno ASC");
            while (rs.next()) {
                cmbCurrentRentals.addItem(rs.getString("plateno"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddRental = new javax.swing.JButton();
        cmbLicenseno = new javax.swing.JComboBox<>();
        cmbPlateno = new javax.swing.JComboBox<>();
        cmbCurrentRentals = new javax.swing.JComboBox<>();
        btnReturnVehicle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Manage Rentals");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("License# of customer:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Plate# of Vehicle:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Current Rentals:");

        btnAddRental.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddRental.setText("Add New");
        btnAddRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRentalActionPerformed(evt);
            }
        });

        cmbLicenseno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbPlateno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCurrentRentals.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnReturnVehicle.setText("Return Vehicle");
        btnReturnVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnVehicleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddRental)
                .addGap(273, 273, 273))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbPlateno, 0, 132, Short.MAX_VALUE)
                            .addComponent(cmbLicenseno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCurrentRentals, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btnReturnVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbLicenseno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPlateno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddRental)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbCurrentRentals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnReturnVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // verify valid entry of integer values
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    // verify valid entry of double values
    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    // clear all labels used to display error messages 
    void clearErrorLabels() { 

    }

    // we don't care if data is valid really
    boolean isValidData() {
        clearErrorLabels();
        boolean result = true; // assume all details are true, set to false if otherwise 
        
        return result;
    }

    // clear for every new entry 
    void clearInputBoxes() { 
 
    }

    // check if the employee is a duplicate
    private boolean isDuplicate(int empno) throws SQLException {
        boolean isduplicate = false;
        String stmtSQL = "SELECT empno FROM emp WHERE empno = " + empno;
      //  rs = dbCon.executeStatement(stmtSQL);
        
      //  isduplicate = rs.isBeforeFirst();
        return isduplicate;
    }
    
    // method invoked when a new emp is added
    private void btnAddRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRentalActionPerformed
        // TODO add your handling code here:
        try {
            String prepSQL = "INSERT INTO rented (license, plateno, transactionID) VALUES ('"
                    + cmbLicenseno.getSelectedItem() + "', '"
                    + cmbPlateno.getSelectedItem() + "', "
                    + generateID() + ")";
            int result = dbCon.executePrepared(prepSQL);
            if (result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("New rental added successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                // update the isavailable flag in vehicle

                prepSQL = "UPDATE vehicle set isavailable = 0 WHERE plateno = '" + cmbPlateno.getSelectedItem() + "'";
                result = dbCon.executePrepared(prepSQL);
                
            } else {
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new employee.");
        }
        populateFields();
    }//GEN-LAST:event_btnAddRentalActionPerformed

    private void btnReturnVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnVehicleActionPerformed
        // TODO add your handling code here:
        try {
            String prepSQL = "DELETE rented where plateno = '" + cmbCurrentRentals.getSelectedItem() + "'";
            int result = dbCon.executePrepared(prepSQL);
            if(result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("New rental returned successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                prepSQL = "Update vehicle set isavailable = 1 where plateno = '" + cmbCurrentRentals.getSelectedItem() + "'";
                dbCon.executePrepared(prepSQL);
            }
        }
        catch(SQLException e)
        {
        }
        populateFields();
    }//GEN-LAST:event_btnReturnVehicleActionPerformed
    private String generateID()
    {
        int randomNum = rand.nextInt((10000-1) + 1) + 1;
        return Integer.toString(randomNum);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRental;
    private javax.swing.JButton btnReturnVehicle;
    private javax.swing.JComboBox<String> cmbCurrentRentals;
    private javax.swing.JComboBox<String> cmbLicenseno;
    private javax.swing.JComboBox<String> cmbPlateno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}