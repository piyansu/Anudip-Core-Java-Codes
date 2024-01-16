package week1_day4;

interface BankAccount {
 void getBalance();
 void deposit(double amount); 
 void withdraw(double amount);
}

class BankAccountImpl implements BankAccount {
 private String accountHolderName;
 private String bankName;
 private double accountBalance;

 public BankAccountImpl(String accountHolderName, String bankName, double initialBalance) {
     this.accountHolderName = accountHolderName;
     this.bankName = bankName;
     this.accountBalance = initialBalance;
 }

 public void getBalance() {
     System.out.println("Account Balance for " + accountHolderName + ": "+accountBalance);
 }

 public void deposit(double amount) {
     if (amount > 0) {
         accountBalance += amount;
         System.out.println("Deposit successful , amount : "+amount);
     } else {
         System.out.println("Invalid deposit amount for " + accountHolderName + " (" + bankName + ").");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= accountBalance) {
         accountBalance -= amount;
         System.out.println("Withdrawal successful , amount : "+amount);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient funds for " + accountHolderName + " (" + bankName + ").");
     }
 }

}

public class BankAccountExample {
 public static void main(String[] args) {
     BankAccount account1 = new BankAccountImpl("Piyansu Saha", "ICICI", 1000.0);
     BankAccount account2 = new BankAccountImpl("Joy Ghosh", "HDFC", 1500.0);
     BankAccount account3 = new BankAccountImpl("Bubun", "SBI", 2000.0);

     account1.getBalance();
     account2.getBalance();
     account3.getBalance();
     System.out.println("\n");
     
     account1.deposit(500.0);
     account2.deposit(200.0);
     account3.deposit(1000.0);
     System.out.println("\n");
     
     account1.getBalance();
     account2.getBalance();
     account3.getBalance();
     System.out.println("\n");
     
     account1.withdraw(300.0);
     account2.withdraw(100.0);
     account3.withdraw(500.0);
     System.out.println("\n");
     
     account1.getBalance();
     account2.getBalance();
     account3.getBalance();
 }
}

