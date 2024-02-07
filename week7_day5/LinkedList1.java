package week7_day5;

public class LinkedList1 {
    
    // Inner class representing a node in the linked list
	class Node {
        int data;   // Data stored in the node
        Node next;  // Reference to the next node in the list

        // Constructor to initialize the node with data and null next reference
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }

    Node head;  // Reference to the first node in the linked list

    // Constructor to initialize an empty linked list
    public LinkedList1() {
        this.head = null;
    }

    // Method to add a new node at the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        if (head == null) {
            // If the list is empty, set the new node as the head
            head = newNode;
        } else {
            // Otherwise, traverse to the end of the list and append the new node
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to reverse the linked list in-place
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            // Store the next node in a temporary variable
            next = current.next;
            // Reverse the link of the current node to point to the previous node
            current.next = prev;
            // Move prev to the current node
            prev = current;
            // Move current to the next node
            current = next;
        }
        // Update the head to point to the last node which is now the first node
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list:");
        // Print the original list
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        // Reverse the list
        list.reverse();

        System.out.println("Reversed list:");
        // Print the reversed list
        temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
