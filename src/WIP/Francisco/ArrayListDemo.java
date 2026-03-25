package WIP.Francisco;

import java.awt.Color;

public class ArrayListDemo extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ArrayListDemo.class.getName());

    public ArrayListDemo() {
        initComponents();
        getContentPane().setBackground(new Color(23, 23, 23));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblEnterData = new javax.swing.JLabel();
        txtInputData = new javax.swing.JTextField();
        lblOutputText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResult = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnPoll = new javax.swing.JButton();
        btnPeek = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rajdhani", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 197, 134));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARRAYLIST");

        lblEnterData.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 14)); // NOI18N
        lblEnterData.setForeground(new java.awt.Color(227, 197, 134));
        lblEnterData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEnterData.setText("Enter Data:");

        txtInputData.setBackground(new java.awt.Color(31, 30, 26));
        txtInputData.setFont(new java.awt.Font("JetBrains Mono SemiBold", 0, 14)); // NOI18N
        txtInputData.setForeground(new java.awt.Color(227, 197, 134));
        txtInputData.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblOutputText.setFont(new java.awt.Font("Rajdhani SemiBold", 1, 13)); // NOI18N
        lblOutputText.setForeground(new java.awt.Color(122, 106, 48));
        lblOutputText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOutputText.setText("Output:");

        txtAreaResult.setBackground(new java.awt.Color(31, 30, 26));
        txtAreaResult.setColumns(20);
        txtAreaResult.setFont(new java.awt.Font("JetBrains Mono NL", 1, 14)); // NOI18N
        txtAreaResult.setForeground(new java.awt.Color(227, 197, 134));
        txtAreaResult.setRows(5);
        jScrollPane1.setViewportView(txtAreaResult);

        btnAdd.setBackground(new java.awt.Color(38, 34, 15));
        btnAdd.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(227, 197, 134));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnPoll.setBackground(new java.awt.Color(38, 34, 15));
        btnPoll.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        btnPoll.setForeground(new java.awt.Color(227, 197, 134));
        btnPoll.setText("Poll");
        btnPoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPollActionPerformed(evt);
            }
        });

        btnPeek.setBackground(new java.awt.Color(38, 34, 15));
        btnPeek.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        btnPeek.setForeground(new java.awt.Color(227, 197, 134));
        btnPeek.setText("Peek");
        btnPeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeekActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(38, 34, 15));
        btnClear.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(227, 197, 134));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPoll, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblOutputText)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEnterData, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPoll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblOutputText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPollActionPerformed
        
    }//GEN-LAST:event_btnPollActionPerformed

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed
        
    }//GEN-LAST:event_btnPeekActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
    }//GEN-LAST:event_btnClearActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ArrayListDemo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPeek;
    private javax.swing.JButton btnPoll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterData;
    private javax.swing.JLabel lblOutputText;
    private javax.swing.JTextArea txtAreaResult;
    private javax.swing.JTextField txtInputData;
    // End of variables declaration//GEN-END:variables
}
