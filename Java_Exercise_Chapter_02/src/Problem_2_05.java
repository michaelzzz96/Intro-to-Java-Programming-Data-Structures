import java.util.Scanner;

public class Problem_2_5 {

    public static void main(String[] args) {

        // Create the scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the subtotal and gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble();

        // Calculate gratuity and total
        double gratuity = subtotal * (gratuity_rate / 100);
        double total = gratuity + subtotal;

        // Display results
        System.out.println("The gratuity is $ " + gratuity + " and total is $ " + total );

    }
}
