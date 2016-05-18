package gui;

import functions.EnrollmentStudentManager;
import functions.ExtensionFileFilter;
import functions.ImageHandle;
import functions.ValidateData;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

public class EnrollmentStudentPanel extends javax.swing.JPanel {

    private String imagePath;
    private EnrollmentStudentManager eStudentManager;
    private DefaultTableModel tableModel;

    public void seteStudentManager(EnrollmentStudentManager eStudentManager) {
        this.eStudentManager = eStudentManager;
    }

    public EnrollmentStudentPanel() {
        initComponents();
        myInitialize();
    }

    private boolean checkPermission() {
        if (!eStudentManager.getDbConnection().getAccount().getPermission().equals("enrollment")
                && !eStudentManager.getDbConnection().getAccount().getPermission().equals("admin")) {
            return false;
        }
        return true;
    }

    public void myInitialize() {
        String[] columnName = new String[]{"Student ID", "Full Name", "Gender", "DoB", "Phone", "Email", "Batch ID", "Status", "Action"};
        tableModel = new DefaultTableModel(null, columnName);
        tblRecent.setModel(tableModel);
        tblRecent.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblRecent.getColumn("Student ID").setPreferredWidth(93);
        tblRecent.getColumn("Full Name").setPreferredWidth(145);
        tblRecent.getColumn("Gender").setPreferredWidth(85);
        tblRecent.getColumn("DoB").setPreferredWidth(85);
        tblRecent.getColumn("Phone").setPreferredWidth(85);
        tblRecent.getColumn("Email").setPreferredWidth(160);
        tblRecent.getColumn("Batch ID").setPreferredWidth(64);
        tblRecent.getColumn("Status").setPreferredWidth(85);
        tblRecent.getColumn("Action").setPreferredWidth(70);
    }

