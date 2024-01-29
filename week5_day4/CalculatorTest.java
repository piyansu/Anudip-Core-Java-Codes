package week5_day4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	
	// Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Test addition with positive numbers
    @Test
    public void AdditionWithPositiveNumbers() {
    	// Create an instance of the CalculatorTest class
    	CalculatorTest calculator = new CalculatorTest();
    	// Call the add method with arguments 2 and 3
        int result = calculator.add(2, 3);
        // Assert that the result is equal to 5
        assertEquals(5, result);
    }

    // Test addition with negative numbers
    @Test
    public void AdditionWithNegativeNumbers() {
    	// Create an instance of the CalculatorTest class
    	CalculatorTest calculator = new CalculatorTest();
        // Call the add method with arguments -2 and -3
        int result = calculator.add(-2, -3);
        // Assert that the result is equal to -5
        assertEquals(-5, result);
    }

    // Test subtraction with positive numbers
    @Test
    public void SubtractionWithPositiveNumbers() {
    	// Create an instance of the CalculatorTest class
    	CalculatorTest calculator = new CalculatorTest();
        // Call the subtract method with arguments 8 and 3
        int result = calculator.subtract(8, 3);
        // Assert that the result is equal to 5
        assertEquals(5, result);
    }

    // Test subtraction with negative numbers
    @Test
    public void SubtractionWithNegativeNumbers() {
    	// Create an instance of the CalculatorTest class
    	CalculatorTest calculator = new CalculatorTest();
        // Call the subtract method with arguments -8 and -3
        int result = calculator.subtract(-8, -3);
        // Assert that the result is equal to -5
        assertEquals(-5, result);
    }
}
