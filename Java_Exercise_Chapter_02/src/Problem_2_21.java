import java.util.Scanner;

public class Problem_2_21 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter investment amount: ");
        double investment_amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interest_rate = input.nextDouble();
        System.out.print("Enter number of years: ");
        double years = input.nextDouble() ;

        // Calculate future investment value
        double investment_value = investment_amount * Math.pow(  1 + interest_rate/1200 , years * 12 );

        // Display result
        System.out.print("Future value is $ " + investment_value);

    }

}
