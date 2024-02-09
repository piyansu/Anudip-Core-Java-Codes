package week8_day1;

public class Queue {
    private int[] array; // Array to store the elements of the queue
    private int front; // Index of the front element
    private int rear; // Index where the next element will be inserted (rear)
    private int size; // Current number of elements in the queue
    private int capacity; // Maximum capacity of the queue

    // Constructor to initialize the queue with a specified capacity
    public Queue(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    // Method to insert an element into the queue
    public void enqueue(int item) {
        if (size == capacity) { // Check if the queue is full
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        array[rear] = item; // Insert the new element at the rear position
        rear++; // Move the rear pointer to the next position
        size++; // Increment the size of the queue
    }

    // Method to remove and return the front element from the queue
    public int dequeue() {
        if (isEmpty()) { // Check if the queue is empty
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // or throw an exception
        }
        int removedItem = array[front]; // Store the front element to return later
        front++; // Move the front pointer to the next position
        size--; // Decrement the size of the queue
        return removedItem; // Return the removed element
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the current number of elements in the queue
    public int size() {
        return size;
    }

    // Main method to test the implementation of the queue
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // Insert elements into the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.print("Original Queue : ");       
        for (int i = 0; i < queue.size(); i++) {
            // Print the elements of the queue
            System.out.print(queue.array[(queue.front + i) % queue.capacity] + " ");
         }
        
        System.out.println("\nDequeued item: " + queue.dequeue());
        
        System.out.print("Queue after dequeue: ");  
        for (int i = 0; i < queue.size(); i++) {
            // Print the elements of the queue after dequeue operation
            System.out.print(queue.array[(queue.front + i) % queue.capacity] + " ");
         }
        
        System.out.println("\nSize of the queue: " + queue.size());
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }

}
