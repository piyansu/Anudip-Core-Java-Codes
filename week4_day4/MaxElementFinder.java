package week4_day4;

public class MaxElementFinder {

    // Generic method to find the maximum element in an array of comparable elements
    public static <T extends Comparable<T>> T findMaxElement(T[] array) {
        // Initialize max with the first element of the array
        T max = array[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // Compare the current element with the current max
            if (array[i].compareTo(max) > 0) {
                // If the current element is greater, update max
                max = array[i];
            }
        }

        // Return the maximum element found
        return max;
    }

    public static void main(String[] args) {
        // Test with integers
        Integer[] intArray = {1, 5, 3, 8, 2};
        System.out.println("Maximum Integer: " + findMaxElement(intArray));

        // Test with doubles
        Double[] doubleArray = {1.5, 3.7, 2.2, 4.0, 1.0};
        System.out.println("Maximum Double: " + findMaxElement(doubleArray));

        // Test with strings
        String[] stringArray = {"apple", "banana", "orange", "grape"};
        System.out.println("Maximum String: " + findMaxElement(stringArray));
    }
}
