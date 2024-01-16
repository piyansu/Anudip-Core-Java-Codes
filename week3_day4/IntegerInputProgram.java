package week3_day4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputProgram {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompting the user to enter an integer
            System.out.print("Enter an integer: ");
            // Reading the integer input from the user
            int userInput = scanner.nextInt();
            // Displaying the entered integer
            System.out.println("You entered: " + userInput);

        } catch (InputMismatchException e) {
            // Handling InputMismatchException
            // Displaying an error message for non-integer input
            System.out.println("Error: Invalid input. Please enter an integer.");

        } catch (Exception e) {
            // Handling general exceptions
            // Displaying a generic error message for any other exception
            System.out.println("Error: Something went wrong.");
            	
        }
        scanner.close();
    }
}
