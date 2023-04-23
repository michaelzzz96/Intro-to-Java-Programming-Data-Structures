import java.util.Scanner;

public class Problem_3_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSecond = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSecond % 60;

        // Obtain the total minutes
        long totalMinutes = totalSecond / 60;

        // Compute  the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hour
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;

        if (currentHour > 12){

            currentHour = currentHour - 12;

            // Display results
            System.out.println("Current time is " + currentHour + ":"
                    + currentMinute + ":" + currentSecond + " PM");
        }
        else{

            // Display results
            System.out.println("Current time is " + currentHour  + ":"
                    + currentMinute + ":" + currentSecond  + " AM");

        }


    }


}
