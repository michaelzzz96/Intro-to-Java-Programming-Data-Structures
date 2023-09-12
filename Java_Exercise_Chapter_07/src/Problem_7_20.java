import java.util.Scanner;

public class Problem_7_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        SelectionSort(numbers);

        System.out.println("The array after sort is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }

    public static void SelectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }







}
