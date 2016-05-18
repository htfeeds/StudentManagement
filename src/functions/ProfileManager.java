package functions;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class ProfileManager {

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

    public ProfileManager() {

    }

    public ProfileManager(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public ProfileManager(DatabaseConnection dbConnection, JTextArea txaReport) {
        this.dbConnection = dbConnection;
        this.txaReport = txaReport;
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
