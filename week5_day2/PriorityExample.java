package week5_day2;

class MyThread extends Thread {
	String threadName;

    // Constructor to set the thread's name
    public MyThread(String name) {
        this.threadName = name;
    }
    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " is running iteration " + i);

            // Sleep duration based on priority
            try {
                if (getPriority() == Thread.MAX_PRIORITY) {
                    // High-priority thread sleeps for 1000 milliseconds (1 second)
                    Thread.sleep(1000);
                } else if (getPriority() == Thread.NORM_PRIORITY) {
                    // Medium-priority thread sleeps for 3000 milliseconds (3 seconds)
                    Thread.sleep(3000);
                } else {
                    // Low-priority thread sleeps for 5000 milliseconds (5 seconds)
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class PriorityExample {
    public static void main(String[] args) {
        // Create instances of MyThread with different priorities
        MyThread lowPriorityThread = new MyThread("Low Priority");
        MyThread mediumPriorityThread = new MyThread("Medium Priority");
        MyThread highPriorityThread = new MyThread("High Priority");

        // Start the threads
        lowPriorityThread.start();
        mediumPriorityThread.start();
        highPriorityThread.start();
    }
}
