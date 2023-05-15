import java.util.Scanner;

public class Problem_4_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String s = input.nextLine();

        if (s.length() == 9) {

            // Digit 1
            char digit_1 = s.charAt(0);
            // https://stackoverflow.com/questions/4968323/java-parse-int-value-from-a-char
            int digit_1_value = Character.getNumericValue(digit_1);

            // Digit 2
            char digit_2 = s.charAt(1);
            int digit_2_value = Character.getNumericValue(digit_2);

            // Digit 3
            char digit_3 = s.charAt(2);
            int digit_3_value = Character.getNumericValue(digit_3);

            // Digit 4
            char digit_4 = s.charAt(3);
            int digit_4_value = Character.getNumericValue(digit_4);

            // Digit 5
            char digit_5 = s.charAt(4);
            int digit_5_value = Character.getNumericValue(digit_5);

            // Digit 6
            char digit_6 = s.charAt(5);
            int digit_6_value = Character.getNumericValue(digit_6);

            // Digit 7
            char digit_7 = s.charAt(6);
            int digit_7_value = Character.getNumericValue(digit_7);

            // Digit 8
            char digit_8 = s.charAt(7);
            int digit_8_value = Character.getNumericValue(digit_8);

            // Digit 9
            char digit_9 = s.charAt(8);
            int digit_9_value = Character.getNumericValue(digit_9);

            // Calculate Checksum
            int Checksum = (digit_1_value * 1 + digit_2_value * 2 + digit_3_value * 3 + digit_4_value * 4
                    + digit_5_value * 5 + digit_6_value * 6 + digit_7_value * 7 + digit_8_value * 8
                    + digit_9_value * 9) % 11;

            // Check the Checksum
            if (Checksum == 10) {
                System.out.print("The ISBN-10 number is " + digit_1_value + "" +
                        digit_2_value + "" + digit_3_value + "" + digit_4_value + ""
                        + digit_5_value + "" + digit_6_value + "" + digit_7_value + "" + digit_8_value
                        + digit_9_value + "X");
            } else {
                System.out.print("The ISBN-10 number is " + digit_1_value + "" +
                        digit_2_value + "" + digit_3_value + "" + digit_4_value + ""
                        + digit_5_value + "" + digit_6_value + "" + digit_7_value + "" + digit_8_value
                        + digit_9_value + "" + Checksum);
            }
        }
        else{
            System.out.print("Please enter 9 digits");
        }
    }
}
