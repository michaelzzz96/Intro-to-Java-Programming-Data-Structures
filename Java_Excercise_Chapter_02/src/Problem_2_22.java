import java.util.Scanner;

public class Problem_2_22 {

    public static void main(String[] args) {

        // Call the Scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in integer, for example 1156: ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        // Find the number of one dollar
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickles
        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount/100.0 + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickles + " nickles");
        System.out.println(" " + numberOfPennies + " pennies");

    }

}
