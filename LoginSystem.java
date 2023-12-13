import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSystem {
    private static Map<String, String> userCredentials; // Replace with a secure storage mechanism in a real-world application

    public LoginSystem() {
        this.userCredentials = new HashMap<>();
        // Add sample user credentials (username, password)
        userCredentials.put("User1", "12345");
        userCredentials.put("User2", "123456789");
    }

    public   boolean authenticateUser(String username, String password) {
        // Replace with secure authentication mechanism in a real-world application
        String storedPassword = userCredentials.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    public void LoginValidation()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Login System =====");

        // Loop until a valid login is provided
        while (true) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (authenticateUser(username, password)) {
                System.out.println("Login successful. Welcome, " + username + "!");
                // Call your bank management system or other functionalities here
                break; // Exit the loop if login is successful
            } else {
                System.out.println("Invalid credentials. Please try again.");
            }
        }

        // Close the scanner when done
        scanner.close();
    }
}
