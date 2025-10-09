import edu.bank.*; 

public class Lab_session5 {
    public static void main(String[] args) {
        Loan homeLoan = new HomeLoan();
        Loan autoLoan = new CarLoan();

        System.out.println("Home Loan Rate of Interest: " + homeLoan.getInterestRate());
        System.out.println("Car Loan Rate of Interest: " + autoLoan.getInterestRate());
    }
}
