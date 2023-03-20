import java.util.Scanner;

public class Problem_2_20 {

    public static void main(String[] args) {

        // Call the Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interest_rate = input.nextDouble() ;

        // Calculate interest
        double interest = (balance) * (interest_rate / 1200);

        // Display result
        System.out.print("The interest is " + interest);

    }


}
