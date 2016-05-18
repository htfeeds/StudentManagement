package gui;

import functions.DatabaseConnection;
import functions.ImageHandle;
import functions.StudentFeedbackManager;
import functions.StudentInformationManager;
import functions.StudentScoreManager;
import functions.StudentSearchManager;
import functions.StudentTimetableManager;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class StudentForm extends javax.swing.JFrame {

    DatabaseConnection dbConnection;

    public StudentForm() {
        initComponents();
    }

    public StudentForm(DatabaseConnection dbConnection) {
        initComponents();
        this.dbConnection = dbConnection;
        pnlStudentInformation.setStudentInformationManager(new StudentInformationManager(this.dbConnection));
        pnlStudentTimetable.setStudentTimetableManager(new StudentTimetableManager(this.dbConnection));
        pnlStudentScore.setStudentScoreManager(new StudentScoreManager(this.dbConnection));
        pnlStudentSearch.setStudentSearchManager(new StudentSearchManager(this.dbConnection));
        pnlStudentFeedback.setStudentFeedback(new StudentFeedbackManager(this.dbConnection));
        ImageHandle.setIcon(this, "src/images/studentform.jpg");
        this.setTitle("Student Management- Hi, " + dbConnection.getAccount().getAccountID() + "- " + dbConnection.getAccount().getFullName());
        btnInformation.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgMenu = new javax.swing.ButtonGroup();
        tbrMenu = new javax.swing.JToolBar();
        btnInformation = new javax.swing.JToggleButton();
        btnTimetable = new javax.swing.JToggleButton();
        btnScore = new javax.swing.JToggleButton();
        btnSearch = new javax.swing.JToggleButton();
        btnFeedback = new javax.swing.JToggleButton();
        btnSignOut = new javax.swing.JButton();
        pnlBody = new javax.swing.JPanel();
        pnlStudentInformation = new gui.StudentInformationPanel();
        pnlStudentTimetable = new gui.StudentTimetablePanel();
        pnlStudentScore = new gui.StudentScorePanel();
        pnlStudentSearch = new gui.StudentSearchPanel();
        pnlStudentFeedback = new gui.StudentFeedbackPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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
        btnInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/studentinfor.jpg"))); // NOI18N
        btnInformation.setText("Your Information   ");
        btnInformation.setFocusable(false);
        btnInformation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInformation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });
        tbrMenu.add(btnInformation);

        btgMenu.add(btnTimetable);
        btnTimetable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/timetable.jpg"))); // NOI18N
        btnTimetable.setText("Timetable      ");
        btnTimetable.setFocusable(false);
        btnTimetable.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimetableActionPerformed(evt);
            }
        });
        tbrMenu.add(btnTimetable);

        btgMenu.add(btnScore);
        btnScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/studentscore.jpg"))); // NOI18N
        btnScore.setText("Score           ");
        btnScore.setFocusable(false);
        btnScore.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });
        tbrMenu.add(btnScore);

        btgMenu.add(btnSearch);
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/studentsearch.jpg"))); // NOI18N
        btnSearch.setText("Search           ");
        btnSearch.setFocusable(false);
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        tbrMenu.add(btnSearch);

        btgMenu.add(btnFeedback);
        btnFeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/feedback.jpg"))); // NOI18N
        btnFeedback.setText("Feedback       ");
        btnFeedback.setFocusable(false);
        btnFeedback.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });
        tbrMenu.add(btnFeedback);

        btnSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnSignOut.setText("Sign Out      ");
        btnSignOut.setFocusable(false);
        btnSignOut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });
        tbrMenu.add(btnSignOut);

        pnlBody.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlBody.setLayout(new java.awt.CardLayout());
        pnlBody.add(pnlStudentInformation, "Information");
        pnlBody.add(pnlStudentTimetable, "Timetable");
        pnlBody.add(pnlStudentScore, "Score");
        pnlBody.add(pnlStudentSearch, "Search");
        pnlBody.add(pnlStudentFeedback, "Feedback");

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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Search");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int exit = JOptionPane.showConfirmDialog(null, "Do you want to Exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/images/exit.gif"));
        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimetableActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Timetable");
    }//GEN-LAST:event_btnTimetableActionPerformed

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Score");
    }//GEN-LAST:event_btnScoreActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        CardLayout c1 = (CardLayout) pnlBody.getLayout();
        c1.show(pnlBody, "Feedback");
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        int logOut = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("src/images/logout.png"));
        if (logOut == JOptionPane.YES_OPTION) {
            this.dispose();
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_btnSignOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgMenu;
    private javax.swing.JToggleButton btnFeedback;
    private javax.swing.JToggleButton btnInformation;
    private javax.swing.JToggleButton btnScore;
    private javax.swing.JToggleButton btnSearch;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JToggleButton btnTimetable;
    private javax.swing.JPanel pnlBody;
    private gui.StudentFeedbackPanel pnlStudentFeedback;
    private gui.StudentInformationPanel pnlStudentInformation;
    private gui.StudentScorePanel pnlStudentScore;
    private gui.StudentSearchPanel pnlStudentSearch;
    private gui.StudentTimetablePanel pnlStudentTimetable;
    private javax.swing.JToolBar tbrMenu;
    // End of variables declaration//GEN-END:variables
}
