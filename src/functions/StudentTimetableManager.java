package functions;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentTimetableManager {

    private DatabaseConnection dbConnection;

    public StudentTimetableManager(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public String[] loadSchedule() {
        try {
            String sqlCommand = "SELECT dbo.Schedule.StartDate, dbo.Schedule.EndDate, dbo.Schedule.Batch, dbo.Schedule.Duration,"
                    + " dbo.Schedule.Timing, dbo.Schedule.Lab, dbo.Schedule.Course, dbo.Schedule.Faculty, dbo.Schedule.Note "
                    + "FROM dbo.Student INNER JOIN dbo.Batch ON dbo.Student.BatchID = dbo.Batch.BatchID INNER JOIN dbo.Schedule "
                    + "ON dbo.Batch.Schedule = dbo.Schedule.ID where StudentID='" + dbConnection.getAccount().getUserName() + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                String batch = rs.getString("Batch");;
                String startDate = rs.getString("StartDate");;
                String endDate = rs.getString("EndDate");;
                String course = rs.getString("Course");;
                String duration = rs.getString("Duration");;
                String timing = rs.getString("Timing");;
                String faculty = rs.getString("Faculty");;
                String lab = rs.getString("Lab");;
                String note = rs.getString("Note");;
                return new String[]{batch, startDate, endDate, course, duration, timing, faculty, lab, note};
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentTimetableManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new String[]{"", "", "", "", "", "", "", "", ""};
    }

    public Object[] loadMyFaculty() {
        try {
            String sqlCommand = "SELECT dbo.Faculty.FacultyName, dbo.Faculty.PhoneNumber, dbo.Faculty.Address, "
                    + "dbo.Faculty.DoB, dbo.Faculty.Gender, dbo.Faculty.Email, dbo.Faculty.Image "
                    + "FROM dbo.Student INNER JOIN dbo.Batch ON dbo.Student.BatchID = dbo.Batch.BatchID "
                    + "INNER JOIN dbo.Faculty ON dbo.Batch.FacultyID = dbo.Faculty.FacultyID "
                    + "where StudentID='" + this.dbConnection.getAccount().getUserName() + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                String facultyName = rs.getString("FacultyName");
                String address = rs.getString("Address");
                String phoneNumber = rs.getString("PhoneNumber");
                String doB = rs.getString("DoB");
                String gender = rs.getString("Gender");
                String email = rs.getString("Email");
                Blob blobImage = rs.getBlob("Image");
                return new Object[]{facultyName, doB, gender, phoneNumber, email, address, blobImage};
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentTimetableManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Object[]{"", "", "", "", "", "", null};
    }

    public Object[] loadFaculty(String name) {
        try {
            String sqlCommand = "select * from dbo.Faculty where [FacultyName]=N'" + name + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                String facultyName = rs.getString("FacultyName");
                String address = rs.getString("Address");
                String phoneNumber = rs.getString("PhoneNumber");
                String doB = rs.getString("DoB");
                String gender = rs.getString("Gender");
                String email = rs.getString("Email");
                Blob blobImage = rs.getBlob("Image");
                return new Object[]{facultyName, doB, gender, phoneNumber, email, address, blobImage};
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentTimetableManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Object[]{"", "", "", "", "", "", null};
    }

    private String getFacultyID() {
        String fID = "";
        String sqlCommand = "SELECT dbo.Faculty.FacultyID FROM dbo.Student INNER JOIN dbo.Batch "
                + "ON dbo.Student.BatchID = dbo.Batch.BatchID INNER JOIN dbo.Faculty "
                + "ON dbo.Batch.FacultyID = dbo.Faculty.FacultyID "
                + "where StudentID='" + this.dbConnection.getAccount().getUserName() + "'";
        return fID;
    }
}
