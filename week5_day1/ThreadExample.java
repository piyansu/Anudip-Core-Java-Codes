package week5_day1;

// Thread to calculate the average of the first 10 numbers
class AverageThread extends Thread {
    public void run() {
        double sum = 0;
        // Calculate the sum of the first 10 numbers
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        // Calculate and print the average
        double average = sum / 10;
        System.out.println("Average of first 10 numbers: " + average);
    }
}

// Thread to print the square of numbers in the array
class SquareThread extends Thread {
    int[] arr = {1, 20, 50, 15, 30};

    public void run() {
        System.out.print("Square of numbers in the array: ");
        // Iterate through the array and print the square of each number
        for (int num : arr) {
            System.out.print(num * num + " ");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Creating instances of the threads
        AverageThread t1 = new AverageThread();
        SquareThread t2 = new SquareThread();

        // Starting the threads
        t1.start();
        try {
            // Waiting for the averageThread to finish before starting squareThread
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
