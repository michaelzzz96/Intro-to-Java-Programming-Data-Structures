import java.util.Scanner;

public class Problem_5_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Enter loan amount
        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();

        // Enter number of years
        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        // Enter yearly interest rate
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        // Convert the interest in decimal
        double monthlyInterestRate = annualInterestRate / 1200;


        // Get the monthly rate
        double monthlyPayment = loanAmount
                * monthlyInterestRate
                / (1 - 1 / Math
                .pow(1 + monthlyInterestRate, numberOfYears * 12));


        // Get the total
        double TotalPayment = monthlyPayment * (numberOfYears * 12);


        System.out.println();

        System.out.printf("Monthly Payment: %.2f" , (int) (monthlyPayment * 100)
                / 100.0);
        System.out.println();
        System.out.printf("Total Payment: %.2f" , (int) (TotalPayment * 100)
                / 100.0 );

        System.out.println();


        double interest, balance = loanAmount, principal;

        System.out.println();

        System.out.println("Payment#   Interest   Principal   Balance");
        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-11d%-11.2f%-12.2f%7.2f%n",i, interest, principal, balance);
        }
    }
}
