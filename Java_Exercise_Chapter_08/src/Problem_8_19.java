import java.util.Scanner;

public class Problem_8_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows and column: ");
        int[][] n = new int[input.nextInt()][input.nextInt()];
        System.out.println("Enter the values in the array:");

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = input.nextInt();
            }

        }

        System.out.println(isConsecutiveFour(n));



    }

    public static boolean isConsecutiveFour(int[][] values) {
        return checkVer(values)||checkHor(values) || checkDia(values);
    }

    public static boolean checkVer(int[][] values) {
        // Going through the array vertically

        for (int i = 0; i < values[0].length; i++) {
            int start = values[0][i];
            int count = 1;
            for (int j = 1; j < values.length; j++) {
                if (start == values[j][i]) {
                    count++;
                } else {
                    start = values[j][i];
                    count = 1;
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        return false;

    }

    public static boolean checkHor(int[][] values) {

        // Going through the array horizontally

        for (int i = 1; i < values.length; i++) {
            int start = values[i][0];
            int count = 1;
            for (int j = 1; j < values[i].length; j++) {
                if (start == values[i][j]) {
                    count++;
                } else {
                    start = values[i][j];
                    count = 1;
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        return false;

    }

    public static boolean checkDia(int[][] values) {

        // From upper left to lower right
        // Go through the row

        for (int i = 0; i < values.length; i++) {
            int start = values[i][0];
            int count = 1;
            for (int j = i+1, k = 1; j < values.length && k < values[0].length; j++, k++) {
                if (start == values[j][k]) {
                    count++;
                } else {
                    start = values[j][k];
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }

        // Going through the column

        for (int i = 0; i < values[0].length; i++) {
            int start = values[0][i];
            int count = 1;
            for (int j = i+1, k = 1; j < values[0].length && k < values.length; j++, k++) {
                if (start == values[k][j]) {
                    count++;
                } else {
                    start = values[k][j];
                    count = 1;
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        // From upper right to lower left
        // Go through the column

        for (int i = 0; i < values[0].length; i++) {
            int start = values[0][i];
            int count = 1;
            for (int j = 1, k = i-1; j < values.length && k >= 0; j++, k--) {
                if (start == values[j][k]) {
                    count++;
                } else {
                    start = values[j][k];
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }

        // Going through the row

        for (int i = 0; i < values.length; i++) {
            int start = values[i][values[i].length-1];
            int count = 1;
            for (int j = i+1, k = values[0].length-2; j < values.length && k >= 0; j++, k--) {
                if (start == values[j][k]) {
                    count++;
                } else {
                    start = values[j][k];
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }

        return false;

    }

}
