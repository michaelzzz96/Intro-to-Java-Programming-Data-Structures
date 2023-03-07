import java.util.Scanner;


public class Problem_2_9 {


    public static void main(String[] args) {

        // Create the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter v0, v1, and t: ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double time = input.nextDouble();

        // Calculate average acceleration
        double acceleration = (v1 - v0) / time;

        // Display result
        System.out.print("The average acceleration is " + acceleration);

    }

}
