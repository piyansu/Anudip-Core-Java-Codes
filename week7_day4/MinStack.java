package week7_day4;

import java.util.Stack;

public class MinStack {
    // Stack to store elements
    private Stack<Integer> stack;
    // Stack to keep track of minimum elements
    private Stack<Integer> minStack;

    // Constructor to initialize the stacks
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push operation: Add an element to the stack
    public void push(int x) {
        stack.push(x); // Push the element onto the main stack
        // Update minStack if the new element is smaller or equal
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop operation: Remove and return the top element from the stack
    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        int popped = stack.pop(); // Remove the top element from the main stack
        // Update minStack if the popped element is the minimum
        if (popped == minStack.peek()) {
            minStack.pop();
        }
        return popped;
    }

    // Top operation: Return the top element of the stack
    public int top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot get top element.");
        }
        return stack.peek(); // Return the top element of the main stack
    }

    // isEmpty operation: Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // getMin operation: Return the minimum element in the stack
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot get minimum element.");
        }
        return minStack.peek(); // Return the top element of the minStack
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(7);
        minStack.push(1);

        System.out.println("Minimum element in the stack: " + minStack.getMin()); // Output: 1

        minStack.pop(); // Remove the top element (1)
        minStack.pop(); // Remove the top element (7)

        System.out.println("Minimum element in the stack: " + minStack.getMin()); // Output: 2
    }
}
