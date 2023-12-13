import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankSystem {
    private Map<String, User> userAccounts;

    public BankSystem() {
        this.userAccounts = new HashMap<>();
    }

    // Method to create a new user account
    public void createUserAccount(String username, String password, String fullName) {
        User newUser = new User(username, password, fullName);
        userAccounts.put(username, newUser);
        System.out.println("User account created successfully for " + fullName);
    }

    // Method to update user account details
    public void updateUserAccount(String username, String newPassword, String newFullName) {
        User user = userAccounts.get(username);
        if (user != null) {
            // Update user details
            user.setPassword(newPassword);
            user.setFullName(newFullName);
            System.out.println("User account details updated successfully for " + newFullName);
        } else {
            System.out.println("User not found. Update failed.");
        }
    }

    // Method to delete a user account
    public void deleteUserAccount(String username) {
        if (userAccounts.containsKey(username)) {
            userAccounts.remove(username);
            System.out.println("User account deleted successfully.");
        } else {
            System.out.println("User not found. Deletion failed.");
        }
    }

   
}
