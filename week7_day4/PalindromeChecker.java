package week7_day4;

import java.util.Stack;

public class PalindromeChecker {

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push characters of the first half of the string onto the stack
        int length = str.length();
        int halfLength = length / 2;
        for (int i = 0; i < halfLength; i++) {
            stack.push(str.charAt(i));
        }

        // Compare characters from the stack with the second half of the string
        int startIndex = halfLength + (length % 2); // Skip middle character if length is odd
        for (int i = startIndex; i < length; i++) {
            char c = str.charAt(i);
            // Check if the stack is empty or characters don't match
            if (stack.isEmpty() || stack.pop() != c) {
                return false; // Characters don't match, not a palindrome
            }
        }

        // If all characters match, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        String str1 = "racecar"; // Example palindrome string
        String str2 = "Piyansu"; // Example non-palindrome string
        
        // Check if the strings are palindromes and print the result
        System.out.println("Is \"" + str1 + "\" a palindrome : " + isPalindrome(str1));
        System.out.println("Is \"" + str2 + "\" a palindrome : " + isPalindrome(str2));
    }
}
