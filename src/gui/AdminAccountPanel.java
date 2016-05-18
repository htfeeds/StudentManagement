package gui;

import functions.AdminAccountManager;
import functions.ValidateData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminAccountPanel extends javax.swing.JPanel {

    private AdminAccountManager adminAccountManager;
    private DefaultTableModel tableModel;

    public void setAdminAccountManager(AdminAccountManager adminAccountManager) {
        this.adminAccountManager = adminAccountManager;
    }

    public AdminAccountPanel() {
        initComponents();
        myInitialize();
    }

    public void myInitialize() {
        String[] columnName = new String[]{"UserName", "Full Name", "DoB", "Phone", "Email", "Permission", "Action"};
        tableModel = new DefaultTableModel(null, columnName);
        tblActivity.setModel(tableModel);
        tblActivity.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblActivity.getColumn("UserName").setPreferredWidth(70);
        tblActivity.getColumn("Full Name").setPreferredWidth(120);
        tblActivity.getColumn("DoB").setPreferredWidth(75);
        tblActivity.getColumn("Phone").setPreferredWidth(65);
        tblActivity.getColumn("Email").setPreferredWidth(150);
        tblActivity.getColumn("Permission").setPreferredWidth(65);
        tblActivity.getColumn("Action").setPreferredWidth(65);
    }

    private boolean checkField() {
        if ((txtUserName.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Un-enter UserName !");
            txtUserName.requestFocus();
            return false;
        } else if ((txtFullName.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Un-enter FullName !");
            txtFullName.requestFocus();
            return false;
        } else if (!ValidateData.checkEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid Email !");
            txtEmail.requestFocus();
            return false;
        } else if (!(ValidateData.checkPhoneNumber(txtPhoneNumber.getText()))) {
            JOptionPane.showMessageDialog(null, "Invalid PhoneNumber !");
            txtPhoneNumber.requestFocus();
            return false;
        } else if (!(ValidateData.checkDate(txtDoB.getText()))) {
            JOptionPane.showMessageDialog(null, "Invalid DoB ! !");
            txtDoB.requestFocus();
            return false;
        } else if (!ValidateData.checkPassword(String.valueOf(pwdPassword.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Invalid UserPassword !");
            pwdPassword.requestFocus();
            return false;
        } else if (cbxPermission.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Un-select Permission !");
            cbxPermission.requestFocus();
            return false;
        }
        return true;
    }

    private boolean checkFieldUpdate() {
        if ((txtUserName.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Un-enter UserName !");
            txtUserName.requestFocus();
            return false;
        } else if ((txtFullName.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Un-enter FullName !");
            txtFullName.requestFocus();
            return false;
        } else if (!ValidateData.checkEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid Email !");
            txtEmail.requestFocus();
            return false;
        } else if (!(ValidateData.checkPhoneNumber(txtPhoneNumber.getText()))) {
            JOptionPane.showMessageDialog(null, "Invalid PhoneNumber !");
            txtPhoneNumber.requestFocus();
            return false;
        } else if (!(ValidateData.checkDate(txtDoB.getText()))) {
            JOptionPane.showMessageDialog(null, "Invalid DoB ! !");
            txtDoB.requestFocus();
            return false;
        } else if (cbxPermission.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Un-select Permission !");
            cbxPermission.requestFocus();
            return false;
        }
        return true;
    }

    private void resetAll() {
        txtUserName.setText("");
        txtFullName.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
        txtDoB.setText("");
        pwdPassword.setText("");
        txtAccountID.setText("");
        cbxPermission.setSelectedItem(null);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCreate.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpActivity = new javax.swing.JScrollPane();
        tblActivity = new javax.swing.JTable();
        pnlAccountInformation = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblDoB = new javax.swing.JLabel();
        lblPermission = new javax.swing.JLabel();
        lblAccountID = new javax.swing.JLabel();
        txtDoB = new javax.swing.JTextField();
        txtAccountID = new javax.swing.JTextField();
        cbxPermission = new javax.swing.JComboBox();
        lblPassword = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        scpActivity.setBorder(javax.swing.BorderFactory.createTitledBorder("Recent Activity"));

        tblActivity.setAutoCreateRowSorter(true);
        tblActivity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tblActivity.setShowHorizontalLines(false);
        tblActivity.setShowVerticalLines(false);
        scpActivity.setViewportView(tblActivity);

        pnlAccountInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Account Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 204))); // NOI18N

        lblUserName.setText("User Name");

        lblFullName.setText("Full Name");

        lblPhoneNumber.setText("Phone Number");

        lblEmail.setText("Email");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });

        lblDoB.setText("DoB");

        lblPermission.setText("Permission");

        lblAccountID.setText("Account ID");

        txtAccountID.setEditable(false);

        cbxPermission.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "admin", "enrollment", "bursary", "student" }));
        cbxPermission.setSelectedItem(null);

        lblPassword.setText("Password");

        javax.swing.GroupLayout pnlAccountInformationLayout = new javax.swing.GroupLayout(pnlAccountInformation);
        pnlAccountInformation.setLayout(pnlAccountInformationLayout);
        pnlAccountInformationLayout.setHorizontalGroup(
            pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountInformationLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPhoneNumber)
                    .addComponent(lblUserName)
                    .addComponent(lblFullName)
                    .addComponent(lblEmail))
                .addGap(24, 24, 24)
                .addGroup(pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAccountInformationLayout.createSequentialGroup()
                        .addGroup(pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDoB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPermission, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlAccountInformationLayout.createSequentialGroup()
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(lblAccountID)))
                .addGap(24, 24, 24)
                .addGroup(pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxPermission, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtAccountID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pwdPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pnlAccountInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxPermission, txtAccountID, txtDoB, txtEmail, txtFullName, txtPhoneNumber, txtUserName});

        pnlAccountInformationLayout.setVerticalGroup(
            pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountInformationLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoB)
                    .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblFullName)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPermission)
                    .addComponent(cbxPermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword)
                    .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAccountInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccountID))
                .addGap(20, 20, 20))
        );

        pnlAccountInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAccountID, txtDoB, txtEmail, txtFullName, txtPhoneNumber, txtUserName});

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAccountInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scpActivity))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btnCreate)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreate, btnDelete, btnReset, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(scpActivity, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlAccountInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (checkField()) {
            String userName = txtUserName.getText().trim();
            String fullName = txtFullName.getText().trim();
            String email = txtEmail.getText().trim();
            String doB = txtDoB.getText().trim();
            String phoneNumber = txtPhoneNumber.getText().trim();
            String password = String.valueOf(pwdPassword.getPassword());
            String permission = cbxPermission.getSelectedItem().toString();
            String[] objRow = adminAccountManager.createAccount(userName, password, fullName, phoneNumber, email, doB, permission);
            if (objRow != null) {
                JOptionPane.showMessageDialog(null, "Account successfully Created.");
                tableModel.addRow(objRow);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (checkFieldUpdate()) {
            String userName = txtUserName.getText().trim();
            String fullName = txtFullName.getText().trim();
            String email = txtEmail.getText().trim();
            String doB = txtDoB.getText().trim();
            String phoneNumber = txtPhoneNumber.getText().trim();
            String password = String.valueOf(pwdPassword.getPassword());
            if (!(password.equals(""))) {
                if (!ValidateData.checkPassword(String.valueOf(pwdPassword.getPassword()))) {
                    JOptionPane.showMessageDialog(null, "Invalid UserPassword !");
                    pwdPassword.requestFocus();
                    return;
                }
            }
            String permission = cbxPermission.getSelectedItem().toString();
            String[] objRow = adminAccountManager.createAccount(userName, password, fullName, phoneNumber, email, doB, permission);
            if (objRow != null) {
                JOptionPane.showMessageDialog(null, "Account successfully Updated.");
                tableModel.addRow(objRow);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String userName = txtUserName.getText().trim();
        String fullName = txtFullName.getText().trim();
        String email = txtEmail.getText().trim();
        String doB = txtDoB.getText().trim();
        String phoneNumber = txtPhoneNumber.getText().trim();
        String permission = "";
        if (cbxPermission.getSelectedItem() != null) {
            permission = cbxPermission.getSelectedItem().toString();
        }
        String[] objRow = adminAccountManager.deleteAccount(userName, fullName, phoneNumber, email, doB, permission);
        if (objRow != null) {
            JOptionPane.showMessageDialog(null, "Account successfully Deleted.");
            tableModel.addRow(objRow);
            resetAll();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetAll();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        if (adminAccountManager.checkExistRecord(txtUserName.getText())) {
            String[] arr = adminAccountManager.loadAccount(txtUserName.getText());
            txtUserName.setText(arr[0]);
            txtFullName.setText(arr[1]);
            txtEmail.setText(arr[2]);
            txtPhoneNumber.setText(arr[3]);
            txtDoB.setText(arr[4]);
            cbxPermission.setSelectedItem(arr[5]);
            txtAccountID.setText(arr[6]);
        }
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        String userName = txtUserName.getText();
        if (adminAccountManager.checkExistRecord(userName)) {
            btnCreate.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        } else {
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnCreate.setEnabled(true);
        }
    }//GEN-LAST:event_txtUserNameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbxPermission;
    private javax.swing.JLabel lblAccountID;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPermission;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlAccountInformation;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JScrollPane scpActivity;
    private javax.swing.JTable tblActivity;
    private javax.swing.JTextField txtAccountID;
    private javax.swing.JTextField txtDoB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}
