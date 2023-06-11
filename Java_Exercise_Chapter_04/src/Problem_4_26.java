import java.util.Scanner;

public class Problem_4_26 {

    // Add variable like they did in pg. 138
    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        String s = input.nextLine();

        String dollar = s.substring(0,s.indexOf('.'));
        int change = Integer.parseInt(s.substring(s.indexOf('.') + 1));

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = change / 25;
        change = change % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = change / 10;
        change = change % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = change / 5;
        change = change % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = change;

        // Display results
        System.out.println("Your amount " + s + " consists of");
        System.out.println("    " + dollar + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");



    }

}
