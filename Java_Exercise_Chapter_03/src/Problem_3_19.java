import  java.util.Scanner;

public class Problem_3_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter three edges for a triangle and compute the perimeter: ");
        double one_edge = input.nextDouble();
        double two_edge = input.nextDouble();
        double three_edge = input.nextDouble();

        if ( one_edge < two_edge + three_edge
                &&  two_edge < one_edge + three_edge
                &&  three_edge < two_edge + one_edge ){

            double perimeter = one_edge + two_edge + three_edge;
            System.out.print("Perimeter is " + perimeter);
        }
        else{
            System.out.print("Not valid");
        }


    }

}
