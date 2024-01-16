package week1_day2;

public class Employee {

    // Protected member variables
    protected int id;
    protected String name;
    protected int age;
    protected boolean isPermanent;

    // Main method
    public static void main(String[] args) {
        System.out.println("Successfully started");

        // Creating an instance of the class
        Employee employee = new Employee();

        // Assigning a double value to age with casting
        double ageDouble = 35.5;
        employee.age = (int) ageDouble;
    }
}
