import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    private String fullName;

    public User(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    // Getters and setters for other user attributes (not shown for brevity)
    public void setUsername(String username)
    {
        this.username=username;
    }
      public void setPassword(String password)
    {
        this.password=password;
    }
      public void setFullName(String fullName)
    {
        this.fullName=fullName;
    }
      public String getUsername()
    {
        return username;
    }
      public String getpassword()
    {
        return password;
    }
      public String getFullName()
    {
       return fullName;
    }

}

