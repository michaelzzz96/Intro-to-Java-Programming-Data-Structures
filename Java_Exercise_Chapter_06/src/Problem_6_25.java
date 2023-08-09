import java.util.Scanner;

public class Problem_6_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the milliseconds: ");
        long millis = scanner.nextLong();
        System.out.println("The time is " + convertMillis(millis));

    }

    public static String convertMillis(long millis){

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = millis / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        return currentHour + ":" + currentMinute + ":" + currentSecond;
    }


}
