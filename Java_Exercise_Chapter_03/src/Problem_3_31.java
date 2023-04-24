import java.util.Scanner;

public class Problem_3_31 {


    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchange_rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = input.nextInt();

        if (convert == 0){

            System.out.print("Enter dollar amount: ");
            double dollar = input.nextDouble();
            double yuan_total = dollar * exchange_rate;
            System.out.print("$ " + dollar + " is " + yuan_total + " yuan");
        }

        else if (convert == 1){

            System.out.print("Enter RMB amount: ");
            double yuan = input.nextDouble();
            double dollar_total = yuan / exchange_rate;
            System.out.print( yuan + " yuan " + " is $" + dollar_total);
        }

        else{
            System.out.print("Incorrect input.");
        }

    }

}
