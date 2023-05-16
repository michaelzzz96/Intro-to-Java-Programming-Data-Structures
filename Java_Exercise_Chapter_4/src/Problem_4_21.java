import java.util.Scanner;

public class Problem_4_21 {

    public static void main(String[] args) {

        // Learned not to declare char() in the main space (after s). Will cause exception error. Do it in the if statement

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String s = input.nextLine();

        if (s.length() == 11) {
            // Digits
            char digit_1 = s.charAt(0);
            char digit_2 = s.charAt(1);
            char digit_3 = s.charAt(2);
            // Dash
            char dash_4 = s.charAt(3);
            char digit_5 = s.charAt(4);
            char digit_6 = s.charAt(5);
            // Dash
            char dash_7 = s.charAt(6);
            char digit_8 = s.charAt(7);
            char digit_9 = s.charAt(8);
            char digit_10 = s.charAt(9);
            char digit_11 = s.charAt(10);
            if (dash_4 == '-' && dash_7 == '-' && s.length() == 11
                    && Character.isDigit(digit_1)
                    && Character.isDigit(digit_2)
                    && Character.isDigit(digit_3)
                    && Character.isDigit(digit_5)
                    && Character.isDigit(digit_6)
                    && Character.isDigit(digit_8)
                    && Character.isDigit(digit_9)
                    && Character.isDigit(digit_10)
                    && Character.isDigit(digit_11)) {
                System.out.print(digit_1 + "" + digit_2 + "" + digit_3 + dash_4 + "" + digit_5 + "" + digit_6
                        + "" + dash_7 + "" + digit_8 + "" + digit_9 + "" + digit_10 + "" + digit_11 + " is a valid social security number");
            }
        }
            else {
                System.out.print(s + " is an invalid social security number");
            }

    }

}
