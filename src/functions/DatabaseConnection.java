package functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {

    private Connection cn;
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public DatabaseConnection() {

    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public boolean connectDatabase(String server, String port, String database, String userName, String password) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://" + server + ":" + port + ";databaseName=" + database;
            cn = DriverManager.getConnection(url, userName, password);
            return true;
        } catch (ClassNotFoundException ex) {
            return false;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean getAccount(String user, String pass) {
        try {
            Statement st = cn.createStatement();
            String sqlCommand = "select * from dbo.Account where UserName='" + user + "' and Password='" + pass + "'";
            ResultSet rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm");
                int accountID = rs.getInt("AccountID");
                String userName = rs.getString("UserName");
                String password = rs.getString("Password");
                if (!(password.equals(pass))) {
                    return false;
                }
                String fullName = rs.getString("FullName");
                String phoneNumber = rs.getString("PhoneNumber");
                String email = rs.getString("Email");
                String doB = rs.getString("DoB");
                String lastLogin = "";
                if (rs.getObject("LastLogin") != null) {
                    lastLogin = dateFormat.format(rs.getObject("LastLogin"));
                }
                String permission = rs.getString("Permission");
                this.account = new Account(accountID, userName, password, fullName, phoneNumber, email, doB, lastLogin, permission);
                return true;
            }
            return false;
        } catch (SQLException ex) {
            return false;
        }
    }

    public void updateLastLogin() {
        try {
            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm");
            String updateLastLogin = "update dbo.Account set [LastLogin]=? where [UserName]=?";
            PreparedStatement pstUpdateLastLogin = cn.prepareStatement(updateLastLogin);
            pstUpdateLastLogin.setString(1, dateFormat.format(date));
            pstUpdateLastLogin.setString(2, this.account.getUserName());
            pstUpdateLastLogin.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void close() {
        try {
            if (cn != null || !(cn.isClosed())) {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
