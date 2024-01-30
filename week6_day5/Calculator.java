package week6_day5 ;

// Functional interface for arithmetic operations
interface ArithmeticOperation {
    double performOperation(double num1, double num2);
}

// Main class for the calculator program
public class Calculator {
    public static void main(String[] args) {
        // Lambda expressions for addition, subtraction, multiplication, and division
        ArithmeticOperation addition = (num1, num2) -> num1 + num2;
        ArithmeticOperation subtraction = (num1, num2) -> num1 - num2;
        ArithmeticOperation multiplication = (num1, num2) -> num1 * num2;
        ArithmeticOperation division = (num1, num2) -> num1 / num2;

        // Numbers to perform operations on
        double operand1 = 10.0;
        double operand2 = 5.0;

        // Applying the lambda expressions
        System.out.println("Addition: " + addition.performOperation(operand1, operand2));
        System.out.println("Subtraction: " + subtraction.performOperation(operand1, operand2));
        System.out.println("Multiplication: " + multiplication.performOperation(operand1, operand2));
        System.out.println("Division: " + division.performOperation(operand1, operand2));
    }
}
