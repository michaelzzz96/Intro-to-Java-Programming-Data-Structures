import java.util.Scanner;

public class Problem_3_23 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Calculate Distance

        if((Math.pow(Math.pow(x, 2), 0.5) <= 5 ) &&
        (Math.pow(Math.pow(y, 2), 0.5) <= 2.5)){
            System.out.print("Point ( " + x + ", " + y + ")" + " is in the rectangle" );
        }
        else{
            System.out.print("Point ( " + x + ", " + y + ")" + " is not in the rectangle" );
        }

    }
}
