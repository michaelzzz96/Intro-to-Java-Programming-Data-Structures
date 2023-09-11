import java.util.Scanner;

public class Problem_7_18 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        bubbleSort(numbers);

        System.out.println("The array after sort is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    public static void bubbleSort(double[] list) {

        int n = list.length - 1;
        while (n != 0) {
            int i;
            for ( i = 0; i < n; i++) {
                if (list[i] > list[i + 1]) {
                    double temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }

            }
            n= i-1;
        }

    }

}
