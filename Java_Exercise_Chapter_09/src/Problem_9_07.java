import java.util.Date;

public class Problem_9_7 {


    public static void main(String[] args) {
        Account account = new Account(1122, 20000);

        // Set annual interest rate of 4.5%
        account.setAnnualInterestRate(4.5);

        // Withdraw $2,500
        account.withdraw(2500);

        // Deposit $3,000
        account.deposit(3000);

        // Display the balance, the monthly interest,
        // and the date when this account was created
        System.out.println("\n          Account Statement");
        System.out.println("------------------------------------------");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Date created: " + account.getDateCreated());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.printf("Monthly interest: $%.2f\n",
                account.getMonthlyInterest());
    }

    private static class Account {
        private int id = 0;
        private double balance = 0.0;
        private double annualInterestRate = 0.0;
        private Date dateCreated;

        Account(){

        }

        Account(int NewId, double NewBalance){
            id = NewId;
            balance = NewBalance;
            dateCreated = new Date();

        }

        public void setId(int newId) {
            id = newId;
        }

        public void setBalance(double newBalance) {
            balance = newBalance;
        }

        public void setAnnualInterestRate(double newAnnualInterestRate) {
            annualInterestRate = newAnnualInterestRate;
        }

        // Accessor methods
        public int getId() {
            return id;
        }

        public double getBalance() {
            return balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        /** Return dateCreated */
        public String getDateCreated() {
            return dateCreated.toString();
        }

        public double getMonthlyInterestRate() {
            return annualInterestRate / 12;
        }

        // Methods
        public double getMonthlyInterest() {
            return balance * (getMonthlyInterestRate() / 100);
        }

        public void withdraw(double amount) {
            balance -= amount;
        }


        public void deposit(double amount) {
            balance += amount;
        }



    }


}
