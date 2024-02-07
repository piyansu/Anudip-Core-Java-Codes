package week7_day5;

public class LinkedList2 {
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
    public LinkedList2() {
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

    // Method to append the elements of another list to this list
    public void appendList(LinkedList2 otherList) {
        if (otherList.head == null) {
            // If the other list is empty, nothing to append
            return;
        }

        // Traverse to the end of this list
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Append each node from the other list to this list
        temp.next = otherList.head;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the first list
        LinkedList2 list1 = new LinkedList2();
        list1.add(22);
        list1.add(33);
        list1.add(44);
        list1.add(55);

        // Create the second list
        LinkedList2 list2 = new LinkedList2();
        list2.add(66);
        list2.add(77);
        list2.add(88);
        list2.add(99);

        System.out.println("list1:");
        list1.printList();

        System.out.println("\nlist2:");
        list2.printList();

        // Append list2 to list1
        list1.appendList(list2);

        System.out.println("\nAfter appending list2 to list1:");
        list1.printList();
    }
}

