import java.util.Scanner;

public class Problem_2_19 {

    public static void main(String[] args) {

        // Call the Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the coordinates of three points separated by spaces " +
                "like x1 y1 x2 y2 x3 y3:  ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Calculate distance between points
        double side_one = Math.pow((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)) ,0.5);
        double side_two = Math.pow((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2)) ,0.5);
        double side_three = Math.pow((Math.pow(x3 - x1, 2)) +  (Math.pow(y3 - y1, 2)) ,0.5);

        // Calculate side
        double side = (side_one + side_two + side_three) / 2;

        // Calculate area
        double area = Math.pow(side*(side - side_one) * (side - side_two)
                * (side - side_three) ,0.5);

        // Display result
        System.out.print("The area of the triangle is " + area);

    }
}
