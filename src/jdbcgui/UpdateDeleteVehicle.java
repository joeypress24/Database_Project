package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JOptionPane;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Press, Joseph, and Watsy, Farah
 */
public class UpdateDeleteVehicle extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rs;
    ResultSet rsdeptno;

    /**
     * Creates new form UpdateDeleteEmployee
     */
    public UpdateDeleteVehicle() {
        initComponents(); // initialize components
        
        // center form in screen 
        this.setLocationRelativeTo(null);
        
        // set all error labels to invisible
        lblPlatenoError.setVisible(false);
        lblMakeError.setVisible(false);
        lblModelError.setVisible(false);
        lblCostError.setVisible(false);
        dbCon = new myDBCon();
        getNewData();
    }

    // gets data and updates the screen
    private void getNewData() {
        try {
            String str;
            // populate iscar field
            
            cmbIscar.removeAllItems();
            cmbIscar.addItem("yes");
            cmbIscar.addItem("no");
            // populate isavailable field
            cmbIsAvailable.removeAllItems();
            cmbIsAvailable.addItem("yes");
            cmbIsAvailable.addItem("no");

            // populate rest of fields
            rs = dbCon.executeStatement("SELECT plateno, make, model, iscar, cost, isavailable FROM vehicle ORDER BY plateno ASC ");
            rs.beforeFirst();
            rs.first();
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display combo boxes.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMake = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        cmbIscar = new javax.swing.JComboBox<>();
        cmbIsAvailable = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtPlateno = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        lblPlatenoError = new javax.swing.JLabel();
        lblMakeError = new javax.swing.JLabel();
        lblModelError = new javax.swing.JLabel();
        lblCostError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update/Delete Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update/Delete Vehicle");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Plateno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Make:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Model:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Is Car:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Cost:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Is Available:");

        txtMake.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtModel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        txtCost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbIscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbIsAvailable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtPlateno.setEditable(false);
        txtPlateno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        lblPlatenoError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPlatenoError.setForeground(new java.awt.Color(255, 0, 0));
        lblPlatenoError.setText("error label");

        lblMakeError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblMakeError.setForeground(new java.awt.Color(255, 0, 0));
        lblMakeError.setText("error label");

        lblModelError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblModelError.setForeground(new java.awt.Color(255, 0, 0));
        lblModelError.setText("error label");

        lblCostError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblCostError.setForeground(new java.awt.Color(255, 0, 0));
        lblCostError.setText("error label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnPrevious)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPlateno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMake, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCost, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbIscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPlatenoError, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(lblMakeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblModelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCostError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbIsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPlateno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlatenoError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMakeError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbIscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblCostError)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbIsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

   
    // populates the textbox and other fields
    private void populateFields() {
        try {
            txtPlateno.setText(rs.getString("plateno"));
            txtMake.setText(rs.getString("make"));
            txtModel.setText(rs.getString("model"));
            // figure out the iscar field
            if(rs.getString("iscar").equals("1"))
                cmbIscar.setSelectedItem("yes");
            else
                cmbIscar.setSelectedItem("no");
            txtCost.setText(rs.getString("cost"));
            if(rs.getString("isavailable").equals("1"))
                cmbIsAvailable.setSelectedItem("yes");
            else
                cmbIsAvailable.setSelectedItem("no");
            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteVehicle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // helper method to handle right arrow
    private void MoveNext() {
        try {
            // TODO add your handling code here:
            if (!rs.isLast()) {
                rs.next();
                populateFields();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteVehicle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    // helper method to handle back arrow
    private void MovePrevious() {
        try {
            // TODO add your handling code here:
            if (!rs.isFirst()) {
                rs.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteVehicle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // logical method to handle moving forward and backwards
    private void EnableDisableButtons() {
        try {
            if (rs.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rs.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteVehicle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    // handles when the user wants to delete an employee
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            // make the result set scrolable forward/backward updatable
            String prepSQL = "DELETE vehicle WHERE plateno = " + txtPlateno.getText().trim();
            int result = dbCon.executePrepared(prepSQL);
            if (result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("Employee No " + txtPlateno.getText().trim() + " deleted successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                getNewData();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new employee.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    void clearErrorLabels() {
        lblPlatenoError.setText("");
        lblPlatenoError.setVisible(false);
        lblMakeError.setText("");
        lblMakeError.setVisible(false);
        lblModelError.setText("");
        lblModelError.setVisible(false);
        lblCostError.setText("");
        lblCostError.setVisible(false);
    }
    
    // helper method to check if an integer
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    // helper method to check if a double
    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    // returns true if data in fields are valid for update, false otherwise
    boolean isValidData() {
        clearErrorLabels();
        boolean result = true; // assume all details are true, set to false if otherwise 
        // check plateno field
        if (txtPlateno.getText().trim().isEmpty() || txtPlateno.getText().trim().length() > 10 ) {
           
            if (txtPlateno.getText().trim().isEmpty()) {
                lblPlatenoError.setText("Invalid. Cannot be empty.");
            } else if (txtPlateno.getText().trim().length() > 10) {
                lblPlatenoError.setText("Invalid. Must be <10 len.");
            }
            lblPlatenoError.setVisible(true);
            result = false;
        }

        // check make field
        if (txtMake.getText().trim().isEmpty() || (txtMake.getText().trim().length() > 10)) {
            if (txtMake.getText().trim().isEmpty()) {
                lblMakeError.setText("Invalid. Cannot be empty.");
            } else if ((txtMake.getText().trim().length() > 10)) {
                lblMakeError.setText("Invalid. Must be < 10 chars.");
            }
            lblMakeError.setVisible(true);
            result = false;
        }

        // check model field
        if (txtModel.getText().trim().isEmpty() || (txtModel.getText().trim().length() > 10)) {
            if (txtModel.getText().trim().isEmpty()) {
                lblModelError.setText("Invalid. Cannot be empty.");
            } else if (txtModel.getText().trim().length() > 10) {
                lblModelError.setText("Invalid. Must be < 10 chars.");
            }
            lblModelError.setVisible(true);
            result = false;
        }
        
        // check the cost field
        if(txtCost.getText().trim().isEmpty() || !isInteger(txtCost.getText().trim()))
        {
            if(txtCost.getText().trim().isEmpty())
                lblCostError.setText("Invalid. Cannot be empty.");
            else
                lblCostError.setText("Invalid. Must be integer.");
            lblCostError.setVisible(true);
            result = false;
        }
        return result;
    }

    private int getIsCar() {
        if(cmbIscar.getSelectedItem().equals("yes"))
            return 1;
        return 0;
    }
    private int getIsAvailable() {
        if(cmbIsAvailable.getSelectedItem().equals("yes"))
            return 1;
        return 0;
    }
    // invoked when the user presses the "update" button
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        try {
            // make the result set scrolable forward/backward updatable
            if (isValidData()) {
                String prepSQL = "UPDATE vehicle SET make = '"
                        + txtMake.getText().trim() + "', model = '" 
                        + txtModel.getText().trim() + "', iscar = "
                        + getIsCar() + ", cost = "
                        + Integer.parseInt(txtCost.getText().trim()) + ", isavailable = "
                        + getIsAvailable() + " where plateno = '"
                        + txtPlateno.getText().trim() + "'";

                System.out.println(prepSQL);
                // confirm update/delete
                javax.swing.JOptionPane conf = new javax.swing.JOptionPane();
                int a = javax.swing.JOptionPane.showConfirmDialog(conf, "are you sure?");
                if(a == javax.swing.JOptionPane.YES_OPTION)
                {
                    int result = dbCon.executePrepared(prepSQL); 
                    if (result > 0) {
                        javax.swing.JLabel label = new javax.swing.JLabel("vehicle no " + txtPlateno.getText() + " updated successfully.");
                        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                        getNewData();

                    } else {
                    }
                }
            } else {
                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating vehicle." + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbIsAvailable;
    private javax.swing.JComboBox<String> cmbIscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCostError;
    private javax.swing.JLabel lblMakeError;
    private javax.swing.JLabel lblModelError;
    private javax.swing.JLabel lblPlatenoError;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPlateno;
    // End of variables declaration//GEN-END:variables
}
