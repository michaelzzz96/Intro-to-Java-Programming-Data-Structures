import java.util.Scanner;

public class Problem_2_4 {

    public static void main(String[] args) {

        // Call the Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter pounds
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        // Calculate kilograms
        double kilograms = pounds * 0.454;

        // Display results
        System.out.println(pounds + " is " + kilograms + " kilograms ");

    }

}
