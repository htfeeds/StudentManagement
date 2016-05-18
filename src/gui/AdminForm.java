package gui;

import functions.AdminInformationManager;
import functions.AdminAccountManager;
import functions.AdminViewFeedbackManager;

import functions.DatabaseConnection;
import functions.ImageHandle;
import java.awt.AWTException;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AdminForm extends javax.swing.JFrame {

    private DatabaseConnection dbConnection;
    private SystemTray systemTray;
    private TrayIcon trayIcon;
    private EnrollmentForm enrollmentForm;

    public AdminForm() {
        initComponents();
    }

    public AdminForm(DatabaseConnection dbConnection) {
        initComponents();
        this.dbConnection = dbConnection;
        pnlInformation.setAdminInformationManager(new AdminInformationManager(this.dbConnection));
        pnlAccount.setAdminAccountManager(new AdminAccountManager(this.dbConnection));
        pnlViewFeedback.setAdminViewFeedbackManager(new AdminViewFeedbackManager(this.dbConnection));
        ImageHandle.setIcon(this, "src/images/adminform.jpg");
        btnInformation.setSelected(true);
        myInitialize();
    }

    private void myInitialize() {
        systemTray = SystemTray.getSystemTray();
        Toolkit toolKit = Toolkit.getDefaultToolkit();
        Image image = toolKit.getImage("src/images/adminform.jpg");
        trayIcon = new TrayIcon(image, "SystemTray Demo", mnpMinimise);
        trayIcon.setImageAutoSize(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMenu = new javax.swing.ButtonGroup();
        mnpMinimise = new java.awt.PopupMenu();
        mniOpen = new java.awt.MenuItem();
        mniSwitch = new java.awt.MenuItem();
        mniLogOut = new java.awt.MenuItem();
        mniExit = new java.awt.MenuItem();
        tbrMenu = new javax.swing.JToolBar();
        btnInformation = new javax.swing.JToggleButton();
        btnAccount = new javax.swing.JToggleButton();
        btnViewFeedback = new javax.swing.JToggleButton();
        btnSwitch = new javax.swing.JButton();
        btnMinmise = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        pnlBody = new javax.swing.JPanel();
        pnlInformation = new gui.AdminInformationPanel();
        pnlAccount = new gui.AdminAccountPanel();
        pnlViewFeedback = new gui.AdminViewFeedbackPanel();

        mnpMinimise.setLabel("popupMenu1");

        mniOpen.setLabel("Open");
        mniOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenActionPerformed(evt);
            }
        });
        mnpMinimise.add(mniOpen);

        mniSwitch.setLabel("Switch to...");
        mniSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSwitchActionPerformed(evt);
            }
        });
        mnpMinimise.add(mniSwitch);
        mnpMinimise.addSeparator();
        mniLogOut.setLabel("Log Out");
        mniLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogOutActionPerformed(evt);
            }
        });
        mnpMinimise.add(mniLogOut);
        mnpMinimise.addSeparator();
        mniExit.setLabel("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnpMinimise.add(mniExit);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Student Management - Admin");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tbrMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbrMenu.setFloatable(false);
        tbrMenu.setRollover(true);

        btgMenu.add(btnInformation);
        btnInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.jpg"))); // NOI18N
        btnInformation.setText("My Information    ");
        btnInformation.setFocusable(false);
        btnInformation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInformation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });
        tbrMenu.add(btnInformation);

        btgMenu.add(btnAccount);
        btnAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.jpg"))); // NOI18N
        btnAccount.setText("Account        ");
        btnAccount.setFocusable(false);
        btnAccount.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });
        tbrMenu.add(btnAccount);

        btgMenu.add(btnViewFeedback);
        btnViewFeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewfeedback.jpg"))); // NOI18N
        btnViewFeedback.setText("View Feedback     ");
        btnViewFeedback.setFocusable(false);
        btnViewFeedback.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnViewFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFeedbackActionPerformed(evt);
            }
        });
        tbrMenu.add(btnViewFeedback);

        btnSwitch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.jpg"))); // NOI18N
        btnSwitch.setText("Switch to...    ");
        btnSwitch.setFocusable(false);
        btnSwitch.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitchActionPerformed(evt);
            }
        });
        tbrMenu.add(btnSwitch);

        btnMinmise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimise.jpg"))); // NOI18N
        btnMinmise.setText("Minimise      ");
        btnMinmise.setFocusable(false);
        btnMinmise.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMinmise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinmiseActionPerformed(evt);
            }
        });
        tbrMenu.add(btnMinmise);

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminlogout.jpg"))); // NOI18N
        btnLogOut.setText("Log Out     ");
        btnLogOut.setFocusable(false);
        btnLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        tbrMenu.add(btnLogOut);

        pnlBody.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlBody.setLayout(new java.awt.CardLayout());
        pnlBody.add(pnlInformation, "Information");
        pnlBody.add(pnlAccount, "Account");
        pnlBody.add(pnlViewFeedback, "Feedback");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlBody, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbrMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tbrMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformationActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Information");
    }//GEN-LAST:event_btnInformationActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int exit = JOptionPane.showConfirmDialog(null, "Do you want to Exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/images/exit.gif"));
        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Account");
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnViewFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFeedbackActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Feedback");
    }//GEN-LAST:event_btnViewFeedbackActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        int logOut = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/images/logout.png"));
        if (logOut == JOptionPane.YES_OPTION) {
            this.dispose();
            if (enrollmentForm != null) {
                enrollmentForm.dispose();
            }
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitchActionPerformed
        minimise();
        if (enrollmentForm == null) {
            enrollmentForm = new EnrollmentForm(dbConnection);
        }
        enrollmentForm.setVisible(true);
    }//GEN-LAST:event_btnSwitchActionPerformed

    private void btnMinmiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinmiseActionPerformed
        if (!SystemTray.isSupported()) {
            JOptionPane.showMessageDialog(null, "SystemTray is not supported!");
        }
        if (SystemTray.isSupported()) {
            minimise();
        }
    }//GEN-LAST:event_btnMinmiseActionPerformed

    private void mniOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenActionPerformed
        this.setVisible(true);
        systemTray.remove(trayIcon);
    }//GEN-LAST:event_mniOpenActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogOutActionPerformed
        int logOut = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/images/logout.png"));
        if (logOut == JOptionPane.YES_OPTION) {
            this.dispose();
            enrollmentForm.dispose();
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_mniLogOutActionPerformed

    private void mniSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSwitchActionPerformed
        if (enrollmentForm == null) {
            enrollmentForm = new EnrollmentForm(dbConnection);
        }
        enrollmentForm.setVisible(true);
    }//GEN-LAST:event_mniSwitchActionPerformed

    private void minimise() {
        try {
            systemTray.add(trayIcon);
            this.setVisible(false);
        } catch (AWTException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgMenu;
    private javax.swing.JToggleButton btnAccount;
    private javax.swing.JToggleButton btnInformation;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMinmise;
    private javax.swing.JButton btnSwitch;
    private javax.swing.JToggleButton btnViewFeedback;
    private java.awt.MenuItem mniExit;
    private java.awt.MenuItem mniLogOut;
    private java.awt.MenuItem mniOpen;
    private java.awt.MenuItem mniSwitch;
    private java.awt.PopupMenu mnpMinimise;
    private gui.AdminAccountPanel pnlAccount;
    private javax.swing.JPanel pnlBody;
    private gui.AdminInformationPanel pnlInformation;
    private gui.AdminViewFeedbackPanel pnlViewFeedback;
    private javax.swing.JToolBar tbrMenu;
    // End of variables declaration//GEN-END:variables
}
