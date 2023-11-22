import java.util.Scanner;

public class Problem_8_02 {

    public static void main(String[] args) {

        double[][] matrix = new double[4][4];

        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal is "
                + sumMajorDiagonal(matrix));

    }

    public static double sumMajorDiagonal(double[][] m) {

        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][row];
        }
        return sum;
    }

}
