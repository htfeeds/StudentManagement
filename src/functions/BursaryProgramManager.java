package functions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.DefaultComboBoxModel;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class BursaryProgramManager {

    private DatabaseConnection dbConnection;
    private JTextArea txaReport;

    public BursaryProgramManager() {

    }

    public BursaryProgramManager(DatabaseConnection dbConnection, JTextArea txaReport) {
        this.dbConnection = dbConnection;
        this.txaReport = txaReport;
    }

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public JTextArea getTxaReport() {
        return txaReport;
    }

    public void setTxaReport(JTextArea txaReport) {
        this.txaReport = txaReport;
    }

    public String loadProgram(String programID) {
        try {
            String loadProgram = "select * from dbo.Program where ProgramID='" + programID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadProgram);
            while (rs.next()) {
                String programName = rs.getString("ProgramName");
                return programName;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryProgramManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Object[] loadCourse(String courseID) {
        try {
            String loadCourse = "select * from dbo.Course where CourseID='" + courseID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadCourse);
            while (rs.next()) {
                String courseName = rs.getString("CourseName");
                String programID = rs.getString("ProgramID");
                String semester = rs.getString("Semester");
                String theoryHours = rs.getString("TheoryHours");
                String labHours = rs.getString("LabHours");
                return new Object[]{courseName, programID, semester, theoryHours, labHours};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryProgramManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Object[] addProgram(String programID, String programName) {
        try {
            String insertProgram = "insert into dbo.Program values(?,?)";
            PreparedStatement pstInsertProgram = dbConnection.getCn().prepareStatement(insertProgram);
            pstInsertProgram.setString(1, programID);
            pstInsertProgram.setString(2, programName);
            int noProgram = pstInsertProgram.executeUpdate();
            pstInsertProgram.close();
            if (noProgram != 0) {
                this.txaReport.append("Added new Program successful...{" + programID + "- " + programID + "}\n");
                return new Object[]{programID, programName, "Added"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryProgramManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Add failed\n");
        return null;
    }

    public Object[] addCourse(String courseID, String courseName, Object programID, String semester, String theoryHours, String labHours) {
        try {
            String insertCourse = "insert into dbo.Course values(?,?,?,?,?,?,?)";
            PreparedStatement pstInsertCourse = dbConnection.getCn().prepareStatement(insertCourse);
            pstInsertCourse.setString(1, courseID);
            pstInsertCourse.setString(2, courseName);
            if (programID != null) {
                pstInsertCourse.setString(3, programID.toString());
            } else {
                pstInsertCourse.setNull(3, java.sql.Types.NULL);
            }
            if (semester.equals("")) {
                pstInsertCourse.setNull(4, java.sql.Types.NULL);
            } else {
                pstInsertCourse.setInt(4, new Integer(semester));
            }
            pstInsertCourse.setInt(5, new Integer(theoryHours));
            pstInsertCourse.setInt(6, new Integer(labHours));
            pstInsertCourse.setInt(7, new Integer(Integer.sum(new Integer(theoryHours), new Integer(labHours))));
            int noCourse = pstInsertCourse.executeUpdate();
            pstInsertCourse.close();
            if (noCourse != 0) {
                this.txaReport.append("Added new Course successful...{" + courseID + "- " + courseName + "}\n");
                return new Object[]{courseID, courseName, programID, semester, theoryHours, labHours, "Added"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryProgramManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Add failed\n");
        return null;
    }

    public Object[] updateProgram(String programID, String programName) {
        try {
            String updateProgram = "update dbo.Program set [ProgramName]=? where [ProgramID]='" + programID + "'";
            PreparedStatement pstUpdateProgram = dbConnection.getCn().prepareStatement(updateProgram);
            pstUpdateProgram.setString(1, programName);
            int noProgram = pstUpdateProgram.executeUpdate();
            if (noProgram != 0) {
                this.txaReport.append("Updated Program successful...{" + programID + "- " + programName + "}\n");
                return new Object[]{programID, programName, "Updated"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryProgramManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Updated failed\n");
        return null;

    }

    public Object[] updateCourse(String courseID, String courseName, Object programID, String semester, String theoryHours, String labHours) {
        try {
            String updateCourse = "update dbo.Course set [CourseName]=?,[ProgramID]=?,[Semester]=?,[TheoryHours]=?,[LabHours]=?,[TotalHours]=? where [CourseID]='" + courseID + "'";
            PreparedStatement pstUpdateCourse = dbConnection.getCn().prepareStatement(updateCourse);
            pstUpdateCourse.setString(1, courseName);
            if (programID != null) {
                pstUpdateCourse.setString(2, programID.toString());
            } else {
                pstUpdateCourse.setNull(2, java.sql.Types.NULL);
            }
            if (semester.equals("")) {
                pstUpdateCourse.setNull(3, java.sql.Types.NULL);
            } else {
                pstUpdateCourse.setString(3, semester);
            }
            pstUpdateCourse.setInt(4, new Integer(theoryHours.toString()));
            pstUpdateCourse.setInt(5, new Integer(labHours.toString()));
            pstUpdateCourse.setInt(6, new Integer(Integer.sum(new Integer(theoryHours), new Integer(labHours))));
            int noCourse = pstUpdateCourse.executeUpdate();
            if (noCourse != 0) {
                this.txaReport.append("Updated Course successful...{" + courseID + "- " + courseName + "}\n");
                return new Object[]{courseID, courseName, programID, semester, theoryHours, labHours, "Updated"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryProgramManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Updated failed\n");
        return null;
    }

    public Object[] deleteProgram(String programID, String programName) {
        try {
            String deleteProgram = "delete from dbo.Program where [ProgramID]=?";
            PreparedStatement pstDeleteProgram = dbConnection.getCn().prepareStatement(deleteProgram);
            pstDeleteProgram.setString(1, programID);
            int noProgram = pstDeleteProgram.executeUpdate();
            pstDeleteProgram.close();
            if (noProgram != 0) {
                this.txaReport.append("Deleted Program successful...{" + programID + "- " + programName + "}\n");
                return new Object[]{programID, programName, "Deleted"};
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    public Object[] deleteCourse(String courseID, String courseName, Object programID, String semester, String theoryHours, String labHours) {
        try {
            String deleteCourse = "delete from dbo.Course where [CourseID]=?";
            PreparedStatement pstDeleteCourse = dbConnection.getCn().prepareStatement(deleteCourse);
            pstDeleteCourse.setString(1, courseID);
            int noCourse = pstDeleteCourse.executeUpdate();
            pstDeleteCourse.close();
            if (noCourse != 0) {
                this.txaReport.append("Deleted Course successful...{" + courseID + "- " + courseName + "}\n");
                return new Object[]{courseID, courseName, programID, semester, theoryHours, labHours, "Deleted"};
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    public boolean checkExistRecordProgramID(String programID) {
        try {
            String checkExistProgram = "select * from dbo.Program where ProgramID='" + programID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(checkExistProgram);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryProgramManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean checkExistRecordCourseID(String courseID) {
        try {
            String checkExistCourse = "select * from dbo.Course where CourseID='" + courseID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(checkExistCourse);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BursaryProgramManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public DefaultComboBoxModel loadProgramID() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String loadProgram = "select ProgramID from dbo.Program";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadProgram);
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(BursaryProgramManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
