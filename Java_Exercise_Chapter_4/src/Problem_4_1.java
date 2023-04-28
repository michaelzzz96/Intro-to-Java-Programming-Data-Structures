import java.util.Scanner;

public class Problem_4_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();

        double side = 2 * length * (Math.sin(Math.PI / 5));
        double area = (5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5)));

        System.out.printf("Area is %4.2f", area);


    }

}
