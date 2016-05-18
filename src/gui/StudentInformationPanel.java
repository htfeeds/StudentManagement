package gui;

import functions.ImageHandle;
import functions.StudentInformationManager;
import functions.ValidateData;
import java.awt.Color;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentInformationPanel extends javax.swing.JPanel {

    private StudentInformationManager studentInformationManager;

    public void setStudentInformationManager(StudentInformationManager studentInformationManager) {
        this.studentInformationManager = studentInformationManager;
        loadInformation();
    }

    public StudentInformationPanel() {
        initComponents();
    }

    private void loadInformation() {
        Object[] arr = studentInformationManager.loadInformationStudent();
        txtStudentID.setText(arr[10].toString());
        txtStudentName.setText(arr[1] + " " + arr[0]);
        txtDoB.setText(arr[2].toString());
        txtGender.setText(arr[3].toString());
        txtPhoneNumber.setText(arr[4].toString());
        txtAddress.setText(arr[5].toString());
        txtEmail.setText(arr[6].toString());
        if (arr[7] != null) {
            txtBatch.setText(arr[7].toString());
        }
        if (arr[9] != null) {
            try {
                ImageHandle.setPicture(lblFramneImage, (((Blob) arr[9]).getBinaryStream()));
            } catch (SQLException ex) {
                Logger.getLogger(EnrollmentStudentPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lblFramneImage.setText("No Image !");
            lblFramneImage.setForeground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImage = new javax.swing.JLabel();
        lblSeparator = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        lblDoB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPhoneNUmber = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblBatch = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        txtStudentName = new javax.swing.JTextField();
        txtDoB = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtBatch = new javax.swing.JTextField();
        pnlChangAccount = new javax.swing.JPanel();
        lblOldPassword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblRebewPassword = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pwdOld = new javax.swing.JPasswordField();
        pwdNew = new javax.swing.JPasswordField();
        pwdRenew = new javax.swing.JPasswordField();
        lblFramneImage = new javax.swing.JLabel();
        lblInform = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(666, 444));

        lblImage.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblImage.setForeground(new java.awt.Color(0, 204, 204));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("Information Student");

        lblSeparator.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSeparator.setText("----------------------------------------------------------------------------------------------------------------------------");

        lblStudentID.setText("Student ID");

        lblStudentName.setText("Student Name");

        lblDoB.setText("DoB");

        lblGender.setText("Gender");

        lblPhoneNUmber.setText("Phone Number");

        lblAddress.setText("Address");

        lblEmail.setText("Email");

        lblBatch.setText("Batch");

        txtStudentID.setEditable(false);

        txtStudentName.setEditable(false);

        txtDoB.setEditable(false);

        txtGender.setEditable(false);

        txtPhoneNumber.setEditable(false);

        txtAddress.setEditable(false);

        txtEmail.setEditable(false);

        txtBatch.setEditable(false);

        pnlChangAccount.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Change Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 204))); // NOI18N

        lblOldPassword.setText("Old Password");

        jLabel4.setText("---------------------------------------------------");

        lblNewPassword.setText("New Password");

        lblRebewPassword.setText("ReNew Password");

        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlChangAccountLayout = new javax.swing.GroupLayout(pnlChangAccount);
        pnlChangAccount.setLayout(pnlChangAccountLayout);
        pnlChangAccountLayout.setHorizontalGroup(
            pnlChangAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChangAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlChangAccountLayout.createSequentialGroup()
                        .addComponent(lblNewPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pwdNew, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlChangAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlChangAccountLayout.createSequentialGroup()
                            .addComponent(lblOldPassword)
                            .addGap(28, 28, 28)
                            .addComponent(pwdOld, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChangAccountLayout.createSequentialGroup()
                            .addComponent(lblRebewPassword)
                            .addGap(10, 10, 10)
                            .addComponent(pwdRenew, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );

        pnlChangAccountLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pwdNew, pwdOld, pwdRenew});

        pnlChangAccountLayout.setVerticalGroup(
            pnlChangAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangAccountLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlChangAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblOldPassword)
                    .addComponent(pwdOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(pnlChangAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNewPassword)
                    .addComponent(pwdNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlChangAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pwdRenew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRebewPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        lblFramneImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFramneImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblInform.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStudentID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStudentName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDoB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPhoneNUmber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBatch, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(lblFramneImage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlChangAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtBatch, txtDoB, txtEmail, txtGender, txtPhoneNumber, txtStudentID, txtStudentName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSeparator)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudentID))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudentName))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDoB))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGender))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhoneNUmber))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddress))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBatch)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pnlChangAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblInform, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(lblFramneImage, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAddress, txtBatch, txtDoB, txtEmail, txtGender, txtPhoneNumber, txtStudentID, txtStudentName});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.checkPassword()) {
            if (studentInformationManager.changePassword(String.valueOf(pwdNew.getPassword()))) {
                lblInform.setForeground(Color.green);
                lblInform.setText("Change Password Success !");
                pwdOld.setText(null);
                pwdNew.setText(null);
                pwdRenew.setText(null);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean checkPassword() {
        lblInform.setForeground(Color.red);
        if (String.valueOf(pwdOld.getPassword()).equals("")) {
            lblInform.setText("Un-enter OldPassword !");
            pwdOld.requestFocus();
            return false;
        }
        if (!(String.valueOf(pwdOld.getPassword()).equals(this.studentInformationManager.getDbConnection().getAccount().getPassword()))) {
            lblInform.setText("OldPassword failed !");
            pwdOld.requestFocus();
            return false;
        }
        if (!(ValidateData.checkPassword(String.valueOf(pwdNew.getPassword())))) {
            lblInform.setText("In-validate NewPassword !");
            pwdNew.requestFocus();
            return false;
        }
        if (String.valueOf(pwdRenew.getPassword()).equals("")) {
            lblInform.setText("Un-enter RenewPassword !");
            pwdRenew.requestFocus();
            return false;
        }
        if (!(String.valueOf(pwdRenew.getPassword()).equals(String.valueOf(pwdNew.getPassword())))) {
            lblInform.setText("RenewPassword unlike NewPassword !");
            pwdRenew.requestFocus();
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBatch;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFramneImage;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblInform;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblPhoneNUmber;
    private javax.swing.JLabel lblRebewPassword;
    private javax.swing.JLabel lblSeparator;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JPanel pnlChangAccount;
    private javax.swing.JPasswordField pwdNew;
    private javax.swing.JPasswordField pwdOld;
    private javax.swing.JPasswordField pwdRenew;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtDoB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}
