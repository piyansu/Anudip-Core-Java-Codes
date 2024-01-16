package week2_day2;

import java.util.Scanner;

public class gross_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter Salary: ");
            double basicSalary = sc.nextDouble();

            if (basicSalary > 15000) {
                double hra = (basicSalary * 20) / 100;
                double da = (basicSalary * 60) / 100;
                System.out.println("Gross Salary: Rs." + (basicSalary + hra + da));
            } else {
                double hra = 3000;
                double da = (basicSalary * 70) / 100;
                System.out.println("Gross Salary: Rs." + (basicSalary + hra + da));
            }

            System.out.print("Enter -1 to continue or any other number to exit: ");
            choice = sc.nextInt();

        } while (choice == -1);

        System.out.println("Program exited.");
    }
}
