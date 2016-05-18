package gui;

import functions.EnrollmentBatchManager;
import functions.ValidateData;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EnrollmentBatchPanel extends javax.swing.JPanel {

    private EnrollmentBatchManager eBatchManager;
    private DefaultTableModel tableModel;

    public void seteBatchManager(EnrollmentBatchManager eBatchManager) {
        this.eBatchManager = eBatchManager;
    }

    public EnrollmentBatchPanel() {
        initComponents();
        myInitialize();
    }

    private boolean checkPermission() {
        if (!eBatchManager.getDbConnection().getAccount().getPermission().equals("enrollment")
                && !eBatchManager.getDbConnection().getAccount().getPermission().equals("admin")) {
            return false;
        }
        return true;
    }

    public void myInitialize() {
        String[] columnName = new String[]{"Batch ID", "Batch Name", "Faculty ID", "Start Date", "End Date", "Program ID", "Action"};
        tableModel = new DefaultTableModel(null, columnName);
        tblBatchRecent.setModel(tableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpBatchRecent = new javax.swing.JScrollPane();
        tblBatchRecent = new javax.swing.JTable();
        pnlBatchInformation = new javax.swing.JPanel();
        lblBatchID = new javax.swing.JLabel();
        lblBatchName = new javax.swing.JLabel();
        lblFacultyID = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        lblProgramID = new javax.swing.JLabel();
        txtBatchID = new javax.swing.JTextField();
        txtBatchName = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        cbxFacultyID = new javax.swing.JComboBox();
        cbxProgramID = new javax.swing.JComboBox();
        btnBatchAdd = new javax.swing.JButton();
        btnBatchUpdate = new javax.swing.JButton();
        btnBatchDelete = new javax.swing.JButton();
        btnBatchReset = new javax.swing.JButton();

        scpBatchRecent.setBorder(javax.swing.BorderFactory.createTitledBorder("Recent Action"));

        tblBatchRecent.setAutoCreateRowSorter(true);
        tblBatchRecent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblBatchRecent.setShowHorizontalLines(false);
        tblBatchRecent.setShowVerticalLines(false);
        scpBatchRecent.setViewportView(tblBatchRecent);

        pnlBatchInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Batch Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 204))); // NOI18N

        lblBatchID.setText("Batch ID");

        lblBatchName.setText("Batch Name");

        lblFacultyID.setText("Faculty ID");

        lblStartDate.setText("Start Date");

        lblEndDate.setText("End Date");

        lblProgramID.setText("Program ID");

        txtBatchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchIDActionPerformed(evt);
            }
        });
        txtBatchID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBatchIDKeyReleased(evt);
            }
        });

        cbxFacultyID.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxFacultyIDPopupMenuWillBecomeVisible(evt);
            }
        });

        cbxProgramID.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxProgramIDPopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout pnlBatchInformationLayout = new javax.swing.GroupLayout(pnlBatchInformation);
        pnlBatchInformation.setLayout(pnlBatchInformationLayout);
        pnlBatchInformationLayout.setHorizontalGroup(
            pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBatchInformationLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBatchID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBatchName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFacultyID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40)
                .addGroup(pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBatchID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBatchName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxFacultyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEndDate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProgramID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40)
                .addGroup(pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxProgramID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168))
        );

        pnlBatchInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxFacultyID, cbxProgramID, txtBatchID, txtBatchName, txtEndDate, txtStartDate});

        pnlBatchInformationLayout.setVerticalGroup(
            pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBatchInformationLayout.createSequentialGroup()
                .addGroup(pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBatchInformationLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndDate)
                            .addComponent(txtBatchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBatchName)))
                    .addGroup(pnlBatchInformationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtBatchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBatchID)
                            .addComponent(lblStartDate)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBatchInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFacultyID)
                        .addComponent(lblProgramID)
                        .addComponent(cbxFacultyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxProgramID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlBatchInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxFacultyID, cbxProgramID, txtBatchID, txtBatchName, txtEndDate, txtStartDate});

        btnBatchAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBatchAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnBatchAdd.setText("Add");
        btnBatchAdd.setBorderPainted(false);
        btnBatchAdd.setFocusPainted(false);
        btnBatchAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBatchAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatchAddActionPerformed(evt);
            }
        });

        btnBatchUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBatchUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnBatchUpdate.setText("Update");
        btnBatchUpdate.setBorderPainted(false);
        btnBatchUpdate.setEnabled(false);
        btnBatchUpdate.setFocusPainted(false);
        btnBatchUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBatchUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatchUpdateActionPerformed(evt);
            }
        });

        btnBatchDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBatchDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnBatchDelete.setText("Delete");
        btnBatchDelete.setBorderPainted(false);
        btnBatchDelete.setEnabled(false);
        btnBatchDelete.setFocusPainted(false);
        btnBatchDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBatchDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatchDeleteActionPerformed(evt);
            }
        });

        btnBatchReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBatchReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnBatchReset.setText("Reset");
        btnBatchReset.setBorderPainted(false);
        btnBatchReset.setFocusPainted(false);
        btnBatchReset.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBatchReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatchResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnBatchAdd)
                .addGap(40, 40, 40)
                .addComponent(btnBatchUpdate)
                .addGap(40, 40, 40)
                .addComponent(btnBatchDelete)
                .addGap(40, 40, 40)
                .addComponent(btnBatchReset))
            .addComponent(scpBatchRecent)
            .addComponent(pnlBatchInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBatchAdd, btnBatchDelete, btnBatchReset, btnBatchUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(scpBatchRecent, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBatchInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnBatchAdd)
                    .addComponent(btnBatchUpdate)
                    .addComponent(btnBatchDelete)
                    .addComponent(btnBatchReset))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBatchAdd, btnBatchDelete, btnBatchReset, btnBatchUpdate});

    }// </editor-fold>//GEN-END:initComponents

    public void loadRecord(String valueID) {
        Object[] objArray = eBatchManager.loadBatch(valueID);
        if (objArray != null) {
            resetAll();
            txtBatchID.setText(valueID);
            txtBatchName.setText(objArray[0].toString());
            if (objArray[1] != null) {
                DefaultComboBoxModel faculty = eBatchManager.loadFacultyID();
                cbxFacultyID.setModel(faculty);
                cbxFacultyID.setSelectedItem(objArray[1]);
            }
            if (objArray[2] == null) {
                txtStartDate.setText(null);
            } else {
                txtStartDate.setText(objArray[2].toString());
            }
            if (objArray[3] == null) {
                txtEndDate.setText(null);
            } else {
                txtEndDate.setText(objArray[3].toString());
            }

            if (objArray[4] != null) {
                DefaultComboBoxModel model = eBatchManager.loadProgramID();
                cbxProgramID.setModel(model);
                cbxProgramID.setSelectedItem(objArray[4]);
            }

            btnBatchAdd.setEnabled(false);
            btnBatchUpdate.setEnabled(true);
            btnBatchDelete.setEnabled(true);
        }
    }

    public boolean checkField() {
        if ((txtBatchID.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Batch ID !");
            txtBatchID.requestFocus();
            return false;
        } else if ((txtBatchName.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter BatchName !");
            txtBatchName.requestFocus();
            return false;
        } else if (!(txtStartDate.getText().equals(""))) {
            if (!(ValidateData.checkDate(txtStartDate.getText()))) {
                JOptionPane.showMessageDialog(null, "Invalid Start Date ! !");
                txtStartDate.requestFocus();
                return false;
            } else if (!(txtEndDate.getText().equals(""))) {
                if (!(ValidateData.checkDate(txtEndDate.getText()))) {
                    JOptionPane.showMessageDialog(null, "Invalid End Date ! !");
                    txtEndDate.requestFocus();
                    return false;
                }
            }
        }
        else if (!(txtEndDate.getText().equals(""))) {
            if (!(ValidateData.checkDate(txtEndDate.getText()))) {
                JOptionPane.showMessageDialog(null, "Invalid End Date ! !");
                txtEndDate.requestFocus();
                return false;
            } else if (!(txtStartDate.getText().equals(""))) {
                if (!(ValidateData.checkDate(txtStartDate.getText()))) {
                    JOptionPane.showMessageDialog(null, "Invalid Start Date ! !");
                    txtStartDate.requestFocus();
                    return false;
                }
            }
        }

        return true;
    }

    public void resetAll() {
        txtBatchID.setText(null);
        txtBatchName.setText(null);
        cbxFacultyID.setSelectedItem(null);
        txtStartDate.setText(null);
        txtEndDate.setText(null);
        cbxProgramID.setSelectedItem(null);
    }
    private void txtBatchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchIDActionPerformed
        loadRecord(txtBatchID.getText());
    }//GEN-LAST:event_txtBatchIDActionPerformed

    private void btnBatchAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatchAddActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkField()) {
            String batchID = txtBatchID.getText().trim();
            String batchName = txtBatchName.getText().trim();
            Object facultyID = cbxFacultyID.getSelectedItem();
            String startdate = txtStartDate.getText().trim();
            String endDate = txtEndDate.getText().trim();
            Object programID = cbxProgramID.getSelectedItem();
            Object[] objRow = eBatchManager.addBatch(batchID, batchName, facultyID, startdate, endDate, programID);
            if (objRow != null) {
                tableModel.addRow(objRow);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnBatchAddActionPerformed

    private void btnBatchResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatchResetActionPerformed
        this.resetAll();
    }//GEN-LAST:event_btnBatchResetActionPerformed

    private void cbxProgramIDPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxProgramIDPopupMenuWillBecomeVisible
        DefaultComboBoxModel program = eBatchManager.loadProgramID();
        cbxProgramID.setModel(program);
        cbxProgramID.setSelectedItem(null);
    }//GEN-LAST:event_cbxProgramIDPopupMenuWillBecomeVisible

    private void txtBatchIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBatchIDKeyReleased
        String batchID = txtBatchID.getText();
        if (eBatchManager.checkExistRecord(batchID)) {
            btnBatchAdd.setEnabled(false);
            btnBatchUpdate.setEnabled(true);
            btnBatchDelete.setEnabled(true);
        } else {
            btnBatchUpdate.setEnabled(false);
            btnBatchDelete.setEnabled(false);
            btnBatchAdd.setEnabled(true);
        }
    }//GEN-LAST:event_txtBatchIDKeyReleased

    private void cbxFacultyIDPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxFacultyIDPopupMenuWillBecomeVisible
        DefaultComboBoxModel faculty = eBatchManager.loadFacultyID();
        cbxFacultyID.setModel(faculty);
        cbxFacultyID.setSelectedItem(null);
    }//GEN-LAST:event_cbxFacultyIDPopupMenuWillBecomeVisible

    private void btnBatchUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatchUpdateActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkField()) {
            String batchID = txtBatchID.getText().trim();
            String batchName = txtBatchName.getText().trim();
            Object facultyID = cbxFacultyID.getSelectedItem();
            String startdate = txtStartDate.getText().trim();
            String endDate = txtEndDate.getText().trim();
            Object programID = cbxProgramID.getSelectedItem();
            Object[] objRow = eBatchManager.updateBatch(batchID, batchName, facultyID, startdate, endDate, programID);
            if (objRow != null) {
                tableModel.addRow(objRow);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnBatchUpdateActionPerformed

    private void btnBatchDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatchDeleteActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        String batchID = txtBatchID.getText().trim();
        String batchName = txtBatchName.getText().trim();
        Object facultyID = cbxFacultyID.getSelectedItem();
        String startdate = txtStartDate.getText().trim();
        String endDate = txtEndDate.getText().trim();
        Object programID = cbxProgramID.getSelectedItem();
        Object[] objRow = eBatchManager.deleteBatch(batchID, batchName, facultyID, startdate, endDate, programID);
        if (objRow != null) {
            tableModel.addRow(objRow);
            resetAll();
        }
    }//GEN-LAST:event_btnBatchDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatchAdd;
    private javax.swing.JButton btnBatchDelete;
    private javax.swing.JButton btnBatchReset;
    private javax.swing.JButton btnBatchUpdate;
    private javax.swing.JComboBox cbxFacultyID;
    private javax.swing.JComboBox cbxProgramID;
    private javax.swing.JLabel lblBatchID;
    private javax.swing.JLabel lblBatchName;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblFacultyID;
    private javax.swing.JLabel lblProgramID;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JPanel pnlBatchInformation;
    private javax.swing.JScrollPane scpBatchRecent;
    private javax.swing.JTable tblBatchRecent;
    private javax.swing.JTextField txtBatchID;
    private javax.swing.JTextField txtBatchName;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
