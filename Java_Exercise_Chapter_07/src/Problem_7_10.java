import java.util.Scanner;

public class Problem_7_10 {


    public static void main(String[] args) {

        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The index of the smallest element is: " + indexOfSmallestElement(numbers));

    }

    public static int indexOfSmallestElement(double[] array) {

        double min = array[0];
        int indexOfMax = 0;

        for (int i = 1; i < array.length; i++) {
            if ( min > array[i]) {
                min = array[i];
                indexOfMax = i;
            }
        }

        return indexOfMax;
    }

}
