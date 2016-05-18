package functions;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentInformationManager {

    private DatabaseConnection dbConnection;

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public StudentInformationManager() {

    }

    public StudentInformationManager(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public Object[] loadInformationStudent() {
        try {
            String studentID = this.dbConnection.getAccount().getUserName();
            String loadStudent = "SELECT dbo.Student.FirstName, dbo.Student.LastName, dbo.Student.DoB, dbo.Student.Gender,"
                    + "dbo.Student.PhoneNumber, dbo.Student.Address, dbo.Student.Email, dbo.Batch.BatchName, "
                    + "dbo.Student.Status, dbo.Student.Image FROM dbo.Student INNER JOIN dbo.Batch "
                    + "ON dbo.Student.BatchID = dbo.Batch.BatchID where StudentID='" + studentID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadStudent);
            while (rs.next()) {
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String doB = rs.getString("DoB");
                String gender = rs.getString("Gender");
                String phoneNumber = rs.getString("PhoneNumber");
                String address = rs.getString("Address");
                String email = rs.getString("Email");
                String batchID = rs.getString("BatchName");
                String status = rs.getString("Status");
                Blob blobImage = rs.getBlob("Image");
                return new Object[]{firstName, lastName, doB, gender, phoneNumber, address, email, batchID, status, blobImage, studentID};
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean changePassword(String newPassword) {
        try {
            String userName = this.dbConnection.getAccount().getUserName();
            Statement st = dbConnection.getCn().createStatement();
            int noRow = st.executeUpdate("update dbo.Account set [Password]='" + newPassword + "' where [UserName]='" + userName + "'");
            if (noRow == 1) {
                this.dbConnection.getAccount().setPassword(newPassword);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentInformationManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }
}
