import java.util.Scanner;

public class Problem_2_15 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculate distance
        double x_axis = Math.pow((x2 - x1),2);
        double y_axis = Math.pow((y2- y1), 2);

        // Math.pow((Math.pow((x2 - x1),2) + Math.pow((y2- y1), 2)), 0.5);
        double distance = Math.pow((x_axis + y_axis), 0.5);

        // Display result
        System.out.println("The distance between the two points is " + distance);


    }


}
