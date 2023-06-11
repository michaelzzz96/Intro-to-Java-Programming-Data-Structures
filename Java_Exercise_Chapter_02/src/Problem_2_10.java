import java.util.Scanner;

public class Problem_2_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the amount of water in kilograms: ");
        double water = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initial_temperature = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double final_temperature = input.nextDouble();

        // Calculation
       double energy =  water * (final_temperature - initial_temperature) * 4184;

       // Display results
       System.out.println("The energy needed is " + energy);




    }

}
