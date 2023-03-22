import java.util.Scanner;

public class Problem_2_23 {

    public static void main(String[] args) {

        // Call the Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the driving distance: ");
        double driving_distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double miles = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();

        // Calculate the cost of driving
        double cost = (driving_distance / miles) * price;

        // Display the result
        System.out.print("The cost of driving is $" + cost);

    }





}
