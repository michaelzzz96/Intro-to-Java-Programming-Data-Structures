import java.util.Scanner;

public class Problem_3_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a 3 digit: ");
        int number = input.nextInt();


        // Extract the digits
        int extract = (int)(number);

        int digit3 = extract % 10;
        extract /= 10;

        int digit2 = extract % 10;
        extract /= 10;

        int digit1 = extract % 10;
        extract /= 10;


        // Check the digit
        if (digit1 == digit3){
            System.out.print( number + " is a palindrome");
        }
        else{
            System.out.print( number + " is not a palindrome");
        }

    }

}
