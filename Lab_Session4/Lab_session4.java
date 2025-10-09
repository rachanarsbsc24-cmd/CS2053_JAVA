abstract class Account {
    protected String holderName;
    protected double balance;

    public Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    abstract void computeInterest();

    public void showDetails() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends Account {
    private double rate = 0.04; 

    public SavingsAccount(String holderName, double balance) {
        super(holderName, balance);
    }

    @Override
    void computeInterest() {
        double interest = balance * rate;
        System.out.println("Interest for Savings Account: ₹" + interest);
    }
}

class CurrentAccount extends Account {
    private double serviceFee = 100.0;

    public CurrentAccount(String holderName, double balance) {
        super(holderName, balance);
    }

    @Override
    void computeInterest() {
        System.out.println("Current Account has no interest. Service Fee: ₹" + serviceFee);
    }
}

public class Lab_session4 {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount("Samir", 50000);
        Account acc2 = new CurrentAccount("Rajat", 30000);

        System.out.println("--- Savings Account ---");
        acc1.showDetails();
        acc1.computeInterest();

        System.out.println("\n--- Current Account ---");
        acc2.showDetails();
        acc2.computeInterest();
    }
}
