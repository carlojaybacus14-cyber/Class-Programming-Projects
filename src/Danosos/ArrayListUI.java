package Danosos;

import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ArrayListUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayListUI.class.getName());
    
    private final ArrayList<Integer> arrayList;
    private String txtContainer = "";
    
    public ArrayListUI() {
        initComponents();
        arrayList = new ArrayList<>();
        getContentPane().setBackground(new Color(26, 26, 26));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnAccess = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(26, 26, 26));

        txtOutput.setEditable(false);
        txtOutput.setBackground(new java.awt.Color(17, 17, 17));
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtOutput.setForeground(new java.awt.Color(255, 255, 255));
        txtOutput.setRows(5);
        jScrollPane2.setViewportView(txtOutput);

        btnAccess.setBackground(new java.awt.Color(44, 44, 44));
        btnAccess.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnAccess.setForeground(new java.awt.Color(224, 224, 224));
        btnAccess.setText("Access");
        btnAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessActionPerformed(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(44, 44, 44));
        btnChange.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnChange.setForeground(new java.awt.Color(224, 224, 224));
        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(56, 40, 40));
        btnRemove.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(224, 136, 136));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(44, 44, 44));
        btnAdd.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(224, 224, 224));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtInput.setBackground(new java.awt.Color(17, 17, 17));
        txtInput.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtInput.setForeground(new java.awt.Color(221, 221, 221));

        jLabel2.setBackground(new java.awt.Color(17, 17, 17));
        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ARRAY LIST");

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(136, 136, 136));
        jLabel4.setText("User Input");

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(136, 136, 136));
        jLabel3.setText("Output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //method to display the output of each button function
    private void display() {
        txtOutput.setText(txtContainer);
    }

    //method to show an error dialog
    private void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(this, message, "error", JOptionPane.ERROR_MESSAGE);
    }

    //method to remind the user that the list is empty
    private void showReminderDialog() {
        JOptionPane.showMessageDialog(this, "Array list is empty");
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int data;
        try {
            //converts the user input into data to be added to the list
            data = Integer.parseInt(txtInput.getText());
        } catch (NumberFormatException e) {
            //shows an error message if the user inputs an invalid integer
            showErrorDialog("Invalid user input");
            return; 
        }
        
        //adds data to the list
        arrayList.add(data);
        txtContainer += arrayList + "\n";
        display();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessActionPerformed
        //checks if the list is empty or not
        if (arrayList.isEmpty()) {
            showReminderDialog();
            return;
        }
        
        int index;
        
        try {
            index = Integer.parseInt(txtInput.getText());

            //checks if the user input is a valid index within the list's bounds
            if (index < 0 || index >= arrayList.size()) {
                showErrorDialog("Index out of bounds");
                return;
            }
        } catch (HeadlessException | NumberFormatException e) {
            //shows an error message if the user inputs an invalid integer
            JOptionPane.showMessageDialog(this, "Invalid user input", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //accesses any data when the user requests a specific element
        txtContainer += "Accessed element: " + arrayList.get(index) + "\n";
        display();
    }//GEN-LAST:event_btnAccessActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        //checks if the list is empty or not
        if (arrayList.isEmpty()) {
            showReminderDialog();
            return;
        }
        
        int data;
        int index;
        try {
            data = Integer.parseInt(txtInput.getText());
            index = Integer.parseInt(JOptionPane.showInputDialog("Enter index"));
            
            if (index < 0 || index >= arrayList.size()) {
                //checks if the user input is a valid index within the list's bounds
                JOptionPane.showConfirmDialog(this, "Index out of bounds", "error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (HeadlessException | NumberFormatException e) {
            //shows an error message if the user inputs an invalid integer
            JOptionPane.showMessageDialog(this, "Invalid user input", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //changes any data the user wants to update
        arrayList.set(index, data);
        txtContainer += arrayList + "\n";
        display();
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        //checks if the list is empty or not
        if (arrayList.isEmpty()) {
            showReminderDialog();
            return;
        }
        
        int index;
        
        try {
            index = Integer.parseInt(txtInput.getText());
            
            if (index < 0 || index >= arrayList.size()) {
                //checks if the user input is a valid index within the list's bounds
                JOptionPane.showMessageDialog(this, "Index out of bounds", "error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            //shows an error message if the user inputs an invalid integer
            JOptionPane.showMessageDialog(this, "Invalid user input", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //removes the element the user wants to delete
        arrayList.remove(index);
        
        if (arrayList.isEmpty()) {
            //shows a message if the list is now empty
            txtContainer += "Array list is now empty.\n";
        } else {
            //shows the remaining elements in the list
            txtContainer += arrayList + "\n";
        }
        
        display();
    }//GEN-LAST:event_btnRemoveActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> new ArrayListUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccess;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
