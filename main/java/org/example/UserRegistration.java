import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("User Registration");
        System.out.println("-----------------");

        // Get user input for First Name
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        // Validate and display the result for First Name
        if (isValidName(firstName)) {
            System.out.println("Valid First Name: " + firstName);
        } else {
            System.out.println("Invalid First Name. Please follow the specified criteria.");
        }

        // Get user input for Last Name
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        // Validate and display the result for Last Name
        if (isValidName(lastName)) {
            System.out.println("Valid Last Name: " + lastName);
        } else {
            System.out.println("Invalid Last Name. Please follow the specified criteria.");
        }

        scanner.close();
    }

    // Function to validate the First and Last Name
    private static boolean isValidName(String name) {
        // Check if the Name starts with a capital letter and has a minimum length of 3 characters
        return name.matches("[A-Z][a-zA-Z]{2,}");
    }
}
