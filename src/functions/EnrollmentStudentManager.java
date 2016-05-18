package functions;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class EnrollmentStudentManager {

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

    public EnrollmentStudentManager() {

    }

    public EnrollmentStudentManager(DatabaseConnection dbConnection, JTextArea txaReport) {
        this.dbConnection = dbConnection;
        this.txaReport = txaReport;
    }

    public Object[] checkExistRecord(String studentID, String s) {
        try {
            String sqlCommand = "select * from dbo.Student where StudentID=?";
            PreparedStatement pst = dbConnection.getCn().prepareStatement(sqlCommand);
            pst.setString(1, studentID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String firtName = rs.getString("");
                return new Object[]{};
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    public Object[] addStudent(String studentID, String firstName, String lastName, String doB, String gender, String phoneNumber, String address, String email, Object batchID, String status, String imagePath, String password) {
        try {
            dbConnection.getCn().setAutoCommit(false);
            String insertStudent = "insert into dbo.Student values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstInsertStudent = dbConnection.getCn().prepareStatement(insertStudent);
            pstInsertStudent.setString(1, studentID);
            pstInsertStudent.setString(2, firstName);
            pstInsertStudent.setString(3, lastName);
            pstInsertStudent.setString(4, firstName + " " + lastName);
            pstInsertStudent.setString(5, doB);
            pstInsertStudent.setString(6, gender);
            pstInsertStudent.setString(7, phoneNumber);
            pstInsertStudent.setString(8, address);
            pstInsertStudent.setString(9, email);
            if (batchID != null) {
                pstInsertStudent.setString(10, batchID.toString());
            } else {
                pstInsertStudent.setNull(10, java.sql.Types.NULL);
            }
            pstInsertStudent.setString(11, status);
            if (imagePath.equals("")) {
                pstInsertStudent.setNull(12, java.sql.Types.NULL);
            } else if (!(imagePath.equals(""))) {
                pstInsertStudent.setBlob(12, ImageHandle.convertImage(imagePath));
            }
            int noStudent = pstInsertStudent.executeUpdate();
            String insertAccount = "insert into dbo.Account values(?,?,?,?,?,?,?,?)";
            PreparedStatement pstInsertAccount = dbConnection.getCn().prepareStatement(insertAccount);
            pstInsertAccount.setString(1, studentID);
            pstInsertAccount.setString(2, password);
            pstInsertAccount.setString(3, firstName + " " + lastName);
            pstInsertAccount.setString(4, phoneNumber);
            pstInsertAccount.setString(5, email);
            pstInsertAccount.setString(6, doB);
            pstInsertAccount.setNull(7, java.sql.Types.NULL);
            pstInsertAccount.setString(8, "student");
            int noAccount = pstInsertAccount.executeUpdate();
            dbConnection.getCn().commit();
            dbConnection.getCn().setAutoCommit(true);
            pstInsertStudent.close();
            pstInsertAccount.close();
            if (noStudent != 0 && noAccount != 0) {
                this.txaReport.append("Added new student successful...{" + studentID + "- " + firstName + " " + lastName + "- " + phoneNumber + "}\n");
                return new Object[]{studentID, firstName + " " + lastName, gender, doB, phoneNumber, email, batchID, status, "Added"};
            }
        } catch (SQLException ex) {
            try {
                Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex);
                dbConnection.getCn().rollback();
                dbConnection.getCn().setAutoCommit(true);
            } catch (SQLException ex1) {
                Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        this.txaReport.append("Add failed\n");
        return null;
    }

    public Object[] updateStudent(String studentID, String firstName, String lastName, String doB, String gender, String phoneNumber, String address, String email, Object batchID, String status, String imagePath, String password) {
        try {
            String updateImage = "";
            if (!(imagePath.equals(""))) {
                updateImage = ",[Image]=?";
            }
            String updateStudent = "update dbo.Student set [FirstName]=?,[LastName]=?,[FullName]=?,[DoB]=?,[Gender]=?,[PhoneNumber]=?,[Address]=?,[Email]=?,[BatchID]=?,[Status]=?" + updateImage + " where [StudentID]='" + studentID + "'";
            PreparedStatement pstUpdateStudent = dbConnection.getCn().prepareStatement(updateStudent);
            pstUpdateStudent.setString(1, firstName);
            pstUpdateStudent.setString(2, lastName);
            pstUpdateStudent.setString(3, firstName + " " + lastName);
            pstUpdateStudent.setString(4, doB);
            pstUpdateStudent.setString(5, gender);
            pstUpdateStudent.setString(6, phoneNumber);
            pstUpdateStudent.setString(7, address);
            pstUpdateStudent.setString(8, email);
            if (batchID != null) {
                pstUpdateStudent.setString(9, batchID.toString());
            } else {
                pstUpdateStudent.setNull(9, java.sql.Types.NULL);
            }
            pstUpdateStudent.setString(10, status);
            if (!(imagePath.equals(""))) {
                pstUpdateStudent.setBlob(11, ImageHandle.convertImage(imagePath));
            }
            int noStudent = pstUpdateStudent.executeUpdate();
            if (noStudent != 0) {
                this.txaReport.append("Updated student successful...{" + studentID + "- " + firstName + " " + lastName + "- " + phoneNumber + "}\n");
            }
            if (!(password.equals(""))) {
                updatePassword(studentID, password);
            }
            return new Object[]{studentID, firstName + " " + lastName, gender, doB, phoneNumber, email, batchID, status, "Updated"};
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex);
            this.txaReport.append("Update failed\n");
        }
        return null;
    }

    public void updatePassword(String userName, String password) {
        try {
            String updateAccount = "update dbo.Account set [Password]=? where [UserName]=?";
            PreparedStatement pstUpdateAccount = dbConnection.getCn().prepareStatement(updateAccount);
            pstUpdateAccount.setString(1, password);
            pstUpdateAccount.setString(2, userName);
            int no = pstUpdateAccount.executeUpdate();
            if (no != 0) {
                this.txaReport.append("Change password successful...{" + userName + "}\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Object[] deleteStudent(String studentID, String firstName, String lastName, String doB, String gender, String phoneNumber, String address, String email, Object batchID, String status, String imagePath, String password) {
        try {
            dbConnection.getCn().setAutoCommit(false);
            String deleteStudent = "delete from dbo.Student where [StudentID]=?";
            PreparedStatement pstDeleteStudent = dbConnection.getCn().prepareStatement(deleteStudent);
            pstDeleteStudent.setString(1, studentID);
            int noStudent = pstDeleteStudent.executeUpdate();
            String deleteAccount = "delete from dbo.Account where [UserName]=?";
            PreparedStatement pstDeleteAccount = dbConnection.getCn().prepareStatement(deleteAccount);
            pstDeleteAccount.setString(1, studentID);
            int noAccount = pstDeleteAccount.executeUpdate();
            dbConnection.getCn().commit();
            dbConnection.getCn().setAutoCommit(true);
            pstDeleteStudent.close();
            pstDeleteAccount.close();
            if (noStudent != 0) {
                this.txaReport.append("Deleted student successful...{" + studentID + "- " + firstName + " " + lastName + "- " + phoneNumber + "}\n");
                return new Object[]{studentID, firstName + " " + lastName, gender, doB, phoneNumber, email, batchID, status, "Deleted"};
            }
        } catch (SQLException ex) {
            try {
                Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex);
                dbConnection.getCn().rollback();
                dbConnection.getCn().setAutoCommit(true);
            } catch (SQLException ex1) {
                Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        this.txaReport.append("Delete failed!\n");
        return null;
    }

    public boolean checkExistRecord(String studentID) {
        try {
            String checkExistStudent = "select * from dbo.Student where StudentID='" + studentID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(checkExistStudent);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Object[] loadStudent(String studentID) {
        try {
            String loadStudent = "select * from dbo.Student where StudentID='" + studentID + "'";
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
                String batchID = rs.getString("BatchID");
                String status = rs.getString("Status");
                Blob blobImage = rs.getBlob("Image");
                return new Object[]{firstName, lastName, doB, gender, phoneNumber, address, email, batchID, status, blobImage, studentID};
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String loadAccount(String accountID) {
        try {
            String loadAccount = "select * from dbo.Account where [AccountID]='" + accountID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadAccount);
            while (rs.next()) {
                String userName = rs.getString("UserName");
                return userName;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public DefaultComboBoxModel loadComboBoxModel() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            String loadStudent = "select BatchID from dbo.Batch";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(loadStudent);
            while (rs.next()) {
                model.addElement(rs.getString(1));
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentStudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
