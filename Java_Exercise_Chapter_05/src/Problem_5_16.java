import java.util.Scanner;

public class Problem_5_16 {

    public static void main(String[] args) {

        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int integer = input.nextInt();
        int factor = 2;

        // integer / factor != 1
        while (factor < integer) {
            if (integer % factor == 0) {
                System.out.print(factor + ", ");
                integer = integer / factor;
            } else {
                factor++;
            }

        }

        System.out.print(integer + ".");
    }

}
