package org.example;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("User Registration");
        System.out.println("-----------------");

        // Get user input for First Name
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        // Validate and display the result
        if (isValidFirstName(firstName)) {
            System.out.println("Valid First Name: " + firstName);
        } else {
            System.out.println("Invalid First Name. Please follow the specified criteria.");
        }

        scanner.close();
    }

    // Function to validate the First Name
    private static boolean isValidFirstName(String firstName) {
        // Check if the First Name starts with a capital letter and has a minimum length of 3 characters
        return firstName.matches("[A-Z][a-zA-Z]{2,}");
    }
}
