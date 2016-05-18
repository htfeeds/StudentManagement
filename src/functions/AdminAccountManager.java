package functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminAccountManager {

    private DatabaseConnection dbConnection;

    public AdminAccountManager(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public String[] createAccount(String userName, String password, String fullName, String phoneNumber, String email, String doB, String permission) {
        try {
            String sqlCommand = "insert into dbo.Account values(?,?,?,?,?,?,?,?)";
            PreparedStatement pstInsertAccount = dbConnection.getCn().prepareStatement(sqlCommand);
            pstInsertAccount.setString(1, userName);
            pstInsertAccount.setString(2, password);
            pstInsertAccount.setString(3, fullName);
            pstInsertAccount.setString(4, phoneNumber);
            pstInsertAccount.setString(5, email);
            pstInsertAccount.setString(6, doB);
            pstInsertAccount.setNull(7, java.sql.Types.NULL);
            pstInsertAccount.setString(8, permission);
            int noAccount = pstInsertAccount.executeUpdate();
            if (noAccount != 0) {
                return new String[]{userName, fullName, doB, phoneNumber, email, permission, "Created"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminAccountManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String[] updateAccount(String userName, String password, String fullName, String phoneNumber, String email, String doB, String permission) {
        try {
            String updatePassword = "";
            if (!(password.equals(""))) {
                updatePassword = ",[Password]='" + password + "'";
            }
            String updateAccount = "update dbo.Account set [FullName]=?, [PhoneNumber]=?, [Email]=?, [DoB]=?, [Permission]=?" + updatePassword + " where [UserName]=?";
            PreparedStatement pstInsertAccount = dbConnection.getCn().prepareStatement(updateAccount);
            pstInsertAccount.setString(1, fullName);
            pstInsertAccount.setString(2, phoneNumber);
            pstInsertAccount.setString(3, email);
            pstInsertAccount.setString(4, doB);
            pstInsertAccount.setString(5, permission);
            pstInsertAccount.setString(6, userName);
            int noAccount = pstInsertAccount.executeUpdate();
            if (noAccount != 0) {
                return new String[]{userName, fullName, doB, phoneNumber, email, permission, "Updated"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminAccountManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String[] deleteAccount(String userName, String fullName, String phoneNumber, String email, String doB, String permission) {
        try {
            String deleteAccount = "delete from dbo.Account where [UserName]=?";
            PreparedStatement pstDeleteAccount = dbConnection.getCn().prepareStatement(deleteAccount);
            pstDeleteAccount.setString(1, userName);
            int noAccount = pstDeleteAccount.executeUpdate();
            if (noAccount != 0) {
                return new String[]{userName, fullName, doB, phoneNumber, email, permission, "Delete"};
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminAccountManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean checkExistRecord(String userName) {
        try {
            String checkExist = "select * from dbo.Account where UserName='" + userName + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(checkExist);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminAccountManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String[] loadAccount(String user) {
        try {
            String load = "select * from dbo.Account where UserName='" + user + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(load);
            while (rs.next()) {
                String accountID = rs.getString("AccountID");
                String userName = rs.getString("UserName");
                String fullName = rs.getString("FullName");
                String phoneNumber = rs.getString("PhoneNumber");
                String email = rs.getString("Email");
                String doB = rs.getString("DoB");
                String permission = rs.getString("Permission");
                return new String[]{userName, fullName, email, phoneNumber, doB, permission, accountID};
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminAccountManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
