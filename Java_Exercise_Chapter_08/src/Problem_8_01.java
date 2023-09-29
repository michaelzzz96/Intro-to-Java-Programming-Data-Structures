import java.util.Scanner;

public class Problem_8_1 {


    public static void main(String[] args) {

        double[][] matrix = new double[3][4];

        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        for (int column = 0; column < matrix[0].length; column++) {
            System.out.println("Sum of the elements at column " + column
                    + " is " + sumColumn(matrix, column));
        }

    }

    public static double sumColumn(double[][] m, int columnIndex) {

        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }


}
