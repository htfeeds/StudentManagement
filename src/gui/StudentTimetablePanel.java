package gui;

import functions.ImageHandle;
import functions.StudentTimetableManager;
import java.awt.Color;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentTimetablePanel extends javax.swing.JPanel {

    private StudentTimetableManager studentTimetableManager;

    public void setStudentTimetableManager(StudentTimetableManager sTimetableManager) {
        this.studentTimetableManager = sTimetableManager;
        loadSchedule();
        loadFaculty(this.studentTimetableManager.loadMyFaculty());
        lblFacultyCourse.setText("Form-master");
    }

    public StudentTimetablePanel() {
        initComponents();
    }

    private void loadSchedule() {
        String[] arr = this.studentTimetableManager.loadSchedule();
        txtBatch.setText(arr[0]);
        txtStartDay.setText(arr[1]);
        txtEndDay.setText(arr[2]);
        txtCourse.setText(arr[3]);
        txtDuraion.setText(arr[4]);
        txtTiming.setText(arr[5]);
        txtFaculty.setText(arr[6]);
        txtLab.setText(arr[7]);
        txtNote.setText(arr[8]);
    }

    private void loadFaculty(Object[] arr) {
        txtName.setText(arr[0].toString());
        txtDoB.setText(arr[1].toString());
        txtGender.setText(arr[2].toString());
        txtPhone.setText(arr[3].toString());
        txtEmail.setText(arr[4].toString());
        txtAddress.setText(arr[5].toString());
        if (arr[6] != null) {
            try {
                ImageHandle.setPicture(lblFrameImage, (((Blob) arr[9]).getBinaryStream()));
            } catch (SQLException ex) {
                Logger.getLogger(StudentTimetablePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lblFrameImage.setText("No Image !");
            lblFrameImage.setForeground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSchedule = new javax.swing.JPanel();
        lblBatch = new javax.swing.JLabel();
        txtBatch = new javax.swing.JTextField();
        lblStartDat = new javax.swing.JLabel();
        lblEndDay = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblTiming = new javax.swing.JLabel();
        lblFaculty = new javax.swing.JLabel();
        lblLab = new javax.swing.JLabel();
        lblNote = new javax.swing.JLabel();
        txtStartDay = new javax.swing.JTextField();
        txtEndDay = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        txtDuraion = new javax.swing.JTextField();
        txtTiming = new javax.swing.JTextField();
        txtFaculty = new javax.swing.JTextField();
        txtLab = new javax.swing.JTextField();
        txtNote = new javax.swing.JTextField();
        btnView = new javax.swing.JToggleButton();
        pnlFaculty = new javax.swing.JPanel();
        lblTeacher = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblDoB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblFrameImage = new javax.swing.JLabel();
        txtDoB = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblFacultyCourse = new javax.swing.JLabel();

        pnlSchedule.setBorder(javax.swing.BorderFactory.createTitledBorder("Schedule"));

        lblBatch.setText("Batch");

        txtBatch.setEditable(false);

        lblStartDat.setText("Start Day");

        lblEndDay.setText("End Day");

        lblCourse.setText("Course");

        lblDuration.setText("Duration");

        lblTiming.setText("Timing");

        lblFaculty.setText("Faculty");

        lblLab.setText("Lab");

        lblNote.setText("Note");

        txtStartDay.setEditable(false);

        txtEndDay.setEditable(false);

        txtCourse.setEditable(false);

        txtDuraion.setEditable(false);

        txtTiming.setEditable(false);

        txtFaculty.setEditable(false);

        txtLab.setEditable(false);

        txtNote.setEditable(false);

        btnView.setText("View");
        btnView.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btnViewStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlScheduleLayout = new javax.swing.GroupLayout(pnlSchedule);
        pnlSchedule.setLayout(pnlScheduleLayout);
        pnlScheduleLayout.setHorizontalGroup(
            pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScheduleLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStartDat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEndDay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCourse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDuration, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTiming, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFaculty, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNote, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBatch, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuraion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlScheduleLayout.createSequentialGroup()
                        .addComponent(txtFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnView))
                    .addComponent(txtLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTiming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlScheduleLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBatch, txtCourse, txtDuraion, txtEndDay, txtFaculty, txtLab, txtNote, txtStartDay, txtTiming});

        pnlScheduleLayout.setVerticalGroup(
            pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScheduleLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblBatch)
                    .addComponent(txtBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartDat))
                .addGap(18, 18, 18)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndDay))
                .addGap(18, 18, 18)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourse))
                .addGap(18, 18, 18)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDuraion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuration))
                .addGap(18, 18, 18)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtTiming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiming))
                .addGap(18, 18, 18)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaculty)
                    .addComponent(btnView))
                .addGap(18, 18, 18)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblLab)
                    .addComponent(txtLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNote)
                    .addComponent(txtNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnlFaculty.setBorder(javax.swing.BorderFactory.createTitledBorder("Faculty"));

        lblTeacher.setText("Teach");

        lblName.setText("Name");

        txtName.setEditable(false);

        lblDoB.setText("DoB");

        lblGender.setText("Gender");

        lblPhone.setText("Phone");

        lblEmail.setText("Email");

        lblAddress.setText("Address");

        lblImage.setText("Image");

        lblFrameImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrameImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtDoB.setEditable(false);

        txtGender.setEditable(false);

        txtPhone.setEditable(false);

        txtEmail.setEditable(false);

        txtAddress.setEditable(false);

        javax.swing.GroupLayout pnlFacultyLayout = new javax.swing.GroupLayout(pnlFaculty);
        pnlFaculty.setLayout(pnlFacultyLayout);
        pnlFacultyLayout.setHorizontalGroup(
            pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFacultyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblDoB)
                    .addComponent(lblGender)
                    .addComponent(lblPhone)
                    .addComponent(lblEmail)
                    .addComponent(lblImage)
                    .addComponent(lblAddress)
                    .addComponent(lblTeacher))
                .addGap(18, 18, 18)
                .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDoB)
                        .addComponent(txtGender)
                        .addComponent(txtPhone)
                        .addComponent(txtEmail)
                        .addComponent(txtAddress)
                        .addComponent(lblFrameImage, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFacultyCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pnlFacultyLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtDoB, txtEmail, txtGender, txtName, txtPhone});

        pnlFacultyLayout.setVerticalGroup(
            pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFacultyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeacher)
                    .addComponent(lblFacultyCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoB)
                    .addComponent(txtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFacultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImage)
                    .addComponent(lblFrameImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(pnlFaculty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlFaculty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btnViewStateChanged
        if (btnView.isSelected()) {
            Object[] arr = this.studentTimetableManager.loadFaculty(txtFaculty.getText());
            this.loadFaculty(arr);
            lblFacultyCourse.setText(txtCourse.getText());
        } else {
            Object[] arr = this.studentTimetableManager.loadMyFaculty();
            this.loadFaculty(arr);
            lblFacultyCourse.setText("Form-master");
        }
    }//GEN-LAST:event_btnViewStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnView;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBatch;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblDoB;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndDay;
    private javax.swing.JLabel lblFaculty;
    private javax.swing.JLabel lblFacultyCourse;
    private javax.swing.JLabel lblFrameImage;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLab;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblStartDat;
    private javax.swing.JLabel lblTeacher;
    private javax.swing.JLabel lblTiming;
    private javax.swing.JPanel pnlFaculty;
    private javax.swing.JPanel pnlSchedule;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBatch;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtDoB;
    private javax.swing.JTextField txtDuraion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndDay;
    private javax.swing.JTextField txtFaculty;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLab;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNote;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStartDay;
    private javax.swing.JTextField txtTiming;
    // End of variables declaration//GEN-END:variables
}
