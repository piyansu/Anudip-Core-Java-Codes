package week5_day1;

// Thread class representing a participant in the race
class RaceThread extends Thread {
    String threadName;

    // Constructor to set the thread's name
    public RaceThread(String name) {
        this.threadName = name;
    }

    // Run method contains the logic to simulate the race
    @Override
    public void run() {
        for (int i = 1; ; i++) {
            // Display the thread name and current iteration number
            System.out.println(threadName + " - Iteration: " + i);

            try {
                // Introduce a delay between iterations
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle interrupted exception (print stack trace)
                e.printStackTrace();
            }
        }
    }
}

// Main class for the race simulation
public class RaceSimulation {
    public static void main(String[] args) {
        // Creating three threads with different names and priorities
        RaceThread thread1 = new RaceThread("Thread 1");
        thread1.setPriority(Thread.MIN_PRIORITY); // Set minimum priority

        RaceThread thread2 = new RaceThread("Thread 2");
        thread2.setPriority(Thread.NORM_PRIORITY); // Set default priority

        RaceThread thread3 = new RaceThread("Thread 3");
        thread3.setPriority(Thread.MAX_PRIORITY); // Set maximum priority

        // Starting the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
