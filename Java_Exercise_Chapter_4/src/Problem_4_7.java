import java.util.Scanner;

public class Problem_4_7 {

    // Review
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();


        System.out.print("The coordinates of five points on the pentagon are ");
        System.out.println("");
        System.out.println("(" + Math.sin(Math.toRadians(72)) * radius +  "," + Math.cos(Math.toRadians(72)) * radius + ")");
        System.out.println("( " + Math.sin(Math.toRadians(0)) * radius +  "," + Math.cos(Math.toRadians(360)) * radius + ")");
        System.out.println("(" + Math.sin(Math.toRadians(-72)) * radius +  "," + Math.cos(Math.toRadians(72)) * radius + ")");
        System.out.println("(" + Math.sin(Math.toRadians(-36)) * radius +  "," + Math.cos(Math.toRadians(216)) * radius + ")");
        System.out.println("(" + Math.sin(Math.toRadians(36)) * radius +  "," +  Math.cos(Math.toRadians(216)) * radius + ")");




    }

}
