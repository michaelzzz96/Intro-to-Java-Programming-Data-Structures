import java.util.Scanner;

public class Problem_7_12 {

    public static void main(String[] args) {

        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Printing the original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        int[] reverseNumbers = reverse(numbers);

        System.out.println();
        System.out.println("Printing the returned array:");
        for (int i = 0; i < reverseNumbers.length; i++) {
            System.out.print(reverseNumbers[i] + " ");
        }
    }


    public static int[] reverse (int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
