package week1_day2;

public class Student {

    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;

    // Constructor
    public Student(String studentName, String collegeName, int studentID) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.studentID = studentID;
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getStudentID() {
        return studentID;
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Successful");
    }
}
