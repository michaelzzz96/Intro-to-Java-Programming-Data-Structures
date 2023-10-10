import java.util.Scanner;

public class Problem_8_11 {

    public static void main(String[] args) {
        int number = getNumber();
        char[][] matrix = makeMatrix(number);
        printMatrix(matrix);
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        return scanner.nextInt();
    }

    public static void printMatrix(char[][] matrix) {
        for (char[] aMatrix : matrix) {
            for (char anAMatrix : aMatrix) {
                System.out.print(anAMatrix + " ");
            }
            System.out.println();
        }
    }

    public static char[][] makeMatrix(int number) {
        char[][] matrix = new char[3][3];
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                matrix[i][j] = number % 2 == 1 ? 'T' : 'H';
                number /= 2;
            }
        }
        return matrix;
    }

}
