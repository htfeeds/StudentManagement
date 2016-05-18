package gui;

import functions.EnrollmentSearchManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EnrollmentSearchPanel extends javax.swing.JPanel {

    private EnrollmentSearchManager eSearchManager;
    private String tableName;
    private DefaultTableModel model = null;
    private EnrollmentForm allParent;

    public void seteSearchManager(EnrollmentSearchManager eSearchManager) {
        this.eSearchManager = eSearchManager;
    }

    public EnrollmentSearchPanel() {
        initComponents();
        myInitialize();
    }

    private boolean checkPermission() {
        boolean permission = true;
        switch (tableName) {
            case "Student":
                if (!eSearchManager.getDbConnection().getAccount().getPermission().equals("enrollment")
                        && !eSearchManager.getDbConnection().getAccount().getPermission().equals("admin")) {
                    return false;
                }
                break;
            case "Batch":
                if (!eSearchManager.getDbConnection().getAccount().getPermission().equals("enrollment")
                        && !eSearchManager.getDbConnection().getAccount().getPermission().equals("admin")) {
                    return false;
                }
                break;
            case "Faculty":
                if (!eSearchManager.getDbConnection().getAccount().getPermission().equals("enrollment")
                        && !eSearchManager.getDbConnection().getAccount().getPermission().equals("admin")) {
                    return false;
                }
                break;
            case "Program":
                if (!eSearchManager.getDbConnection().getAccount().getPermission().equals("bursary")
                        && !eSearchManager.getDbConnection().getAccount().getPermission().equals("admin")) {
                    return false;
                }
                break;
            case "Schedule":
                if (!eSearchManager.getDbConnection().getAccount().getPermission().equals("bursary")
                        && !eSearchManager.getDbConnection().getAccount().getPermission().equals("admin")) {
                    return false;
                }
                break;
            case "Score":
                if (!eSearchManager.getDbConnection().getAccount().getPermission().equals("bursary")
                        && !eSearchManager.getDbConnection().getAccount().getPermission().equals("admin")) {
                    return false;
                }
                break;
            case "Account":
                if (!eSearchManager.getDbConnection().getAccount().getPermission().equals("enrollment")
                        && !eSearchManager.getDbConnection().getAccount().getPermission().equals("admin")) {
                    return false;
                }
                break;
        }
        return permission;
    }

    public void myInitialize() {
        DefaultComboBoxModel modelFind = new DefaultComboBoxModel(new String[]{"Student", "Batch", "Faculty", "Program", "Schedule", "Score", "Account"});
        cbxFind.setModel(modelFind);
        cbxFind.setSelectedItem(null);
        cbxBy.setEnabled(false);
    }

    public JFrame getAllParent() {
        return allParent;
    }

    public void setAllParent(EnrollmentForm allParent) {
        this.allParent = allParent;
    }

    private void load() {
        model = eSearchManager.search(cbxFind.getSelectedItem().toString(), cbxBy.getSelectedItem().toString(), txtSearch.getText());
        if (model != null) {
            tableName = cbxFind.getSelectedItem().toString();
            tblSearch.setModel(model);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpSearchTable = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        pnlSearch = new javax.swing.JPanel();
        lblFind = new javax.swing.JLabel();
        lblBy = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cbxFind = new javax.swing.JComboBox();
        cbxBy = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        scpSearchTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblSearch.setAutoCreateRowSorter(true);
        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblSearch.setShowHorizontalLines(false);
        tblSearch.setShowVerticalLines(false);
        scpSearchTable.setViewportView(tblSearch);

        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 204))); // NOI18N

        lblFind.setText("Find");

        lblBy.setText("by");

        txtSearch.setEnabled(false);
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cbxFind.setRequestFocusEnabled(false);
        cbxFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFindActionPerformed(evt);
            }
        });

        cbxBy.setEnabled(false);
        cbxBy.setRequestFocusEnabled(false);
        cbxBy.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxByPopupMenuWillBecomeVisible(evt);
            }
        });
        cbxBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxByActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblFind)
                .addGap(18, 18, 18)
                .addComponent(cbxFind, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblBy)
                .addGap(18, 18, 18)
                .addComponent(cbxBy, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBy)
                    .addComponent(lblFind)
                    .addComponent(cbxFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete16.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusPainted(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setFocusPainted(false);
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset16.png"))); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(btnUpdate)
                .addGap(39, 39, 39)
                .addComponent(btnDelete)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scpSearchTable)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(scpSearchTable, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(jButton1))
                .addGap(11, 11, 11))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        if (cbxFind.getSelectedItem() != null & cbxBy.getSelectedItem() != null) {
            load();
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    private void cbxFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFindActionPerformed
        if (cbxFind.getSelectedItem() != null) {
            cbxBy.setSelectedItem(null);
            cbxBy.setEnabled(true);
        }
    }//GEN-LAST:event_cbxFindActionPerformed

    private void cbxByPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxByPopupMenuWillBecomeVisible
        if (cbxFind.getSelectedItem().toString().equals("Student")) {
            cbxBy.setModel(new DefaultComboBoxModel(new String[]{"All", "StudentID", "FullName", "PhoneNumber", "Email", "BatchID", "Status"}));
            cbxBy.setSelectedItem(null);
        }
        if (cbxFind.getSelectedItem().toString().equals("Batch")) {
            cbxBy.setModel(new DefaultComboBoxModel(new String[]{"All", "BatchID", "BatchName", "FacultyID", "ProgramID"}));
            cbxBy.setSelectedItem(null);
        }
        if (cbxFind.getSelectedItem().toString().equals("Faculty")) {
            cbxBy.setModel(new DefaultComboBoxModel(new String[]{"All", "FacultyID", "FacultyName", "PhoneNumber", "Email"}));
            cbxBy.setSelectedItem(null);
        }
        if (cbxFind.getSelectedItem().toString().equals("Account")) {
            cbxBy.setModel(new DefaultComboBoxModel(new String[]{"All", "UserName", "PhoneNumber", "Email"}));
            cbxBy.setSelectedItem(null);
        }
        if (cbxFind.getSelectedItem().toString().equals("Program")) {
            cbxBy.setModel(new DefaultComboBoxModel(new String[]{"All", "ProgramID", "ProgramName"}));
            cbxBy.setSelectedItem(null);
        }
        if (cbxFind.getSelectedItem().toString().equals("Schedule")) {
            cbxBy.setModel(new DefaultComboBoxModel(new String[]{"All", "Batch", "Lab", "Faculty"}));
            cbxBy.setSelectedItem(null);
        }
        if (cbxFind.getSelectedItem().toString().equals("Score")) {
            cbxBy.setModel(new DefaultComboBoxModel(new String[]{"All", "StudentID", "CourseID"}));
            cbxBy.setSelectedItem(null);
        }
    }//GEN-LAST:event_cbxByPopupMenuWillBecomeVisible

    private void cbxByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxByActionPerformed
        if (cbxBy.getSelectedItem() != null) {
            if (cbxBy.getSelectedItem().toString().equals("All")) {
                txtSearch.setText("");
                txtSearch.setEnabled(false);
                load();
            } else {
                txtSearch.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cbxByActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (tblSearch.getSelectedRow() != -1) {
            int[] selectedRow = tblSearch.getSelectedRows();
            for (int i = selectedRow.length - 1; i >= 0; i--) {
                if (eSearchManager.delete(tblSearch.getValueAt(selectedRow[i], 0).toString(), tableName)) {
                    model.removeRow(selectedRow[i]);
                    eSearchManager.getTxaReport().append("Deleted " + tableName + " successful...{" + tblSearch.getValueAt(selectedRow[i], 0).toString() + "}\n");
                } else {
                    eSearchManager.getTxaReport().append("Delete " + tableName + " failed!{" + tblSearch.getValueAt(selectedRow[i], 0).toString() + "}\n");
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (tblSearch.getSelectedRows().length == 1) {
            if (tableName.equals("Account") || tableName.equals("Schedule") || tableName.equals("Score") || tableName.equals("Program")) {
                JOptionPane.showMessageDialog(null, "Not enough time....");
                return;
            }
            String valueID = tblSearch.getValueAt(tblSearch.getSelectedRow(), 0).toString();
            allParent.loadFormUpdate(tableName, valueID);
        } else if (tblSearch.getSelectedRows().length > 1) {
            JOptionPane.showMessageDialog(null, "Select one record !");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (cbxFind.getSelectedItem() != null & cbxBy.getSelectedItem() != null) {
            load();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cbxFind.setSelectedItem(null);
        cbxBy.setSelectedItem(null);
        txtSearch.setText("");
        tblSearch.setModel(new DefaultTableModel());
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbxBy;
    private javax.swing.JComboBox cbxFind;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblBy;
    private javax.swing.JLabel lblFind;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JScrollPane scpSearchTable;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
