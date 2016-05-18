package gui;

import functions.BursaryScheduleManager;
import functions.ValidateData;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BursarySchedulePanel extends javax.swing.JPanel {

    private BursaryScheduleManager eScheduleManager;
    private DefaultTableModel tableModelLab;
    private DefaultTableModel tableModelTimeTable;

    public void seteScheduleManager(BursaryScheduleManager eScheduleManager) {
        this.eScheduleManager = eScheduleManager;
    }

    public BursarySchedulePanel() {
        initComponents();
        myInitializeLab();
        myInitializeTimeTable();
    }

    private boolean checkPermission() {
        if (!eScheduleManager.getDbConnection().getAccount().getPermission().equals("bursary")
                && !eScheduleManager.getDbConnection().getAccount().getPermission().equals("admin")) {
            return false;
        }
        return true;
    }

    public void myInitializeLab() {
        String[] columnName = new String[]{"Lab ID", "Lab Name", " Status", "Action"};
        tableModelLab = new DefaultTableModel(null, columnName);
        tblLab.setModel(tableModelLab);
    }

    public void myInitializeTimeTable() {
        String[] columnName = new String[]{"ID", "Start Date", "End Date", "Batch", "Duration", "Timing", "Lab", "Course", "Faculty", "Note", "Action"};
        tableModelTimeTable = new DefaultTableModel(null, columnName);
        tblTimetable.setModel(tableModelTimeTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLabInformation = new javax.swing.JPanel();
        lblLabID = new javax.swing.JLabel();
        txtLabID = new javax.swing.JTextField();
        lblLabName = new javax.swing.JLabel();
        txtLabName = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnLabInformation_Add = new javax.swing.JButton();
        btnLabInformation_Update = new javax.swing.JButton();
        btnLabInformation_Delete = new javax.swing.JButton();
        scpLab = new javax.swing.JScrollPane();
        tblLab = new javax.swing.JTable();
        pnlTimetableInformation = new javax.swing.JPanel();
        lblTimetableID = new javax.swing.JLabel();
        lblStartdate = new javax.swing.JLabel();
        lblEnddate = new javax.swing.JLabel();
        lblBatch = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblTiming = new javax.swing.JLabel();
        lblLab = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        lblFaculty = new javax.swing.JLabel();
        txtTimetableID = new javax.swing.JTextField();
        txtStartdate = new javax.swing.JTextField();
        txtEnddate = new javax.swing.JTextField();
        lblNote = new javax.swing.JLabel();
        txtNote = new javax.swing.JTextField();
        cbxLab = new javax.swing.JComboBox();
        cbxBatch = new javax.swing.JComboBox();
        cbxDuration = new javax.swing.JComboBox();
        cbxTiming = new javax.swing.JComboBox();
        cbxCourse = new javax.swing.JComboBox();
        cbxFaculty = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        scpTimetable = new javax.swing.JScrollPane();
        tblTimetable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(900, 480));

        pnlLabInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Lab Information"));

        lblLabID.setText("ID");

        txtLabID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabIDActionPerformed(evt);
            }
        });
        txtLabID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLabIDKeyReleased(evt);
            }
        });

        lblLabName.setText("Name");

        lblStatus.setText("Status");

        btnLabInformation_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add16.png"))); // NOI18N
        btnLabInformation_Add.setText("Add");
        btnLabInformation_Add.setBorderPainted(false);
        btnLabInformation_Add.setFocusPainted(false);
        btnLabInformation_Add.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLabInformation_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabInformation_AddActionPerformed(evt);
            }
        });

        btnLabInformation_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnLabInformation_Update.setText("Update");
        btnLabInformation_Update.setBorderPainted(false);
        btnLabInformation_Update.setEnabled(false);
        btnLabInformation_Update.setFocusPainted(false);
        btnLabInformation_Update.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLabInformation_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabInformation_UpdateActionPerformed(evt);
            }
        });

        btnLabInformation_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete16.png"))); // NOI18N
        btnLabInformation_Delete.setText("Delete");
        btnLabInformation_Delete.setBorderPainted(false);
        btnLabInformation_Delete.setEnabled(false);
        btnLabInformation_Delete.setFocusPainted(false);
        btnLabInformation_Delete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLabInformation_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabInformation_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLabInformationLayout = new javax.swing.GroupLayout(pnlLabInformation);
        pnlLabInformation.setLayout(pnlLabInformationLayout);
        pnlLabInformationLayout.setHorizontalGroup(
            pnlLabInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLabInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLabInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLabID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLabName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(pnlLabInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLabName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLabID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlLabInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLabInformation_Add)
                    .addComponent(btnLabInformation_Update)
                    .addComponent(btnLabInformation_Delete))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlLabInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtLabID, txtLabName, txtStatus});

        pnlLabInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLabInformation_Add, btnLabInformation_Delete, btnLabInformation_Update});

        pnlLabInformationLayout.setVerticalGroup(
            pnlLabInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLabInformationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLabInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnLabInformation_Add)
                    .addComponent(txtLabID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLabID))
                .addGap(14, 14, 14)
                .addGroup(pnlLabInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnLabInformation_Update)
                    .addComponent(txtLabName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLabName))
                .addGap(14, 14, 14)
                .addGroup(pnlLabInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnLabInformation_Delete)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus)))
        );

        pnlLabInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtLabID, txtLabName, txtStatus});

        pnlLabInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLabInformation_Add, btnLabInformation_Delete, btnLabInformation_Update});

        scpLab.setBorder(javax.swing.BorderFactory.createTitledBorder("Recent Activity"));

        tblLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
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
        scpLab.setViewportView(tblLab);

        pnlTimetableInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Timetable Information"));

        lblTimetableID.setText("ID");

        lblStartdate.setText("Start Date");

        lblEnddate.setText("End Date");

        lblBatch.setText("Batch");

        lblDuration.setText("Duration");

        lblTiming.setText("Timing");

        lblLab.setText("Lab");

        lblCourse.setText("Course");

        lblFaculty.setText("Faculty");

        txtTimetableID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimetableIDActionPerformed(evt);
            }
        });
        txtTimetableID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimetableIDKeyReleased(evt);
            }
        });

        lblNote.setText("Note");

        cbxLab.setSelectedItem(null);
        cbxLab.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxLabPopupMenuWillBecomeVisible(evt);
            }
        });

        cbxBatch.setEditable(true);
        cbxBatch.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxBatchPopupMenuWillBecomeVisible(evt);
            }
        });
        cbxBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBatchActionPerformed(evt);
            }
        });

        cbxDuration.setEditable(true);
        cbxDuration.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning 2-4-6", "Morning 3-5-7", "Afternoon 2-4-6", "Afternoon 3-5-7", "Evening 2-4-6", "Evening 3-5-7" }));
        cbxDuration.setSelectedItem(null);

        cbxTiming.setEditable(true);
        cbxTiming.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Session 1", "Session 2", "Session 1-2" }));
        cbxTiming.setSelectedItem(null);

        cbxCourse.setEditable(true);
        cbxCourse.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxCoursePopupMenuWillBecomeVisible(evt);
            }
        });

        cbxFaculty.setEditable(true);
        cbxFaculty.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cbxFacultyPopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout pnlTimetableInformationLayout = new javax.swing.GroupLayout(pnlTimetableInformation);
        pnlTimetableInformation.setLayout(pnlTimetableInformationLayout);
        pnlTimetableInformationLayout.setHorizontalGroup(
            pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimetableInformationLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTimetableID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStartdate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEnddate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimetableID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBatch, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDuration, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTiming, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxBatch, 0, 126, Short.MAX_VALUE)
                    .addComponent(cbxDuration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxTiming, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCourse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFaculty, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxFaculty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxLab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(lblNote)
                .addGap(20, 20, 20)
                .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pnlTimetableInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEnddate, txtNote, txtStartdate, txtTimetableID});

        pnlTimetableInformationLayout.setVerticalGroup(
            pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimetableInformationLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTimetableID)
                    .addComponent(txtTimetableID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBatch)
                    .addComponent(lblLab)
                    .addComponent(cbxLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNote)
                    .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtStartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuration)
                    .addComponent(lblStartdate)
                    .addComponent(lblCourse)
                    .addComponent(cbxDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlTimetableInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblFaculty)
                    .addComponent(lblTiming)
                    .addComponent(txtEnddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnddate)
                    .addComponent(cbxTiming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlTimetableInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxLab, txtEnddate, txtNote, txtStartdate, txtTimetableID});

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

        scpTimetable.setBorder(javax.swing.BorderFactory.createTitledBorder("Recent Activity"));

        tblTimetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scpTimetable.setViewportView(tblTimetable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnAdd)
                        .addGap(40, 40, 40)
                        .addComponent(btnUpdate)
                        .addGap(40, 40, 40)
                        .addComponent(btnDelete)
                        .addGap(40, 40, 40)
                        .addComponent(btnClear)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlTimetableInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scpTimetable)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlLabInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(scpLab, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnClear, btnDelete, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLabInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scpLab, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(scpTimetable, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTimetableInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addGap(11, 11, 11))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnClear, btnDelete, btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    public void resetAll() {
        txtLabID.setText(null);
        txtLabName.setText(null);
        txtStatus.setText(null);
        txtTimetableID.setText(null);
        cbxLab.setSelectedItem(null);
        txtStartdate.setText(null);
        txtEnddate.setText(null);
        cbxBatch.setSelectedItem(null);
        cbxDuration.setSelectedItem(null);
        cbxTiming.setSelectedItem(null);
        cbxCourse.setSelectedItem(null);
        cbxFaculty.setSelectedItem(null);
        txtNote.setText(null);
    }

    public boolean checkFieldLab() {
        if ((txtLabID.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Lab ID !");
            txtLabID.requestFocus();
            return false;
        } else if ((txtLabName.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Lab Name !");
            txtLabName.requestFocus();
            return false;
        } else if ((txtStatus.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Status !");
            txtStatus.requestFocus();
            return false;
        }
        return true;
    }

    public void loadLab(String valueID) {
        Object[] objArray = eScheduleManager.loadLab(valueID);
        if (objArray != null) {
            resetAll();
            txtLabID.setText(valueID);
            txtLabName.setText(objArray[0].toString());
            txtStatus.setText(objArray[1].toString());
            btnLabInformation_Add.setEnabled(false);
            btnLabInformation_Update.setEnabled(true);
            btnLabInformation_Delete.setEnabled(true);
        }
    }

    public void loadCourseFromBatchName(String valueID) {
        Vector objArray = eScheduleManager.loadProgramIDFromBatch(valueID);
        if (objArray != null) {
            cbxBatch.setSelectedItem(valueID);
            DefaultComboBoxModel mm = new DefaultComboBoxModel(objArray);
            cbxCourse.setModel(mm);
            cbxCourse.setSelectedItem(null);

        }
    }

    public void loadTimetable(String valueID) {
        Object[] objArray = eScheduleManager.loadTimetable(valueID);
        if (objArray != null) {
            resetAll();
            txtTimetableID.setText(valueID);
            txtStartdate.setText(objArray[0].toString());
            txtEnddate.setText(objArray[1].toString());
            cbxBatch.setSelectedItem(objArray[2].toString());
            cbxDuration.setSelectedItem(objArray[3].toString());
            cbxTiming.setSelectedItem(objArray[4].toString());
            if (objArray[5] != null) {
                DefaultComboBoxModel lab = eScheduleManager.loadLabID();
                cbxLab.setModel(lab);
                cbxLab.setSelectedItem(objArray[5]);
            }
            cbxCourse.setSelectedItem(objArray[6].toString());
            cbxFaculty.setSelectedItem(objArray[7].toString());
            txtNote.setText(objArray[8].toString());
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        }
    }

    public boolean checkFieldTimeTable() {
        if ((txtTimetableID.getText()).equals("")) {
            JOptionPane.showMessageDialog(this, "Un-enter Time Table ID !");
            txtTimetableID.requestFocus();
            return false;
        } else if (!(ValidateData.checkDate(txtStartdate.getText()))) {
            JOptionPane.showMessageDialog(null, "Invalid Start Date ! !");
            txtStartdate.requestFocus();
            return false;
        } else if (!(ValidateData.checkDate(txtEnddate.getText()))) {
            JOptionPane.showMessageDialog(null, "Invalid End Date ! !");
            txtEnddate.requestFocus();
            return false;
        } else if ((cbxBatch.getSelectedItem() == null)) {
            JOptionPane.showMessageDialog(this, "Un-enter Batch !");
            cbxBatch.requestFocus();
            return false;
        } else if ((cbxDuration.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "Un-enter Duration !");
            cbxDuration.requestFocus();
            return false;
        } else if ((cbxTiming.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "Un-enter Timing !");
            cbxTiming.requestFocus();
            return false;
        } else if ((cbxCourse.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "Un-enter Course !");
            cbxCourse.requestFocus();
            return false;
        } else if ((cbxFaculty.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "Un-enter Faculty !");
            cbxFaculty.requestFocus();
            return false;
        } else if ((txtNote.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Un-enter Note !");
            txtNote.requestFocus();
            return false;
        }
        return true;

    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkFieldTimeTable()) {
            String timetableID = txtTimetableID.getText().trim();
            String startDate = txtStartdate.getText().trim();
            String endDate = txtEnddate.getText().trim();
            Object batch = cbxBatch.getSelectedItem();
            Object duration = cbxDuration.getSelectedItem();
            Object timing = cbxTiming.getSelectedItem();
            Object lab = cbxLab.getSelectedItem();
            Object course = cbxCourse.getSelectedItem();
            Object faculty = cbxFaculty.getSelectedItem();
            String note = txtNote.getText().trim();
            Object[] addTimetable = eScheduleManager.addTimetable(timetableID, startDate, endDate, batch, duration, timing, lab, course, faculty, note);
            if (addTimetable != null) {
                tableModelTimeTable.addRow(addTimetable);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        resetAll();
    }//GEN-LAST:event_btnClearActionPerformed

    private void cbxLabPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxLabPopupMenuWillBecomeVisible
        DefaultComboBoxModel lab = eScheduleManager.loadLabID();
        cbxLab.setModel(lab);
        cbxLab.setSelectedItem(null);
    }//GEN-LAST:event_cbxLabPopupMenuWillBecomeVisible

    private void txtLabIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabIDActionPerformed
        loadLab(txtLabID.getText());
    }//GEN-LAST:event_txtLabIDActionPerformed

    private void txtLabIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLabIDKeyReleased
        String labID = txtLabID.getText();
        if (eScheduleManager.checkExistRecordLabID(labID)) {
            btnLabInformation_Add.setEnabled(false);
            btnLabInformation_Update.setEnabled(true);
            btnLabInformation_Delete.setEnabled(true);
        } else {
            btnLabInformation_Update.setEnabled(false);
            btnLabInformation_Delete.setEnabled(false);
            btnLabInformation_Add.setEnabled(true);
        }
    }//GEN-LAST:event_txtLabIDKeyReleased

    private void btnLabInformation_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabInformation_AddActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkFieldLab()) {
            String labID = txtLabID.getText().trim();
            String labName = txtLabName.getText().trim();
            String status = txtStatus.getText().trim();
            Object[] addLab = eScheduleManager.addLab(labID, labName, status);
            if (addLab != null) {
                tableModelLab.addRow(addLab);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnLabInformation_AddActionPerformed

    private void btnLabInformation_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabInformation_UpdateActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkFieldLab()) {
            String labID = txtLabID.getText().trim();
            String labName = txtLabName.getText().trim();
            String status = txtStatus.getText().trim();

            Object[] updateLab = eScheduleManager.updateLab(labID, labName, status);
            if (updateLab != null) {
                tableModelLab.addRow(updateLab);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnLabInformation_UpdateActionPerformed

    private void btnLabInformation_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabInformation_DeleteActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkFieldLab()) {
            String labID = txtLabID.getText().trim();
            String labName = txtLabName.getText().trim();
            String status = txtStatus.getText().trim();
            Object[] deleteLab = eScheduleManager.deleteLab(labID, labName, status);
            if (deleteLab != null) {
                tableModelLab.addRow(deleteLab);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnLabInformation_DeleteActionPerformed

    private void txtTimetableIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimetableIDActionPerformed
        loadTimetable(txtTimetableID.getText());
    }//GEN-LAST:event_txtTimetableIDActionPerformed

    private void txtTimetableIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimetableIDKeyReleased
        String timetableID = txtTimetableID.getText();

        if (eScheduleManager.checkExistRecordTimetableID(timetableID)) {
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        } else {
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnAdd.setEnabled(true);
        }
    }//GEN-LAST:event_txtTimetableIDKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkFieldTimeTable()) {
            String timetableID = txtTimetableID.getText().trim();
            String startDate = txtStartdate.getText().trim();
            String endDate = txtEnddate.getText().trim();
            Object batch = cbxBatch.getSelectedItem();
            Object duration = cbxDuration.getSelectedItem();
            Object timing = cbxTiming.getSelectedItem();
            Object lab = cbxLab.getSelectedItem();
            Object course = cbxCourse.getSelectedItem();
            Object faculty = cbxFaculty.getSelectedItem();
            String note = txtNote.getText().trim();

            Object[] updateTimetable = eScheduleManager.updateTimetable(timetableID, startDate, endDate, batch, duration, timing, lab, course, faculty, note);
            if (updateTimetable != null) {
                tableModelTimeTable.addRow(updateTimetable);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!checkPermission()) {
            JOptionPane.showMessageDialog(null, "You do not have permission!", "Access is denied", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/images/lock.jpg"));
            return;
        }
        if (checkFieldTimeTable()) {
            String timetableID = txtTimetableID.getText().trim();
            String startDate = txtStartdate.getText().trim();
            String endDate = txtEnddate.getText().trim();
            Object batch = cbxBatch.getSelectedItem();
            Object duration = cbxDuration.getSelectedItem();
            Object timing = cbxTiming.getSelectedItem();
            Object lab = cbxLab.getSelectedItem();
            Object course = cbxCourse.getSelectedItem();
            Object faculty = cbxFaculty.getSelectedItem();
            String note = txtNote.getText().trim();
            Object[] deleteTimetable = eScheduleManager.deleteTimetable(timetableID, startDate, endDate, batch, duration, timing, lab, course, faculty, note);
            if (deleteTimetable != null) {
                tableModelTimeTable.addRow(deleteTimetable);
                resetAll();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cbxBatchPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxBatchPopupMenuWillBecomeVisible
        DefaultComboBoxModel batch = eScheduleManager.loadBatch();
        cbxBatch.setModel(batch);
        cbxBatch.setSelectedItem(null);
    }//GEN-LAST:event_cbxBatchPopupMenuWillBecomeVisible

    private void cbxCoursePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxCoursePopupMenuWillBecomeVisible
        cbxCourse.setSelectedItem(null);
    }//GEN-LAST:event_cbxCoursePopupMenuWillBecomeVisible

    private void cbxFacultyPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbxFacultyPopupMenuWillBecomeVisible
        DefaultComboBoxModel faculty = eScheduleManager.loadFaculty();
        cbxFaculty.setModel(faculty);
        cbxFaculty.setSelectedItem(null);
    }//GEN-LAST:event_cbxFacultyPopupMenuWillBecomeVisible

    private void cbxBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBatchActionPerformed
        loadCourseFromBatchName((String) cbxBatch.getSelectedItem());
    }//GEN-LAST:event_cbxBatchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLabInformation_Add;
    private javax.swing.JButton btnLabInformation_Delete;
    private javax.swing.JButton btnLabInformation_Update;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbxBatch;
    private javax.swing.JComboBox cbxCourse;
    private javax.swing.JComboBox cbxDuration;
    private javax.swing.JComboBox cbxFaculty;
    private javax.swing.JComboBox cbxLab;
    private javax.swing.JComboBox cbxTiming;
    private javax.swing.JLabel lblBatch;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblEnddate;
    private javax.swing.JLabel lblFaculty;
    private javax.swing.JLabel lblLab;
    private javax.swing.JLabel lblLabID;
    private javax.swing.JLabel lblLabName;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblStartdate;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTimetableID;
    private javax.swing.JLabel lblTiming;
    private javax.swing.JPanel pnlLabInformation;
    private javax.swing.JPanel pnlTimetableInformation;
    private javax.swing.JScrollPane scpLab;
    private javax.swing.JScrollPane scpTimetable;
    private javax.swing.JTable tblLab;
    private javax.swing.JTable tblTimetable;
    private javax.swing.JTextField txtEnddate;
    private javax.swing.JTextField txtLabID;
    private javax.swing.JTextField txtLabName;
    private javax.swing.JTextField txtNote;
    private javax.swing.JTextField txtStartdate;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTimetableID;
    // End of variables declaration//GEN-END:variables
}
