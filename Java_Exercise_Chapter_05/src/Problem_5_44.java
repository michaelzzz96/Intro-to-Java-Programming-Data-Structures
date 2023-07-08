import java.util.Scanner;

public class Problem_5_44 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        short number = input.nextShort();

        String bits = "";	// Holds the bits


        for (int i = 0; i < 16; i++) {
            bits = (number & 1) + bits;
            number >>= 1;
        }

        // Display result
        System.out.println("The bits are " + bits);

    }

}
