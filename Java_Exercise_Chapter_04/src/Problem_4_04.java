import java.util.Scanner;

public class Problem_4_4 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate the area
        double area = (6 * Math.pow(side, 2) ) / (4 * Math.tan(Math.PI / 6));

        // Display result
        System.out.print("The area of the hexagon is " + area);


    }
}
