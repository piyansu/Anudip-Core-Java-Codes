package week3_day3;

import java.util.Scanner;

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class represents a simple bank account
class BankAccount {
    private double balance = 5000; // Initial balance is set to 5000

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws InsufficientFundsException {
        // Checking if the withdrawal amount exceeds the balance
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed. Insufficient funds.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

// Main class representing the banking application
public class BankingApplication {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Creating a BankAccount object
        BankAccount account = new BankAccount();

        try {
            // Asking the user to enter the deposit amount
            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            // Asking the user to enter the withdrawal amount
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);

        } catch (InsufficientFundsException e) {
            // Handling insufficient funds exception and displaying an error message
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handling general exceptions and displaying a generic error message
            System.out.println("Error: Something went wrong.");
        }
    }
}
