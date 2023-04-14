import java.util.Scanner;

public class Problem_3_21 {

    public static void main(String[] args) {

        // Call the Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter year: (e.g., 2012:): ");
        int year = input.nextInt();

        System.out.print("Enter month: ");
        int m = input.nextInt();

        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();


        if (m == 1){
            m = 13;
            year--;
        }
        if (m == 2){
            m = 14;
            year--;
        }

        // Calculate day of the week
        int h = (q + (26 * (m + 1)) / 10 + (year % 100)
                + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;


        switch(h){
            case 0:
                System.out.print("Day of the week is Saturday");
                break;
            case 1:
                System.out.print("Day of the week is Sunday");
                break;
            case 2:
                System.out.print("Day of the week is Monday");
                break;
            case 3:
                System.out.print("Day of the week is Tuesday");
                break;
            case 4:
                System.out.print("Day of the week is Wednesday");
                break;
            case 5:
                System.out.print("Day of the week is Thursday");
                break;
            case 6:
                System.out.print("Day of the week is Friday");
                break;
            default:
                System.out.print("Default");
                System.exit(1);
        }


    }

}
