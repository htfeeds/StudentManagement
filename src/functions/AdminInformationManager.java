package functions;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminInformationManager {

    private DatabaseConnection dbConnection;

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public AdminInformationManager() {

    }

    public AdminInformationManager(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
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
