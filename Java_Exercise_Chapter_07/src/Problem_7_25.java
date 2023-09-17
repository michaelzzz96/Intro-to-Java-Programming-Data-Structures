import java.util.Scanner;

public class Problem_7_25 {

    public static void main(String[] args) {

        double[] eqn = new double[3];
        double[] roots = new double[2];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c:");
        eqn[0] = input.nextDouble();
        eqn[1] = input.nextDouble();
        eqn[2] = input.nextDouble();

        int numberOfRoots = solveQuadratic(eqn, roots);

        if (numberOfRoots == 0) {
            System.out.println("The equation has no real roots");

        } else if (numberOfRoots == 2) {
            System.out.println("The equation has two roots " + roots[0]
                    + " and " + roots[1]);
        } else if (numberOfRoots == 1) {
            System.out.println("The equation has one root " + roots[0]);
        }

    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {

            return 0;
        }

        roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
        roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);

        if (discriminant > 0) {
            return 2;
        } else {

            return 1;
        }

    }


}
