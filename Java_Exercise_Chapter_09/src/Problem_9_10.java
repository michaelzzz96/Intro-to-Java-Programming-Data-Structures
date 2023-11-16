import java.util.Scanner;

public class Problem_9_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Create a QuadraticEquation object
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        // Compute the real roots of the quadriatic equation if any.
        System.out.print("The equation has ");
        if (quadraticEquation.getDiscriminant() < 0)
            System.out.println("no real roots");
        else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("two roots " + quadraticEquation.getRoot1() +
                    " and " + quadraticEquation.getRoot2());
        }
        else {
            System.out.println("one root " + (quadraticEquation.getRoot1() > 0 ?
                    quadraticEquation.getRoot1() : quadraticEquation.getRoot2()));
        }


    }

    private static class QuadraticEquation{
        private double a;
        private double b;
        private double c;


        QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }


        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return Math.pow(b, 2) - 4 * a * c;
        }

        public double getRoot1() {
            return getDiscriminant() < 0 ? 0 :
                    ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        }

        public double getRoot2() {
            return getDiscriminant() < 0 ? 0 :
                    ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        }

    }

}
