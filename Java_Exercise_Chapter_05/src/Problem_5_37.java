import java.util.Scanner;

public class Problem_5_37 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int d = input.nextInt();
        String b = "";

        while (d != 0) {
            b = d % 2 + b;
            d = d / 2;
        }

        System.out.println("The binary form is " + b);

    }
}
