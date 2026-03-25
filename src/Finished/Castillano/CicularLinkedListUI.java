package Finished.Castillano;

import java.awt.Color;
import javax.swing.JOptionPane;

public class CicularLinkedListUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CicularLinkedListUI.class.getName());

    private String texts = "";

    private final CircularLinkedList circularList;

    private void displayText() {
        txtOutput.setText(texts);
    }

    public CicularLinkedListUI() {
        initComponents();
        getContentPane().setBackground(new Color(44, 15, 18));
        circularList = new CircularLinkedList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsert = new javax.swing.JButton();
        btnTraverse = new javax.swing.JButton();
        btnLength = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        txtInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInsert.setBackground(new java.awt.Color(107, 30, 35));
        btnInsert.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(245, 225, 225));
        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnTraverse.setBackground(new java.awt.Color(107, 30, 35));
        btnTraverse.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        btnTraverse.setForeground(new java.awt.Color(245, 225, 225));
        btnTraverse.setText("TRAVERSE");
        btnTraverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraverseActionPerformed(evt);
            }
        });

        btnLength.setBackground(new java.awt.Color(107, 30, 35));
        btnLength.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        btnLength.setForeground(new java.awt.Color(245, 225, 225));
        btnLength.setText("LENGTH");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(114, 16, 16));
        btnDelete.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(245, 225, 225));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(210, 140, 140));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CIRCULAR LINKED LIST");

        txtOutput.setEditable(false);
        txtOutput.setBackground(new java.awt.Color(62, 20, 22));
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtOutput.setForeground(new java.awt.Color(245, 225, 225));
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        txtInput.setBackground(new java.awt.Color(62, 20, 22));
        txtInput.setForeground(new java.awt.Color(245, 225, 225));

        jLabel2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(210, 140, 140));
        jLabel2.setText("Enter Data:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTraverse, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                    .addComponent(txtInput)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnTraverse)
                    .addComponent(btnLength)
                    .addComponent(btnDelete))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String txt = txtInput.getText();
        if (txt.isBlank()) {
            JOptionPane.showMessageDialog(this, "Input something.");
            return;
        }

        int data;

        try {
            data = Integer.parseInt(txt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            return;
        }

        circularList.insertAtEnd(data);

        texts += data + " is inserted.\n";

        displayText();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnTraverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraverseActionPerformed
        texts += circularList.traverse() + "\n";
        displayText();
    }//GEN-LAST:event_btnTraverseActionPerformed

    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        texts += "Length: " + circularList.length() + "\n";
        displayText();
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        String txt = txtInput.getText();
        
        if (txt.isBlank()) {
            JOptionPane.showMessageDialog(this, "Please enter something");
            return;
        }
            
        int data;
        
        try {
            data = Integer.parseInt(txt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            return;
        }

        if (circularList.delete(data)) {
            texts += data + " has been deleted.\n";
        } else {
            texts += data + " is not on the list.\n";
        }

        displayText();
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CicularLinkedListUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLength;
    private javax.swing.JButton btnTraverse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}

class CircularLinkedList {

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // --- TRAVERSE ---
    public String traverse() {
        if (head == null) {
            return "List is empty.";
        }

        String txtContainer = "";
        String output = "";
        String line = "";
        Node current = head;

        do {
            String localOutput = current.data + " -> ";
            output += localOutput;
            txtContainer += localOutput;
            current = current.next;
        } while (current.next != head);

        for (int i = 0; i < output.length() - 1; i++) {
            line += "_";
        }

        txtContainer += current.data + "\n|" + line + "|";

        return txtContainer;
    }

    // --- INSERT AT BEGINNING ---
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    // --- INSERT AT END ---
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    // --- INSERT AT INDEX ---
    public void insertAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else if (index == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        } else if (index == size) {
            insertAtEnd(data);
            return;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    // --- DELETE ---
    public boolean delete(int data) {
        if (head == null) {
            return false;
        }

        Node current = head;
        Node previous = null;

        do {
            if (current.data == data) {
                if (current == head) {
                    if (size == 1) {
                        head = null;
                        tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                        tail.next = head;
                    }
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println(data + " not fount in the list.");
        return false;
    }

    // --- DELETE AT ---
    public void deleteAt(int position) {
        if (head == null || position < 0 || position >= size) {
            System.out.println("invalid position or empty list");
            return;
        }

        if (position == 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        } else {
            Node current = head;
            Node previous = null;
            for (int i = 0; i < position; i++) {
                previous = current;
                current = current.next;
            }

            previous.next = current.next;
            if (current == tail) {
                tail = previous;
                tail.next = head;
            }
        }
        size--;
    }

    // --- SIZE ---
    public int length() {
        return size;
    }
}
