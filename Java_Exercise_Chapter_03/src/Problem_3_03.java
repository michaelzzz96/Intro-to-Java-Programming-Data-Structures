import java.util.Scanner;

public class Problem_3_3 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the uer
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Get x
        double x = (e * d - b * f) / (a * d- b * c);

        // Get y
        double y = (a * f - e * c) / (a * d - b * c);

        // Check the equation
        if (a * d - b * c == 0)
            System.out.print("The equation has no solution");
        else
            System.out.print("x is " + x + " and y is " + y);



    }
}
