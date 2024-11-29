package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.interfaces.CustomerDAO;
import dao.impl.CustomerDAOImpl;
import entities.Customer;

public class TestDatabaseConnection {
    public static void main(String[] args) {

        String url = "jdbc:sqlserver://ALBERT-PC\\\\MSSQLSERVER01:1433;databaseName=YourDatabase;" +
                "integratedSecurity=true;encrypt=true;trustServerCertificate=true;";

        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("Connection successful!");

            CustomerDAO customerDAO = new CustomerDAOImpl(conn);

            Customer newCustomer = new Customer("John", "Doe", "john.doe@example.com",
                    "securepassword", "123456789", "123 Main St");

            customerDAO.AddCustomer(newCustomer);

            System.out.println("Customer added successfully!");

            int customerId = 1;
            Customer fetchedCustomer = customerDAO.GetCustomerByID(customerId);

            if (fetchedCustomer != null) {
                System.out.println("Customer fetched successfully!");
                System.out.println("Name: " + fetchedCustomer.GetFirstName() + " " + fetchedCustomer.GetLastName());
                System.out.println("Email: " + fetchedCustomer.GetEmail());
            } else {
                System.out.println("Customer with ID " + customerId + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

