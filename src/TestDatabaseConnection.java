import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://ALBERT-PC\\mssqlserver01:1433;databaseName=OnlineStore;" +
                "integratedSecurity=true;encrypt=true;trustServerCertificate=true;";

        try {
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

