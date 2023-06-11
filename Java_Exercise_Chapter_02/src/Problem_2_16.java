import java.util.Scanner;

public class Problem_2_16 {

    public static void main(String[] args) {

        // Call the Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the length of the side: ");
        double length_of_side = input.nextDouble();

        // Calculate Area
        double area = (3 * Math.pow(3,0.5) / 2 ) * (Math.pow(length_of_side, 2));

        // Display result
        System.out.print("The area of the hexagon is " + area);



    }

}
