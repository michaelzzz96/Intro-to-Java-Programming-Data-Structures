import java.util.Scanner;

public class Problem_6_2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter an integer
        System.out.print("Enter a integer: ");
        long number = input.nextLong();

        // Display the sum of all the digits in the integer
        System.out.println("The sum of the digits in " + number + " is " +
                sumDigits(number));

    }

    public static int sumDigits(long n){

        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;

    }

}
