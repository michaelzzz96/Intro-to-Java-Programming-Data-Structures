import java.util.Scanner;

public class Problem_2_17 {

    public static void main(String[] args) {

        // Call the Scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temperature_fahrenheit = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double wind_speed = input.nextDouble();

        // Calculate wind-chill
        double wind_chill = 35.74 + 0.6215*temperature_fahrenheit - 35.75*Math.pow(wind_speed,0.16)
                + 0.4275*temperature_fahrenheit*Math.pow(wind_speed,0.16);

        // Display result
        System.out.print("The wind chill index is " + wind_chill);

    }

}
