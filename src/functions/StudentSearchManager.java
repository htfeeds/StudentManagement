package functions;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class StudentSearchManager {

    private DatabaseConnection dbConnection;

    public StudentSearchManager(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public DatabaseConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public DefaultTableModel search(String tableName, String search) {
        try {
            String sqlCommand = "";
            switch (tableName) {
                case "Student":
                    sqlCommand = "SELECT FullName, DoB, Gender, PhoneNumber, Address, Email FROM dbo.Student where FullName like N'%" + search + "%' and BatchID='" + getBatchID() + "'";
                    break;
                case "Faculty":
                    sqlCommand = "SELECT FacultyName, DoB,Gender, PhoneNumber, Address, Email FROM dbo.Faculty where FacultyName like N'%" + search + "%'";
                    break;
                case "Program":
                    sqlCommand = "SELECT dbo.Program.ProgramName, dbo.Course.Semester, dbo.Course.CourseName, dbo.Course.TheoryHours, dbo.Course.LabHours, dbo.Course.TotalHours FROM dbo.Program INNER JOIN dbo.Course ON dbo.Program.ProgramID = dbo.Course.ProgramID where ProgramName like N'%" + search + "%'";
                    break;
                case "Score":
                    sqlCommand = "SELECT dbo.Course.Semester, dbo.Course.CourseName, dbo.Score.E_Test, dbo.Score.R_Test FROM dbo.Student INNER JOIN dbo.Score ON dbo.Student.StudentID = dbo.Score.StudentID INNER JOIN dbo.Course ON dbo.Score.CourseID = dbo.Course.CourseID where FullName=N'" + search + "';";
                    break;
            }
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
            Logger.getLogger(StudentSearchManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private String getBatchID() {
        try {
            String batchID = "";
            String sqlCommand = "SELECT BatchID FROM dbo.Student where StudentID='" + this.dbConnection.getAccount().getUserName() + "'";
            Statement st = dbConnection.getCn().createStatement();
            ResultSet rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                batchID = rs.getString("BatchID");
            }
            return batchID;
        } catch (SQLException ex) {
            Logger.getLogger(StudentSearchManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

}
