public class Problem_8_22 {

    public static void main(String[] args) {
        int array[][] = new int[6][6];
        fillArray(array);
        displayArray(array);
        calRow(array);
        calCol(array);
    }

    public static void calCol(int array[][]) {

        int intSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                intSum += array[j][i];
            }

            if (intSum % 2 == 0) {
                System.out.println("Column " + i + " has even number of 1.");
            } else {
                System.out.println("Column " + i + " has odd number of 1.");
            }
        }

    }

    public static void calRow(int array[][]) {

        int intSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                intSum += array[i][j];
            }

            if (intSum % 2 == 0) {
                System.out.println("Row " + i + " has even number of 1.");
            } else {
                System.out.println("Row " + i + " has odd number of 1.");
            }

        }

    }

    public static void fillArray(int array[][]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                array[j][i] = intRandom(0, 1);
            }

        }
    }

    public static int intRandom(int lowerBound, int upperBound) {
        return (int) (lowerBound + Math.random()
                * (upperBound - lowerBound + 1));
    }

    public static void displayArray(int array[][]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }

            System.out.println("");
        }
    }

}
