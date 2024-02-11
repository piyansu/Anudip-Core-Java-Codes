package week8_day3;

import java.util.Arrays;

public class BubbleSortStrings {
    public static void main(String[] args) {
        String[] array = {"banana", "apple", "orange", "grapes", "kiwi"}; // Sample array

        System.out.println("Original array: " + Arrays.toString(array));

        // Creating a copy of the original array for comparison
        String[] arrayCopy = Arrays.copyOf(array, array.length);

        // Sorting using Arrays.sort() method
        Arrays.sort(arrayCopy);
        System.out.println("Sorted array using Arrays.sort(): " + Arrays.toString(arrayCopy));

        // Sorting using Bubble sort algorithm for strings
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                // Compare adjacent strings and swap if they are in the wrong order
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(array));
    }
}

