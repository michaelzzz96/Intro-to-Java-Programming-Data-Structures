import java.util.Scanner;

public class Problem_5_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int data = input.nextInt();

        int sum = 0;
        int count = 0;
        int positive_count = 0;
        int negative_count = 0;

        if (data == 0) {	// Test for sentinel value
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (data != 0){

            // Count the positives
            if (data > 0){
                positive_count++;
            }
            // Count the negatives
            else{
                negative_count++;
            }

            // Calculate the sum
            sum = sum + data;

            // Count the number of items
            count++;

            // Ask the user again
            data = input.nextInt();
        }

        // Display result
        System.out.println("The number of positives is " + positive_count);
        System.out.println("The number of negatives is " + negative_count);
        System.out.println("The total is " + (double) sum);
        System.out.println("The average is " + (double) sum / count);

    }
}
