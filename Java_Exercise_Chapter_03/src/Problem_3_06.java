import java.util.Scanner;

public class Problem_3_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        double height = (feet * 12) + inches;

        final double KILOGRAMS_PER_POUNDS = 0.45359237;
        final double METERS_PER_INCHES = 0.0254;

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUNDS;
        double heightInMeters = height * METERS_PER_INCHES;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if ( bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }

}
