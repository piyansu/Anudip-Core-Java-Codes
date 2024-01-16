package week1_day3;

public class Student {

    // Attributes
    private String name;
    private int age;
    private String department;

    // Constructor
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter methods for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Example main method for testing
    public static void main(String[] args) {
        // Creating a Student object using the constructor
        Student student = new Student("Piyansu Saha", 21, "Computer Science");

        // Displaying the details using getter methods
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());

        // Modifying the details using setter methods
        student.setAge(21);
        student.setDepartment("Electrical Engineering");

        // Displaying the modified details
        System.out.println("\nModified Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());
    }
}

