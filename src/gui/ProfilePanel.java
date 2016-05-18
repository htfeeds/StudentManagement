package gui;

import functions.ProfileManager;
import functions.ValidateData;
import java.awt.Color;

public class ProfilePanel extends javax.swing.JPanel {

    private ProfileManager profileManager;

    public void setProfileManager(ProfileManager profileManager) {
        this.profileManager = profileManager;
        loadProfile();
    }

    public ProfilePanel() {
        initComponents();
    }

    private void loadProfile() {
        txtAccountID.setText(profileManager.getDbConnection().getAccount().getAccountID() + "");
        txtUserName.setText(profileManager.getDbConnection().getAccount().getUserName());
        txtFullName.setText(profileManager.getDbConnection().getAccount().getFullName());
        txtPhoneNumber.setText(profileManager.getDbConnection().getAccount().getPhoneNumber());
        txtEmail.setText(profileManager.getDbConnection().getAccount().getEmail());
        txtDoB.setText(profileManager.getDbConnection().getAccount().getDoB());
        txtPermission.setText(profileManager.getDbConnection().getAccount().getPermission());
    }

    private boolean checkPermission() {
        if (!profileManager.getDbConnection().getAccount().getPermission().equals("admin")) {
            return false;
        }
        return true;
    }
    public boolean checkPassword() {
        lblInform.setForeground(Color.red);
        if (String.valueOf(pwdOld.getPassword()).equals("")) {
            lblInform.setText("Un-enter OldPassword !");
            pwdOld.requestFocus();
            return false;
        }
        if (!(String.valueOf(pwdOld.getPassword()).equals(this.profileManager.getDbConnection().getAccount().getPassword()))) {
            lblInform.setText("OldPassword failed !");
            pwdOld.requestFocus();
            return false;
        }
         if (String.valueOf(pwdNew.getPassword()).equals("")) {
            lblInform.setText("Un-enter NewPassword !");
            pwdNew.requestFocus();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblAccountID = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblPermission = new javax.swing.JLabel();
        txtAccountID = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDoB = new javax.swing.JTextField();
        txtPermission = new javax.swing.JTextField();
        pnlChangePassword = new javax.swing.JPanel();
        lblOldPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblRenewPassword = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        pwdOld = new javax.swing.JPasswordField();
        pwdNew = new javax.swing.JPasswordField();
        pwdRenew = new javax.swing.JPasswordField();
        lblInform = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile1.png"))); // NOI18N

        lblAccountID.setText("AccountID");

        lblUsername.setText("UserName");
        lblUsername.setPreferredSize(new java.awt.Dimension(52, 14));

        lblFullName.setText("Full Name");
        lblFullName.setPreferredSize(new java.awt.Dimension(52, 14));

        lblPhoneNumber.setText("Phone Number");
        lblPhoneNumber.setPreferredSize(new java.awt.Dimension(52, 14));

        lblEmail.setText("Email");
        lblEmail.setPreferredSize(new java.awt.Dimension(52, 14));

        lblDOB.setText("DoB");
        lblDOB.setPreferredSize(new java.awt.Dimension(52, 14));

        lblPermission.setText("Permission");
        lblPermission.setPreferredSize(new java.awt.Dimension(52, 14));

        txtAccountID.setEditable(false);

        txtUserName.setEditable(false);

        txtFullName.setEditable(false);

        txtPhoneNumber.setEditable(false);

        txtEmail.setEditable(false);

        txtDoB.setEditable(false);

        txtPermission.setEditable(false);

        pnlChangePassword.setBackground(new java.awt.Color(255, 255, 255));
        pnlChangePassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Change Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 204))); // NOI18N

        lblOldPassword.setText("Old Password");

        lblNewPassword.setText("New Password");

        lblRenewPassword.setText(" Renew Password");

        jLabel12.setText("----------------------------------------------------------------");

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlChangePasswordLayout = new javax.swing.GroupLayout(pnlChangePassword);
        pnlChangePassword.setLayout(pnlChangePasswordLayout);
        pnlChangePasswordLayout.setHorizontalGroup(
            pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangePasswordLayout.createSequentialGroup()
                .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChangePasswordLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlChangePasswordLayout.createSequentialGroup()
                                .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOldPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNewPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblRenewPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlChangePasswordLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pwdRenew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pwdNew, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlChangePasswordLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(pwdOld, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChangePasswordLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChange)))
                .addContainerGap())
        );

        pnlChangePasswordLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pwdNew, pwdOld, pwdRenew});

        pnlChangePasswordLayout.setVerticalGroup(
            pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangePasswordLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblOldPassword)
                    .addComponent(pwdOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(16, 16, 16)
                .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNewPassword)
                    .addComponent(pwdNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblRenewPassword)
                    .addComponent(pwdRenew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnChange)
                .addContainerGap())
        );

        lblInform.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPermission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAccountID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(513, 513, 513))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAccountID, txtDoB, txtEmail, txtFullName, txtPermission, txtPhoneNumber, txtUserName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccountID))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtPermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblInform, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAccountID, lblDOB, lblEmail, lblFullName, lblPermission, lblPhoneNumber, lblUsername, txtAccountID, txtDoB, txtEmail, txtFullName, txtPermission, txtPhoneNumber, txtUserName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
         if (this.checkPassword()) {
            if (profileManager.changePassword(String.valueOf(pwdNew.getPassword()))) {
                lblInform.setForeground(Color.green);
                lblInform.setText("Change Password Success !");
                pwdOld.setText(null);
                pwdNew.setText(null);
                pwdRenew.setText(null);
            }
        }
    }//GEN-LAST:event_btnChangeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lblAccountID;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblInform;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblPermission;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRenewPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlChangePassword;
    private javax.swing.JPasswordField pwdNew;
    private javax.swing.JPasswordField pwdOld;
    private javax.swing.JPasswordField pwdRenew;
    private javax.swing.JTextField txtAccountID;
    private javax.swing.JTextField txtDoB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPermission;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
