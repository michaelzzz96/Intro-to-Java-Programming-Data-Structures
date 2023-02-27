import java.util.Scanner;

public class Problem_2_1 {

    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        // Convert celsius to fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // Display results
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");


    }
}
