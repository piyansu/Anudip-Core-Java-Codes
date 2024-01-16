package week3_day5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class practise_one_age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your date of birth (MM/dd/yyyy): ");
        String dobString = scanner.next();

        // Assuming the calling code handles any potential exceptions
        LocalDate dob = LocalDate.parse(dobString, java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        Period age = Period.between(dob, LocalDate.now());

        System.out.println("Your age is approximately " + age.getYears() + " years.");

        scanner.close();
    }
}

