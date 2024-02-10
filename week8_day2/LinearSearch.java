package week8_day2;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25, 30, 35, 40}; // Sample array
        int key = 25; // Element to search for
        boolean found = false; // Variable to track if the element is found
        int index = -1; // Variable to store the index of the found element

        // Perform linear search
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                found = true; // Set found to true if the key is found in the array
                index = i; // Store the index of the found element
                break; // Exit the loop if the key is found
            }
        }

        // Display the result
        if (found) {
            System.out.println("Element " + key + " found at index " + index + ".");
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
