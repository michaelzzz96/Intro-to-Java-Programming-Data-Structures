import java.util.Scanner;

public class Problem_3_25 {

    public static void main(String[] args) {

        // Call the Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        /*
            Applying Cramer's rule to find the intersecting point:

            Cramer: ax + by = e          x = ed - bf / ad - bc && y = af - ec / ad - bc
                    cx + dy = f

            linear equations to find intersecting point:
            (y1 - y2)x - (x1 -x2)y = (y1 - y2)x1 - (x1 - x2)y1
            (y3 - y4)x - (x3 -x4)y = (y3 - y4)x3 - (x3 - x4)y3

             //  breakdown:  {  a -> [(y1 - y2)]} x    -   { b -> [(x1 - x2)]} y   =  { e -> [(y1 - y2)x1 - (x1 - x2)y1]  }
            //               {  c -> [(y3 - y4)]} x    -   { d -> [(x3 - x4)]} y    =  { f -> [(y3 - y4)x3 - (x3 - x4)y3] }

            Applying Cramer w/ linear equations:


         */

        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        // Check the equation
        if (a * d - b * c == 0)
            System.out.print("The two lines are parallel");
        else
            System.out.print("The intersecting point is at " + " ( " + x + ", " + y + " )");




    }

}
