import java.util.Scanner;

public class Problem_6_6 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        System.out.println();
        displayPattern(number);

    }

    public static void displayPattern(int n){

        for (int rows = 1; rows <= n; rows++) {
            for (int s = n - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int col = rows; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }



}
