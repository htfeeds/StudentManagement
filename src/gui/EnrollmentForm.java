package gui;

import functions.BursaryProgramManager;
import functions.BursaryScheduleManager;
import functions.BursaryScoreManager;
import functions.DatabaseConnection;
import functions.EnrollmentBatchManager;
import functions.EnrollmentFacultyManager;
import functions.EnrollmentSearchManager;
import functions.EnrollmentStudentManager;
import functions.ImageHandle;
import functions.ProfileManager;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class EnrollmentForm extends javax.swing.JFrame {

    DatabaseConnection dbConnection;

    public EnrollmentForm() {
        initComponents();
    }

    private void myInitialize() {
        Timer tDateTime = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                DateFormat dateFormat = new SimpleDateFormat("E',' MMMM dd yyyy");
                DateFormat timeFormat = new SimpleDateFormat("H : mm : ss");
                lblDate.setText(dateFormat.format(date));
                txtTime.setText(timeFormat.format(date));
            }
        });
        tDateTime.start();
        lblAccountID.setText("ID: " + dbConnection.getAccount().getAccountID());
        lblUserName.setText(dbConnection.getAccount().getFullName());
        lblLastLogin.setText("Last login: " + dbConnection.getAccount().getLastLogin());
        long no;
        do {
            no = (long) (10 * Math.random());
        } while (no < 1 || no > 5);
        String bannerPath = "src/images/banner" + no + ".png";
        ImageHandle.setPicture(lblBanner, bannerPath);
        ImageHandle.setIcon(this, "src/images/enrollment.jpg");
        ImageHandle.setPicture(lblIcon, dbConnection.getAccount().getPath());
        txaReport.append("Welcome...\n");
    }

    public EnrollmentForm(DatabaseConnection dbConnection) {
        initComponents();
        this.dbConnection = dbConnection;
        myInitialize();
        pnlEnrollmentStudent.seteStudentManager(new EnrollmentStudentManager(this.dbConnection, txaReport));
        pnlEnrollmentBatch.seteBatchManager(new EnrollmentBatchManager(this.dbConnection, txaReport));
        pnlEnrollmentFaculty.seteFacultyManager(new EnrollmentFacultyManager(this.dbConnection, txaReport));
        pnlBursarySchedule.seteScheduleManager(new BursaryScheduleManager(this.dbConnection, txaReport));
        pnlBursaryProgram.seteProgramManager(new BursaryProgramManager(this.dbConnection, txaReport));
        pnlBursaryScore.seteScoreManager(new BursaryScoreManager(this.dbConnection, txaReport));
        pnlEnrollmentSearch.seteSearchManager(new EnrollmentSearchManager(this.dbConnection, txaReport));
        pnlProfile.setProfileManager(new ProfileManager(this.dbConnection, txaReport));
        pnlEnrollmentSearch.setAllParent(this);
    }

    public void loadFormUpdate(String tableUpdate, String valueID) {
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        switch (tableUpdate) {
            case "Student":
                btnStudent.setSelected(true);
                pnlEnrollmentStudent.loadRecord(valueID);
                c1.show(pnlBody, "Student");
                break;
            case "Batch":
                btnBatch.setSelected(true);
                pnlEnrollmentBatch.loadRecord(valueID);
                c1.show(pnlBody, "Batch");
                break;
            case "Faculty":
                btnFaculty.setSelected(true);
                pnlEnrollmentFaculty.loadRecord(valueID);
                c1.show(pnlBody, "Faculty");
                break;
            case "Account":
                btnStudent.setSelected(true);
                pnlEnrollmentStudent.loadAccount(valueID);
                c1.show(pnlBody, "Student");
                break;
            case "Program":
                btnProgram.setSelected(true);
                pnlBursaryProgram.loadProgram(valueID);
                c1.show(pnlBody, "Program");
                break;
            case "Timetable":
                btnSchedule.setSelected(true);
                pnlBursarySchedule.loadTimetable(valueID);
                c1.show(pnlBody, "Schedule");
                break;
            case "Score":
                btnScore.setSelected(true);
                //pnlBursaryScore.loadScore(valueID);
                c1.show(pnlBody, "Score");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMenu = new javax.swing.ButtonGroup();
        pnlBanner = new javax.swing.JPanel();
        lblAccountID = new javax.swing.JLabel();
        lblHi = new javax.swing.JLabel();
        lblLastLogin = new javax.swing.JLabel();
        lblBanner = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        tbrMenu = new javax.swing.JToolBar();
        btnStudent = new javax.swing.JToggleButton();
        btnBatch = new javax.swing.JToggleButton();
        btnFaculty = new javax.swing.JToggleButton();
        btnProgram = new javax.swing.JToggleButton();
        btnSchedule = new javax.swing.JToggleButton();
        btnScore = new javax.swing.JToggleButton();
        btnSearch = new javax.swing.JToggleButton();
        btnProfile = new javax.swing.JToggleButton();
        pnlBody = new javax.swing.JPanel();
        pnlWelcome = new gui.WelcomePanel();
        pnlEnrollmentStudent = new gui.EnrollmentStudentPanel();
        pnlEnrollmentBatch = new gui.EnrollmentBatchPanel();
        pnlEnrollmentFaculty = new gui.EnrollmentFacultyPanel();
        pnlBursaryProgram = new gui.BursaryProgramPanel();
        pnlBursarySchedule = new gui.BursarySchedulePanel();
        pnlBursaryScore = new gui.BursaryScorePanel();
        pnlEnrollmentSearch = new gui.EnrollmentSearchPanel();
        pnlProfile = new gui.ProfilePanel();
        pnlReport = new javax.swing.JPanel();
        scpReport = new javax.swing.JScrollPane();
        txaReport = new javax.swing.JTextArea();
        lblDate = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Welcome to Student Management Application");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlBanner.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblAccountID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAccountID.setText("A10000000");

        lblHi.setText("Hi,");

        lblLastLogin.setText("Last login: 21-10-2014");

        lblIcon.setPreferredSize(new java.awt.Dimension(24, 24));

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 0, 204));
        lblUserName.setText("Username");

        javax.swing.GroupLayout pnlBannerLayout = new javax.swing.GroupLayout(pnlBanner);
        pnlBanner.setLayout(pnlBannerLayout);
        pnlBannerLayout.setHorizontalGroup(
            pnlBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBannerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBannerLayout.createSequentialGroup()
                        .addComponent(lblLastLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBannerLayout.createSequentialGroup()
                        .addGroup(pnlBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBannerLayout.createSequentialGroup()
                                .addComponent(lblHi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUserName))
                            .addComponent(lblAccountID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addComponent(lblBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnlBannerLayout.setVerticalGroup(
            pnlBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBannerLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(pnlBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBannerLayout.createSequentialGroup()
                        .addComponent(lblAccountID)
                        .addGap(8, 8, 8)
                        .addGroup(pnlBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHi)
                            .addComponent(lblUserName)))
                    .addComponent(lblIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblLastLogin)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(lblBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbrMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbrMenu.setFloatable(false);
        tbrMenu.setRollover(true);

        btgMenu.add(btnStudent);
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student.png"))); // NOI18N
        btnStudent.setText("Student           ");
        btnStudent.setFocusable(false);
        btnStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStudent.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        tbrMenu.add(btnStudent);

        btgMenu.add(btnBatch);
        btnBatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/batch.png"))); // NOI18N
        btnBatch.setText("Batch             ");
        btnBatch.setFocusable(false);
        btnBatch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBatch.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatchActionPerformed(evt);
            }
        });
        tbrMenu.add(btnBatch);

        btgMenu.add(btnFaculty);
        btnFaculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/faculty.png"))); // NOI18N
        btnFaculty.setText("Faculty           ");
        btnFaculty.setFocusable(false);
        btnFaculty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFaculty.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacultyActionPerformed(evt);
            }
        });
        tbrMenu.add(btnFaculty);

        btgMenu.add(btnProgram);
        btnProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/program.png"))); // NOI18N
        btnProgram.setText("Program          ");
        btnProgram.setFocusable(false);
        btnProgram.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgramActionPerformed(evt);
            }
        });
        tbrMenu.add(btnProgram);

        btgMenu.add(btnSchedule);
        btnSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/schedule.png"))); // NOI18N
        btnSchedule.setText("Schedule          ");
        btnSchedule.setFocusable(false);
        btnSchedule.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });
        tbrMenu.add(btnSchedule);

        btgMenu.add(btnScore);
        btnScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/score.png"))); // NOI18N
        btnScore.setText("Score             ");
        btnScore.setFocusable(false);
        btnScore.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });
        tbrMenu.add(btnScore);

        btgMenu.add(btnSearch);
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearch.setText("Search            ");
        btnSearch.setFocusable(false);
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        tbrMenu.add(btnSearch);

        btgMenu.add(btnProfile);
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        btnProfile.setText("Profile               ");
        btnProfile.setFocusable(false);
        btnProfile.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        tbrMenu.add(btnProfile);

        pnlBody.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlBody.setLayout(new java.awt.CardLayout());
        pnlBody.add(pnlWelcome, "card10");
        pnlBody.add(pnlEnrollmentStudent, "Student");
        pnlBody.add(pnlEnrollmentBatch, "Batch");
        pnlBody.add(pnlEnrollmentFaculty, "Faculty");
        pnlBody.add(pnlBursaryProgram, "Program");
        pnlBody.add(pnlBursarySchedule, "Schedule");
        pnlBody.add(pnlBursaryScore, "Score");
        pnlBody.add(pnlEnrollmentSearch, "Search");
        pnlBody.add(pnlProfile, "Profile");

        pnlReport.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        scpReport.setBorder(null);

        txaReport.setEditable(false);
        txaReport.setBackground(new java.awt.Color(240, 240, 240));
        txaReport.setColumns(20);
        txaReport.setRows(3);
        scpReport.setViewportView(txaReport);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("Today");
        lblDate.setEnabled(false);

        txtTime.setEditable(false);
        txtTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signout.png"))); // NOI18N
        btnLogOut.setText("Sign out");
        btnLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlReportLayout = new javax.swing.GroupLayout(pnlReport);
        pnlReport.setLayout(pnlReportLayout);
        pnlReportLayout.setHorizontalGroup(
            pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReportLayout.createSequentialGroup()
                .addComponent(scpReport, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTime, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        pnlReportLayout.setVerticalGroup(
            pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlReportLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scpReport, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlReportLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlBody, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbrMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBanner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tbrMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnlReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Student");
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatchActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Batch");
    }//GEN-LAST:event_btnBatchActionPerformed

    private void btnFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacultyActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Faculty");
    }//GEN-LAST:event_btnFacultyActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Search");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Profile");
    }//GEN-LAST:event_btnProfileActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (this.dbConnection.getAccount().getPermission().equals("admin")) {
            this.dispose();
            return;
        }
        int exit = JOptionPane.showConfirmDialog(null, "Do you want to Exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/images/exit.gif"));
        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        if (this.dbConnection.getAccount().getPermission().equals("admin")) {
            this.dispose();
            return;
        }
        int logOut = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/images/logout.png"));
        if (logOut == JOptionPane.YES_OPTION) {
            this.dispose();
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgramActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Program");
    }//GEN-LAST:event_btnProgramActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Schedule");
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Score");
    }//GEN-LAST:event_btnScoreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgMenu;
    private javax.swing.JToggleButton btnBatch;
    private javax.swing.JToggleButton btnFaculty;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JToggleButton btnProfile;
    private javax.swing.JToggleButton btnProgram;
    private javax.swing.JToggleButton btnSchedule;
    private javax.swing.JToggleButton btnScore;
    private javax.swing.JToggleButton btnSearch;
    private javax.swing.JToggleButton btnStudent;
    private javax.swing.JLabel lblAccountID;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHi;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLastLogin;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlBanner;
    private javax.swing.JPanel pnlBody;
    private gui.BursaryProgramPanel pnlBursaryProgram;
    private gui.BursarySchedulePanel pnlBursarySchedule;
    private gui.BursaryScorePanel pnlBursaryScore;
    private gui.EnrollmentBatchPanel pnlEnrollmentBatch;
    private gui.EnrollmentFacultyPanel pnlEnrollmentFaculty;
    private gui.EnrollmentSearchPanel pnlEnrollmentSearch;
    private gui.EnrollmentStudentPanel pnlEnrollmentStudent;
    private gui.ProfilePanel pnlProfile;
    private javax.swing.JPanel pnlReport;
    private gui.WelcomePanel pnlWelcome;
    private javax.swing.JScrollPane scpReport;
    private javax.swing.JToolBar tbrMenu;
    private javax.swing.JTextArea txaReport;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
