package week6_day3;

import java.io.Console;

public class ConsoleInputExample {
    public static void main(String[] args) {
        // Get the console
        Console console = System.console();

        // Read the first number as a String
        String num1Str = console.readLine("Enter the first number: ");

        // Read the second number as a String
        String num2Str = console.readLine("Enter the second number: ");

        try {
            // Convert the Strings to numbers
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);

            // Perform the addition
            double sum = num1 + num2;

            // Print the result
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid number
            System.err.println("Invalid input. Please enter valid numbers.");
        }
    }
}
