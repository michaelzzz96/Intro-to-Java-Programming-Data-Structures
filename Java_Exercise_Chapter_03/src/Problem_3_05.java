import java.util.Scanner;

public class Problem_3_5 {

    public static void main(String[] args) {

        // Call the scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter today's date: ");
        int today_date = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int days_elapsed = input.nextInt();


        // Check the today's date
        System.out.print("Today's date is ");
        switch(today_date){
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Error: Invalid date");
                System.exit(1);
        }

        // Check the future date
        System.out.print(" & the future date is ");
        switch((today_date + days_elapsed) % 7){
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Error: Invalid date");
                System.exit(1);
        }

    }

}
