import java.util.Scanner;

public class Problem_5_29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Month_Name = "";
        String Day_Name = "";
        int Month_Day = 0;

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter day (1 for Monday, 2 for Tuesday and so on): ");
        int day = input.nextInt();

        for (int month = 1; month <= 12; month++){
            switch (month){
                case 1:
                    Month_Name = "January";
                    Month_Day = 31;
                    break;
                case 2:
                    Month_Name = "February";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        Month_Day = 29;
                    } else {
                        Month_Day = 28;
                    }
                    break;
                case 3:
                    Month_Name = "March";
                    Month_Day = 31;
                    break;
                case 4:
                    Month_Name = "April";
                    Month_Day = 30;
                    break;
                case 5:
                    Month_Name = "May";
                    Month_Day = 31;
                    break;
                case 6:
                    Month_Name = "June";
                    Month_Day = 30;
                    break;
                case 7:
                    Month_Name = "July";
                    Month_Day = 31;
                    break;
                case 8:
                    Month_Name = "August";
                    Month_Day = 31;
                    break;
                case 9:
                    Month_Name = "September";
                    Month_Day = 30;
                    break;
                case 10:
                    Month_Name = "October";
                    Month_Day = 31;
                    break;
                case 11:
                    Month_Name = "November";
                    Month_Day = 30;
                    break;
                case 12:
                    Month_Name = "December";
                    Month_Day = 31;
                    break;
            }

            switch (day){
                case 0:
                    Day_Name = "Sunday";
                    break;
                case 1:
                    Day_Name = "Monday";
                    break;
                case 2:
                    Day_Name = "Tuesday";
                    break;
                case 3:
                    Day_Name = "Wednesday";
                    break;
                case 4:
                    Day_Name = "Thursday";
                    break;
                case 5:
                    Day_Name = "Friday";
                    break;
                case 6:
                    Day_Name = "Saturday";
                    break;
            }
            System.out.println();
            System.out.println("       " + Month_Name + " " + year);
            System.out.println("___________________________");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
            for (int j = 0; j < day; j++) {
                System.out.print("    ");
            }
            int count = day;
            for (int j = 1; j <= Month_Day; j++) {
                if (count == 7) {
                    count = 0;
                    System.out.println();
                }
                System.out.printf("%2d  ", j);
                count++;
            }

            day = (day + Month_Day) % 7;
            System.out.println();
        }
    }
}