package gui;

import functions.*;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LoginForm extends javax.swing.JFrame {

    DatabaseConnection dbConnection;

    public LoginForm() {
        initComponents();
        myInitialize();
        pack();
    }

    private void myInitialize() {
        ImageHandle.setIcon(this, "src/Images/LoginIcon.png");
        getContentPane().setBackground(Color.white);
        lblLogin.setSize(157, 67);
        ImageHandle.setPicture(lblLogin, "src/Images/Login.png");
        pnlAdvanced.setVisible(false);
        loadAccountInformation();
        loadDatabaseInformation();
        dbConnection = new DatabaseConnection();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        tgbAdvanced = new javax.swing.JToggleButton();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        chkSave = new javax.swing.JCheckBox();
        lblStatus = new javax.swing.JLabel();
        pnlAdvanced = new javax.swing.JPanel();
        pnlDatabaseInformation = new javax.swing.JPanel();
        lblPort = new javax.swing.JLabel();
        txtServer = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        lblServer = new javax.swing.JLabel();
        lblUserName2 = new javax.swing.JLabel();
        txtUserName2 = new javax.swing.JTextField();
        lblPassword2 = new javax.swing.JLabel();
        pwdPassword2 = new javax.swing.JPasswordField();
        lblDatabase = new javax.swing.JLabel();
        txtDatabase = new javax.swing.JTextField();
        chkSave2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));

        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblUserName.setText("UserName");

        lblPassword.setText("Password");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        pwdPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdPasswordActionPerformed(evt);
            }
        });

        tgbAdvanced.setText("Advanced");
        tgbAdvanced.setFocusPainted(false);
        tgbAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbAdvancedActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.setFocusPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        chkSave.setBackground(new java.awt.Color(255, 255, 255));
        chkSave.setSelected(true);
        chkSave.setText("Save");

        lblStatus.setForeground(Color.red);

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(tgbAdvanced)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlLoginLayout.createSequentialGroup()
                            .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chkSave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlLoginLayout.createSequentialGroup()
                            .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUserName)
                                .addComponent(lblPassword))
                            .addGap(18, 18, 18)
                            .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(pwdPassword)))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogin)
                .addGap(45, 45, 45))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSave)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgbAdvanced)
                    .addComponent(btnLogin)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pnlAdvanced.setBackground(new java.awt.Color(255, 255, 255));

        pnlDatabaseInformation.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatabaseInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Database Information"));

        lblPort.setText("Port");

        lblServer.setText("Server");

        lblUserName2.setText("UserName");

        lblPassword2.setText("Password");

        lblDatabase.setText("Database");

        chkSave2.setBackground(new java.awt.Color(255, 255, 255));
        chkSave2.setSelected(true);
        chkSave2.setText("Save information");

        javax.swing.GroupLayout pnlDatabaseInformationLayout = new javax.swing.GroupLayout(pnlDatabaseInformation);
        pnlDatabaseInformation.setLayout(pnlDatabaseInformationLayout);
        pnlDatabaseInformationLayout.setHorizontalGroup(
            pnlDatabaseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatabaseInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatabaseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkSave2)
                    .addGroup(pnlDatabaseInformationLayout.createSequentialGroup()
                        .addGroup(pnlDatabaseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblServer)
                            .addComponent(lblPort)
                            .addComponent(lblDatabase)
                            .addComponent(lblUserName2)
                            .addComponent(lblPassword2))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatabaseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatabase)
                            .addComponent(txtUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDatabaseInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pwdPassword2, txtDatabase, txtPort, txtServer, txtUserName2});

        pnlDatabaseInformationLayout.setVerticalGroup(
            pnlDatabaseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatabaseInformationLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlDatabaseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServer)
                    .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatabaseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnlDatabaseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatabase))
                .addGap(18, 18, 18)
                .addGroup(pnlDatabaseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName2))
                .addGap(18, 18, 18)
                .addGroup(pnlDatabaseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword2)
                    .addComponent(pwdPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(chkSave2))
        );

        pnlDatabaseInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pwdPassword2, txtDatabase, txtPort, txtServer, txtUserName2});

        javax.swing.GroupLayout pnlAdvancedLayout = new javax.swing.GroupLayout(pnlAdvanced);
        pnlAdvanced.setLayout(pnlAdvancedLayout);
        pnlAdvancedLayout.setHorizontalGroup(
            pnlAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdvancedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatabaseInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        pnlAdvancedLayout.setVerticalGroup(
            pnlAdvancedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdvancedLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlDatabaseInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pnlAdvanced, pnlLogin});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tgbAdvancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbAdvancedActionPerformed
        if (tgbAdvanced.isSelected()) {
            pnlAdvanced.setVisible(true);
            pack();
        } else {
            pnlAdvanced.setVisible(false);
            pack();
        }
    }//GEN-LAST:event_tgbAdvancedActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        pwdPassword.requestFocus();
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void pwdPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdPasswordActionPerformed
        login();
    }//GEN-LAST:event_pwdPasswordActionPerformed

    public void login() {
        if (checkField()) {
            if (isConnected()) {
                if (dbConnection.getAccount(txtUserName.getText(), String.valueOf(pwdPassword.getPassword()))) {
                    saveAccountInformation();
                    saveDatabaseInformation();
                    dbConnection.updateLastLogin();
                    loadForm();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid UserName or Password!", "Error connecting...", JOptionPane.ERROR_MESSAGE);
                    lblStatus.setText("Invalid UserName or Password!");
                    dbConnection.close();
                }
            } else {
                lblStatus.setText("Connection failed!");
                dbConnection.close();
            }
        }
    }

    public boolean isConnected() {
        String server = txtServer.getText();
        String port = txtPort.getText();
        String database = txtDatabase.getText();
        String userName = txtUserName2.getText();
        String password = String.valueOf(pwdPassword2.getPassword());
        return dbConnection.connectDatabase(server, port, database, userName, password);
    }

    public void loadAccountInformation() {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("src/functions/AccountInformation.properties"));
            txtUserName.setText(p.getProperty("userName"));
            pwdPassword.setText(p.getProperty("password"));
        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveAccountInformation() {
        Properties p = new Properties();
        try {
            if (chkSave.isSelected()) {
                p.setProperty("userName", txtUserName.getText());
                p.setProperty("password", String.valueOf(pwdPassword.getPassword()));
            }
            p.store(new FileOutputStream("src/functions/AccountInformation.properties"), null);
        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadDatabaseInformation() {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("src/functions/DatabaseInformation.properties"));
            txtServer.setText(p.getProperty("server"));
            txtPort.setText(p.getProperty("port"));
            txtDatabase.setText(p.getProperty("database"));
            txtUserName2.setText(p.getProperty("userName"));
            pwdPassword2.setText(p.getProperty("password"));
        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void saveDatabaseInformation() {
        Properties p = new Properties();
        try {
            if (chkSave2.isSelected()) {
                p.setProperty("server", txtServer.getText());
                p.setProperty("port", txtPort.getText());
                p.setProperty("database", txtDatabase.getText());
                p.setProperty("userName", txtUserName2.getText());
                p.setProperty("password", String.valueOf(pwdPassword2.getPassword()));
            }
            p.store(new FileOutputStream("src/functions/DatabaseInformation.properties"), null);
        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean checkField() {
        if (txtUserName.getText().isEmpty()) {
            lblStatus.setText("Un-enter UserName!");
            txtUserName.requestFocus();
            return false;
        }
        if (String.valueOf(pwdPassword.getPassword()).isEmpty()) {
            lblStatus.setText("Un-enter Password!");
            pwdPassword.requestFocus();
            return false;
        }
        if (txtServer.getText().isEmpty()
                || txtPort.getText().isEmpty()
                || txtDatabase.getText().isEmpty()
                || txtUserName2.getText().isEmpty()
                || String.valueOf(pwdPassword2.getPassword()).isEmpty()) {
            lblStatus.setText("Un-enter Database Information!");
            return false;
        }
        return true;
    }

    public void loadForm() {
        switch (dbConnection.getAccount().getPermission()) {
            case "admin":
                new AdminForm(dbConnection).setVisible(true);
                break;
            case "bursary":
            case "enrollment":
                new EnrollmentForm(dbConnection).setVisible(true);
                break;
            case "student":
                new StudentForm(dbConnection).setVisible(true);
                break;
        }
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox chkSave;
    private javax.swing.JCheckBox chkSave2;
    private javax.swing.JLabel lblDatabase;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblServer;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserName2;
    private javax.swing.JPanel pnlAdvanced;
    private javax.swing.JPanel pnlDatabaseInformation;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JPasswordField pwdPassword2;
    private javax.swing.JToggleButton tgbAdvanced;
    private javax.swing.JTextField txtDatabase;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtServer;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserName2;
    // End of variables declaration//GEN-END:variables
}
