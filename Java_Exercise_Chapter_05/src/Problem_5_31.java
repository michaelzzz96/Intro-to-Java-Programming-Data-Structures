import java.util.Scanner;

public class Problem_5_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        double interest_rate = input.nextDouble();

        System.out.print("Enter the number of months: ");
        int month = input.nextInt();


        double monthly_interest = (interest_rate / 1200);

        double compound = 0;

        // Create a table header
        System.out.printf("\n%-10s%10s","Month","CD Value");
        for (int i = 1; i <= month; i++){
            compound += amount + amount * (monthly_interest);
            System.out.printf("\n%1d %18.2f", i, compound);
        }


    }

}
