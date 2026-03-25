package WIP.Francisco;

import java.awt.Color;
import javax.swing.JOptionPane;

public class CircularLinkedListDemo extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CircularLinkedListDemo.class.getName());

    private String txtContainer = "";
    
    private final CircularLinkedList circularList;

    public CircularLinkedListDemo() {
        initComponents();
        getContentPane().setBackground(new Color(23, 23, 23));
        circularList = new CircularLinkedList();
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
        btnInsert = new javax.swing.JButton();
        btnTraverse = new javax.swing.JButton();
        btnLength = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rajdhani", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(227, 197, 134));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CIRCULAR LINKED LIST");

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

        btnInsert.setBackground(new java.awt.Color(38, 34, 15));
        btnInsert.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(227, 197, 134));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnTraverse.setBackground(new java.awt.Color(38, 34, 15));
        btnTraverse.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        btnTraverse.setForeground(new java.awt.Color(227, 197, 134));
        btnTraverse.setText("Traverse");
        btnTraverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraverseActionPerformed(evt);
            }
        });

        btnLength.setBackground(new java.awt.Color(38, 34, 15));
        btnLength.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        btnLength.setForeground(new java.awt.Color(227, 197, 134));
        btnLength.setText("Length");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(38, 34, 15));
        btnDelete.setFont(new java.awt.Font("Rajdhani", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(227, 197, 134));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
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
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTraverse, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOutputText)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEnterData, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraverse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblOutputText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        
        String txt = txtInputData.getText();
        
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

        txtInputData.setText("");
        txtContainer += data + " is inserted.\n";
        txtAreaResult.setText(txtContainer);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnTraverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraverseActionPerformed
        txtContainer += circularList.traverse() + "\n";
        txtAreaResult.setText(txtContainer);
    }//GEN-LAST:event_btnTraverseActionPerformed

    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        txtContainer += "Length: " + circularList.size() + "\n";
        txtAreaResult.setText(txtContainer);
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        String txt = txtInputData.getText();
        
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
            txtContainer += data + " has been deleted.\n";
        } else {
            txtContainer += data + " is not on the list.\n";
        }

        txtInputData.setText("");
        txtAreaResult.setText(txtContainer);
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
        java.awt.EventQueue.invokeLater(() -> new CircularLinkedListDemo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLength;
    private javax.swing.JButton btnTraverse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterData;
    private javax.swing.JLabel lblOutputText;
    private javax.swing.JTextArea txtAreaResult;
    private javax.swing.JTextField txtInputData;
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
            return "List is empty";
        }

        String output = "";
        Node current = head;

        do {
            output += current.data + " -> ";
            current = current.next;
        } while (current.next != head);

        return output + (current.data + " -> head");
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
    public int size() {
        return size;
    }
}
