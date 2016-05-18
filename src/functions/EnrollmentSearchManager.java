package functions;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class EnrollmentSearchManager {

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

    public EnrollmentSearchManager() {

    }

    public EnrollmentSearchManager(DatabaseConnection dbConnection, JTextArea txaReport) {
        this.dbConnection = dbConnection;
        this.txaReport = txaReport;
    }

    public DefaultTableModel search(String find, String by, String value) {
        try {
            String tableSearch = "";
            switch (find) {
                case "Student":
                    tableSearch = "select [StudentID], [FullName], [Gender], [DoB], [PhoneNumber], [Address],[Email], [BatchID], [Status] from dbo.Student";
                    break;
                case "Batch":
                    tableSearch = "select * from dbo.Batch";
                    break;
                case "Faculty":
                    tableSearch = "select [FacultyID], [FacultyName], [Address], [PhoneNumber], [DoB], [Gender],[Email] from dbo.Faculty";
                    break;
                case "Account":
                    tableSearch = "select [UserName], [FullName], [PhoneNumber], [Email], [DoB] from dbo.Account where [Permission]='student'";
                    break;
                case "Program":
                    tableSearch = "select * from dbo.Program";
                    break;
                case "Schedule":
                    tableSearch = "select [ID],[StartDate],[EndDate],[Batch],[Duration],[Timing],[Lab],[Course],[Faculty] from dbo.Schedule";
                    break;
                case "Score":
                    tableSearch = "select * from dbo.Score";
                    break;
            }
            String valueSearch;
            switch (by) {
                case "All":
                    valueSearch = "";
                    break;
                case "FullName":
                case "Status":
                case "FacultyName":
                    valueSearch = " where [" + by + "] like N'%" + value + "%'";
                    break;
                default:
                    if (find != "Acount") {
                        valueSearch = " where [" + by + "] like '%" + value + "%'";
                    } else {
                        valueSearch = " and [" + by + "] like '%" + value + "%'";
                    }
            }
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(tableSearch + valueSearch);
            DefaultTableModel tableModel = new DefaultTableModel();
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
            Logger.getLogger(EnrollmentSearchManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean delete(String valueID, String tableName) {
        try {
            String delete = "";
            switch (tableName) {
                case "Student":
                    delete = "delete from dbo.Student where [StudentID]='" + valueID + "'";
                    break;
                case "Batch":
                    delete = "delete from dbo.Batch where [BatchID]='" + valueID + "'";
                    break;
                case "Faculty":
                    delete = "delete from dbo.Faculty where [FacultyID]='" + valueID + "'";
                    break;
                case "Account":
                    delete = "delete from dbo.Account where [UserName]='" + valueID + "'";
                    break;
                case "Program":
                    delete = "delete from dbo.Account where [ProgramID]='" + valueID + "'";
                    break;
                case "Timetable":
                    delete = "delete from dbo.Timetable where [ID]=" + valueID;
                    break;
                case "Score":
                    delete = "delete from dbo.Score where [StudentID]='" + valueID + "'";
                    break;
            }
            Statement st = dbConnection.getCn().createStatement();
            int no = st.executeUpdate(delete);
            if (no != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EnrollmentSearchManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
