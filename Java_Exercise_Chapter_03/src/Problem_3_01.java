import java.util.Scanner;

public class Problem_3_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Get the discriminant
       double discriminant = Math.pow(b,2) - 4 * a * c;

       double root1 = (-1 * b + Math.pow(discriminant, 0.5)) / (2 * a);
       double root2 = (-1 * b - Math.pow(discriminant, 0.5)) / (2 * a);

       if (discriminant > 0){
           System.out.println("The question has two roots " + root1 + " and " + root2);
       }
       if (discriminant < 0){
            System.out.println("The question has no real roots");
       }
       if (discriminant == 0){
            System.out.println("The question has one root " + root1);
       }

    }

}
