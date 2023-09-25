import java.util.Scanner;

public class Problem_7_34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String string = input.nextLine();

        System.out.println(sort(string));

    }

    public static String sort(String s) {
        char[] array = s.toCharArray();
        selectionSort(array);
        s= String.valueOf(array);

        return s;
    }


    public static void selectionSort(char[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            char currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

}
