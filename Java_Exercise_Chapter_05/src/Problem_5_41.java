import java.util.Scanner;

public class Problem_5_41 {

    public static void main(String[] args) {

        int max = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();


        if (number == 0) {	// Test for sentinel value
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (number != 0){

            if (number > max){
                max = number;
                count = 1;
            }
            else if(number == max){
                count++;
            }

            // Ask the user again
            number = input.nextInt();
        }

        // Display result
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

    }

}
