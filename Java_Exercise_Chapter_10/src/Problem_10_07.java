import java.util.Scanner;
import java.util.Date;


public class Problem_10_7 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create ten accounts in an array
        Account[] accounts = new Account[10];

        // Initialize accounts with balance
        initialBalance(accounts);

        // Once the system starts, it will not stop
        do {
            // Prompt user to enter an id
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            if (isValidID(id, accounts)) {
                int choice;
                do {
                    // Get user choice
                    choice = displayMainMenu(input);
                    if (isTransaction(choice)) {
                        executeTransaction(choice, accounts, id, input);
                    }
                } while (choice != 4); // If 4 exit main menu
            }
            // Once you exit, the system will prompt for an id again
        } while (true);
    }

    /** Initialize accounts with balance of 100 */
    public static void initialBalance(Account[] a) {
        int initialBalance = 100;
        for (int i = 0; i < a.length; i++) {
            a[i] = new Account(i, initialBalance);
        }
    }

    /** Return true if choice is a transaction */
    public static boolean isTransaction(int choice) {
        return choice > 0 && choice < 4;
    }

    /** Return true if ID is valid */
    public static boolean isValidID(int id, Account[] a) {
        for (int i = 0; i < a.length; i++) {
            if (id == a[i].getId())
                return true;
        }
        return false;
    }

    /** Display main menu */
    public static int displayMainMenu(Scanner input) {
        System.out.print(
                "\nMain menu\n1: check balance\n2: withdraw" +
                        "\n3: deposit\n4: exit\nEnter a choice: ");
        return input.nextInt();
    }

    /** Execute a Transaction */
    public static void executeTransaction(
            int c, Account[] a, int id, Scanner input) {
        switch (c) {
            case 1: // Viewing the current balance
                System.out.println("The balance is " + a[id].getBalance());
                break;
            case 2: // Withdraw money
                System.out.print("Enter an amount to withdraw: ");
                a[id].withdraw(input.nextDouble());
                break;
            case 3: // Deposit money
                System.out.print("Enter an amount to deposit: ");
                a[id].deposit(input.nextDouble());
        }
    }


    private static class Account{
        // Data fields
        private int id;
        private double balance;
        private static double annualInterestRate;
        private Date dateCreated;

        // Constructors
        /** Creates a default account */
        Account() {
            id = 0;
            balance = 0;
            annualInterestRate = 0;
            dateCreated = new Date();
        }

        /** Creates an account with the specified id and initial balance */
        Account(int newId, double newBalance) {
            id = newId;
            balance = newBalance;
            dateCreated = new Date();
        }

        // Mutator methods
        /** Set id */
        public void setId(int newId) {
            id = newId;
        }

        /** Set balance */
        public void setBalance(double newBalance) {
            balance = newBalance;
        }

        /** Set annualInterestRate */
        public void setAnnualInterestRate(double newAnnualInterestRate) {
            annualInterestRate = newAnnualInterestRate;
        }

        // Accessor methods
        /** Return id */
        public int getId() {
            return id;
        }

        /** Return balance */
        public double getBalance() {
            return balance;
        }

        /** Return annualInterestRate */
        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        /** Return dateCreated */
        public String getDateCreated() {
            return dateCreated.toString();
        }

        /** Return monthly interest rate */
        public double getMonthlyInterestRate() {
            return annualInterestRate / 12;
        }

        // Methods
        /** Return monthly interest */
        public double getMonthlyInterest() {
            return balance * (getMonthlyInterestRate() / 100);
        }

        /** Decrease balance by amount */
        public void withdraw(double amount) {
            balance -= amount;
        }

        /** Increase balance by amount */
        public void deposit(double amount) {
            balance += amount;
        }
    }

}
