package Florentino;

import java.awt.Color;
import javax.swing.JOptionPane;

public class DoublyLinkedListDemo extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DoublyLinkedListDemo.class.getName());

    private String textContainer = "";

    private final DoublyLinkedList doublyList;

    public DoublyLinkedListDemo() {
        initComponents();
        getContentPane().setBackground(new Color(0, 153, 102));

        doublyList = new DoublyLinkedList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnLength = new javax.swing.JButton();
        btnDeletePos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOUBLY LINKED LIST");

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        jLabel2.setFont(new java.awt.Font("MS Gothic", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Variable:");

        btnInsert.setBackground(new java.awt.Color(255, 255, 255));
        btnInsert.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(0, 0, 0));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnLength.setBackground(new java.awt.Color(255, 255, 255));
        btnLength.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        btnLength.setForeground(new java.awt.Color(0, 0, 0));
        btnLength.setText("Get Length");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        btnDeletePos.setBackground(new java.awt.Color(255, 255, 255));
        btnDeletePos.setFont(new java.awt.Font("MS Gothic", 1, 12)); // NOI18N
        btnDeletePos.setForeground(new java.awt.Color(0, 0, 0));
        btnDeletePos.setText("Delete Position");
        btnDeletePos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInput)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletePos, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeletePos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String str = txtInput.getText();

        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a data");
            return;
        }

        try {

            int data = Integer.parseInt(str);
            doublyList.insertAtEnd(data);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
        }

        textContainer += doublyList.printList() + "\n";
        txtOutput.setText(textContainer);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String str = txtInput.getText();

        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter a data to delete");
            return;
        }

        try {
            int data = Integer.parseInt(str);
            doublyList.deleteData(data);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
        }

        textContainer += doublyList.printList() + "\n";
        txtOutput.setText(textContainer);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        textContainer += "Length: " + doublyList.size() + "\n";
        txtOutput.setText(textContainer);
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnDeletePosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePosActionPerformed
        String str = txtInput.getText();

        if (str.isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter an index to delete");
            return;
        }

        try {
            int index = Integer.parseInt(str);

            if (index < 0 || index >= doublyList.size()) {
                JOptionPane.showMessageDialog(this, "Index out of bounds");
                return;
            }

            doublyList.deleteAtIndex(index);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }

        textContainer += doublyList.printList() + "\n";
        txtOutput.setText(textContainer);
    }//GEN-LAST:event_btnDeletePosActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new DoublyLinkedListDemo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeletePos;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLength;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
