class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Not enough balance to withdraw ₹" + amount + "!");
        }
        balance -= amount;
        System.out.println("Withdrawal of ₹" + amount + " successful! Remaining balance: ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class Lab_session6 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(5000); 

        try {
            System.out.println("Trying to withdraw ₹6000...");
            myAccount.withdraw(6000); 
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction finished.");
        }

        try {
            System.out.println("\nTrying to withdraw ₹3000...");
            myAccount.withdraw(3000); 
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction finished.");
        }
    }
}
