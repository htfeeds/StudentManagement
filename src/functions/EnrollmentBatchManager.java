package functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class EnrollmentBatchManager {

    private DatabaseConnection dbConnection;
    private JTextArea txaReport;

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

    public EnrollmentBatchManager() {

    }

    public EnrollmentBatchManager(DatabaseConnection dbConnection, JTextArea txaReport) {
        this.dbConnection = dbConnection;
        this.txaReport = txaReport;
    }

    public Object[] addBatch(String batchID, String batchName, Object facultyID, String startDate, String endDate, Object programID) {
        try {
            String insertBatch = "insert into dbo.Batch values(?,?,?,?,?,?,?)";
            PreparedStatement pstInsertBatch = dbConnection.getCn().prepareStatement(insertBatch);
            pstInsertBatch.setString(1, batchID);
            pstInsertBatch.setString(2, batchName);
            if (facultyID != null) {
                pstInsertBatch.setString(3, facultyID.toString());
            } else {
                pstInsertBatch.setNull(3, java.sql.Types.NULL);
            }
            if (startDate.equals("")) {
                pstInsertBatch.setDate(4, null);
            } else {
                pstInsertBatch.setString(4, startDate);
            }
            if (endDate.equals("")) {
                pstInsertBatch.setDate(5, null);
            } else {
                pstInsertBatch.setString(5, endDate);
            }
            if (programID != null) {
                pstInsertBatch.setString(6, programID.toString());
            } else {
                pstInsertBatch.setNull(6, java.sql.Types.NULL);
            }
            pstInsertBatch.setNull(7, java.sql.Types.NULL);

            int noBatch = pstInsertBatch.executeUpdate();
            pstInsertBatch.close();
            if (noBatch != 0) {
                this.txaReport.append("Added new Batch successful...{" + batchID + "- " + batchName + "}\n");
                return new Object[]{batchID, batchName, facultyID, startDate, endDate, programID, "Added"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentBatchManager.class.getName()).log(Level.SEVERE, null, ex);

        }
        this.txaReport.append("Add failed\n");
        return null;
    }

    public Object[] deleteBatch(String batchID, String batchName, Object facultyID, String startDate, String endDate, Object programID) {
        try {
            String deleteBatch = "delete from dbo.Batch where [BatchID]=?";
            PreparedStatement pstDeleteBatch = dbConnection.getCn().prepareStatement(deleteBatch);
            pstDeleteBatch.setString(1, batchID);
            int noBatch = pstDeleteBatch.executeUpdate();
            pstDeleteBatch.close();
            if (noBatch != 0) {
                this.txaReport.append("Deleted Batch successful...{" + batchID + "- " + batchName + "}\n");
                return new Object[]{batchID, batchName, facultyID, startDate, endDate, programID, "Deleted"};
            }
        } catch (SQLException ex) {
            try {
                Logger.getLogger(EnrollmentBatchManager.class.getName()).log(Level.SEVERE, null, ex);
                dbConnection.getCn().rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(EnrollmentBatchManager.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        this.txaReport.append("Delete failed!\n");
        return null;
    }

    public Object[] updateBatch(String batchID, String batchName, Object facultyID, String startDate, String endDate, Object programID) {
        try {
            String updateBatch = "update dbo.Batch set [BatchName]=?,[FacultyID]=?,[StartDate]=?,[EndDate]=?,[ProgramID]=?,[Schedule]=? where [BatchID]='" + batchID + "'";
            PreparedStatement pstUpdateBatch = dbConnection.getCn().prepareStatement(updateBatch);
            pstUpdateBatch.setString(1, batchName);
            if (facultyID != null) {
                pstUpdateBatch.setString(2, facultyID.toString());
            } else {
                pstUpdateBatch.setNull(2, java.sql.Types.NULL);
            }
            if (startDate.equals("")) {
                pstUpdateBatch.setDate(3, null);
            } else {
                pstUpdateBatch.setString(3, startDate);
            }
            if (endDate.equals("")) {
                pstUpdateBatch.setDate(4, null);
            } else {
                pstUpdateBatch.setString(4, endDate);
            }
            if (programID != null) {
                pstUpdateBatch.setString(5, programID.toString());
            } else {
                pstUpdateBatch.setNull(5, java.sql.Types.NULL);
            }
            pstUpdateBatch.setNull(6, java.sql.Types.NULL);
            int noBatch = pstUpdateBatch.executeUpdate();
            if (noBatch != 0) {
                this.txaReport.append("Updated Batch successful...{" + batchID + "- " + batchName + "}\n");
            }
            return new Object[]{batchID, batchName, facultyID, startDate, endDate, programID, "Updated"};
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentBatchManager.class.getName()).log(Level.SEVERE, null, ex);
            this.txaReport.append("Update failed\n");
        }
        return null;
    }

    public Object[] loadBatch(String batchID) {
        try {
            String loadBatch = "select * from dbo.Batch where BatchID='" + batchID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadBatch);
            while (rs.next()) {
                String batchName = rs.getString("BatchName");
                String facultyID = rs.getString("FacultyID");
                String startDate = rs.getString("StartDate");
                String endDate = rs.getString("EndDate");
                String programID = rs.getString("ProgramID");
                String schedule = rs.getString("Schedule");
                return new Object[]{batchName, facultyID, startDate, endDate, programID};
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentBatchManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean checkExistRecord(String batchID) {
        try {
            String checkExistbatch = "select * from dbo.Batch where BatchID='" + batchID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(checkExistbatch);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentBatchManager.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EnrollmentBatchManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public DefaultComboBoxModel loadFacultyID() {
        try {
            DefaultComboBoxModel faculty = new DefaultComboBoxModel();
            String loadFaculty = "select FacultyID from dbo.Faculty";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadFaculty);
            while (rs.next()) {
                faculty.addElement(rs.getString(1));
            }
            return faculty;
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentBatchManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public DefaultComboBoxModel loadSchedule() {
        try {
            DefaultComboBoxModel schedule = new DefaultComboBoxModel();
            String loadSchedule = "select ID from dbo.Timetable";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadSchedule);
            while (rs.next()) {
                schedule.addElement(rs.getString(1));
            }
            return schedule;
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentBatchManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
