package Finished.Danosos;

import java.awt.Color;

public class OfferDialog extends javax.swing.JDialog {

    private String offerType = "";

    public OfferDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        getContentPane().setBackground(new Color(26, 26, 26));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnBeginning = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btnBeginning.setBackground(new java.awt.Color(44, 44, 44));
        btnBeginning.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnBeginning.setForeground(new java.awt.Color(255, 255, 255));
        btnBeginning.setText("First");
        btnBeginning.setPreferredSize(new java.awt.Dimension(150, 25));
        btnBeginning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginningActionPerformed(evt);
            }
        });
        getContentPane().add(btnBeginning, new java.awt.GridBagConstraints());

        btnEnd.setBackground(new java.awt.Color(44, 44, 44));
        btnEnd.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnEnd.setForeground(new java.awt.Color(255, 255, 255));
        btnEnd.setText("Cancel");
        btnEnd.setPreferredSize(new java.awt.Dimension(150, 25));
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(btnEnd, gridBagConstraints);

        btnCancel.setBackground(new java.awt.Color(44, 44, 44));
        btnCancel.setFont(new java.awt.Font("Mongolian Baiti", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Last");
        btnCancel.setPreferredSize(new java.awt.Dimension(150, 25));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(btnCancel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeginningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginningActionPerformed
        offerType = "FIRST";
        dispose();
    }//GEN-LAST:event_btnBeginningActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        offerType = "LAST";
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        offerType = "";
        dispose();
    }//GEN-LAST:event_btnEndActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeginning;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEnd;
    // End of variables declaration//GEN-END:variables

    public String getOfferType() {
        return offerType;
    }
}
