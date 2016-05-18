package gui;

import functions.AdminInformationManager;
import functions.ValidateData;
import java.awt.Color;

public class AdminInformationPanel extends javax.swing.JPanel {

    private AdminInformationManager profileAdminManager;

    public void setAdminInformationManager(AdminInformationManager profileAdminManager) {
        this.profileAdminManager = profileAdminManager;
        loadProfile();
    }

    public AdminInformationPanel() {
        initComponents();
    }

    private void loadProfile() {
        txtAccountID.setText(profileAdminManager.getDbConnection().getAccount().getAccountID() + "");
        txtUserName.setText(profileAdminManager.getDbConnection().getAccount().getUserName());
        txtFullName.setText(profileAdminManager.getDbConnection().getAccount().getFullName());
        txtPhoneNumber.setText(profileAdminManager.getDbConnection().getAccount().getPhoneNumber());
        txtEmail.setText(profileAdminManager.getDbConnection().getAccount().getEmail());
        txtDoB.setText(profileAdminManager.getDbConnection().getAccount().getDoB());
        txtPermission.setText(profileAdminManager.getDbConnection().getAccount().getPermission());
    }

    private boolean checkPermission() {
        if (profileAdminManager.getDbConnection().getAccount().getPermission().equals("admin")) {
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        pwdNew = new javax.swing.JPasswordField();
        pwdOld = new javax.swing.JPasswordField();
        pwdRenew = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblInform = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(666, 444));

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

        jLabel12.setText("-----------------------------------------------------------");

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
                        .addGap(16, 16, 16)
                        .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRenewPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOldPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdRenew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdOld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChangePasswordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChangePasswordLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChange)))
                .addContainerGap())
        );

        pnlChangePasswordLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pwdNew, pwdOld, pwdRenew});

        pnlChangePasswordLayout.setVerticalGroup(
            pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangePasswordLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOldPassword)
                    .addComponent(pwdOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(16, 16, 16)
                .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPassword)
                    .addComponent(pwdNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRenewPassword)
                    .addComponent(pwdRenew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnChange)
                .addGap(15, 15, 15))
        );

        pnlChangePasswordLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pwdNew, pwdOld});

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileAdmin.png"))); // NOI18N

        lblInform.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPermission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAccountID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAccountID, txtDoB, txtEmail, txtFullName, txtPermission, txtPhoneNumber, txtUserName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccountID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccountID, javax.swing.GroupLayout.Alignment.TRAILING))
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
                            .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtPermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInform, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAccountID, lblDOB, lblEmail, lblFullName, lblPermission, lblPhoneNumber, lblUsername, txtAccountID, txtDoB, txtEmail, txtFullName, txtPermission, txtPhoneNumber, txtUserName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if (this.checkPassword()) {
            if (profileAdminManager.changePassword(String.valueOf(pwdNew.getPassword()))) {
                lblInform.setForeground(Color.green);
                lblInform.setText("Change Password Success !");
                pwdOld.setText(null);
                pwdNew.setText(null);
                pwdRenew.setText(null);
            }
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    public boolean checkPassword() {
        lblInform.setForeground(Color.red);
        if (String.valueOf(pwdOld.getPassword()).equals("")) {
            lblInform.setText("Un-enter OldPassword !");
            pwdOld.requestFocus();
            return false;
        }
        if (!(String.valueOf(pwdOld.getPassword()).equals(this.profileAdminManager.getDbConnection().getAccount().getPassword()))) {
            lblInform.setText("OldPassword failed !");
            pwdOld.requestFocus();
            return false;
        }
        if (!(ValidateData.checkPassword(String.valueOf(pwdNew.getPassword())))) {
            lblInform.setText("Invalid NewPassword !");
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
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lblAccountID;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
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
