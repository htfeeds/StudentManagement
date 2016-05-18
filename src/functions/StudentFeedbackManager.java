package functions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentFeedbackManager {

    private Connection cn;
    private Account account;
    private DatabaseConnection dbConnection;

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public void setDbConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public StudentFeedbackManager(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public boolean InsertFeedback(String student, String fomal, String subject, String body) {
        try {
            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            String insertFeedback = "insert into dbo.Feedback values(?,?,?,?,?,?)";
            PreparedStatement pstInsertFeedback = dbConnection.getCn().prepareStatement(insertFeedback);
            pstInsertFeedback.setString(1, student);
            pstInsertFeedback.setString(2, dateFormat.format(date));
            pstInsertFeedback.setString(3, fomal);
            pstInsertFeedback.setString(4, subject);
            pstInsertFeedback.setString(5, body);
            pstInsertFeedback.setInt(6, new Integer(0));
            pstInsertFeedback.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
