import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://ALBERT-PC\\MSSQLSERVER01:1433;databaseName=YourDatabase;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";

    public static Connection getConnection() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(URL);
            System.out.println("Connection successful!");

        } catch (SQLException e) {

            System.err.println("Connection failed!");
            e.printStackTrace();

        }
        return connection;
    }
}

