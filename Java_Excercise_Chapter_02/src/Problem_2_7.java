import java.util.Scanner;

public class Problem_2_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        double minutes = input.nextDouble();

        // Get Hour
        double hour = (int) minutes / 60;

        // Get Day
        double day = (int) hour / 24;

        // Get Year
        double year = (int) day / 365;

        // Remaining Days
        double remaining_days = day % 365;

        System.out.print(minutes + " minutes is approximately " + year + " years and " + remaining_days + " days");

    }
}
