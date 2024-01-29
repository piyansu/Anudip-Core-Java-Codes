package week5_day5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringManipulatorTest {

    // Variables to hold the parameters for each test case
    private final String input;
    private final String expectedReversed;
    private final String expectedUpperCase;
    private final boolean expectedIsPalindrome;

    // Constructor to initialize the test case parameters
    public StringManipulatorTest(String input, String expectedReversed, String expectedUpperCase, boolean expectedIsPalindrome) {
        this.input = input;
        this.expectedReversed = expectedReversed;
        this.expectedUpperCase = expectedUpperCase;
        this.expectedIsPalindrome = expectedIsPalindrome;
    }

    // Method to provide test data for parameterized tests
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"hello", "olleh", "HELLO", false},
                {"openai", "ianepo", "OPENAI", false},
                {"level", "level", "LEVEL", true},
                {"racecar", "racecar", "RACECAR", true},
                {"12321", "12321", "12321", true}
        });
    }

    // Test method to check if the reverse method works correctly
    @Test
    public void testReverseString() {
        StringManipulator stringManipulator = new StringManipulator();
        assertEquals(expectedReversed, stringManipulator.reverse(input));
    }

    // Test method to check if the convertToUppercase method works correctly
    @Test
    public void testConvertToUppercase() {
        StringManipulator stringManipulator = new StringManipulator();
        assertEquals(expectedUpperCase, stringManipulator.convertToUppercase(input));
    }

    // Test method to check if the isPalindrome method works correctly
    @Test
    public void testIsPalindrome() {
        StringManipulator stringManipulator = new StringManipulator();
        assertEquals(expectedIsPalindrome, stringManipulator.isPalindrome(input));
    }
}

class StringManipulator {

    // Method to reverse a string
    public String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Method to convert a string to uppercase
    public String convertToUppercase(String input) {
        return input.toUpperCase();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String input) {
        // Clean the input by removing non-alphanumeric characters and converting to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the clean input string
        String reversed = reverse(cleanInput);

        // Check if the clean input is equal to its reversed form
        return cleanInput.equals(reversed);
    }
}
