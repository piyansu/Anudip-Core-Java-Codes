package week4_day5;

import java.util.HashSet;

// Employee class representing an employee with employeeID and employeeName
class Employee {
    int employeeID;
    String employeeName;

    // Constructor to initialize employeeID and employeeName
    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    // Override equals method to compare employees based on employeeID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return employeeID == employee.employeeID;
    }

    // Main method to demonstrate the usage of Employee class
    public static void main(String[] args) {
        // Creating three employee instances with different employeeID and employeeName
        Employee emp1 = new Employee(101, "John");
        Employee emp2 = new Employee(102, "Alice");
        Employee emp3 = new Employee(103, "Bob");

        // Creating a HashSet to store unique employees
        HashSet<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);

        // Creating another employee with the same employeeID as emp1 but a different name
        Employee emp4 = new Employee(101, "Jane");
        employeeSet.add(emp4);

        // Displaying all employees in the HashSet
        System.out.println("Employees in the set:");
        for (Employee employee : employeeSet) {
            System.out.println("ID: " + employee.employeeID + ", Name: " + employee.employeeName);
        }
    }
}
