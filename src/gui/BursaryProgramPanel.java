package gui;

import functions.BursaryProgramManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BursaryProgramPanel extends javax.swing.JPanel {

    private BursaryProgramManager eProgramManager;
    private DefaultTableModel tableModelProgram;
    private DefaultTableModel tableModelCourse;

    public void seteProgramManager(BursaryProgramManager eProgramManager) {
        this.eProgramManager = eProgramManager;
    }

    public BursaryProgramPanel() {
        initComponents();
        myInitialize();
    }

    private boolean checkPermission() {
        if (!eProgramManager.getDbConnection().getAccount().getPermission().equals("bursary")
                && !eProgramManager.getDbConnection().getAccount().getPermission().equals("admin")) {
            return false;
        }
        return true;
    }

    public void myInitialize() {
        String[] columnName = new String[]{"Program ID", "Program Name", "Action"};
        tableModelProgram = new DefaultTableModel(null, columnName);
        tblProgram.setModel(tableModelProgram);
        String[] columCourse = new String[]{"Course ID", "Course Name", "Program ID", "Semester", "Theory Hours", "Lab Hours", "Action"};
        tableModelCourse = new DefaultTableModel(null, columCourse);
        tblCourse.setModel(tableModelCourse);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpProgram = new javax.swing.JScrollPane();
        tblProgram = new javax.swing.JTable();
        pnlProgramInformation = new javax.swing.JPanel();
        lblProgramInformation_ProgramID = new javax.swing.JLabel();
        lblProgramInformation_ProgramName = new javax.swing.JLabel();
        txtProgramInformation_ProgramID = new javax.swing.JTextField();
        txtProgramInformation_ProgramName = new javax.swing.JTextField();
        btnAdd_Program = new javax.swing.JButton();
        btnUpdate_Program = new javax.swing.JButton();
        btnDelete_Program = new javax.swing.JButton();
        scpCourse = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        pnlCourseInformation = new javax.swing.JPanel();
        lblCourseInformation_CourseID = new javax.swing.JLabel();
        lblCourseInformation_CourseName = new javax.swing.JLabel();
        txtCourseInformation_CourseID = new javax.swing.JTextField();
        txtCourseInformation_CourseName = new javax.swing.JTextField();
        lblCourseInformation_ProgramID = new javax.swing.JLabel();
        lblCourseInformation_Semester = new javax.swing.JLabel();
        txtCourseInformation_Semester = new javax.swing.JTextField();
        lblCourseInformation_TheoryHours = new javax.swing.JLabel();
        lblCourseInformation_LabHourHours = new javax.swing.JLabel();
        txtCourseInformation_TheoryHours = new javax.swing.JTextField();
        txtCourseInformation_LabHours = new javax.swing.JTextField();
        cbxProgram = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 480));

        scpProgram.setBorder(javax.swing.BorderFactory.createTitledBorder("Recent"));

        tblProgram.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scpProgram.setViewportView(tblProgram);

        pnlProgramInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Program Information"));

        lblProgramInformation_ProgramID.setText("ID");

        lblProgramInformation_ProgramName.setText("Name");

        txtProgramInformation_ProgramID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProgramInformation_ProgramIDActionPerformed(evt);
            }
        });
        txtProgramInformation_ProgramID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProgramInformation_ProgramIDKeyReleased(evt);
            }
        });

        btnAdd_Program.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add16.png"))); // NOI18N
        btnAdd_Program.setText("Add");
        btnAdd_Program.setBorderPainted(false);
        btnAdd_Program.setFocusPainted(false);
        btnAdd_Program.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdd_Program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_ProgramActionPerformed(evt);
            }
        });

        btnUpdate_Program.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnUpdate_Program.setText("Update");
        btnUpdate_Program.setBorderPainted(false);
        btnUpdate_Program.setEnabled(false);
        btnUpdate_Program.setFocusPainted(false);
        btnUpdate_Program.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdate_Program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_ProgramActionPerformed(evt);
            }
        });

        btnDelete_Program.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete16.png"))); // NOI18N
        btnDelete_Program.setText("Delete");
        btnDelete_Program.setBorderPainted(false);
        btnDelete_Program.setEnabled(false);
        btnDelete_Program.setFocusPainted(false);
        btnDelete_Program.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete_Program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_ProgramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProgramInformationLayout = new javax.swing.GroupLayout(pnlProgramInformation);
        pnlProgramInformation.setLayout(pnlProgramInformationLayout);
        pnlProgramInformationLayout.setHorizontalGroup(
            pnlProgramInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProgramInformationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlProgramInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProgramInformation_ProgramID)
                    .addComponent(lblProgramInformation_ProgramName))
                .addGap(37, 37, 37)
                .addGroup(pnlProgramInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProgramInformationLayout.createSequentialGroup()
                        .addComponent(txtProgramInformation_ProgramName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate_Program))
                    .addGroup(pnlProgramInformationLayout.createSequentialGroup()
                        .addComponent(txtProgramInformation_ProgramID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlProgramInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete_Program)
                            .addComponent(btnAdd_Program))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlProgramInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtProgramInformation_ProgramID, txtProgramInformation_ProgramName});

        pnlProgramInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd_Program, btnDelete_Program, btnUpdate_Program});

        pnlProgramInformationLayout.setVerticalGroup(
            pnlProgramInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProgramInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProgramInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProgramInformation_ProgramID)
                    .addComponent(txtProgramInformation_ProgramID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd_Program))
                .addGap(10, 10, 10)
                .addGroup(pnlProgramInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProgramInformation_ProgramName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProgramInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProgramInformation_ProgramName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate_Program)))
                .addGap(10, 10, 10)
                .addComponent(btnDelete_Program))
        );

        pnlProgramInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtProgramInformation_ProgramID, txtProgramInformation_ProgramName});

        pnlProgramInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd_Program, btnDelete_Program, btnUpdate_Program});

        scpCourse.setBorder(javax.swing.BorderFactory.createTitledBorder("Recent"));

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scpCourse.setViewportView(tblCourse);

        pnlCourseInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Information"));

        lblCourseInformation_CourseID.setText("Course ID");

        lblCourseInformation_CourseName.setText("Course Name");

        txtCourseInformation_CourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseInformation_CourseIDActionPerformed(evt);
            }
        });
        txtCourseInformation_CourseID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCourseInformation_CourseIDKeyReleased(evt);
            }
        });

        lblCourseInformation_ProgramID.setText("Program ID");

        lblCourseInformation_Semester.setText("Semester");

        lblCourseInformation_TheoryHours.setText("Theory Hours");

        lblCourseInformation_LabHourHours.setText("Lab Hours");

        cbxProgram.setSelectedItem(null);
        cbxProgram.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxProgramPopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout pnlCourseInformationLayout = new javax.swing.GroupLayout(pnlCourseInformation);
        pnlCourseInformation.setLayout(pnlCourseInformationLayout);
        pnlCourseInformationLayout.setHorizontalGroup(
            pnlCourseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCourseInformationLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlCourseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCourseInformation_CourseID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCourseInformation_CourseName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(pnlCourseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCourseInformation_CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseInformation_CourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnlCourseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCourseInformation_Semester, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCourseInformation_ProgramID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(pnlCourseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCourseInformation_Semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnlCourseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCourseInformation_TheoryHours, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCourseInformation_LabHourHours, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(pnlCourseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCourseInformation_LabHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseInformation_TheoryHours, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pnlCourseInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxProgram, txtCourseInformation_CourseID, txtCourseInformation_CourseName, txtCourseInformation_LabHours, txtCourseInformation_Semester, txtCourseInformation_TheoryHours});

        pnlCourseInformationLayout.setVerticalGroup(
            pnlCourseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCourseInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCourseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtCourseInformation_TheoryHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseInformation_TheoryHours)
                    .addComponent(cbxProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseInformation_ProgramID)
                    .addComponent(txtCourseInformation_CourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseInformation_CourseID))
                .addGap(20, 20, 20)
                .addGroup(pnlCourseInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblCourseInformation_CourseName)
                    .addComponent(txtCourseInformation_CourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseInformation_Semester)
                    .addComponent(txtCourseInformation_Semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseInformation_LabHourHours)
                    .addComponent(txtCourseInformation_LabHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlCourseInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxProgram, txtCourseInformation_CourseID, txtCourseInformation_CourseName, txtCourseInformation_LabHours, txtCourseInformation_Semester, txtCourseInformation_TheoryHours});

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setEnabled(false);
        btnUpdate.setFocusPainted(false);
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
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorderPainted(false);
        btnClear.setFocusPainted(false);
        btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlProgramInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scpProgram, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                    .addComponent(pnlCourseInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scpCourse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnAdd)
                        .addGap(40, 40, 40)
                        .addComponent(btnUpdate)
                        .addGap(40, 40, 40)
                        .addComponent(btnDelete)
                        .addGap(40, 40, 40)
                        .addComponent(btnClear)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnClear, btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlProgramInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scpProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCourseInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addGap(11, 11, 11))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnClear, btnDelete, btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private void txtProgramInformation_ProgramIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProgramInformation_ProgramIDActionPerformed
        loadProgram(txtProgramInformation_ProgramID.getText());
    }//GEN-LAST:event_txtProgramInformation_ProgramIDActionPerformed

    private void txtProgramInformation_ProgramIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProgramInformation_ProgramIDKeyReleased
        String programID = txtProgramInformation_ProgramID.getText();
        if (eProgramManager.checkExistRecordProgramID(programID)) {
            btnAdd_Program.setEnabled(false);
            btnUpdate_Program.setEnabled(true);
            btnDelete_Program.setEnabled(true);
        } else {
            btnUpdate_Program.setEnabled(false);
            btnDelete_Program.setEnabled(false);
            btnAdd_Program.setEnabled(true);
        }
    }//GEN-LAST:event_txtProgramInformation_ProgramIDKeyReleased

    private void btnAdd_ProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_ProgramActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkFieldProgram()) {
            String programID = txtProgramInformation_ProgramID.getText().trim();
            String programName = txtProgramInformation_ProgramName.getText().trim();

            Object[] objRow = eProgramManager.addProgram(programID, programName);
            if (objRow != null) {
                tableModelProgram.addRow(objRow);
                resetAll();
            }
        }

    }//GEN-LAST:event_btnAdd_ProgramActionPerformed

    private void btnUpdate_ProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_ProgramActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkFieldProgram()) {
            String programID = txtProgramInformation_ProgramID.getText().trim();
            String programName = txtProgramInformation_ProgramName.getText().trim();

            Object[] objRow = eProgramManager.updateProgram(programID, programName);
            if (objRow != null) {
                tableModelProgram.addRow(objRow);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnUpdate_ProgramActionPerformed

    private void btnDelete_ProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_ProgramActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        String programID = txtProgramInformation_ProgramID.getText().trim();
        String programName = txtProgramInformation_ProgramName.getText().trim();

        Object[] objRow = eProgramManager.deleteProgram(programID, programName);
        if (objRow != null) {
            tableModelProgram.addRow(objRow);
            resetAll();
        }
    }//GEN-LAST:event_btnDelete_ProgramActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkFieldCourse()) {
            String courseID = txtCourseInformation_CourseID.getText().trim();
            String courseName = txtCourseInformation_CourseName.getText().trim();
            Object programID = cbxProgram.getSelectedItem();
            String semester = txtCourseInformation_Semester.getText().trim();
            String theoryHours = txtCourseInformation_TheoryHours.getText().trim();
            String labHours = txtCourseInformation_LabHours.getText().trim();

            Object[] addCourse = eProgramManager.addCourse(courseID, courseName, programID, semester, theoryHours, labHours);
            if (addCourse != null) {
                tableModelCourse.addRow(addCourse);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkFieldCourse()) {
            String courseID = txtCourseInformation_CourseID.getText().trim();
            String courseName = txtCourseInformation_CourseName.getText().trim();
            Object programID = cbxProgram.getSelectedItem();
            String semester = txtCourseInformation_Semester.getText().trim();
            String theoryHours = txtCourseInformation_TheoryHours.getText().trim();
            String labHours = txtCourseInformation_LabHours.getText().trim();
            Object[] objRow = eProgramManager.updateCourse(courseID, courseName, programID, semester, theoryHours, labHours);
            if (objRow != null) {
                tableModelCourse.addRow(objRow);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        String courseID = txtCourseInformation_CourseID.getText().trim();
        String courseName = txtCourseInformation_CourseName.getText().trim();
        Object programID = cbxProgram.getSelectedItem();
        String semester = txtCourseInformation_Semester.getText().trim();
        String theoryHours = txtCourseInformation_TheoryHours.getText().trim();
        String labHours = txtCourseInformation_LabHours.getText().trim();

        Object[] objRow = eProgramManager.deleteCourse(courseID, courseName, programID, semester, theoryHours, labHours);
        if (objRow != null) {
            tableModelCourse.addRow(objRow);
            resetAll();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        resetAll();
    }//GEN-LAST:event_btnClearActionPerformed

    private void cbxProgramPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxProgramPopupMenuWillBecomeVisible
        DefaultComboBoxModel program = eProgramManager.loadProgramID();
        cbxProgram.setModel(program);
        cbxProgram.setSelectedItem(null);
    }//GEN-LAST:event_cbxProgramPopupMenuWillBecomeVisible

    private void txtCourseInformation_CourseIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCourseInformation_CourseIDKeyReleased
        String courseID = txtCourseInformation_CourseID.getText();

        if (eProgramManager.checkExistRecordCourseID(courseID)) {
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        } else {
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnAdd.setEnabled(true);
        }
    }//GEN-LAST:event_txtCourseInformation_CourseIDKeyReleased

    private void txtCourseInformation_CourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseInformation_CourseIDActionPerformed
        loadRecordCourse(txtCourseInformation_CourseID.getText());
    }//GEN-LAST:event_txtCourseInformation_CourseIDActionPerformed

    public void resetAll() {
        txtProgramInformation_ProgramID.setText(null);
        txtProgramInformation_ProgramName.setText(null);
        txtCourseInformation_CourseID.setText(null);
        txtCourseInformation_CourseName.setText(null);
        cbxProgram.setSelectedItem(null);
        txtCourseInformation_Semester.setText(null);
        txtCourseInformation_TheoryHours.setText(null);
        txtCourseInformation_LabHours.setText(null);
    }

    public boolean checkFieldProgram() {
        if ((txtProgramInformation_ProgramID.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Program ID !");
            txtProgramInformation_ProgramID.requestFocus();
            return false;
        } else if ((txtProgramInformation_ProgramName.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Program Name !");
            txtProgramInformation_ProgramName.requestFocus();
            return false;
        }
        return true;
    }

    public void loadProgram(String valueID) {
        String name = eProgramManager.loadProgram(valueID);
        resetAll();
        txtProgramInformation_ProgramID.setText(valueID);
        txtProgramInformation_ProgramName.setText(name);

        btnAdd_Program.setEnabled(false);
        btnUpdate_Program.setEnabled(true);
        btnDelete_Program.setEnabled(true);
    }

    public void loadRecordCourse(String valueID) {
        Object[] objArray = eProgramManager.loadCourse(valueID);
        if (objArray != null) {
            resetAll();
            txtCourseInformation_CourseID.setText(valueID);
            txtCourseInformation_CourseName.setText(objArray[0].toString());
            if (objArray[1] != null) {
                DefaultComboBoxModel program = eProgramManager.loadProgramID();
                cbxProgram.setModel(program);
                cbxProgram.setSelectedItem(objArray[1]);
            }
            if (objArray[2] == null) {
                txtCourseInformation_Semester.setText(null);
            } else {
                txtCourseInformation_Semester.setText(objArray[2].toString());
            }

            txtCourseInformation_TheoryHours.setText(objArray[3].toString());
            txtCourseInformation_LabHours.setText(objArray[4].toString());
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        }
    }

    public boolean checkFieldCourse() {
        if ((txtCourseInformation_CourseID.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Course ID !");
            txtCourseInformation_CourseID.requestFocus();
            return false;
        } else if ((txtCourseInformation_CourseName.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Course Name !");
            txtCourseInformation_CourseName.requestFocus();
            return false;
        } else if ((txtCourseInformation_TheoryHours.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Theory Hours !");
            txtCourseInformation_TheoryHours.requestFocus();
            return false;
        } else if ((txtCourseInformation_LabHours.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Lab Hours !");
            txtCourseInformation_LabHours.requestFocus();
            return false;

        }
        return true;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd_Program;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete_Program;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate_Program;
    private javax.swing.JComboBox cbxProgram;
    private javax.swing.JLabel lblCourseInformation_CourseID;
    private javax.swing.JLabel lblCourseInformation_CourseName;
    private javax.swing.JLabel lblCourseInformation_LabHourHours;
    private javax.swing.JLabel lblCourseInformation_ProgramID;
    private javax.swing.JLabel lblCourseInformation_Semester;
    private javax.swing.JLabel lblCourseInformation_TheoryHours;
    private javax.swing.JLabel lblProgramInformation_ProgramID;
    private javax.swing.JLabel lblProgramInformation_ProgramName;
    private javax.swing.JPanel pnlCourseInformation;
    private javax.swing.JPanel pnlProgramInformation;
    private javax.swing.JScrollPane scpCourse;
    private javax.swing.JScrollPane scpProgram;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTable tblProgram;
    private javax.swing.JTextField txtCourseInformation_CourseID;
    private javax.swing.JTextField txtCourseInformation_CourseName;
    private javax.swing.JTextField txtCourseInformation_LabHours;
    private javax.swing.JTextField txtCourseInformation_Semester;
    private javax.swing.JTextField txtCourseInformation_TheoryHours;
    private javax.swing.JTextField txtProgramInformation_ProgramID;
    private javax.swing.JTextField txtProgramInformation_ProgramName;
    // End of variables declaration//GEN-END:variables
}
