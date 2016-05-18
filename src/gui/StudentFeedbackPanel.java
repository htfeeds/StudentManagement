package gui;

import functions.StudentFeedbackManager;
import javax.swing.JOptionPane;

public class StudentFeedbackPanel extends javax.swing.JPanel {

    private StudentFeedbackManager sFeedback;

    public void setStudentFeedback(StudentFeedbackManager sFeedback) {
        this.sFeedback = sFeedback;

    }

    public StudentFeedbackPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFormal = new javax.swing.JLabel();
        cbxFormal = new javax.swing.JComboBox();
        lblSubject = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        scpContent = new javax.swing.JScrollPane();
        txaBody = new javax.swing.JTextArea();
        btnCancel = new javax.swing.JButton();
        ctnSend = new javax.swing.JButton();
        lblAlias = new javax.swing.JLabel();
        txtAlias = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(666, 444));

        lblFormal.setText("Formal");

        cbxFormal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Private", "Public", "Anonymous" }));
        cbxFormal.setSelectedItem(null);
        cbxFormal.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxFormalPopupMenuWillBecomeVisible(evt);
            }
        });
        cbxFormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFormalActionPerformed(evt);
            }
        });

        lblSubject.setText("Subject");

        txaBody.setColumns(20);
        txaBody.setRows(5);
        scpContent.setViewportView(txaBody);

        btnCancel.setText("Clear");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        ctnSend.setText("Send");
        ctnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctnSendActionPerformed(evt);
            }
        });

        lblAlias.setText("Alias");

        txtAlias.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctnSend)
                        .addGap(20, 20, 20)
                        .addComponent(btnCancel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSubject)
                                .addComponent(lblAlias)
                                .addComponent(lblFormal))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbxFormal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSubject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAlias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(scpContent, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormal)
                    .addComponent(cbxFormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlias))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubject))
                .addGap(15, 15, 15)
                .addComponent(scpContent, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(ctnSend))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void clear() {
        cbxFormal.setSelectedItem(null);
        txtAlias.setText(null);
        txtSubject.setText(null);
        txaBody.setText(null);
    }

    private void cbxFormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFormalActionPerformed
        if (cbxFormal.getSelectedItem() != null) {
            if (cbxFormal.getSelectedItem().toString().equals("Anonymous")) {
                txtAlias.setText(null);
                txtAlias.setEditable(true);
            }
            if (cbxFormal.getSelectedItem().toString().equals("Private")) {
                txtAlias.setText(null);
                txtAlias.setEditable(false);
            }
            if (cbxFormal.getSelectedItem().toString().equals("Public")) {
                txtAlias.setText(sFeedback.getDbConnection().getAccount().getUserName());
                txtAlias.setEditable(false);
            }
        }
    }//GEN-LAST:event_cbxFormalActionPerformed

    private void cbxFormalPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxFormalPopupMenuWillBecomeVisible

    }//GEN-LAST:event_cbxFormalPopupMenuWillBecomeVisible

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clear();
    }//GEN-LAST:event_btnCancelActionPerformed

    public boolean checkFieldFeedback() {
        if ((txtSubject.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Subject !");
            txtSubject.requestFocus();
            return false;
        } else if ((txaBody.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Body !");
            txaBody.requestFocus();
            return false;
        }
        if (cbxFormal.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Un-enter Formals !");
            cbxFormal.requestFocus();
            return false;
        }
        return true;
    }
    private void ctnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctnSendActionPerformed
        if (checkFieldFeedback()) {
            String fomal = cbxFormal.getSelectedItem().toString();
            String subject = txtSubject.getText().trim();
            String body = txaBody.getText().trim();
            String student = txtAlias.getText();
            if (sFeedback.InsertFeedback(student, fomal, subject, body)) {
                clear();
                JOptionPane.showMessageDialog(null, "Thank you for your feedback!", "Complete", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sending failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_ctnSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox cbxFormal;
    private javax.swing.JButton ctnSend;
    private javax.swing.JLabel lblAlias;
    private javax.swing.JLabel lblFormal;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JScrollPane scpContent;
    private javax.swing.JTextArea txaBody;
    private javax.swing.JTextField txtAlias;
    private javax.swing.JTextField txtSubject;
    // End of variables declaration//GEN-END:variables
}
