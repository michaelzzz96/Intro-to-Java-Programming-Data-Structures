import java.util.Scanner;

public class Problem_5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int d = input.nextInt();
        String oct = "";

        while (d != 0) {
            oct = d % 8 + oct;
            d = d / 8;
        }

        System.out.println("The octal form is " + oct);

    }

}
