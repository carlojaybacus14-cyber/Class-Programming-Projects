package Danosos;

import java.awt.*;
import javax.swing.JOptionPane;

/**
 * CircularLinkedListUI is a Java Swing GUI application that provides
 * a visual interface for interacting with a Circular Linked List.
 * Users can insert nodes, delete nodes, traverse the list, and check
 * its length through the provided buttons.
 */
public class CircularLinkedListUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CircularLinkedListUI.class.getName());
    
    // The underlying circular linked list data structure that this UI interacts with
    private final CircularLinkedList circularList;
    
    // Accumulates all output messages (insertions, deletions, traversals, etc.)
    // so that the output area shows a running history rather than just the last action
    private String txtContainer = "";
    
    /**
     * Constructor: Initializes the form components, creates a new CircularLinkedList instance,
     * and sets the background color of the window's content area to a dark theme color.
     */
    public CircularLinkedListUI() {
        initComponents();
        circularList = new CircularLinkedList();
        getContentPane().setBackground(new Color(26, 26, 26));
    }
    
    /**
     * Updates the output text area (txtOutput) with the current contents
     * of txtContainer. This is called after every user action to reflect
     * the latest state of the list operations.
     */
    private void display() {
        txtOutput.setText(txtContainer);
    }
    
    /**
     * Displays a modal error dialog with a custom message.
     * Used when the user provides invalid input (e.g., non-numeric values).
     *
     * @param message The error message to display in the dialog box.
     */
    private void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(this, message, "error", JOptionPane.ERROR_MESSAGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnTraverse = new javax.swing.JButton();
        btnLength = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(26, 26, 26));

        txtOutput.setEditable(false);
        txtOutput.setBackground(new java.awt.Color(17, 17, 17));
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtOutput.setForeground(new java.awt.Color(255, 255, 255));
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        btnTraverse.setBackground(new java.awt.Color(44, 44, 44));
        btnTraverse.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnTraverse.setForeground(new java.awt.Color(224, 224, 224));
        btnTraverse.setText("Traverse");
        btnTraverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraverseActionPerformed(evt);
            }
        });

        btnLength.setBackground(new java.awt.Color(44, 44, 44));
        btnLength.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnLength.setForeground(new java.awt.Color(224, 224, 224));
        btnLength.setText("Length");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(50, 40, 40));
        btnDelete.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(224, 136, 136));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(44, 44, 44));
        btnInsert.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(224, 224, 224));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        txtInput.setBackground(new java.awt.Color(17, 17, 17));
        txtInput.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtInput.setForeground(new java.awt.Color(221, 221, 221));

        jLabel1.setBackground(new java.awt.Color(17, 17, 17));
        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CIRCULAR LINKED LIST");

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(136, 136, 136));
        jLabel2.setText("User Input");

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
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTraverse, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTraverse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Triggered when the "Insert" button is clicked.
     * Reads the integer value from the input field and inserts it at the end
     * of the circular linked list. Logs the action to the output area.
     * Shows an error dialog if the input is not a valid integer.
     */
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        int data;
        try {
            // Attempt to parse the text field value as an integer
            data = Integer.parseInt(txtInput.getText());
        } catch (NumberFormatException e) {
            // Input is not a valid number — notify the user and stop
            showErrorDialog("Invalid user input");
            return;
        }
        
        // Insert the value at the end of the circular linked list
        circularList.insertAtEnd(data);
        
        // Insert the value at the end of the circular linked list
        txtContainer += data + " has been inserted.\n";
        display();
    }//GEN-LAST:event_btnInsertActionPerformed

    /**
     * Triggered when the "Traverse" button is clicked.
     * Calls the traverse() method on the circular linked list and appends
     * the result (a string representation of all nodes) to the output log.
     */
    private void btnTraverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraverseActionPerformed
        // Display the total number of elements in the list
        txtContainer += circularList.traverse() + "\n";
        display();
    }//GEN-LAST:event_btnTraverseActionPerformed

    /**
     * Triggered when the "Length" button is clicked.
     * Retrieves the current number of nodes in the circular linked list
     * and appends it to the output log.
     */
    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        // Get and display the total number of elements in the list
        txtContainer += "Length: " + circularList.length() + "\n";
        display();
    }//GEN-LAST:event_btnLengthActionPerformed

    /**
     * Triggered when the "Delete" button is clicked.
     * Reads the integer value from the input field and attempts to delete
     * the matching node from the circular linked list.
     * Logs whether the deletion was successful or if the value wasn't found.
     * Shows an error dialog if the input is not a valid integer.
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int data;
        try {
            // Attempt to parse the input field as an integer
            data = Integer.parseInt(txtInput.getText());
        } catch (NumberFormatException e) {
            // Input is not a valid number — show an error and stop
            showErrorDialog("Delete what?");
            return;
        }
        
        // Attempt deletion; delete() returns true if found and removed, false otherwise
        if (circularList.delete(data)) {
            txtContainer += data + " has been deleted.\n";
        } else {
            txtContainer += data + " is not on the list.\n";
        }
        
        // Refresh the output display with the updated log
        display();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new CircularLinkedListUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLength;
    private javax.swing.JButton btnTraverse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
