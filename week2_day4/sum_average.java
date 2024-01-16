package week2_day4;

import java.util.Scanner;

public class sum_average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int array [] = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        double average = (double) sum / size;

        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
        
    }
}
