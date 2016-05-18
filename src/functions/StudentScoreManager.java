package functions;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class StudentScoreManager {

    private DatabaseConnection dbConnection;

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public StudentScoreManager() {

    }

    public StudentScoreManager(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public String[] loadInformation() {
        try {
            String studentID = this.dbConnection.getAccount().getUserName();
            String sqlCommand = "SELECT dbo.Student.FullName, dbo.Batch.BatchName, dbo.Program.ProgramName FROM dbo.Student "
                    + "INNER JOIN dbo.Batch ON dbo.Student.BatchID = dbo.Batch.BatchID INNER JOIN dbo.Program "
                    + "ON dbo.Batch.ProgramID = dbo.Program.ProgramID where StudentID='" + studentID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                String fullName = rs.getString("FullName");
                String batchName = rs.getString("BatchName");
                String programName = rs.getString("ProgramName");
                return new String[]{studentID, fullName, batchName, programName};
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new String[]{"", "", "", ""};
    }

    public DefaultTableModel loadScore() {
        try {
            String studentID = this.dbConnection.getAccount().getUserName();
            String sqlCommand = "SELECT dbo.Course.Semester, dbo.Course.CourseName, dbo.Course.TotalHours, dbo.Score.E_Test, dbo.Score.E_Times,"
                    + " dbo.Score.R_Test, dbo.Score.R_Times FROM dbo.Course INNER JOIN dbo.Score "
                    + "ON dbo.Course.CourseID = dbo.Score.CourseID where StudentID='" + studentID + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(sqlCommand);
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
            Logger.getLogger(StudentScoreManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new DefaultTableModel();
    }
}
