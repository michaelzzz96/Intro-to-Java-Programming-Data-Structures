import java.util.Scanner;

public class Problem_2_12 {

    public static void main(String[] args) {

        // Call scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter speed and acceleration: ");

        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        // Calculation
        double length = Math.pow(speed, 2) / (2 * acceleration);

        // Display result
        System.out.println("The minimum runway for this airplane is " + length);



    }

}
