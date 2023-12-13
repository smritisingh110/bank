import java.util.Scanner;

public class BankManagementSystem {
    
    public static void main(String[] args) {
        
        LoginSystem loginSystem = new LoginSystem();
        loginSystem.LoginValidation();

        BankSystem bankSystem = new BankSystem();
        Scanner scanner = new Scanner(System.in);

        // Example: Creating a new user account
        System.out.println("Creating a new user account...");
        bankSystem.createUserAccount("john_doe", "pass123", "John Doe");

        // Example: Updating user account details
        System.out.println("\nUpdating user account details...");
        bankSystem.updateUserAccount("john_doe", "newpass456", "John Doe Jr.");

        // Example: Deleting a user account
        System.out.println("\nDeleting a user account...");
        bankSystem.deleteUserAccount("john_doe");

        // Close the scanner when done
        scanner.close();
        ConnectionwithSQL sqlConnection =new ConnectionwithSQL();
        sqlConnection.JDBCMySQLConnection();

    }
}
