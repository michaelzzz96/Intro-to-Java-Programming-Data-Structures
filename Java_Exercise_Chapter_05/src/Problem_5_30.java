import java.util.Scanner;

class Problem_5_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        double interest_rate = input.nextDouble();

        System.out.print("Enter the number of months: ");
        int month = input.nextInt();


        double monthly_interest = ((interest_rate / 100) / 12);

        double compound = 0;


        for (int i = 1; i <= month; i++){
            compound = (amount + compound) * (1 + monthly_interest);
        }

        System.out.printf("Amount in savings account after " + month + " months: $%.3f\n", compound);

    }

}
