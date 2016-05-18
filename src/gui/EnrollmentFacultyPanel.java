package gui;

import functions.EnrollmentFacultyManager;
import functions.ExtensionFileFilter;
import functions.ImageHandle;
import functions.ValidateData;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

public class EnrollmentFacultyPanel extends javax.swing.JPanel {

    String imagePath = "";
    DefaultTableModel tableModel;
    EnrollmentFacultyManager eFacultyManager;

    public void seteFacultyManager(EnrollmentFacultyManager eFacultyManager) {
        this.eFacultyManager = eFacultyManager;
    }

    public EnrollmentFacultyPanel() {
        initComponents();
        myInitialize();
    }

    private boolean checkPermission() {
        if (!eFacultyManager.getDbConnection().getAccount().getPermission().equals("enrollment")
                && !eFacultyManager.getDbConnection().getAccount().getPermission().equals("admin")) {
            return false;
        }
        return true;
    }

    private void myInitialize() {
        String[] columnName = new String[]{"Faculty ID", "Faculty Name", "Gender", "Address", "Phone Number", "DoB", "Enail", "Action"};
        tableModel = new DefaultTableModel(null, columnName);
        tblFacultyRecent.setModel(tableModel);
        tblFacultyRecent.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblFacultyRecent.getColumn("Faculty ID").setPreferredWidth(95);
        tblFacultyRecent.getColumn("Faculty Name").setPreferredWidth(130);
        tblFacultyRecent.getColumn("Gender").setPreferredWidth(70);
        tblFacultyRecent.getColumn("Address").setPreferredWidth(170);
        tblFacultyRecent.getColumn("Phone Number").setPreferredWidth(95);
        tblFacultyRecent.getColumn("DoB").setPreferredWidth(80);
        tblFacultyRecent.getColumn("Enail").setPreferredWidth(170);
        tblFacultyRecent.getColumn("Action").setPreferredWidth(70);
    }

