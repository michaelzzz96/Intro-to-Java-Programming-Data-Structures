import java.util.Scanner;

public class Problem_4_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String character = input.next();

        char Unicode = character.charAt(0);

        System.out.print("The Unicode for the character " + character + " is " + (int)Unicode );

    }
}
