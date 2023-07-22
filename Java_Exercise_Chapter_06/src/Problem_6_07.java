import java.util.Scanner;

public class Problem_6_7 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Total amount invested: ");
        double investment_amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double interest_rate = input.nextDouble();

        // Create a table header
        System.out.printf("\n%-10s%10s","Years","Future Value");
        int years = 0;
        for (int i = 1; years < 30; i++){
            years++;
            double future_amount = futureInvestmentValue(investment_amount, interest_rate,years);
            double compound = 0;
            compound += future_amount;
            System.out.printf("\n%1d %18.2f", years, compound);
        }

    }

    public static double futureInvestmentValue (double investmentAmount, double monthlyInterestRate, int years){

        double investment_value = investmentAmount * Math.pow(  1 + monthlyInterestRate/1200 , years * 12 );

        return investment_value;

    }

}
