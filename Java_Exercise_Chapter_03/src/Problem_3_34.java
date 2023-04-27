import java.util.Scanner;

public class Problem_3_34 {

    public static void main(String[] args) {

        // Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter three points for p0, p1, and p2: ");
        double p0_x0 = input.nextDouble();
        double p0_y0 = input.nextDouble();
        double p1_x1 = input.nextDouble();
        double p1_y1 = input.nextDouble();
        double p2_x2 = input.nextDouble();
        double p2_y2 = input.nextDouble();

        // Calculate point position
        double point_position = (p1_x1 - p0_x0) * (p2_y2 - p0_y0) - (p2_x2 - p0_x0) * (p1_y1 - p0_y0);

        if ((point_position == 0) && ((p2_x2 > p1_x1) && (p2_x2 < p0_x0) || (p2_x2 > p0_x0) && (p2_x2 < p1_x1))) {
            System.out.println("(" + p2_x2 + ", " + p2_y2 + ") is on the line segment from " +
                    "(" + p0_x0 + ", " + p0_y0 + ") to (" + p1_x1 + ", " + p1_y1 + ")");
        } else {
            System.out.println("(" + p2_x2 + ", " + p2_y2 + ") is  not on the line segment from " +
                    "(" + p0_x0 + ", " + p0_y0 + ") to (" + p1_x1 + ", " + p1_y1 + ")");
        }

    }


}
