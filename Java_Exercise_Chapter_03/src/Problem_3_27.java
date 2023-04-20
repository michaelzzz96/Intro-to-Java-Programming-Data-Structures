import java.util.Scanner;

public class Problem_3_27 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Calculate intersect
        double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

        if(x > intersectx || y > intersecty){
            System.out.print("The point is not in the triangle" );
        }
        else{
            System.out.print("The point is  in the triangle" );
        }



    }

}
