package week2_day1;

import java.util.*;

public class simpleinterest {
    public static void main(String[] args) {
        double p;
        int t;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount : ");
        p = sc.nextDouble();
        System.out.println("Enter Time (Year) : ");
        t = sc.nextInt();
        
        double interest;
        
        if (p > 10000) {
            interest = (p * t * 10) / 100;
        } else if (p > 5000) {
            interest = (p * t * 8) / 100;
        } else {
            interest = (p * t * 5) / 100;
        }

        // Display interest amount in words
        String interestInWords = convertNumberToWords((int) interest);
        System.out.println("Interest is : Rs." + interest + "/- (" + interestInWords + " Rupees)");

        // Close the scanner
        sc.close();
    }

    private static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        return convertToWordsHelper(number, "");
    }

    private static String convertToWordsHelper(int number, String current) {
        if (number == 0) {
            return current;
        }

        if (number < 10) {
            return current + units[number];
        } else if (number < 20) {
            return current + teens[number - 10];
        } else if (number < 100) {
            return convertToWordsHelper(number % 10, current + tens[number / 10] + " ");
        } else {
            return convertToWordsHelper(number % 100, current + units[number / 100] + " Hundred ");
        }
    }

    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
}

