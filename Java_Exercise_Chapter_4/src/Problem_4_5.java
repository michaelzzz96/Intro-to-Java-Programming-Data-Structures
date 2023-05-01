import java.util.Scanner;

public class Problem_4_5 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the number of sides: ");
        int num_side = input.nextInt();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Get the area
        double area = (num_side * Math.pow(side, 2) ) / (4 * Math.tan(Math.PI / num_side));

        System.out.print("The area of the polygon is " + area);

    }

}
