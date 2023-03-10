import java.util.Scanner;

public class Problem_2_11 {

    public static void main(String[] args) {

        // Create Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the population of years: ");

        double years = input.nextDouble();

        // Calculation

        double birth = 4505142;
        double death = 2425846;
        double immigrant = 700800;


        double population = 312032486 + ((birth + immigrant - death) * years);

        // Display results
        System.out.println("The population in 5 years is " + population);


    }

}
