package week3_day5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class practise_two_firstday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (MM/dd/yyyy): ");
        String dateString = scanner.next();

        // Parse the input string to a LocalDate object
        LocalDate inputDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        // Calculate the date of the first day of the next month
        LocalDate firstDayOfNextMonth = inputDate.plusMonths(1).withDayOfMonth(1);

        // Print the result
        System.out.println("The date of the first day of the next month is: " +
                firstDayOfNextMonth.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        scanner.close();
    }
}

