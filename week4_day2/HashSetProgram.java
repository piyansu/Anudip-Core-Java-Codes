package week4_day2;

import java.util.HashSet;

public class HashSetProgram {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numberSet = new HashSet<>();

        // Add numbers 5, 10, 15, 20, and 25 to the set
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);
        numberSet.add(20);
        numberSet.add(25);

        // Display the elements of the set
        System.out.println("Elements of the set: " + numberSet);

        // Check if the set contains the number 10
        if (numberSet.contains(15)) {
            System.out.println("Set contains 15");
        } else {
            System.out.println("Set does not contain 15");
        }

        // Remove the number 15 from the set
        numberSet.remove(15);
        System.out.println("Removed 15 from the set");

        // Display the size of the set
        System.out.println("Size of the set: " + numberSet.size());
    }
}
