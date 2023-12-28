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
            return;
        }

        // Get user input for Last Name
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        // Validate and display the result for Last Name
        if (isValidName(lastName)) {
            System.out.println("Valid Last Name: " + lastName);
        } else {
            System.out.println("Invalid Last Name. Please follow the specified criteria.");
            return;
        }

        // Get user input for Email
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        // Validate and display the result for Email
        if (isValidEmail(email)) {
            System.out.println("Valid Email: " + email);
        } else {
            System.out.println("Invalid Email. Please follow the specified criteria.");
            return;
        }

        // Get user input for Mobile Number
        System.out.print("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine();

        // Validate and display the result for Mobile Number
        if (isValidMobileNumber(mobileNumber)) {
            System.out.println("Valid Mobile Number: " + mobileNumber);
        } else {
            System.out.println("Invalid Mobile Number. Please follow the specified criteria.");
            return;
        }

        // Get user input for Password
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Validate and display the result for Password
        if (isValidPassword(password)) {
            System.out.println("Valid Password: " + password);
        } else {
            System.out.println("Invalid Password. Please follow the specified criteria.");
        }

        scanner.close();
    }

    // Function to validate the First and Last Name
    private static boolean isValidName(String name) {
        // Check if the Name starts with a capital letter and has a minimum length of 3 characters
        return name.matches("[A-Z][a-zA-Z]{2,}");
    }

    // Function to validate the Email
    private static boolean isValidEmail(String email) {
        // Check if the Email follows the specified criteria
        return email.matches("[a-zA-Z]+(\\.[a-zA-Z]+)*@[a-zA-Z]+(\\.[a-zA-Z]{2,})*(\\.[a-zA-Z]{2,})");
    }

    // Function to validate the Mobile Number
    private static boolean isValidMobileNumber(String mobileNumber) {
        // Check if the Mobile Number follows the specified format: Country code followed by space and 10-digit number
        return mobileNumber.matches("\\d{2} \\d{10}");
    }

    // Function to validate the Password
    private static boolean isValidPassword(String password) {
        // Check if the Password has a minimum length of 8 characters and at least 1 uppercase letter
        return password.length() >= 8 && password.matches(".*[A-Z].*");
    }
}
