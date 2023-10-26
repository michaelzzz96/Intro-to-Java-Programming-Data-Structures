import java.util.Scanner;

public class Problem_8_27 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] n = new double[3][3];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = input.nextDouble();
            }
        }

        double[][] sorted = sortColumns(n);

        System.out.println("The original array is:");
        display(n);
        System.out.println("The row-sorted array is:");
        display(sorted);
    }

    public static double[][] sortColumns(double[][] m) {
        double[][] result = new double[m.length][m[0].length];
        double [] col = new double[m.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < col.length; j++) {
                col[j] = m[j][i];
            }
            col = selectionSort(col);
            for (int j = 0; j < col.length; j++) {
                result[j][i]=col[j];
            }
        }
        return result;
    }

    public static double[] selectionSort(double[] inputList) {
        double[] list = inputList.clone();

        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
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
        return list;
    }

    public static void display(double[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }

}
