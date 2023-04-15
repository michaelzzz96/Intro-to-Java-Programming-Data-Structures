import java.util.Scanner;

public class Problem_3_22 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Calculate Distance
        double distance = Math.pow(Math.pow(x-0,2) + Math.pow(y-0,2),0.5);

        if(distance <= 10){
            System.out.print("Point ( " + x + ", " + y + ")" + " is in the circle" );
        }
        else{
            System.out.print("Point ( " + x + ", " + y + ")" + " is not in the circle" );
        }



    }
}
