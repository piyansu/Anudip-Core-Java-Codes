package week3_day3;

import java.util.Scanner;

// Custom exception for an invalid operator
class InvalidOperatorException extends Exception {
    public InvalidOperatorException(String message) {
        super(message);
    }
}

// Custom exception for division by zero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class simplecalculator {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Getting the first number from the user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Getting the second number from the user
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Getting the operator from the user
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            // Performing the calculation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Checking for division by zero
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        throw new DivisionByZeroException("Cannot divide by zero");
                    }
                    break;
                default:
                    // Throwing an exception for an invalid operator
                    throw new InvalidOperatorException("Invalid operator entered");
            }

            // Displaying the result
            System.out.println("Result: " + result);

        } catch (InvalidOperatorException | DivisionByZeroException e) {
            // Handling specific exceptions and displaying error messages
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handling general exceptions and displaying a generic error message
            System.out.println("Error: Something went wrong.");
        }
    }
}
