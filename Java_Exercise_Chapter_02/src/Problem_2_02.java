import java.util.Scanner;

public class Problem_2_2 {

    public static void main(String[] args) {
        // Constant
        final double PI = 3.14159265359;

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Enter prompt
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        // Get Calculations
        double area = radius * radius * PI;
        double volume = area * length;

        // Display results
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }

}
