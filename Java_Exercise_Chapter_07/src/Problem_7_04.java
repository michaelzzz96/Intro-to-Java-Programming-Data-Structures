import java.util.Scanner;

public class Problem_7_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[100];
        double sum = 0;
        double count = 0;
        int above_avg_count = 0;


        System.out.print("Enter the numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();

            if(numbers[i] == 0 || numbers[i] < 0 ){
                break;
            }

            count++;
            sum += numbers[i];
        }


        double average = sum /  count;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                above_avg_count++;
            }

        }


        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " +  above_avg_count );
        System.out.println("Number of elements above the average is " +  (int)(count - above_avg_count) );

    }


}
