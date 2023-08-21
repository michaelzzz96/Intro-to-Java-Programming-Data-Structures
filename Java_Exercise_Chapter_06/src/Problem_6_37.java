import java.util.Scanner;

public class Problem_6_37 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer and its width: ");
        int number = input.nextInt();
        int width = input.nextInt();

        String formattedNumber = format(number, width);

        System.out.println(formattedNumber);

    }

    public static String format(int number, int width) {
        String str = number + "";

        if (str.length() < width) {
            for (int i = width - str.length(); i > 0; i--) {
                str = 0 + str;
            }
        }

        return str;
    }

}
