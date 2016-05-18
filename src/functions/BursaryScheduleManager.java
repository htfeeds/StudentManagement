package functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class BursaryScheduleManager {

    private DatabaseConnection dbConnection;
    private JTextArea txaReport;

    public BursaryScheduleManager(DatabaseConnection dbConnection, JTextArea txaReport) {
        this.dbConnection = dbConnection;
        this.txaReport = txaReport;
    }

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public JTextArea getTxaReport() {
        return txaReport;
    }

    public void setDbConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void setTxaReport(JTextArea txaReport) {
        this.txaReport = txaReport;
    }

    public Object[] loadLab(String labID) {
        try {
            String loadLab = "select * from dbo.Lab where LabID='" + labID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadLab);
            while (rs.next()) {
                String labName = rs.getString("LabName");
                String status = rs.getString("Status");
                return new Object[]{labName, status};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Object[] loadTimetable(String timetableID) {
        try {
            String loadTimeTable = "select * from dbo.Schedule where ID='" + timetableID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadTimeTable);
            while (rs.next()) {
                String startDate = rs.getString("StartDate");
                String endDate = rs.getString("EndDate");
                String batch = rs.getString("Batch");
                String duration = rs.getString("Duration");
                String timing = rs.getString("Timing");
                String lab = rs.getString("Lab");
                String course = rs.getString("Course");
                String faculty = rs.getString("Faculty");
                String note = rs.getString("Note");

                return new Object[]{startDate, endDate, batch, duration, timing, lab, course, faculty, note};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean checkExistRecordTimetableID(String timetableID) {
        try {
            String checkExistTimetable = "select * from dbo.Schedule where ID='" + timetableID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(checkExistTimetable);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean checkExistRecordLabID(String labID) {
        try {
            String checkExistLab = "select * from dbo.Lab where LabID='" + labID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(checkExistLab);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public DefaultComboBoxModel loadLabID() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String loadLabName = "select LabID from dbo.Lab";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadLabName);
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel loadBatch() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String loadBatchName = "select BatchName from dbo.Batch";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadBatchName);
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel loadCourse() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String loadCourse = "select CourseName from dbo.Course";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadCourse);
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel loadFaculty() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String loadFaculty = "select FacultyName from dbo.Faculty";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadFaculty);
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Vector loadProgramIDFromBatch(String batchName) {
        try {
            String loadCourseName = "select dbo.COurse.CourseName from dbo.Batch inner join dbo.Course on dbo.Batch.ProgramID=dbo.Course.ProgramID where dbo.Batch.BatchName='" + batchName + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadCourseName);
            Vector vt = new Vector();
            while (rs.next()) {
                String courseName = rs.getString(1);
                vt.addElement(courseName);
            }
            return vt;
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Object[] addLab(String labID, String labName, String status) {
        try {
            String insertLab = "insert into dbo.Lab values(?,?,?)";
            PreparedStatement pstInsertLab = dbConnection.getCn().prepareStatement(insertLab);
            pstInsertLab.setString(1, labID);
            pstInsertLab.setString(2, labName);
            pstInsertLab.setString(3, status);
            int noLab = pstInsertLab.executeUpdate();
            pstInsertLab.close();
            if (noLab != 0) {
                this.txaReport.append("Added new Lab successful...{" + labID + "- " + labName + "}\n");
                return new Object[]{labID, labName, status, "Added"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Add failed\n");
        return null;
    }

    public Object[] addTimetable(String timetableID, String startDate, String endDate, Object batch, Object duration, Object timing, Object lab, Object course, Object faculty, String note) {
        try {
            String insertTimetable = "insert into dbo.Schedule values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstInsertTimetable = dbConnection.getCn().prepareStatement(insertTimetable);
            pstInsertTimetable.setString(1, timetableID);
            pstInsertTimetable.setString(2, startDate);
            pstInsertTimetable.setString(3, endDate);
            pstInsertTimetable.setString(4, batch.toString());
            pstInsertTimetable.setString(5, duration.toString());
            pstInsertTimetable.setString(6, timing.toString());
            if (lab != null) {
                pstInsertTimetable.setString(7, lab.toString());
            } else {
                pstInsertTimetable.setNull(7, java.sql.Types.NULL);
            }

            pstInsertTimetable.setString(8, course.toString());
            pstInsertTimetable.setString(9, faculty.toString());
            pstInsertTimetable.setString(10, note);
            int noTimetable = pstInsertTimetable.executeUpdate();
            pstInsertTimetable.close();
            if (noTimetable != 0) {
                String updateBatch = "update dbo.Batch set [Schedule]='" + timetableID + "' where [BatchName]='" + batch + "'";
                Statement st = dbConnection.getCn().createStatement();
                st.executeUpdate(updateBatch);
                this.txaReport.append("Added new Schedule successful...{" + timetableID + "}\n");
                return new Object[]{timetableID, startDate, endDate, batch, duration, timing, lab, course, faculty, note, "Added"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Add failed\n");
        return null;
    }

    public Object[] updateLab(String labID, String labName, String status) {
        try {
            String updateLab = "update dbo.Lab set [LabName]=?,[Status]=? where [LabID]='" + labID + "'";
            PreparedStatement pstUpdateLab = dbConnection.getCn().prepareStatement(updateLab);
            pstUpdateLab.setString(1, labName);
            pstUpdateLab.setString(2, status);
            int noLab = pstUpdateLab.executeUpdate();
            if (noLab != 0) {
                this.txaReport.append("Updated Lab successful...{" + labID + "- " + labName + "}\n");
                return new Object[]{labID, labName, status, "Updated"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Update failed\n");
        return null;
    }

    public Object[] updateTimetable(String timetableID, String startDate, String endDate, Object batch, Object duration, Object timing, Object lab, Object course, Object faculty, String note) {
        try {
            String updateTimetable = "update dbo.Schedule set [StartDate]=?,[EndDate]=?,[Batch]=?,[Duration]=?,[Timing]=?,[Lab]=?,[Course]=?,[Faculty]=?,[Note]=? where [ID]='" + timetableID + "'";
            PreparedStatement pstUpdateTimetable = dbConnection.getCn().prepareStatement(updateTimetable);
            pstUpdateTimetable.setString(1, startDate);
            pstUpdateTimetable.setString(2, endDate);
            pstUpdateTimetable.setString(3, batch.toString());
            pstUpdateTimetable.setString(4, duration.toString());
            pstUpdateTimetable.setString(5, timing.toString());
            if (lab != null) {
                pstUpdateTimetable.setString(6, lab.toString());
            } else {
                pstUpdateTimetable.setNull(6, java.sql.Types.NULL);
            }
            pstUpdateTimetable.setString(7, course.toString());
            pstUpdateTimetable.setString(8, faculty.toString());
            pstUpdateTimetable.setString(9, note.toString());
            int noTimetable = pstUpdateTimetable.executeUpdate();
            if (noTimetable != 0) {
                String updateBatch = "update dbo.Batch set [Schedule]='" + timetableID + "' where [BatchName]='" + batch.toString() + "'";
                Statement st = dbConnection.getCn().createStatement();
                st.executeUpdate(updateBatch);
                this.txaReport.append("Updated Schedule successful...{" + timetableID + "}\n");
                return new Object[]{timetableID, startDate, endDate, batch, duration, timing, lab, course, faculty, note, "Updated"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Update failed\n");
        return null;
    }

    public Object[] deleteLab(String labID, String labName, String status) {
        try {
            String deleteLab = "delete from dbo.Lab where [LabID]=?";
            PreparedStatement pstDeleteLab = dbConnection.getCn().prepareStatement(deleteLab);
            pstDeleteLab.setString(1, labID);
            int noLab = pstDeleteLab.executeUpdate();
            pstDeleteLab.close();
            if (noLab != 0) {
                this.txaReport.append("Deleted Lab successful...{" + labID + "- " + labName + "}\n");
                return new Object[]{labID, labName, status, "Deleted"};
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    public Object[] deleteTimetable(String timetableID, String startDate, String endDate, Object batch, Object duration, Object timing, Object lab, Object course, Object faculty, String note) {
        try {
            String deleteTimetables = "delete from dbo.Schedule where [ID]=?";
            PreparedStatement pstDeleteTimetable = dbConnection.getCn().prepareStatement(deleteTimetables);
            pstDeleteTimetable.setString(1, timetableID);
            int noTimetable = pstDeleteTimetable.executeUpdate();
            pstDeleteTimetable.close();
            if (noTimetable != 0) {
                this.txaReport.append("Deleted Schedule successful...{" + timetableID + "}\n");
                return new Object[]{timetableID, startDate, endDate, batch, duration, timing, lab, course, faculty, note, "Deleted"};
            }
        } catch (SQLException ex) {
        }
        return null;
    }

}
