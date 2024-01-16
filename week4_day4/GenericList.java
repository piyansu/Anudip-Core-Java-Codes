package week4_day4;

import java.util.ArrayList;

// GenericList class with a generic type parameter T
public class GenericList<T> {
    // ArrayList to store elements of type T
    ArrayList<T> list;

    // Constructor to initialize the ArrayList
    public GenericList() {
        this.list = new ArrayList<>();
    }

    // Method to add an element to the list
    public void addElement(T element) {
        list.add(element);
    }

    // Method to get an element from the list by index
    public T getElement(int index) {
        // Check if the index is within bounds
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            // Throw an exception if the index is out of bounds
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    // Method to print all elements in the list
    public void printList() {
        for (T element : list) {
            System.out.print(element+"  ");
        }
    }

    // Main method to demonstrate the usage of GenericList
    public static void main(String[] args) {
        // Create an instance of GenericList with String elements
        GenericList<String> stringList = new GenericList<>();

        // Adding elements
        stringList.addElement("Sumitra Sir");
        stringList.addElement("Piyansu");
        stringList.addElement("Hirak Sir");
        stringList.addElement("Avik Sir");

        // Retrieving and printing elements
        System.out.println("Element at index 1: " + stringList.getElement(1));

        // Printing the entire list
        System.out.println("List elements: ");
        stringList.printList();
    }
}
