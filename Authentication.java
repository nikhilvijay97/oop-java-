import java.util.Scanner;

// File: CredentialException.java [cite: 2]
class CredentialException extends Exception {
    public CredentialException(String s) {
        // Pass the error message to the superclass (Exception) constructor [cite: 1, 2]
        super(s);
    }
}

// File: Authentication.java [cite: 2]
public class Authentication {
    public static void main(String[] args) {
        // Predefined credentials [cite: 2]
        String username = "Ashish";
        String password = "@Ashish123";
        
        Scanner sc = new Scanner(System.in);
        
        // Reading input from user [cite: 2]
        System.out.println("Enter the Username");
        String u1 = sc.nextLine();
        
        System.out.println("Enter the Password");
        String u2 = sc.nextLine();
        
        try {
            // Check if entered credentials match predefined ones 
            if ((u1.equals(username)) && (u2.equals(password))) {
                System.out.println("Access Granted");
            } else {
                // Manually throw the user-defined exception 
                throw new CredentialException("Invalid Credentials");
            }
        } 
        catch (CredentialException e) {
            // Catch and display the exception message 
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}