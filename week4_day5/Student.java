package week4_day5;

import java.util.HashSet;
import java.util.Objects;

// Student class representing a student with studentName and studentID
class Student {
    private String studentName;
    private int studentID;

    // Constructor to initialize studentName and studentID
    public Student(int studentID , String studentName) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    // Override equals method to compare students based on studentID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentID == student.studentID;
    }

    // Override hashCode method to generate a hash code based on studentID
    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    // Main method to demonstrate the usage of Student class
    public static void main(String[] args) {
        // Creating three student instances with different studentID and studentName
        Student student1 = new Student(101, "Alice");
        Student student2 = new Student(102, "Bob");
        Student student3 = new Student(103, "Charlie");

        // Creating a HashSet to store unique students
        HashSet<Student> studentSet = new HashSet<>();

        // Adding students to the HashSet
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);

        // Creating another student with the same studentID as student1 but a different name
        Student student4 = new Student(101, "David");
        studentSet.add(student4);

        // Displaying all students in the HashSet
        System.out.println("Students in the set:");
        for (Student student : studentSet) {
            System.out.println("ID: " + student.studentID + ", Name: " + student.studentName);
        }
    }
}
