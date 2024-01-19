package week5_day2;

import java.util.LinkedList;
import java.util.Queue;

// SenderThread class for sending messages to the shared queue
class SenderThread extends Thread {
    private Queue<String> queue; // Shared message queue
    private int capacity; // Maximum capacity of the queue

    // Constructor to initialize the sender thread with the shared queue and capacity
    public SenderThread(Queue<String> queue, int capacity) {
        this.queue = queue;
        this.capacity = capacity;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (queue) {
                // Wait if the queue is full
                while (queue.size() == capacity) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Add message to the queue
                String message = "Message " + i;
                queue.add(message);
                System.out.println("Sent message: " + message);

                // Notify receiver that a message is available
                queue.notifyAll();
            }
        }
    }
}

// ReceiverThread class for receiving messages from the shared queue
class ReceiverThread extends Thread {
    private Queue<String> queue; // Shared message queue

    // Constructor to initialize the receiver thread with the shared queue
    public ReceiverThread(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (queue) {
                // Wait if the queue is empty
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Remove and return message from the queue
                String receivedMessage = queue.poll();
                System.out.println("Received message: " + receivedMessage);

                // Notify sender that space is available in the queue
                queue.notifyAll();
            }
        }
    }
}

// Main class to demonstrate the messaging system
public class MessagingSystem {
    public static void main(String[] args) {
        Queue<String> messageQueue = new LinkedList<>(); // Shared message queue
        int capacity = 3; // Maximum capacity of the queue

        // Create sender and receiver threads with the shared queue
        SenderThread senderThread = new SenderThread(messageQueue, capacity);
        ReceiverThread receiverThread = new ReceiverThread(messageQueue);

        // Start sender and receiver threads
        senderThread.start();
        receiverThread.start();
    }
}
