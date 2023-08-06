import java.util.Scanner;

public class Problem_6_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter an integer
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        // Display the square root
        System.out.println(
                "The approximated square root of " + number + " is: " + sqrt(number));

    }

    public static double sqrt (long n) {

        double lastGuess = 1;
        double nextGuess = (lastGuess + (n / lastGuess)) / 2;
        int nOfG = 0;

        while (Math.abs(lastGuess - nextGuess) > 0.0001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n / lastGuess)) / 2;
            nOfG++;
            System.out.println("Guess " + nOfG + " is " + nextGuess);
         }
        lastGuess = nextGuess;
        return nextGuess;
    }

}
