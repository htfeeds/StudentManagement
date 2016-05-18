package functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class BursaryScoreManager {

    private DatabaseConnection dbconnection;
    private JTextArea txaReport;

    public DatabaseConnection getDbconnection() {
        return dbconnection;
    }

    public JTextArea getTxaReport() {
        return txaReport;
    }

    public BursaryScoreManager(DatabaseConnection dbconnection, JTextArea txaReport) {
        this.dbconnection = dbconnection;
        this.txaReport = txaReport;
    }

    public void setDbconnection(DatabaseConnection dbconnection) {
        this.dbconnection = dbconnection;
    }

    public void setTxaReport(JTextArea txaReport) {
        this.txaReport = txaReport;
    }

    public String[] loadBatchInformation(String batchID) {
        try {
            String loadBatch = "SELECT dbo.Batch.BatchName, dbo.Program.ProgramName,dbo.Program.ProgramID FROM dbo.Batch "
                    + "INNER JOIN dbo.Program ON dbo.Batch.ProgramID = dbo.Program.ProgramID "
                    + "where BatchID='" + batchID + "'";
            Statement st = dbconnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadBatch);
            while (rs.next()) {
                String batchName = rs.getString(1);
                String programName = rs.getString(2);
                String programID = rs.getString(3);
                return new String[]{batchName, programName, programID};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String[] loadStudentInformation(String studentID) {
        try {
            String loadStudent = "select * from Student where StudentID='" + studentID + "'";
            Statement st = dbconnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadStudent);
            while (rs.next()) {
                String fullName = rs.getString("FullName");
                String phone = rs.getString("PhoneNumber");
                return new String[]{fullName, phone};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String[] loadCourseInformation(String courseID) {
        try {
            String loadCourse = "select * from Course where CourseID='" + courseID + "'";
            Statement st = dbconnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadCourse);
            while (rs.next()) {
                String courseName = rs.getString("CourseName");
                String totalHours = rs.getString("TotalHours");
                return new String[]{courseName, totalHours};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel loadBatchID() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String loadBatchID = "select BatchID from dbo.Batch";
            Statement st = dbconnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadBatchID);
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel loadStudentID(String batchID) {
        try {
            String loadStudentID = "";
            switch (batchID) {
                case "All":
                    loadStudentID = "select StudentID from dbo.Student";
                    break;
                default:
                    loadStudentID = "select StudentID from dbo.Student where BatchID='" + batchID + "'";
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            Statement st = dbconnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadStudentID);
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel loadCourseID(String programID) {
        try {
            String loadCourseID = "";
            switch (programID) {
                case "All":
                    loadCourseID = "select CourseID from Course";
                    break;
                default:
                    loadCourseID = "select CourseID from Course where ProgramID='" + programID + "'";
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            Statement st = dbconnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadCourseID);
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel loadCourse() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String loadCourse = "select CourseID from dbo.Course ";
            Statement st = dbconnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadCourse);
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String[] loadScore(String studentID, String courseID) {
        try {
            String loadCourse = "select * from dbo.Score where CourseID='" + courseID + "' and StudentID='" + studentID + "'";
            Statement st = dbconnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadCourse);
            while (rs.next()) {
                String eTest = rs.getString("E_Test");
                String eTime = rs.getString("E_Times");
                String rTest = rs.getString("R_Test");
                String rTime = rs.getString("R_Times");
                return new String[]{eTest, eTime, rTest, rTime};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String[] addScore(String studentID, String courseID, String e_test, String e_time, String r_test, String r_time) {
        try {
            String insert = "insert into dbo.Score values(?,?,?,?,?,?)";
            PreparedStatement pstInsert = dbconnection.getCn().prepareStatement(insert);
            pstInsert.setString(1, studentID);
            pstInsert.setString(2, courseID);
            pstInsert.setString(3, e_test);
            pstInsert.setString(4, e_time);
            pstInsert.setString(5, r_test);
            pstInsert.setString(6, r_time);

            int no = pstInsert.executeUpdate();
            if (no != 0) {
                this.txaReport.append("Added successful\n");
                return new String[]{studentID, courseID, e_test, e_time, r_test, r_time, "Added"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Add failed\n");
        return null;
    }

    public String[] updScore(String studentID, String courseID, String e_test, String e_time, String r_test, String r_time) {
        try {
            String update = "update dbo.Score set [E_Test]=?,[E_Times]=? ,[R_Test]=?,[R_Times]=? where [StudentID]='" + studentID + "' and [CourseID]='" + courseID + "'";
            PreparedStatement pst = dbconnection.getCn().prepareStatement(update);
            pst.setString(1, e_test);
            pst.setString(2, e_time);
            pst.setString(3, r_test);
            pst.setString(4, r_time);
            int no = pst.executeUpdate();
            if (no != 0) {
                this.txaReport.append("Update successful\n");
                return new String[]{studentID, courseID, e_test, e_time, r_test, r_time, "Updated"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryScheduleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Update failed\n");
        return null;
    }
}
