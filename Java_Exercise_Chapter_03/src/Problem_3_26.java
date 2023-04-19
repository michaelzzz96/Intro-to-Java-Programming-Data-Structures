import java.util.Scanner;

public class Problem_3_26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Divisible by 5 & 6
        boolean divisible_and_logic = (number % 5 == 0 && number % 6 == 0);

        // Divisible by 5 or 6
        boolean divisible_or_logic = (number % 5 == 0 || number % 6 == 0);

        // Divisible by 5 xor 6
        boolean divisible_xor_logic = (number % 5 == 0 ^ number % 6 == 0);


        System.out.println("Is " + number + " divisible by 5 and 6? " + divisible_and_logic);

        System.out.println("Is " + number + " divisible by 5 or 6? " + divisible_or_logic);

        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + divisible_xor_logic);


    }

}
