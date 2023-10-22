import java.util.Scanner;

public class Problem_8_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        int[][] n = new int[6][6];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = input.nextInt();
            }
        }

        int col = calCol(n);
        int row = calRow(n);

        if(col!=-1 && row != -1) {
            System.out.println("The flipped cell is at (" +row + ","+ col +")");
        }else {
            System.out.println("There is no flipped cell.");
        }

    }

    public static int calCol(int array[][]) {

        int intSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                intSum += array[j][i];
            }

            if (intSum % 2 != 0) {
                return i;
            }
        }

        return -1;

    }

    public static int calRow(int array[][]) {

        int intSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                intSum += array[i][j];
            }

            if (intSum % 2 != 0) {
                return i;
            }
        }
        return -1;

    }



}
