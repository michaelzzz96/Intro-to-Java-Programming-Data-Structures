import java.util.Scanner;


public class Problem_2_6 {

    public static void main(String[] args) {

        // Create the Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        // Calculate
        int last_digit = number % 10;
        int non_last_digit =  (number / 10);

        int last_digit_again =  non_last_digit % 10;
        int non_digit_again = (non_last_digit / 10);

        int sum =  last_digit + last_digit_again + non_digit_again;

        // Display Result
        System.out.print("The sum of the digits is " + sum);

    }

}
