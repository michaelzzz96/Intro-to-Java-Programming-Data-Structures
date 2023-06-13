import java.util.Scanner;

public class Problem_5_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loan = input.nextDouble();

        System.out.print("Number of years: ");
        int years = input.nextInt();

        System.out.println();


        // Create a table header
       System.out.printf("%-10s%20s%20s","Interest Payment","Monthly Payment","Total Payment");
        for(double interest = 5; interest <= 8; interest = interest + .125){
            System.out.println();

            // Convert the interest in decimal
            double rate = (interest / 100);

            // Get the monthly rate
            double monthly = ((loan * rate / 12) * (Math.pow((1 + rate/12),(years * 12)))) /
                    (Math.pow((1 + rate / 12),(years * 12)) - 1);

            // Get the total
            double total = monthly * (years * 12);

            // http://javablogx.blogspot.com/2014/09/printing-percent-sign-using-printf.html
            System.out.printf("%.3f%% %20.2f %23.2f", interest, monthly , total);

        }


    }

}
