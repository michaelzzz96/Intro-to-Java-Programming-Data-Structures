import java.util.Scanner;

public class Problem_7_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner
        int[] numbers = new int[5]; // Create an array of length 5

        // Prompt the user to enter five numbers
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Display the gcd
        System.out.println("The greatest common divisor is " + gcd(numbers));

    }

    public static int gcd(int... numbers) {
        int min = min(numbers);
        for (int i = min; i > 0; i--) {
            boolean gcd = true;
            for (int number : numbers) {
                gcd = gcd && (number % i == 0);
            }
            if (gcd) return i;
        }
        return 1;
    }


    public static int min(int... numbers) {
        int min = numbers[0];
        for (int e: numbers) {
            if (e < min)
                min = e;
        }
        return min;
    }


}
