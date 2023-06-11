import java.util.Scanner;

public class Problem_4_2 {

    public static void main(String[] args) {

        final double RADIUS = 6371.01;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double X1 = Math.toRadians(x1);
        double Y1 = Math.toRadians(y1);

        double X2 = Math.toRadians(x2);
        double Y2 = Math.toRadians(y2);

        double d = RADIUS * Math.acos(Math.sin(X1) * Math.sin(X2) + Math.cos(X1) * Math.cos(X2)
        * Math.cos(Y1 - Y2));

        System.out.print("The distance between the two points is " + d + " km");

    }

}
