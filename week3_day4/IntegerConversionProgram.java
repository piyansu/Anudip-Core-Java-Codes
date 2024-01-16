package week3_day4;

import java.util.Scanner;

// Custom exception for null or empty input
class NullOrEmptyInputException extends Exception {
    public NullOrEmptyInputException(String message) {
        super(message);
    }
}

public class IntegerConversionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String userInput = scanner.nextLine();

            // Checking for null or empty input
            if (userInput == null || userInput.isEmpty()) {
                throw new NullOrEmptyInputException("Input is null or empty. Please enter a valid integer.");
            }

            // Attempting to convert the input to an integer directly in the main method
            int convertedValue = Integer.parseInt(userInput);
            System.out.println("Converted integer: " + convertedValue);

        } catch (NullOrEmptyInputException e) {
            // Handling NullOrEmptyInputException
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            // Handling NumberFormatException directly in the main method
            System.out.println("Error: Invalid input. Please enter a valid integer.");

        } catch (Exception e) {
            // Handling general exceptions
            System.out.println("Error: Something went wrong.");

        }
        scanner.close();
    }
}
