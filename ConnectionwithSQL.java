import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionwithSQL {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/BankManagementSystem";
    private static final String JDBC_USER = "admin";
    private static final String JDBC_PASSWORD = "admin";

    public  void JDBCMySQLConnection() {
        // Replace "your_mysql_username" and "your_mysql_password" with your MySQL credentials
        createUserAccount("User1", "12345", "User1");
    }

    public static void createUserAccount(String username, String password, String fullName) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the MySQL database
            try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                // Prepare the SQL statement
                String insertQuery = "INSERT INTO users (username, password, full_name) VALUES (?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                    // Set values for the parameters
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, password);
                    preparedStatement.setString(3, fullName);

                    // Execute the SQL statement
                    preparedStatement.executeUpdate();
                }
                System.out.println("User account created successfully for " + fullName);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Error creating user account.");
        }
    }
}
