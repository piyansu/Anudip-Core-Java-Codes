package week12_day1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Details:");
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Designation: ");
        String designation = scanner.nextLine();
        System.out.print("Salary: ");
        int salary = scanner.nextInt();

        Employee employee = new Employee();
        employee.setFullName(fullName);
        employee.setDepartment(department);
        employee.setDesignation(designation);
        employee.setSalary(salary);

        Laptop laptop = new Laptop();
        laptop.setBrand("YourBrand");
        laptop.setModel("YourModel");
        laptop.setPrice(1000);

        employee.setLaptop(laptop);

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employeeDao.saveEmployeeDetails(employee);

        System.out.println("Employee details saved successfully.");

        scanner.close();
    }
}
