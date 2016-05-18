package gui;

import functions.AdminViewFeedbackManager;
import functions.ValidateData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminViewFeedbackPanel extends javax.swing.JPanel {

    private AdminViewFeedbackManager adminViewFeedbackManager;

    public void setAdminViewFeedbackManager(AdminViewFeedbackManager adminViewFeedbackManager) {
        this.adminViewFeedbackManager = adminViewFeedbackManager;
    }

    public AdminViewFeedbackPanel() {
        initComponents();
    }

    private void clear() {
        cbxLoad.setSelectedItem(null);
        txtDate.setText("");
        txtDate.setEditable(false);
        tblLoad.setModel(new DefaultTableModel());
        lblLoadSender.setText("");
        lblLoadSubject.setText("");
        lblLoadDate.setText("");
        txaContent.setText("");
    }

    private boolean checkField() {
        if (cbxLoad.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Un-select Load !");
            cbxLoad.requestFocus();
            return false;
        }
        if (txtDate.isEditable() && !(ValidateData.checkDate(txtDate.getText()))) {
            JOptionPane.showMessageDialog(null, "Invalid Date !");
            txtDate.requestFocus();
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoad = new javax.swing.JLabel();
        cbxLoad = new javax.swing.JComboBox();
        scpTableLoad = new javax.swing.JScrollPane();
        tblLoad = new javax.swing.JTable();
        lblSender = new javax.swing.JLabel();
        lblLoadSender = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblLoadDate = new javax.swing.JLabel();
        scpContent = new javax.swing.JScrollPane();
        txaContent = new javax.swing.JTextArea();
        lblSubject = new javax.swing.JLabel();
        lblLoadSubject = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnLoad = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUnRead = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        lblLoad.setText("Load");

        cbxLoad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "New", "Date" }));
        cbxLoad.setSelectedItem(null);
        cbxLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLoadActionPerformed(evt);
            }
        });

        tblLoad.setAutoCreateRowSorter(true);
        tblLoad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Subject", "Alias", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoadMouseClicked(evt);
            }
        });
        scpTableLoad.setViewportView(tblLoad);

        lblSender.setText("Sender:");

        lblDate.setText("Date:");

        lblLoadDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        txaContent.setEditable(false);
        txaContent.setBackground(new java.awt.Color(204, 204, 255));
        txaContent.setColumns(20);
        txaContent.setLineWrap(true);
        txaContent.setRows(5);
        txaContent.setWrapStyleWord(true);
        scpContent.setViewportView(txaContent);

        lblSubject.setText("Subject:");

        txtDate.setEditable(false);

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUnRead.setText("Un-Read");
        btnUnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnReadActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpContent)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLoad)
                        .addGap(26, 26, 26)
                        .addComponent(cbxLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLoad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scpTableLoad, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSender)
                            .addComponent(lblSubject))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLoadSender, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblLoadDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLoadSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUnRead)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblLoad)
                    .addComponent(cbxLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoad)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpTableLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSender)
                    .addComponent(lblDate)
                    .addComponent(lblLoadDate, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoadSender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSubject)
                    .addComponent(btnUnRead)
                    .addComponent(lblLoadSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(scpContent, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLoadActionPerformed
        if (cbxLoad.getSelectedItem() != null) {
            if (cbxLoad.getSelectedItem().toString().equals("All")) {
                txtDate.setEditable(false);
            }
            if (cbxLoad.getSelectedItem().toString().equals("New")) {
                txtDate.setEditable(false);
            }
            if (cbxLoad.getSelectedItem().toString().equals("Date")) {
                txtDate.setEditable(true);
            }
        }
    }//GEN-LAST:event_cbxLoadActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        if (checkField()) {
            if (txtDate.isEditable()) {
                tblLoad.setModel(this.adminViewFeedbackManager.loadTableFeedback(txtDate.getText()));
                tblLoad.getColumn("ID").setPreferredWidth(10);
                tblLoad.getColumn("Subject").setPreferredWidth(195);
            } else {
                tblLoad.setModel(this.adminViewFeedbackManager.loadTableFeedback(cbxLoad.getSelectedItem().toString()));
                tblLoad.getColumn("ID").setPreferredWidth(15);
                tblLoad.getColumn("Subject").setPreferredWidth(195);
            }
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoadMouseClicked
        if (evt.getClickCount() == 2) {
            loadFeedback();
        }
    }//GEN-LAST:event_tblLoadMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tblLoad.getSelectedRow() != -1) {
            int[] selectedRow = tblLoad.getSelectedRows();
            int noDelete = 0, noError = 0;
            for (int i = selectedRow.length - 1; i >= 0; i--) {
                if (this.adminViewFeedbackManager.deleteFeedback(tblLoad.getValueAt(selectedRow[i], 0).toString())) {
                    ((DefaultTableModel) (tblLoad.getModel())).removeRow(selectedRow[i]);
                    noDelete++;
                } else {
                    noError++;
                }
            }
            JOptionPane.showMessageDialog(null, "Deleted " + noDelete + " Feedback. " + noError + " Fail.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnReadActionPerformed
        if (tblLoad.getSelectedRow() != -1) {
            int[] selectedRow = tblLoad.getSelectedRows();
            int unRead = 0;
            for (int i = selectedRow.length - 1; i >= 0; i--) {
                if (this.adminViewFeedbackManager.unReadFeedback(tblLoad.getValueAt(selectedRow[i], 0).toString())) {
                    lblLoadSender.setText("");
                    lblLoadSubject.setText("");
                    lblLoadDate.setText("");
                    txaContent.setText("");
                    unRead++;
                }
            }
            JOptionPane.showMessageDialog(null, "Un-read " + unRead + " Feedback.");
        }
    }//GEN-LAST:event_btnUnReadActionPerformed
    public void loadFeedback() {
        String valueID = tblLoad.getValueAt(tblLoad.getSelectedRow(), 0).toString();
        String[] arr = this.adminViewFeedbackManager.loadFeedback(valueID);
        lblLoadSender.setText(arr[0]);
        lblLoadDate.setText(arr[1]);
        lblLoadSubject.setText(arr[2]);
        txaContent.setText(arr[3]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnUnRead;
    private javax.swing.JComboBox cbxLoad;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLoad;
    private javax.swing.JLabel lblLoadDate;
    private javax.swing.JLabel lblLoadSender;
    private javax.swing.JLabel lblLoadSubject;
    private javax.swing.JLabel lblSender;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JScrollPane scpContent;
    private javax.swing.JScrollPane scpTableLoad;
    private javax.swing.JTable tblLoad;
    private javax.swing.JTextArea txaContent;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
