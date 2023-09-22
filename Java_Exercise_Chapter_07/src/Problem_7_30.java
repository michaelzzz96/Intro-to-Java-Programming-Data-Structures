import java.util.Scanner;

public class Problem_7_30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        System.out.print("Enter the values: ");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("The list has ");
        System.out.print(isConsecutiveFour(array) ? "" : "no ");
        System.out.print("consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 1; // number of consecutive numbers

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1])
                count++;

            if (count >= 4)
                return true;

            if (values[i] != values[i + 1])
                count = 1;
        }
        return false;
    }


}
