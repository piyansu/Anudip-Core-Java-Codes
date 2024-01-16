package week3_day5;

import java.time.Month;

public class LeapYear {
    public static void main(String[] args) {
        // Iterate over all months
        for (Month month : Month.values()) {
            // Get the total number of days in each month
            int daysInMonth = month.length(false);

            // Print the month name and the total number of days
            System.out.println(month + ": " + daysInMonth + " days");
        }
    }
}

