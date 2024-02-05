package week7_day3;

import java.util.Stack;

public class StringReverser {
    // Method to reverse a given string using a stack
    public static String reverseString(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string onto the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters from the stack to reverse the string
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // Return the reversed string
        return reversedString.toString();
    }

    // Main method to demonstrate the usage of the StringReverser class
    public static void main(String[] args) {
        // Example usage
        String originalString = "Hello I am Piyansu Saha";

        // Reverse the original string
        String reversedString = reverseString(originalString);

        // Print the original and reversed strings
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
