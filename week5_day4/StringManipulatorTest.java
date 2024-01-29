package week5_day4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringManipulatorTest {

    private final String input;
    private final String expectedReversed;
    private final String expectedUpperCase;
    private final boolean expectedIsPalindrome;

    public StringManipulatorTest(String input, String expectedReversed, String expectedUpperCase, boolean expectedIsPalindrome) {
        this.input = input;
        this.expectedReversed = expectedReversed;
        this.expectedUpperCase = expectedUpperCase;
        this.expectedIsPalindrome = expectedIsPalindrome;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"hello", "olleh", "HELLO", false},
                {"openai", "ianepo", "OPENAI", false},
                {"level", "level", "LEVEL", true},
                {"racecar", "racecar", "RACECAR", true},
                {"12321", "12321", "12321", true},
                {"", "", "", true}
        });
    }

    @Test
    public void testReverseString() {
        StringManipulator stringManipulator = new StringManipulator();
        assertEquals(expectedReversed, stringManipulator.reverse(input));
    }

    @Test
    public void testConvertToUppercase() {
        StringManipulator stringManipulator = new StringManipulator();
        assertEquals(expectedUpperCase, stringManipulator.convertToUppercase(input));
    }

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
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = reverse(cleanInput);
        return cleanInput.equals(reversed);
    }
}