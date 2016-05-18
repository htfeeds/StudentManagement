package gui;

import functions.StudentSearchManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentSearchPanel extends javax.swing.JPanel {

    private StudentSearchManager studentSearchManager;

    public void setStudentSearchManager(StudentSearchManager studentSearchManager) {
        this.studentSearchManager = studentSearchManager;
    }

    public StudentSearchPanel() {
        initComponents();
    }

    private void clear() {
        cbxFind.setSelectedItem(null);
        txtSearch.setText("");
        tblSearch.setModel(new DefaultTableModel());
    }

    private boolean checkField() {
        if (cbxFind.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Un-select Find!");
            return false;
        }
        if (txtSearch.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Un-enter search!");
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpSearchTable = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        pnlSearch = new javax.swing.JPanel();
        lblFind = new javax.swing.JLabel();
        cbxFind = new javax.swing.JComboBox();
        txtSearch = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(666, 444));

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
        tblSearch.setEnabled(false);
        tblSearch.setShowHorizontalLines(false);
        tblSearch.setShowVerticalLines(false);
        scpSearchTable.setViewportView(tblSearch);

        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 204))); // NOI18N

        lblFind.setText("Find");

        cbxFind.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Faculty", "Program", "Score" }));
        cbxFind.setSelectedItem(null);
        cbxFind.setRequestFocusEnabled(false);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxFind, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnOk)
                .addGap(25, 25, 25)
                .addComponent(btnReset)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnReset)
                    .addComponent(btnOk)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFind)
                    .addComponent(cbxFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scpSearchTable))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(pnlSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpSearchTable, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clear();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (checkField()) {
            DefaultTableModel model = this.studentSearchManager.search(cbxFind.getSelectedItem().toString(), txtSearch.getText());
            tblSearch.setModel(model);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        if (checkField()) {
            DefaultTableModel model = this.studentSearchManager.search(cbxFind.getSelectedItem().toString(), txtSearch.getText());
            tblSearch.setModel(model);
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox cbxFind;
    private javax.swing.JLabel lblFind;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JScrollPane scpSearchTable;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
