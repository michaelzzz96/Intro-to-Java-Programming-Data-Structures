import java.util.Scanner;

public class Problem_2_3 {

    public static void main(String[] args) {

        // Create the scanner class
        Scanner input = new Scanner(System.in);

        // Enter value for feet
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        // Calculations for meter
        double meter = feet * 0.305;

        // Display results
        System.out.println(feet + " feet is " + meter + " meters");

    }
}
