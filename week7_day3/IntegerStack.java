package week7_day3;

public class IntegerStack {
    // Define a constant for the default capacity of the stack
    int DEFAULT_CAPACITY = 10;
    
    // Array to store stack elements
    int[] stack;
    
    // Index representing the top of the stack
    int top;

    // Constructor to initialize the stack with default capacity
    public IntegerStack() {
        this.stack = new int[DEFAULT_CAPACITY];
        this.top = -1;
    }

    // Method to add an item to the top of the stack
    public void push(int item) {
        // Check if the stack is full
        if (top == stack.length - 1) {
            throw new IllegalStateException("Stack is full");
        } else {
            // Increment the top index and add the item to the stack
            stack[++top] = item;
        }
    }

    // Method to remove and return the item from the top of the stack
    public int pop() {
        // Check if the stack is empty
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            // Return the item at the top and decrement the top index
            return stack[top--];
        }
    }

    // Method to return the item at the top of the stack without removing it
    public int peek() {
        // Check if the stack is empty
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            // Return the item at the top of the stack
            return stack[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Main method to demonstrate the usage of the IntegerStack class
    public static void main(String[] args) {
        // Create an instance of IntegerStack
        IntegerStack stack = new IntegerStack();

        // Push elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);
        
        // Display the top element without removing it
        System.out.println("Peek: " + stack.peek()); // Output: 15

        // Pop and display elements from the stack
        System.out.println("Pop: " + stack.pop());    // Output: 15
        System.out.println("Pop: " + stack.pop());    // Output: 10

        // Check if the stack is empty
        System.out.println("Is Empty: " + stack.isEmpty()); // Output: false

        // Pop remaining elements from the stack
        System.out.println("Pop: " + stack.pop());    // Output: 5

        // Check if the stack is empty after all elements are popped
        System.out.println("Is Empty: " + stack.isEmpty()); // Output: true
    }
}
