package functions;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class EnrollmentFacultyManager {

    private DatabaseConnection dbConnection;
    private JTextArea txaReport;

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public JTextArea getTxaReport() {
        return txaReport;
    }

    public EnrollmentFacultyManager() {

    }

    public EnrollmentFacultyManager(DatabaseConnection dbConnection, JTextArea txaReport) {
        this.dbConnection = dbConnection;
        this.txaReport = txaReport;
    }

    public void setDatabaseConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public DatabaseConnection getDatabaseConnection() {
        return this.dbConnection;
    }

    public void setJTextArea(JTextArea txaReport) {
        this.txaReport = txaReport;
    }

    public JTextArea getJTextArea() {
        return this.txaReport;
    }

    public boolean checkExistRecord(String facultyID) {
        try {
            String checkExistStudent = "select * from dbo.Faculty where FacultyID='" + facultyID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(checkExistStudent);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentFacultyManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Object[] AddFacyulty(String facultyID, String facultyName, String Address, String phoneNumber, String Dob, String email, String gender, String imagePath) {
        try {
            String insertFaculty = "insert into dbo.Faculty values (?,?,?,?,?,?,?,?)";
            PreparedStatement pstInsertFaculty = dbConnection.getCn().prepareStatement(insertFaculty);
            pstInsertFaculty.setString(1, facultyID);
            pstInsertFaculty.setString(2, facultyName);
            pstInsertFaculty.setString(3, Address);
            pstInsertFaculty.setString(4, phoneNumber);
            pstInsertFaculty.setString(5, Dob);
            pstInsertFaculty.setString(6, gender);
            pstInsertFaculty.setString(7, email);
            if (imagePath.equals("")) {
                pstInsertFaculty.setNull(8, java.sql.Types.NULL);
            } else if (!(imagePath.equals(""))) {
                pstInsertFaculty.setBlob(8, ImageHandle.convertImage(imagePath));
            }
            int noFaculty = pstInsertFaculty.executeUpdate();
            pstInsertFaculty.close();
            if (noFaculty != 0) {
                this.txaReport.append("Add new Faculty success...{" + facultyID + "-" + facultyName + "-" + phoneNumber + "}\n");
                return new Object[]{facultyID, facultyName, gender, Address, phoneNumber, Dob, email, "Added"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentFacultyManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.txaReport.append("Add Fail !\n");
        return null;
    }

    public Object[] updateFaculty(String facultyID, String facultyName, String Address, String phoneNumber, String Dob, String email, String gender, String imagePath) {
        try {
            String updateImage = "";
            if (!(imagePath.equals(""))) {
                updateImage = ",[Image]=?";
            }
            String updateFaculty = "update dbo.Faculty set [FacultyName]=?,[Address]=?,[PhoneNumber]=?,[DoB]=?,[Email]=?,[Gender]=?" + updateImage + " where [FacultyID]='" + facultyID + "'";
            PreparedStatement pstUpdateFaculty = dbConnection.getCn().prepareStatement(updateFaculty);
            pstUpdateFaculty.setString(1, facultyName);
            pstUpdateFaculty.setString(2, Address);
            pstUpdateFaculty.setString(3, phoneNumber);
            pstUpdateFaculty.setString(4, Dob);
            pstUpdateFaculty.setString(5, email);
            pstUpdateFaculty.setString(6, gender);
            if (!(imagePath.equals(""))) {
                pstUpdateFaculty.setBlob(7, ImageHandle.convertImage(imagePath));
            }
            int noFaculty = pstUpdateFaculty.executeUpdate();
            if (noFaculty != 0) {
                this.txaReport.append("Update Faculty success...{" + facultyID + "-" + facultyName + "-" + phoneNumber + "}\n");
            }
            return new Object[]{facultyID, facultyName, gender, Address, phoneNumber, Dob, email, "Updated"};
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentFacultyManager.class.getName()).log(Level.SEVERE, null, ex);
            this.txaReport.append("Update failed\n");
        }
        return null;
    }

    public Object[] deleteteFaculty(String facultyID, String facultyName, String Address, String phoneNumber, String Dob, String email, String gender, String imagePath) {
        try {
            String deleteFaculty = "delete from dbo.Faculty where [FacultyID]=?";
            PreparedStatement pstDeleteFaculty = dbConnection.getCn().prepareStatement(deleteFaculty);
            pstDeleteFaculty.setString(1, facultyID);
            int noFaculty = pstDeleteFaculty.executeUpdate();
            pstDeleteFaculty.close();
            if (noFaculty != 0) {
                this.txaReport.append("Delete Faculty success...{" + facultyID + "-" + facultyName + "-" + phoneNumber + "}\n");
                return new Object[]{facultyID, facultyName, gender, Address, phoneNumber, Dob, email, "Deleted"};
            }
        } catch (SQLException ex1) {
            Logger.getLogger(EnrollmentFacultyManager.class.getName()).log(Level.SEVERE, null, ex1);
        }
        this.txaReport.append("Delete failed!\n");
        return null;
    }

    public Object[] loadFaculty(String facultyID) {
        try {
            String loadFaculty = "select * from dbo.Faculty Where [FacultyID]='" + facultyID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadFaculty);
            while (rs.next()) {
                String facultyName = rs.getString("FacultyName");
                String address = rs.getString("Address");
                String phoneNumber = rs.getString("PhoneNumber");
                String doB = rs.getString("DoB");
                String gender = rs.getString("Gender");
                String email = rs.getString("Email");
                Blob blobImage = rs.getBlob("Image");
                return new Object[]{facultyName, address, phoneNumber, doB, gender, email, blobImage};
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentFacultyManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
