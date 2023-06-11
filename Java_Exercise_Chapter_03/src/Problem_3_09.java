import java.util.Scanner;

public class Problem_3_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");

        int ISBN = input.nextInt();

        // Extract the digits
        int d9 = ISBN % 10;
        ISBN /= 10;
        int d8 = ISBN % 10;
        ISBN /= 10;
        int d7 = ISBN % 10;
        ISBN /= 10;
        int d6 = ISBN % 10;
        ISBN /= 10;
        int d5 = ISBN % 10;
        ISBN /= 10;
        int d4 = ISBN % 10;
        ISBN /= 10;
        int d3 = ISBN % 10;
        ISBN /= 10;
        int d2 = ISBN % 10;
        ISBN /= 10;
        int d1 = ISBN % 10;


        // Calculate the checksum
        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
                d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9 ) % 11;

        // Check the checksum
        if ( checksum == 10) {

            System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        }
        else{
            System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + checksum);
        }


    }

}
