import java.util.Scanner;

public class Problem_8_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int intSize = input.nextInt();

        int[][] intMetrix = new int[intSize][intSize];
        fillMetrix(intMetrix);
        displayMetrix(intMetrix);
        checkMetrix(intMetrix);
    }

    public static int intRandom(int lowerBound, int upperBound) {
        return (int) (lowerBound + Math.random()
                * (upperBound - lowerBound + 1));
    }

    public static void fillMetrix(int metrix[][]) {
        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[i].length; j++) {
                metrix[i][j] = intRandom(0, 1);
            }

        }

    }

    public static void checkMetrix(int metrix[][]) {

        boolean blnFound = false;
        // Checking row
        for (int i = 0; i < metrix.length; ++i) {
            int intResult = checkRow(i, metrix);
            if (intResult != 2) {
                blnFound = true;
                System.out.println("All " + intResult + "s on row " + i);
            }
        }

        if (blnFound == false) {

            System.out.println("No same numbers on a row");
        }

        // Checking column
        blnFound = false;
        for (int i = 0; i < metrix.length; ++i) {
            int intResult = checkCol(i, metrix);
            if (intResult != 2) {
                blnFound = true;
                System.out.println("All " + intResult + "s on column " + i);
            }
        }

        if (blnFound == false) {

            System.out.println("No same numbers on a column");
        }

        // Checking major diagonals

        int intMajor = checkMajorDia(metrix);
        int intMinor = checkMinorDia(metrix);

        if (intMajor != 2) {
            System.out.println("All " + intMajor + "s on major diagonal");
        } else {
            System.out.println("No same numbers on the major diagonal");
        }

        if (intMinor != 2) {
            System.out.println("All " + intMinor + "s on sub-diagonal");
        } else {
            System.out.println("No same numbers on the sub-diagonal");
        }

    }

    public static void displayMetrix(int metrix[][]) {

        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[i].length; j++) {
                System.out.print(metrix[i][j]);
            }

            System.out.println("");
        }

    }

    // Return 2 if the row is not repeating. Return number 0 or one if it is
    public static int checkRow(int intRow, int intMetrix[][]) {

        for (int i = 1; i < intMetrix[intRow].length; i++) {
            if (intMetrix[intRow][i] != intMetrix[intRow][0])
                return 2;
        }
        return intMetrix[intRow][0];

    }

    public static int checkCol(int intCol, int intMetrix[][]) {
        for (int i = 1; i < intMetrix.length; i++) {
            if (intMetrix[i][intCol] != intMetrix[0][intCol])
                return 2;
        }
        return intMetrix[0][intCol];
    }

    // Check major diagonal where i = j or from top left to lower right
    public static int checkMajorDia(int intMetrix[][]) {
        for (int i = 1; i < intMetrix.length; i++) {
            if (intMetrix[i][i] != intMetrix[0][0])
                return 2;
        }
        return intMetrix[0][0];
    }

    // Check major diagonal where i = metrix size - i or from lower left to
    // upper right
    public static int checkMinorDia(int intMetrix[][]) {
        int intSize = intMetrix.length - 1;
        for (int i = 1; i < intMetrix.length; i++) {
            if (intMetrix[i][intSize - i] != intMetrix[0][intSize])
                return 2;
        }
        return intMetrix[0][0];
    }

}
