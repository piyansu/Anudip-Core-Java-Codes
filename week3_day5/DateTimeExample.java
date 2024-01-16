package week3_day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Create a LocalDateTime object representing the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define a custom date-time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Format the LocalDateTime object using the defined format
        String formattedDateTime = currentDateTime.format(formatter);

        // Print the formatted date and time
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}

