package functions;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AdminViewFeedbackManager {

    private DatabaseConnection dbConnection;

    public AdminViewFeedbackManager(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public String[] loadFeedback(String ID) {
        try {
            String[] arr = null;
            String sqlCommand = "select * from dbo.Feedback where ID=" + ID;
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                String sender = rs.getString("Student");
                String date = rs.getString("Date");
                String subject = rs.getString("Subject");
                String content = rs.getString("Body");
                arr = new String[]{sender, date, subject, content};
            }
            if (arr != null) {
                String updateMark = "update dbo.Feedback set [Mark]=1 where ID=" + ID;
                Statement stUpdateMark = dbConnection.getCn().createStatement();
                int no = stUpdateMark.executeUpdate(updateMark);
            }
            return arr;
        } catch (SQLException ex) {
            Logger.getLogger(AdminViewFeedbackManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public MyTableModel loadTableFeedback(String str) {
        try {
            String sqlCommand = "";
            switch (str) {
                case "All":
                    sqlCommand = "select ID, Formal, Subject, Student, Date from dbo.Feedback";
                    break;
                case "New":
                    sqlCommand = "select ID, Formal, Subject, Student, Date from dbo.Feedback where [Mark]='false'";
                    break;
                default:
                    sqlCommand = "select ID, Formal, Subject, Student, Date from dbo.Feedback where [Date]='" + str + "'";
            }
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(sqlCommand);
            MyTableModel tableModel = new MyTableModel();
            ResultSetMetaData rmd = rs.getMetaData();
            int numberColumn = rmd.getColumnCount();
            Vector vtColumn = new Vector<String>();
            for (int i = 1; i <= numberColumn; i++) {
                vtColumn.add(rmd.getColumnName(i));
            }
            tableModel.setColumnIdentifiers(vtColumn.toArray());
            Vector vtRow = new Vector<String>();
            while (rs.next()) {
                for (int i = 1; i <= numberColumn; i++) {
                    vtRow.add(rs.getString(i));
                }
                tableModel.addRow(vtRow.toArray());
                vtRow.clear();
            }
            return tableModel;
        } catch (SQLException ex) {
            Logger.getLogger(AdminViewFeedbackManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean deleteFeedback(String ID) {
        try {
            String sqlCommand = "delete from dbo.Feedback where ID=" + ID;
            Statement st = dbConnection.getCn().createStatement();
            int no = st.executeUpdate(sqlCommand);
            if (no != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminViewFeedbackManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean unReadFeedback(String ID) {
        try {
            String updateMark = "update dbo.Feedback set [Mark]=0 where ID=" + ID;
            Statement stUpdateMark = dbConnection.getCn().createStatement();
            int no = stUpdateMark.executeUpdate(updateMark);
            if (no != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminViewFeedbackManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

class MyTableModel extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }
}
