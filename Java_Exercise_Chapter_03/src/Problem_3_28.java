import java.util.Scanner;

public class Problem_3_28 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");

        double r1_x_coordinates = input.nextDouble();
        double r1_y_coordinates = input.nextDouble();
        double r1_width = input.nextDouble();
        double r1_height = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");

        double r2_x_coordinates = input.nextDouble();
        double r2_y_coordinates = input.nextDouble();
        double r2_width = input.nextDouble();
        double r2_height = input.nextDouble();

        if((Math.pow(Math.pow(r2_y_coordinates - r1_y_coordinates, 2), .05) + r2_height / 2 <= r1_height / 2) &&
                (Math.pow(Math.pow(r2_x_coordinates - r1_x_coordinates, 2), .05) + r2_width / 2 <= r1_width / 2) &&
                (r1_height / 2 + r2_height / 2 <= r1_height) &&
                (r1_width / 2 + r2_width / 2 <= r1_width)){
            System.out.print("r2 is inside r1");
        }

        else if ((r1_x_coordinates + r1_width / 2 > r2_x_coordinates - r2_width) ||
                (r1_y_coordinates + r1_height / 2 > r2_y_coordinates - r2_height)){
            System.out.print("r2 overlap r1");
        }

        else{
            System.out.print("r2 does not overlap r1");
        }



    }

}
