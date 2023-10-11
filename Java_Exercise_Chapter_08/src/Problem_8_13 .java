import java.util.Scanner;

public class Problem_8_13 {

    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);

        System.out
                .print("Enter the number of rows and columns of the array:");
        int i = input.nextInt();
        int j = input.nextInt();
        int[] intResult;
        System.out.println("Enter the array:");
        double[][] in = new double[i][j];

        for (int k = 0; k < i; k++) {
            for (int k2 = 0; k2 < j; k2++) {
                in[k][k2] = input.nextDouble();
            }
        }

        intResult = locateLargest(in);
        System.out.println("The location of the largest element is at (" + intResult[0] + ", " + intResult[1] + ")");

    }

    public static int[] locateLargest(double[][] a) {
        double dblMax = 0;
        int[] intReturn = new int[2];

        for (int k = 0; k < a.length; k++) {
            for (int k2 = 0; k2 < a[k].length; k2++) {
                if (a[k][k2] > dblMax) {
                    dblMax = a[k][k2];
                    intReturn[0] = k;
                    intReturn[1] = k2;
                }
            }
        }
        return intReturn;
    }




}
