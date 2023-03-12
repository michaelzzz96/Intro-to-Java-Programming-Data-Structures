import java.util.Scanner;

public class Problem_2_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double interest_rate = (0.05 / 12);

        // Prompt the user
        System.out.print("Enter the monthly saving account: ");
        double saving_amount = input.nextDouble();

        // First month
        double account_value = saving_amount * ( 1 + interest_rate);

        // Second month
        double monthly = (saving_amount + account_value) * ( 1 + interest_rate);

        // Third month
        monthly = ( monthly +  saving_amount) * ( 1 + interest_rate);

        // Fourth month
        monthly = ( monthly +  saving_amount) * ( 1 + interest_rate);

        // Fifth month
        monthly = ( monthly +  saving_amount) * ( 1 + interest_rate);

        // Sixth month
        monthly = ( monthly +  saving_amount) * ( 1 + interest_rate);

        System.out.print("After the sixth month, the account value is $ " + monthly);

    }

}
