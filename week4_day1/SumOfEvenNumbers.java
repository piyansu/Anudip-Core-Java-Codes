package week4_day1;

import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add integers to the ArrayList
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(11);
        numbers.add(13);

        // Calculate the sum of even numbers directly inside the main method
        int sumOfEvenNumbers = 0;

        // Iterate through the ArrayList using a for loop
        for (int i = 0; i < numbers.size(); i++) {
            // Get the current number from the ArrayList
            int number = numbers.get(i);

            // Check if the number is even
            if (number % 2 == 0) {
                // Add the even number to the sum
                sumOfEvenNumbers += number;
            }
        }

        // Display the result
        System.out.println("ArrayList: " + numbers);
        System.out.println("Sum of Even Numbers: " + sumOfEvenNumbers);
    }
}
