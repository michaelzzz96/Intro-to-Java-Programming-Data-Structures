import java.util.Scanner;

public class Problem_6_19 {

    public static void main(String[] args) {

        // Call the Scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three edges of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (!isValid(side1, side2, side3)) {
            System.out.print("The input is invalid");
            System.exit(0);
        }

        System.out.print("The area of the triangle is  "
                + area(side1, side2, side3));

    }


    public static boolean isValid (double side1, double side2, double side3){
        boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
        return valid;
    }

    public static double area (double side1, double side2, double side3){

        // Calculate side
        double side = (side1 + side2 + side3) / 2;

        // Calculate area
        double area = Math.pow(side*(side - side1) * (side - side2)
                * (side - side3) ,0.5);

        return  area;

    }

}


