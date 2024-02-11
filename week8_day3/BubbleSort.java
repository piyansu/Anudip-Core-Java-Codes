package week8_day3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90}; // Sample array
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        // Creating a copy of the original array for comparison
        int[] arrayCopy = Arrays.copyOf(array, array.length);

        // Sorting using Arrays.sort() method
        Arrays.sort(arrayCopy);
        System.out.println("Sorted array using Arrays.sort(): " + Arrays.toString(arrayCopy));
        
        // Sorting using Bubble sort algorithm
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(array));

    }
}
