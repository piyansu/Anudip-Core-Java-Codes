package week1_day5;

public class BankAccount {
	String accountHolderName ;
	int accountNumber ;
	int balance;
	
	public BankAccount(String accountHolderName , int accountNumber , int balance) {
		this.accountHolderName = accountHolderName ; 
		this.accountNumber = accountNumber ; 
		this.balance = balance ; 
	}
	
	public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account. New balance: " + balance);
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from account. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }
    
    public static void main(String[] args) {
    	BankAccount a1 = new BankAccount("Piyansu Saha", 123456, 5000);
    	
    	System.out.println("Present Balance = "+a1.getBalance());
    	a1.deposit(3000);
    	a1.withdraw(4000);
    	System.out.println("Present Balance = "+a1.getBalance());
    	
    	String status;
    	if (a1.balance >= 3000) {
    	    status = "Minimum Balance Maintained";
    	} else {
    	    status = "Minimum Balance not Maintained";
    	}
    	
    	System.out.println("Account Status: " + status);
    	
	}
	
}

