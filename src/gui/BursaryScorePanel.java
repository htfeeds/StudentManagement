package gui;

import functions.BursaryScoreManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BursaryScorePanel extends javax.swing.JPanel {

    private BursaryScoreManager eScoreManager;
    private DefaultTableModel tableModelTimeTable;

    public void seteScoreManager(BursaryScoreManager eScoreManager) {
        this.eScoreManager = eScoreManager;
    }

    public BursaryScorePanel() {
        initComponents();
        myInitializeScore();
    }

    public void myInitializeScore() {
        String[] columnName = new String[]{"Student ID", "Course ID", " E_Test", "E_Time", "R_Test", "R_Time", "Action"};
        tableModelTimeTable = new DefaultTableModel(null, columnName);
        tblScore.setModel(tableModelTimeTable);
    }

    private boolean checkPermission() {
        if (!eScoreManager.getDbconnection().getAccount().getPermission().equals("bursary")
                && !eScoreManager.getDbconnection().getAccount().getPermission().equals("admin")) {
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpScore = new javax.swing.JScrollPane();
        tblScore = new javax.swing.JTable();
        pnlScoreInformation = new javax.swing.JPanel();
        lblScoreBatchID = new javax.swing.JLabel();
        lblScoreStudentID = new javax.swing.JLabel();
        lblScoreCourseID = new javax.swing.JLabel();
        lblScoreBatchName = new javax.swing.JLabel();
        lblScoreStudentName = new javax.swing.JLabel();
        lblScoreCourseName = new javax.swing.JLabel();
        lblScoreE_Test = new javax.swing.JLabel();
        lblScoreR_Test = new javax.swing.JLabel();
        lblETimes = new javax.swing.JLabel();
        lblRTimes = new javax.swing.JLabel();
        lblCurrentTimesE = new javax.swing.JLabel();
        lblCurrentTimesR = new javax.swing.JLabel();
        txtScoreBatchName = new javax.swing.JTextField();
        txtScoreStudentName = new javax.swing.JTextField();
        txtScoreCourseName = new javax.swing.JTextField();
        txtScoreE_Test = new javax.swing.JTextField();
        txtScoreR_Test = new javax.swing.JTextField();
        txtScoreTimesE = new javax.swing.JTextField();
        txtScoreTimesR = new javax.swing.JTextField();
        cbxScoreBatchID = new javax.swing.JComboBox();
        cbxScoreStudentID = new javax.swing.JComboBox();
        cbxScoreCourseID = new javax.swing.JComboBox();
        txtScoreCurrentTimesE = new javax.swing.JTextField();
        txtScoreCurrentTimesR = new javax.swing.JTextField();
        lblScoreProgramName = new javax.swing.JLabel();
        txtScoreProgramName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtScorePhone = new javax.swing.JTextField();
        txtScoreTotalHours = new javax.swing.JTextField();
        btnScoreAdd = new javax.swing.JButton();
        btnScoreUpdate = new javax.swing.JButton();
        btnScoreDelete = new javax.swing.JButton();
        btnScoreReset = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 480));

        scpScore.setBorder(javax.swing.BorderFactory.createTitledBorder("Recent Activity"));

        tblScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scpScore.setViewportView(tblScore);

        pnlScoreInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Score Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 204))); // NOI18N

        lblScoreBatchID.setText("Batch ID");

        lblScoreStudentID.setText("Student ID");

        lblScoreCourseID.setText("Course ID");

        lblScoreBatchName.setText("Batch Name");

        lblScoreStudentName.setText("Student Name");

        lblScoreCourseName.setText("Course Name");

        lblScoreE_Test.setText("E-Test");

        lblScoreR_Test.setText("R-Test");

        lblETimes.setText("Times");

        lblRTimes.setText("Times");

        lblCurrentTimesE.setText("Current Times");

        lblCurrentTimesR.setText("Current Times");

        txtScoreBatchName.setEditable(false);

        txtScoreStudentName.setEditable(false);

        txtScoreCourseName.setEditable(false);

        cbxScoreBatchID.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxScoreBatchIDPopupMenuWillBecomeVisible(evt);
            }
        });
        cbxScoreBatchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxScoreBatchIDActionPerformed(evt);
            }
        });

        cbxScoreStudentID.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxScoreStudentIDPopupMenuWillBecomeVisible(evt);
            }
        });
        cbxScoreStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxScoreStudentIDActionPerformed(evt);
            }
        });

        cbxScoreCourseID.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxScoreCourseIDPopupMenuWillBecomeVisible(evt);
            }
        });
        cbxScoreCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxScoreCourseIDActionPerformed(evt);
            }
        });

        txtScoreCurrentTimesE.setEnabled(false);

        txtScoreCurrentTimesR.setEnabled(false);

        lblScoreProgramName.setText("Program");

        txtScoreProgramName.setEditable(false);

        jLabel1.setText("Phone");

        jLabel2.setText("Total Hours");

        txtScorePhone.setEditable(false);

        txtScoreTotalHours.setEditable(false);

        javax.swing.GroupLayout pnlScoreInformationLayout = new javax.swing.GroupLayout(pnlScoreInformation);
        pnlScoreInformation.setLayout(pnlScoreInformationLayout);
        pnlScoreInformationLayout.setHorizontalGroup(
            pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScoreInformationLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlScoreInformationLayout.createSequentialGroup()
                        .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScoreCourseID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblScoreStudentID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblScoreBatchID, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(21, 21, 21)
                        .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxScoreCourseID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbxScoreStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxScoreBatchID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScoreBatchName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblScoreStudentName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblScoreCourseName, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(lblScoreE_Test)
                    .addComponent(lblScoreR_Test))
                .addGap(0, 34, Short.MAX_VALUE)
                .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlScoreInformationLayout.createSequentialGroup()
                        .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtScoreCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtScoreBatchName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtScoreStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScoreProgramName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(pnlScoreInformationLayout.createSequentialGroup()
                        .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlScoreInformationLayout.createSequentialGroup()
                                .addComponent(txtScoreR_Test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblRTimes))
                            .addGroup(pnlScoreInformationLayout.createSequentialGroup()
                                .addComponent(txtScoreE_Test, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblETimes)))
                        .addGap(33, 33, 33)
                        .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtScoreTimesE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtScoreTimesR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)))
                .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlScoreInformationLayout.createSequentialGroup()
                        .addComponent(lblCurrentTimesR)
                        .addGap(43, 43, 43)
                        .addComponent(txtScoreCurrentTimesR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlScoreInformationLayout.createSequentialGroup()
                            .addComponent(lblCurrentTimesE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtScoreCurrentTimesE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtScoreProgramName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtScorePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtScoreTotalHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pnlScoreInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtScoreBatchName, txtScoreCourseName, txtScorePhone, txtScoreProgramName, txtScoreStudentName, txtScoreTotalHours});

        pnlScoreInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtScoreCurrentTimesE, txtScoreCurrentTimesR, txtScoreE_Test, txtScoreR_Test, txtScoreTimesE, txtScoreTimesR});

        pnlScoreInformationLayout.setVerticalGroup(
            pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScoreInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblScoreBatchID)
                    .addComponent(cbxScoreBatchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScoreBatchName)
                    .addComponent(txtScoreBatchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScoreProgramName)
                    .addComponent(txtScoreProgramName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtScorePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtScoreStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScoreStudentName)
                    .addComponent(cbxScoreStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScoreStudentID))
                .addGap(18, 18, 18)
                .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtScoreCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScoreCourseName)
                    .addComponent(cbxScoreCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScoreCourseID)
                    .addComponent(txtScoreTotalHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtScoreE_Test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblScoreE_Test))
                    .addComponent(lblETimes)
                    .addComponent(txtScoreTimesE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentTimesE)
                    .addComponent(txtScoreCurrentTimesE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlScoreInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblScoreR_Test)
                    .addComponent(txtScoreR_Test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRTimes)
                    .addComponent(txtScoreTimesR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentTimesR)
                    .addComponent(txtScoreCurrentTimesR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlScoreInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxScoreBatchID, cbxScoreCourseID, cbxScoreStudentID, txtScoreBatchName, txtScoreCourseName, txtScorePhone, txtScoreProgramName, txtScoreStudentName, txtScoreTotalHours});

        pnlScoreInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtScoreCurrentTimesE, txtScoreCurrentTimesR, txtScoreE_Test, txtScoreR_Test, txtScoreTimesE, txtScoreTimesR});

        btnScoreAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnScoreAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnScoreAdd.setText("Add");
        btnScoreAdd.setBorderPainted(false);
        btnScoreAdd.setFocusPainted(false);
        btnScoreAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnScoreAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreAddActionPerformed(evt);
            }
        });

        btnScoreUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnScoreUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnScoreUpdate.setText("Update");
        btnScoreUpdate.setBorderPainted(false);
        btnScoreUpdate.setEnabled(false);
        btnScoreUpdate.setFocusPainted(false);
        btnScoreUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnScoreUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreUpdateActionPerformed(evt);
            }
        });

        btnScoreDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnScoreDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnScoreDelete.setText("Delete");
        btnScoreDelete.setBorderPainted(false);
        btnScoreDelete.setEnabled(false);
        btnScoreDelete.setFocusPainted(false);
        btnScoreDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnScoreDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreDeleteActionPerformed(evt);
            }
        });

        btnScoreReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnScoreReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnScoreReset.setText("Reset");
        btnScoreReset.setBorderPainted(false);
        btnScoreReset.setFocusPainted(false);
        btnScoreReset.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnScoreReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlScoreInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scpScore)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnScoreAdd)
                .addGap(40, 40, 40)
                .addComponent(btnScoreUpdate)
                .addGap(40, 40, 40)
                .addComponent(btnScoreDelete)
                .addGap(40, 40, 40)
                .addComponent(btnScoreReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnScoreAdd, btnScoreDelete, btnScoreReset, btnScoreUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(scpScore, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlScoreInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnScoreAdd)
                    .addComponent(btnScoreUpdate)
                    .addComponent(btnScoreDelete)
                    .addComponent(btnScoreReset))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void resetAllScore() {
        cbxScoreBatchID.setSelectedItem(null);
        cbxScoreStudentID.setSelectedItem(null);
        cbxScoreCourseID.setSelectedItem(null);
        cbxScoreStudentID.removeAllItems();
        cbxScoreCourseID.removeAllItems();
        txtScoreBatchName.setText(null);
        txtScoreCourseName.setText(null);
        txtScoreProgramName.setText(null);
        txtScoreStudentName.setText(null);
        txtScoreCurrentTimesE.setText(null);
        txtScoreCurrentTimesR.setText(null);
        txtScorePhone.setText(null);
        txtScoreTotalHours.setText(null);
        txtScoreE_Test.setText(null);
        txtScoreR_Test.setText(null);
        txtScoreTimesE.setText(null);
        txtScoreTimesR.setText(null);
        btnScoreAdd.setEnabled(true);
        btnScoreUpdate.setEnabled(false);
        btnScoreDelete.setEnabled(false);
    }

    public boolean checkField() {
        if ((cbxScoreBatchID.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "Un-select BatchID !");
            cbxScoreBatchID.requestFocus();
            return false;
        } else if ((cbxScoreStudentID.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "Un-select StudentID !");
            cbxScoreStudentID.requestFocus();
            return false;
        } else if ((cbxScoreCourseID.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "Un-select CourseID !");
            cbxScoreCourseID.requestFocus();
            return false;
        } else if ((txtScoreE_Test.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter E-Test !");
            txtScoreE_Test.requestFocus();
            return false;
        } else if ((txtScoreR_Test.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter R-Test !");
            txtScoreR_Test.requestFocus();
            return false;
        } else if ((txtScoreTimesE.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Times!");
            txtScoreTimesE.requestFocus();
            return false;
        } else if ((txtScoreTimesR.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Times !");
            txtScoreTimesR.requestFocus();
            return false;
        } else {
            JOptionPane.showMessageDialog(this, "Complete !");
        }
        return true;
    }

    public void loadScore(String studentID, String courseID) {
        String[] arr = this.eScoreManager.loadScore(studentID, courseID);
        if (arr != null) {
            txtScoreE_Test.setText(arr[0]);
            txtScoreR_Test.setText(arr[2]);
            txtScoreCurrentTimesE.setText(arr[1]);
            txtScoreCurrentTimesR.setText(arr[3]);
            btnScoreAdd.setEnabled(false);
            btnScoreUpdate.setEnabled(true);
            btnScoreDelete.setEnabled(true);
        } else {
            txtScoreE_Test.setText("");
            txtScoreR_Test.setText("");
            txtScoreTimesE.setText("");
            txtScoreTimesR.setText("");
            txtScoreCurrentTimesE.setText("");
            txtScoreCurrentTimesR.setText("");
            btnScoreAdd.setEnabled(true);
            btnScoreUpdate.setEnabled(false);
            btnScoreDelete.setEnabled(false);
        }
    }
    private void btnScoreResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreResetActionPerformed
        this.resetAllScore();
    }//GEN-LAST:event_btnScoreResetActionPerformed

    private void btnScoreAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreAddActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkField()) {
            String studentID = cbxScoreStudentID.getSelectedItem().toString();
            String courseID = cbxScoreCourseID.getSelectedItem().toString();
            String[] arr = eScoreManager.addScore(studentID, courseID, txtScoreE_Test.getText(), txtScoreTimesE.getText(), txtScoreR_Test.getText(), txtScoreTimesR.getText());
            if (arr != null) {
                tableModelTimeTable.addRow(arr);
                resetAllScore();
            }
        }
    }//GEN-LAST:event_btnScoreAddActionPerformed

    private void cbxScoreBatchIDPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxScoreBatchIDPopupMenuWillBecomeVisible
        DefaultComboBoxModel batchID = eScoreManager.loadBatchID();
        cbxScoreBatchID.setModel(batchID);
        resetAllScore();
    }//GEN-LAST:event_cbxScoreBatchIDPopupMenuWillBecomeVisible

    private void cbxScoreStudentIDPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxScoreStudentIDPopupMenuWillBecomeVisible
        if (cbxScoreBatchID.getSelectedItem() == null) {
            cbxScoreStudentID.setModel(eScoreManager.loadStudentID("All"));
        }
    }//GEN-LAST:event_cbxScoreStudentIDPopupMenuWillBecomeVisible

    private void cbxScoreCourseIDPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxScoreCourseIDPopupMenuWillBecomeVisible
        if (cbxScoreBatchID.getSelectedItem() == null) {
            cbxScoreCourseID.setModel(eScoreManager.loadCourseID("All"));
        }
    }//GEN-LAST:event_cbxScoreCourseIDPopupMenuWillBecomeVisible

    private void cbxScoreStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxScoreStudentIDActionPerformed
        if (cbxScoreStudentID.getSelectedItem() != null) {
            loadStudent((String) cbxScoreStudentID.getSelectedItem());
        }
        if (cbxScoreCourseID.getSelectedItem() != null
                && cbxScoreStudentID.getSelectedItem() != null) {
            loadScore(cbxScoreStudentID.getSelectedItem().toString(), cbxScoreCourseID.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbxScoreStudentIDActionPerformed

    private void cbxScoreCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxScoreCourseIDActionPerformed
        if (cbxScoreCourseID.getSelectedItem() != null) {
            loadCourse((String) cbxScoreCourseID.getSelectedItem());
        }
        if (cbxScoreCourseID.getSelectedItem() != null
                && cbxScoreStudentID.getSelectedItem() != null) {
            loadScore(cbxScoreStudentID.getSelectedItem().toString(), cbxScoreCourseID.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbxScoreCourseIDActionPerformed

    private void cbxScoreBatchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxScoreBatchIDActionPerformed
        loadBatchID((String) cbxScoreBatchID.getSelectedItem());
        cbxScoreStudentID.setSelectedItem(null);
        cbxScoreCourseID.setSelectedItem(null);
        txtScoreStudentName.setText("");
        txtScorePhone.setText("");
        txtScoreCourseName.setText("");
        txtScoreTotalHours.setText("");
    }//GEN-LAST:event_cbxScoreBatchIDActionPerformed

    private void btnScoreUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreUpdateActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        String studentID = cbxScoreStudentID.getSelectedItem().toString();
        String courseID = cbxScoreCourseID.getSelectedItem().toString();
        String[] arr = eScoreManager.updScore(studentID, courseID, txtScoreE_Test.getText(), txtScoreTimesE.getText(), txtScoreR_Test.getText(), txtScoreTimesR.getText());
        if (arr != null) {
            tableModelTimeTable.addRow(arr);
            resetAllScore();
        }
    }//GEN-LAST:event_btnScoreUpdateActionPerformed

    private void btnScoreDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreDeleteActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        JOptionPane.showMessageDialog(null, "Over time!");
    }//GEN-LAST:event_btnScoreDeleteActionPerformed

    public void loadBatchID(String valueID) {
        String[] arr = eScoreManager.loadBatchInformation(valueID);
        if (arr != null) {
            txtScoreBatchName.setText(arr[0]);
            txtScoreProgramName.setText(arr[1]);
            cbxScoreStudentID.setModel(eScoreManager.loadStudentID(valueID));
            cbxScoreCourseID.setModel(eScoreManager.loadCourseID(arr[2]));
        }
    }

    public void loadStudent(String valueID) {
        String[] arr = eScoreManager.loadStudentInformation(valueID);
        if (arr != null) {
            txtScoreStudentName.setText(arr[0]);
            txtScorePhone.setText(arr[1]);
        }
    }

    public void loadCourse(String valueID) {
        String[] arr = eScoreManager.loadCourseInformation(valueID);
        if (arr != null) {
            txtScoreCourseName.setText(arr[0]);
            txtScoreTotalHours.setText(arr[1]);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnScoreAdd;
    private javax.swing.JButton btnScoreDelete;
    private javax.swing.JButton btnScoreReset;
    private javax.swing.JButton btnScoreUpdate;
    private javax.swing.JComboBox cbxScoreBatchID;
    private javax.swing.JComboBox cbxScoreCourseID;
    private javax.swing.JComboBox cbxScoreStudentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCurrentTimesE;
    private javax.swing.JLabel lblCurrentTimesR;
    private javax.swing.JLabel lblETimes;
    private javax.swing.JLabel lblRTimes;
    private javax.swing.JLabel lblScoreBatchID;
    private javax.swing.JLabel lblScoreBatchName;
    private javax.swing.JLabel lblScoreCourseID;
    private javax.swing.JLabel lblScoreCourseName;
    private javax.swing.JLabel lblScoreE_Test;
    private javax.swing.JLabel lblScoreProgramName;
    private javax.swing.JLabel lblScoreR_Test;
    private javax.swing.JLabel lblScoreStudentID;
    private javax.swing.JLabel lblScoreStudentName;
    private javax.swing.JPanel pnlScoreInformation;
    private javax.swing.JScrollPane scpScore;
    private javax.swing.JTable tblScore;
    private javax.swing.JTextField txtScoreBatchName;
    private javax.swing.JTextField txtScoreCourseName;
    private javax.swing.JTextField txtScoreCurrentTimesE;
    private javax.swing.JTextField txtScoreCurrentTimesR;
    private javax.swing.JTextField txtScoreE_Test;
    private javax.swing.JTextField txtScorePhone;
    private javax.swing.JTextField txtScoreProgramName;
    private javax.swing.JTextField txtScoreR_Test;
    private javax.swing.JTextField txtScoreStudentName;
    private javax.swing.JTextField txtScoreTimesE;
    private javax.swing.JTextField txtScoreTimesR;
    private javax.swing.JTextField txtScoreTotalHours;
    // End of variables declaration//GEN-END:variables
}
