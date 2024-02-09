package week8_day1;

public class MinHeapPriorityQueue {
    private int[] heap; // Array to store the elements of the heap
    private int size; // Current number of elements in the heap
    private int capacity; // Maximum capacity of the heap

    // Constructor to initialize the priority queue with a specified capacity
    public MinHeapPriorityQueue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1]; // Adding 1 to capacity to start indexing from 1
    }

    // Method to insert an element into the priority queue
    public void insert(int item) {
        if (size == capacity) { // Check if the priority queue is full
            System.out.println("Priority queue is full. Cannot insert.");
            return;
        }
        size++;
        heap[size] = item; // Insert the new element at the end of the heap
        int currentIndex = size;
        // Heapify upwards to maintain the heap property
        while (currentIndex > 1 && heap[currentIndex] < heap[currentIndex / 2]) {
            swap(currentIndex, currentIndex / 2); // Swap the current element with its parent if necessary
            currentIndex = currentIndex / 2; // Move up to the parent index
        }
    }

    // Method to delete and return the minimum element from the priority queue
    public int deleteMin() {
        if (isEmpty()) { // Check if the priority queue is empty
            System.out.println("Priority queue is empty. Cannot delete.");
            throw new IllegalStateException("Priority queue is empty");
        }
        int min = heap[1]; // Store the minimum element (at the root)
        heap[1] = heap[size]; // Replace the root with the last element in the heap
        size--;
        int currentIndex = 1;
        // Heapify downwards to maintain the heap property
        while (true) {
            int smallest = currentIndex;
            int leftChild = 2 * currentIndex;
            int rightChild = 2 * currentIndex + 1;
            if (leftChild <= size && heap[leftChild] < heap[smallest]) {
                smallest = leftChild;
            }
            if (rightChild <= size && heap[rightChild] < heap[smallest]) {
                smallest = rightChild;
            }
            if (smallest != currentIndex) {
                swap(currentIndex, smallest); // Swap the current element with the smallest child if necessary
                currentIndex = smallest; // Move down to the smallest child index
            } else {
                break; // If the current element is in its correct position, stop the loop
            }
        }
        return min; // Return the minimum element that was deleted
    }

    // Method to check if the priority queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the current number of elements in the priority queue
    public int size() {
        return size;
    }

    // Helper method to swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Main method to test the implementation of the priority queue
    public static void main(String[] args) {
        MinHeapPriorityQueue priorityQueue = new MinHeapPriorityQueue(5);

        // Insert elements into the priority queue
        priorityQueue.insert(3);
        priorityQueue.insert(1);
        priorityQueue.insert(4);
        priorityQueue.insert(2);
        priorityQueue.insert(5);

        System.out.println("Priority queue size: " + priorityQueue.size());

        // Delete and print the minimum element from the priority queue until it is empty
        while (!priorityQueue.isEmpty()) {
            System.out.println("Min element: " + priorityQueue.deleteMin());
        }
    }
}
