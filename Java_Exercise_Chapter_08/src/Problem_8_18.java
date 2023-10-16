public class Problem_8_18 {

    public static void main(String[] args) {
        int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
        shuffle(m);

        System.out.print("{");
        for (int i = 0; i < m.length; i++) {
            System.out.print("{");
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]);
                if (j != m[0].length - 1) {
                    System.out.print(",");
                } else if (i == m.length - 1) {
                    System.out.print("}");
                } else {
                    System.out.print("},");
                }

            }
        }
        System.out.print("};");
    }

    public static void shuffle(int[][] m) {
        int row = m.length;
        int col = m[0].length;
        int total = row * col;

        // Go through all the positions in metrix
        // Select member as random and put it in current position
        for (int i = 0; i < total; i++) {
            int sel = intRandom(i, total - 1);
            // selected member as random
            int srow = sel / row;
            int scol = sel % col;
            // calculate row and column of the current member
            int crow = i / row;
            int ccol = i % col;

            // swap current member with selected member
            int temp = m[srow][scol];
            m[srow][scol] = m[crow][ccol];
            m[crow][ccol] = temp;

        }

    }

    public static int intRandom(int lowerBound, int upperBound) {
        return (int) (lowerBound + Math.random()
                * (upperBound - lowerBound + 1));
    }
}