    public void loadRecord(String valueID) {
        Object[] objArray = eStudentManager.loadStudent(valueID);
        if (objArray != null) {
            resetAll();
            txtStudentID.setText(objArray[10].toString());
            txtFirstName.setText(objArray[0].toString());
            txtLastname.setText(objArray[1].toString());
            txtDoB.setText(objArray[2].toString());
            if (objArray[3].toString().equals("Male")) {
                radMale.setSelected(true);
            } else if (objArray[3].toString().equals("Female")) {
                radFemale.setSelected(true);
            }
            txtPhoneNumber.setText(objArray[4].toString());
            txtAddress.setText(objArray[5].toString());
            txtEmail.setText(objArray[6].toString());
            if (objArray[7] != null) {
                DefaultComboBoxModel model = eStudentManager.loadComboBoxModel();
                cbxBatchID.setModel(model);
                cbxBatchID.setSelectedItem(objArray[7]);
            }
            if (objArray[8] != null) {
                txtStatus.setText(objArray[8].toString());
            }
            if (objArray[9] != null) {
                try {
                    ImageHandle.setPicture(lblFrameImage, (((Blob) objArray[9]).getBinaryStream()));
                } catch (SQLException ex) {
                    Logger.getLogger(EnrollmentStudentPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        }
    }

    public void loadAccount(String valueID) {
        String userName = eStudentManager.loadAccount(valueID);
        resetAll();
        txtUserName.setText(userName);
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGender = new javax.swing.ButtonGroup();
        scpRecentTable = new javax.swing.JScrollPane();
        tblRecent = new javax.swing.JTable();
        pnlStudentInformation = new javax.swing.JPanel();
        lblStudentID = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblDoB = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblBatchID = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        txtFirstName = new javax.swing.JTextField();
        txtStudentID = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtDoB = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        cbxBatchID = new javax.swing.JComboBox();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        lblFrameImage = new javax.swing.JLabel();
        btnBrowser = new javax.swing.JButton();
        pnlAccount = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblUserPassword = new javax.swing.JLabel();
        pwdUserPassword = new javax.swing.JPasswordField();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 480));

        scpRecentTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Recent Activity"));

        tblRecent.setAutoCreateRowSorter(true);
        tblRecent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        tblRecent.setToolTipText("");
        tblRecent.setShowHorizontalLines(false);
        tblRecent.setShowVerticalLines(false);
        scpRecentTable.setViewportView(tblRecent);

        pnlStudentInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 153))); // NOI18N

        lblStudentID.setText("Student ID");

        lblFirstName.setText("First Name");

        lblLastName.setText("LastName");

        lblDoB.setText("DoB");

        lblPhoneNumber.setText("Phone Number");
        lblPhoneNumber.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblAddress.setText("Address");

        lblEmail.setText("Email");

        lblGender.setText("Gender");

        lblBatchID.setText("Batch ID");

        btgGender.add(radMale);
        radMale.setText("Male");

        btgGender.add(radFemale);
        radFemale.setText("Female");

        txtFirstName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFirstName.setNextFocusableComponent(txtLastname);

        txtStudentID.setNextFocusableComponent(txtFirstName);
        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });
        txtStudentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStudentIDKeyReleased(evt);
            }
        });

        txtLastname.setNextFocusableComponent(txtDoB);

        txtDoB.setToolTipText("");
        txtDoB.setNextFocusableComponent(txtPhoneNumber);

        txtEmail.setNextFocusableComponent(txtStatus);

        txtPhoneNumber.setNextFocusableComponent(txtAddress);

        txtAddress.setNextFocusableComponent(txtEmail);

        cbxBatchID.setSelectedItem(null);
        cbxBatchID.setNextFocusableComponent(btnBrowser);
        cbxBatchID.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxBatchIDPopupMenuWillBecomeVisible(evt);
            }
        });

        lblStatus.setText("Status");

        txtStatus.setNextFocusableComponent(cbxBatchID);

        lblImage.setText("Image");

        lblFrameImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lblFrameImage.setPreferredSize(new java.awt.Dimension(75, 100));

        btnBrowser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/browse.png"))); // NOI18N
        btnBrowser.setText("Browser");
        btnBrowser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBrowser.setNextFocusableComponent(pwdUserPassword);
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });

        pnlAccount.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 153))); // NOI18N

        lblUserName.setText("User");

        txtUserName.setText(" ");
        txtUserName.setEnabled(false);

        lblUserPassword.setText("Password");

        pwdUserPassword.setNextFocusableComponent(btnAdd);

        javax.swing.GroupLayout pnlAccountLayout = new javax.swing.GroupLayout(pnlAccount);
        pnlAccount.setLayout(pnlAccountLayout);
        pnlAccountLayout.setHorizontalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblUserName)
                .addGap(20, 20, 20)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(lblUserPassword)
                .addGap(20, 20, 20)
                .addComponent(pwdUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pnlAccountLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pwdUserPassword, txtUserName});

        pnlAccountLayout.setVerticalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountLayout.createSequentialGroup()
                .addGroup(pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserPassword)
                    .addComponent(pwdUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAccountLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pwdUserPassword, txtUserName});

        javax.swing.GroupLayout pnlStudentInformationLayout = new javax.swing.GroupLayout(pnlStudentInformation);
        pnlStudentInformation.setLayout(pnlStudentInformationLayout);
        pnlStudentInformationLayout.setHorizontalGroup(
            pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStudentInformationLayout.createSequentialGroup()
                        .addComponent(pnlAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(pnlStudentInformationLayout.createSequentialGroup()
                        .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStudentID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlStudentInformationLayout.createSequentialGroup()
                                .addComponent(radMale)
                                .addGap(62, 62, 62)
                                .addComponent(radFemale))
                            .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 66, Short.MAX_VALUE)
                        .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDoB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)))
                .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBatchID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxBatchID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblFrameImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBrowser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );

        pnlStudentInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxBatchID, txtAddress, txtDoB, txtEmail, txtFirstName, txtLastname, txtPhoneNumber, txtStatus, txtStudentID});

        pnlStudentInformationLayout.setVerticalGroup(
            pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblStudentID)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoB)
                    .addComponent(txtDoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBatchID)
                    .addComponent(cbxBatchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlStudentInformationLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblLastName)
                            .addComponent(txtLastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImage))
                        .addGap(11, 11, 11)
                        .addGroup(pnlStudentInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblGender)
                            .addComponent(radMale)
                            .addComponent(radFemale)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 22, Short.MAX_VALUE)
                        .addComponent(pnlAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(pnlStudentInformationLayout.createSequentialGroup()
                        .addComponent(lblFrameImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBrowser)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlStudentInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxBatchID, txtAddress, txtDoB, txtEmail, txtFirstName, txtLastname, txtPhoneNumber, txtStatus, txtStudentID});

        pnlStudentInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblFirstName, lblPhoneNumber});

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdd.setNextFocusableComponent(btnUpdate);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorderPainted(false);
        btnReset.setFocusPainted(false);
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setEnabled(false);
        btnUpdate.setFocusPainted(false);
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdate.setNextFocusableComponent(btnDelete);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.setEnabled(false);
        btnDelete.setFocusPainted(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete.setNextFocusableComponent(btnReset);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnUpdate)
                        .addGap(40, 40, 40)
                        .addComponent(btnDelete)
                        .addGap(40, 40, 40)
                        .addComponent(btnReset)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlStudentInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scpRecentTable))
                .addGap(2, 2, 2))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnReset, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(scpRecentTable, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlStudentInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnDelete, btnReset, btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    public boolean checkField() {
        if ((txtStudentID.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Un-enter Student ID !");
            txtStudentID.requestFocus();
            return false;
        } else if ((txtFirstName.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Un-enter FirstName !");
            txtFirstName.requestFocus();
            return false;
        } else if ((txtLastname.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Un-enter LastName !");
            txtLastname.requestFocus();
            return false;
        } else if (radMale.isSelected() == false && radFemale.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Un-select Gender !");
            radMale.requestFocus();
            return false;
        } else if (!(ValidateData.checkDate(txtDoB.getText()))) {
            JOptionPane.showMessageDialog(null, "Invalid DoB ! !");
            txtDoB.requestFocus();
            return false;
        } else if (!(ValidateData.checkPhoneNumber(txtPhoneNumber.getText()))) {
            JOptionPane.showMessageDialog(null, "Invalid PhoneNumber !");
            txtPhoneNumber.requestFocus();
            return false;
        } else if ((txtAddress.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Un-enter Address !");
            txtAddress.requestFocus();
            return false;
        } else if (!(ValidateData.checkEmail(txtEmail.getText()))) {
            JOptionPane.showMessageDialog(null, "Invalid Email !");
            txtEmail.requestFocus();
            return false;
        } else if (!ValidateData.checkPassword(String.valueOf(pwdUserPassword.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Invalid UserPassword !");
            pwdUserPassword.requestFocus();
            return false;
        }
        return true;
    }

    public void resetAll() {
        btgGender.clearSelection();
        txtStudentID.setText(null);
        txtAddress.setText(null);
        txtDoB.setText(null);
        txtEmail.setText(null);
        txtFirstName.setText(null);
        txtLastname.setText(null);
        txtPhoneNumber.setText(null);
        txtStatus.setText(null);
        txtUserName.setText(null);
        pwdUserPassword.setText(null);
        cbxBatchID.setSelectedItem(null);
        lblFrameImage.setIcon(null);
        imagePath = "";
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    public void chooseImage() {
        JFileChooser fcrChooseImage = new JFileChooser();
        FileFilter filterImage = new ExtensionFileFilter("Image files", new String[]{"JPG", "JPEG", "PNG", "GIF"});
        fcrChooseImage.setFileFilter(filterImage);
        fcrChooseImage.setDialogTitle("Choose an Image file");
        int returnValue = fcrChooseImage.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            imagePath = fcrChooseImage.getSelectedFile().getPath();
            ImageHandle.setPicture(lblFrameImage, imagePath);
        }
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.resetAll();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkField()) {
            String studentID = txtStudentID.getText().trim();
            String firstName = txtFirstName.getText().trim();
            String lastName = txtLastname.getText().trim();
            String doB = txtDoB.getText().trim();
            String gender = "";
            if (radMale.isSelected()) {
                gender = "Male";
            } else if (radFemale.isSelected()) {
                gender = "Female";
            }
            String phoneNumber = txtPhoneNumber.getText().trim();
            String address = txtAddress.getText().trim();
            String email = txtEmail.getText().trim();
            Object batchID = cbxBatchID.getSelectedItem();
            String status = txtStatus.getText().trim();
            String password = String.valueOf(pwdUserPassword.getPassword());
            Object[] objRow = eStudentManager.addStudent(studentID, firstName, lastName, doB, gender, phoneNumber, address, email, batchID, status, imagePath, password);
            if (objRow != null) {
                tableModel.addRow(objRow);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtStudentIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudentIDKeyReleased
        String studentID = txtStudentID.getText();
        txtUserName.setText(studentID);
        if (eStudentManager.checkExistRecord(studentID)) {
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        } else {
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnAdd.setEnabled(true);
        }
    }//GEN-LAST:event_txtStudentIDKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (txtStudentID.getText().equals("") && !(txtUserName.getText().equals(""))) {
            if (!(ValidateData.checkPassword(String.valueOf(pwdUserPassword.getPassword())))) {
                JOptionPane.showMessageDialog(this, "Invalid UserPassword !");
                pwdUserPassword.requestFocus();
                return;
            }
            eStudentManager.updatePassword(txtUserName.getText(), String.valueOf(pwdUserPassword.getPassword()));
            return;
        }
        if (!(String.valueOf(pwdUserPassword.getPassword()).isEmpty())) {
            if (!(ValidateData.checkPassword(String.valueOf(pwdUserPassword.getPassword())))) {
                JOptionPane.showMessageDialog(this, "Invalid UserPassword !");
                pwdUserPassword.requestFocus();
                return;
            }
        }
        String studentID = txtStudentID.getText().trim();
        String firstName = txtFirstName.getText().trim();
        String lastName = txtLastname.getText().trim();
        String doB = txtDoB.getText().trim();
        String gender = "";
        if (radMale.isSelected()) {
            gender = "Male";
        } else if (radFemale.isSelected()) {
            gender = "Female";
        }
        String phoneNumber = txtPhoneNumber.getText().trim();
        String address = txtAddress.getText().trim();
        String email = txtEmail.getText().trim();
        Object batchID = cbxBatchID.getSelectedItem();
        String status = txtStatus.getText().trim();
        String password = String.valueOf(pwdUserPassword.getPassword());
        Object[] objRow = eStudentManager.updateStudent(studentID, firstName, lastName, doB, gender, phoneNumber, address, email, batchID, status, imagePath, password);
        if (objRow != null) {
            tableModel.addRow(objRow);
            resetAll();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowserActionPerformed
        chooseImage();
    }//GEN-LAST:event_btnBrowserActionPerformed

    private void cbxBatchIDPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxBatchIDPopupMenuWillBecomeVisible
        DefaultComboBoxModel model = eStudentManager.loadComboBoxModel();
        cbxBatchID.setModel(model);
        cbxBatchID.setSelectedItem(null);
    }//GEN-LAST:event_cbxBatchIDPopupMenuWillBecomeVisible

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        String studentID = txtStudentID.getText().trim();
        String firstName = txtFirstName.getText().trim();
        String lastName = txtLastname.getText().trim();
        String doB = txtDoB.getText().trim();
        String gender = "";
        if (radMale.isSelected()) {
            gender = "Male";
        } else if (radFemale.isSelected()) {
            gender = "Female";
        }
        String phoneNumber = txtPhoneNumber.getText().trim();
        String address = txtAddress.getText().trim();
        String email = txtEmail.getText().trim();
        Object batchID = cbxBatchID.getSelectedItem();
        String status = txtStatus.getText().trim();
        String password = String.valueOf(pwdUserPassword.getPassword());
        Object[] objRow = eStudentManager.deleteStudent(studentID, firstName, lastName, doB, gender, phoneNumber, address, email, batchID, status, imagePath, password);
        if (objRow != null) {
            tableModel.addRow(objRow);
            resetAll();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        loadRecord(txtStudentID.getText());
    }//GEN-LAST:event_txtStudentIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGender;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBrowser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbxBatchID;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBatchID;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFrameImage;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserPassword;
    private javax.swing.JPanel pnlAccount;
    private javax.swing.JPanel pnlStudentInformation;
    private javax.swing.JPasswordField pwdUserPassword;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JScrollPane scpRecentTable;
    private javax.swing.JTable tblRecent;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDoB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
