import java.util.Scanner;

public class Problem_2_14 {

    public static void main(String[] args) {

        // Constants
        final double POUNDS_PER_INCH = 0.45359237;
        final double INCHES_PER_METER = 0.0254;

        // Create the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("\n");

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        System.out.print("\n");

        // Convert
         weight *= POUNDS_PER_INCH;
         height *= INCHES_PER_METER;

        // Calculate BMI
        double BMI = weight / (Math.pow(height, 2));

        // Display result
        System.out.print("BMI is " + BMI);

    }

}
