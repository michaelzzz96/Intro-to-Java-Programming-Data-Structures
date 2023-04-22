import java.util.Scanner;

public class Problem_3_29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle's center x- , y-coordinates, and radius: ");
        double r1_x_coordinates = input.nextDouble();
        double r1_y_coordinates = input.nextDouble();
        double r1_radius = input.nextDouble();


        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2_x_coordinates = input.nextDouble();
        double r2_y_coordinates = input.nextDouble();
        double r2_radius = input.nextDouble();


        // Calculate Distance
        double distance = Math.pow(Math.pow(r2_x_coordinates-r1_x_coordinates,2) + Math.pow(r2_y_coordinates-r1_y_coordinates,2),0.5);

        //
        if(distance <= r1_radius - r2_radius){
            System.out.println("circle2 is inside circle1");
        }
        else if (distance <= r1_radius + r2_radius){
            System.out.println("circle2 overlap circle1");
        }
        else {
            System.out.println("circle2 does not overlap circle1");
        }

    }

}
