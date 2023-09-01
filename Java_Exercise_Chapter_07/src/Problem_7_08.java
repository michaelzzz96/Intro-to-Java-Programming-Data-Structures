import java.util.Scanner;

public class Problem_7_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];


        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The average is " + average(numbers));


    }

    public static double average(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;

    }

    public static double average(double[] array){

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;

    }

}
