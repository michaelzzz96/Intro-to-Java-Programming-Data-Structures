// https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_12/Exercise_12_04/TestLoanClass.java



import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem_12_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter annual interest rate, for example, 8.25: ");

                double annualInterestRate = input.nextDouble();

                System.out.print("Enter number of years as an integer: ");
                int numberOfYears = input.nextInt();

                System.out.print("Enter loan amount, for example, 120000.95: ");
                double loanAmount = input.nextDouble();


                Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);


                System.out.printf("The loan was created created on %s\n" +
                                "The monthly payment is %.2f\nThe total payment is %.2f\n",
                        loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());

            } catch (IllegalArgumentException ex) {
                System.out.println("IllegalArgumentException: " + ex.getMessage());
                //input.nextLine();
            }
        } while (continueInput);

    }

        private static class Loan {
            private double annualInterestRate;
            private int numberOfYears;
            private double loanAmount;
            private java.util.Date loanDate;

            /**
             * Default constructor
             */
            public Loan() {
                this(2.5, 1, 1000);
            }

            /**
             * Construct a loan with specified annual interest rate,
             * number of years, and loan amount
             */
            public Loan(double annualInterestRate, int numberOfYears,
                        double loanAmount) {
                if (loanAmount <= 0)
                    throw new IllegalArgumentException("loanAmount must be greater than 0.");
                if (annualInterestRate <= 0)
                    throw new IllegalArgumentException("annualInterestRate must be greater than 0.");
                if (numberOfYears <= 0)
                    throw new IllegalArgumentException("numberOfYears must be greater than 0.");

                this.annualInterestRate = annualInterestRate;
                this.numberOfYears = numberOfYears;
                this.loanAmount = loanAmount;
                loanDate = new java.util.Date();
            }

            /**
             * Return annualInterestRate
             */
            public double getAnnualInterestRate() {
                return annualInterestRate;
            }

            /**
             * Set a new annualInterestRate
             */
            public void setAnnualInterestRate(double annualInterestRate) {
                if (annualInterestRate <= 0)
                    throw new IllegalArgumentException("annualInterestRate must be greater than 0.");
                this.annualInterestRate = annualInterestRate;
            }

            /**
             * Return numberOfYears
             */
            public int getNumberOfYears() {
                return numberOfYears;
            }

            /**
             * Set a new numberOfYears
             */
            public void setNumberOfYears(int numberOfYears) {
                if (numberOfYears <= 0)
                    throw new IllegalArgumentException("numberOfYears must be greater than 0.");
                this.numberOfYears = numberOfYears;
            }

            /**
             * Return loanAmount
             */
            public double getLoanAmount() {
                return loanAmount;
            }

            /**
             * Set a newloanAmount
             */
            public void setLoanAmount(double loanAmount) {
                if (loanAmount <= 0)
                    throw new IllegalArgumentException("loanAmount must be greater than 0.");
                this.loanAmount = loanAmount;
            }

            /**
             * Find monthly payment
             */
            public double getMonthlyPayment() {
                double monthlyInterestRate = annualInterestRate / 1200;
                double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                        (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
                return monthlyPayment;
            }

            /**
             * Find total payment
             */
            public double getTotalPayment() {
                double totalPayment = getMonthlyPayment() * numberOfYears * 12;
                return totalPayment;
            }

            /**
             * Return loan date
             */
            public java.util.Date getLoanDate() {
                return loanDate;
            }

        }
    }


