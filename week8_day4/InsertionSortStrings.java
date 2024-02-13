package week8_day4;

import java.util.Scanner;

public class InsertionSortStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Create an array to store the strings
        String[] strings = new String[n];
        
        // Ask the user to input the strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        // Perform Insertion Sort on the array of strings
        for (int i = 1; i < n; i++) {
            String key = strings[i];
            int j = i - 1;
            
            // Move elements of strings[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && strings[j].compareTo(key) > 0) {
                strings[j + 1] = strings[j];
                j = j - 1;
            }
            strings[j + 1] = key;
        }

        // Display the sorted list
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}

