package week8_day2;

public class BinarySearch {
    // Method to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        // Loop until the left index is less than or equal to the right index
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // If the key is present at the middle index, return the index
            if (arr[mid] == key) {
                return mid;
            }

            // If the key is greater than the element at the middle index, search in the right half
            if (arr[mid] < key) {
                left = mid + 1;
            }
            // If the key is smaller than the element at the middle index, search in the left half
            else {
                right = mid - 1;
            }
        }

        // If the key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25, 30, 35, 40}; // Sorted array
        int key = 25; // Element to search for

        // Perform binary search
        int index = binarySearch(array, key);

        // Display the result
        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index + ".");
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}

