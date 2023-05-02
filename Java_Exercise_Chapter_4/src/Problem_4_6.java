import java.util.Scanner;

public class Problem_4_6 {

    public static void main(String[] args) {

        final double RADIUS = 40;

        // Generate random angle
        double angle1 = (Math.random() * (2 * Math.PI));
        double angle2 = (Math.random() * (2 * Math.PI));
        double angle3 = (Math.random() * (2 * Math.PI));

        //Get coordinates
        System.out.printf("Point one is %6.5f, %4.5f\n",RADIUS * Math.cos(angle1), RADIUS * Math.sin(angle1) );
        System.out.printf("Point one is %6.5f, %4.5f\n",RADIUS * Math.cos(angle2), RADIUS * Math.sin(angle2) );
        System.out.printf("Point one is %6.5f, %4.5f\n",RADIUS * Math.cos(angle3), RADIUS * Math.sin(angle3) );

    }

}