    public void loadRecord(String valueID) {
        Object[] objArray = eFacultyManager.loadFaculty(valueID);
        if (objArray != null) {
            resetAll();
            txtFacultyID.setText(valueID);
            txtFacultyName.setText(objArray[0].toString());
            txtFacultyAddress.setText(objArray[1].toString());
            txtFacultyPhoneNumber.setText(objArray[2].toString());
            txtFacultyDob.setText(objArray[3].toString());
            if (objArray[4].toString().equals("Male")) {
                radFacultyMale.setSelected(true);
            } else if (objArray[4].toString().equals("Female")) {
                radfacultyFemale.setSelected(true);
            }
            txtFacultyEmail.setText(objArray[5].toString());
            if (objArray[6] != null) {
                try {
                    ImageHandle.setPicture(lblFacultyFrameImage, ((Blob) objArray[6]).getBinaryStream());
                } catch (SQLException ex) {
                    Logger.getLogger(EnrollmentFacultyPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        scpFacultyRecent = new javax.swing.JScrollPane();
        tblFacultyRecent = new javax.swing.JTable();
        pnlFacultyInformation = new javax.swing.JPanel();
        lblFacultyID = new javax.swing.JLabel();
        lblFacultyName = new javax.swing.JLabel();
        lblfacultyAddress = new javax.swing.JLabel();
        lblFacultyPhoneNumber = new javax.swing.JLabel();
        lblFacultyDob = new javax.swing.JLabel();
        lblFacultyGenderl = new javax.swing.JLabel();
        lblFacultyEmail = new javax.swing.JLabel();
        lblFacultyImage = new javax.swing.JLabel();
        txtFacultyID = new javax.swing.JTextField();
        txtFacultyName = new javax.swing.JTextField();
        txtFacultyPhoneNumber = new javax.swing.JTextField();
        txtFacultyAddress = new javax.swing.JTextField();
        txtFacultyDob = new javax.swing.JTextField();
        txtFacultyEmail = new javax.swing.JTextField();
        lblFacultyFrameImage = new javax.swing.JLabel();
        btnFacultyBrowser = new javax.swing.JButton();
        radFacultyMale = new javax.swing.JRadioButton();
        radfacultyFemale = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        scpFacultyRecent.setBorder(javax.swing.BorderFactory.createTitledBorder("Recent Activity"));

        tblFacultyRecent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scpFacultyRecent.setViewportView(tblFacultyRecent);

        pnlFacultyInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Faculty Informtion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 204))); // NOI18N

        lblFacultyID.setText("Faculty ID");

        lblFacultyName.setText("Faculty Name");

        lblfacultyAddress.setText("Address");

        lblFacultyPhoneNumber.setText("Phone Number");

        lblFacultyDob.setText("DoB");

        lblFacultyGenderl.setText("Gender");

        lblFacultyEmail.setText("Email");

        lblFacultyImage.setText("Image");

        txtFacultyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultyIDActionPerformed(evt);
            }
        });
        txtFacultyID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFacultyIDKeyReleased(evt);
            }
        });

        lblFacultyFrameImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lblFacultyFrameImage.setPreferredSize(new java.awt.Dimension(75, 100));

        btnFacultyBrowser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/browse.png"))); // NOI18N
        btnFacultyBrowser.setText("Browser");
        btnFacultyBrowser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFacultyBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacultyBrowserActionPerformed(evt);
            }
        });

        btnGroup.add(radFacultyMale);
        radFacultyMale.setText("Male");

        btnGroup.add(radfacultyFemale);
        radfacultyFemale.setText("Female");

        javax.swing.GroupLayout pnlFacultyInformationLayout = new javax.swing.GroupLayout(pnlFacultyInformation);
        pnlFacultyInformation.setLayout(pnlFacultyInformationLayout);
        pnlFacultyInformationLayout.setHorizontalGroup(
            pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFacultyInformationLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFacultyPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblfacultyAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFacultyName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFacultyID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFacultyPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFacultyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFacultyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFacultyID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFacultyGenderl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFacultyDob, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFacultyEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFacultyInformationLayout.createSequentialGroup()
                        .addComponent(txtFacultyDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(lblFacultyImage)
                        .addGap(35, 35, 35))
                    .addGroup(pnlFacultyInformationLayout.createSequentialGroup()
                        .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFacultyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFacultyInformationLayout.createSequentialGroup()
                                .addComponent(radFacultyMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radfacultyFemale)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFacultyBrowser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFacultyFrameImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );

        pnlFacultyInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtFacultyAddress, txtFacultyDob, txtFacultyEmail, txtFacultyID, txtFacultyName, txtFacultyPhoneNumber});

        pnlFacultyInformationLayout.setVerticalGroup(
            pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFacultyInformationLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFacultyInformationLayout.createSequentialGroup()
                        .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblFacultyID)
                            .addComponent(txtFacultyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFacultyDob)
                            .addComponent(txtFacultyDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFacultyImage))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFacultyName)
                            .addComponent(txtFacultyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFacultyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFacultyEmail))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfacultyAddress)
                            .addComponent(txtFacultyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFacultyGenderl)
                            .addComponent(radFacultyMale)
                            .addComponent(radfacultyFemale)))
                    .addComponent(lblFacultyFrameImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFacultyInformationLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlFacultyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFacultyPhoneNumber)
                            .addComponent(txtFacultyPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFacultyInformationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFacultyBrowser)))
                .addGap(15, 15, 15))
        );

        pnlFacultyInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtFacultyAddress, txtFacultyDob, txtFacultyEmail, txtFacultyID, txtFacultyName, txtFacultyPhoneNumber});

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnAdd)
                .addGap(40, 40, 40)
                .addComponent(btnUpdate)
                .addGap(40, 40, 40)
                .addComponent(btnDelete)
                .addGap(40, 40, 40)
                .addComponent(btnReset)
                .addContainerGap(176, Short.MAX_VALUE))
            .addComponent(scpFacultyRecent)
            .addComponent(pnlFacultyInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnReset, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(scpFacultyRecent, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(pnlFacultyInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset))
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents
     public boolean checkField() {

        if ((txtFacultyID.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter FacultyID !");
            txtFacultyID.requestFocus();
            return false;
        } else if ((txtFacultyName.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter FacultyName !");
            txtFacultyName.requestFocus();
            return false;
        } else if ((txtFacultyAddress.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter FacultyAddress !");
            txtFacultyAddress.requestFocus();
            return false;
        } else if (!(ValidateData.checkPhoneNumber(txtFacultyPhoneNumber.getText()))) {
            JOptionPane.showMessageDialog(this, "Invalid PhoneNumber !");
            txtFacultyPhoneNumber.requestFocus();
            return false;
        } else if (!(ValidateData.checkDate(txtFacultyDob.getText()))) {
            JOptionPane.showMessageDialog(this, "Invalid DoB !");
            txtFacultyDob.requestFocus();
            return false;
        } else if (!(ValidateData.checkEmail(txtFacultyEmail.getText()))) {
            JOptionPane.showMessageDialog(this, "Invalid Email !");
            txtFacultyEmail.requestFocus();
            return false;
        } else if (radFacultyMale.isSelected() == false && radfacultyFemale.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Un-select Gender !");
            radFacultyMale.requestFocus();
            return false;
        }
        return true;
    }

    public void resetAll() {
        txtFacultyID.setText(null);
        txtFacultyName.setText(null);
        txtFacultyAddress.setText(null);
        txtFacultyPhoneNumber.setText(null);
        txtFacultyDob.setText(null);
        btnGroup.clearSelection();
        txtFacultyEmail.setText(null);
        lblFacultyFrameImage.setIcon(null);
        imagePath = "";
    }

    public void chooseImage() {
        JFileChooser fcrChooseImage = new JFileChooser();
        FileFilter filterImage = new ExtensionFileFilter("Image files", new String[]{"JPG", "JPEG", "PNG", "GIF"});
        fcrChooseImage.setFileFilter(filterImage);
        fcrChooseImage.setDialogTitle("Choose an Image file");
        int returnValue = fcrChooseImage.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            imagePath = fcrChooseImage.getSelectedFile().getPath();
            ImageHandle.setPicture(lblFacultyFrameImage, imagePath);
        }
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkField()) {
            String facultyID = txtFacultyID.getText().trim();
            String facultyName = txtFacultyName.getText().trim();
            String facultyAdress = txtFacultyAddress.getText().trim();
            String facultyPhoneNumber = txtFacultyPhoneNumber.getText().trim();
            String facultyDoB = txtFacultyDob.getText().trim();
            String facultyEmail = txtFacultyEmail.getText().trim();
            String facultyGender = "";
            if (radFacultyMale.isSelected()) {
                facultyGender = "Male";
            } else if (radfacultyFemale.isSelected()) {
                facultyGender = "famale";
            }
            Object[] objRow = eFacultyManager.AddFacyulty(facultyID, facultyName, facultyAdress, facultyPhoneNumber, facultyDoB, facultyEmail, facultyGender, imagePath);
            if (objRow != null) {
                tableModel.addRow(objRow);
                this.resetAll();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFacultyBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacultyBrowserActionPerformed
        chooseImage();
    }//GEN-LAST:event_btnFacultyBrowserActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.resetAll();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        String facultyID = txtFacultyID.getText().trim();
        String facultyName = txtFacultyName.getText().trim();
        String facultyAdress = txtFacultyAddress.getText().trim();
        String facultyPhoneNumber = txtFacultyPhoneNumber.getText().trim();
        String facultyDoB = txtFacultyDob.getText().trim();
        String facultyEmail = txtFacultyEmail.getText().trim();
        String facultyGender = "";
        if (radFacultyMale.isSelected()) {
            facultyGender = "Male";
        } else if (radfacultyFemale.isSelected()) {
            facultyGender = "famale";
        }
        Object[] objRow = eFacultyManager.updateFaculty(facultyID, facultyName, facultyAdress, facultyPhoneNumber, facultyDoB, facultyEmail, facultyGender, imagePath);
        if (objRow != null) {
            tableModel.addRow(objRow);
            resetAll();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        String facultyID = txtFacultyID.getText().trim();
        String facultyName = txtFacultyName.getText().trim();
        String facultyAdress = txtFacultyAddress.getText().trim();
        String facultyPhoneNumber = txtFacultyPhoneNumber.getText().trim();
        String facultyDoB = txtFacultyDob.getText().trim();
        String facultyEmail = txtFacultyEmail.getText().trim();
        String facultyGender = "";
        if (radFacultyMale.isSelected()) {
            facultyGender = "Male";
        } else if (radfacultyFemale.isSelected()) {
            facultyGender = "famale";
        }
        Object[] objRow = eFacultyManager.deleteteFaculty(facultyID, facultyName, facultyAdress, facultyPhoneNumber, facultyDoB, facultyEmail, facultyGender, imagePath);
        if (objRow != null) {
            tableModel.addRow(objRow);
            resetAll();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtFacultyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultyIDActionPerformed
        loadRecord(txtFacultyID.getText());
    }//GEN-LAST:event_txtFacultyIDActionPerformed

    private void txtFacultyIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFacultyIDKeyReleased
        String facultyID = txtFacultyID.getText();
        if (eFacultyManager.checkExistRecord(facultyID)) {
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        } else {
            btnAdd.setEnabled(true);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
        }
    }//GEN-LAST:event_txtFacultyIDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFacultyBrowser;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblFacultyDob;
    private javax.swing.JLabel lblFacultyEmail;
    private javax.swing.JLabel lblFacultyFrameImage;
    private javax.swing.JLabel lblFacultyGenderl;
    private javax.swing.JLabel lblFacultyID;
    private javax.swing.JLabel lblFacultyImage;
    private javax.swing.JLabel lblFacultyName;
    private javax.swing.JLabel lblFacultyPhoneNumber;
    private javax.swing.JLabel lblfacultyAddress;
    private javax.swing.JPanel pnlFacultyInformation;
    private javax.swing.JRadioButton radFacultyMale;
    private javax.swing.JRadioButton radfacultyFemale;
    private javax.swing.JScrollPane scpFacultyRecent;
    private javax.swing.JTable tblFacultyRecent;
    private javax.swing.JTextField txtFacultyAddress;
    private javax.swing.JTextField txtFacultyDob;
    private javax.swing.JTextField txtFacultyEmail;
    private javax.swing.JTextField txtFacultyID;
    private javax.swing.JTextField txtFacultyName;
    private javax.swing.JTextField txtFacultyPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
