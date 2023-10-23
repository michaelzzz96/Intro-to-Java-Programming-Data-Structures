import java.util.Scanner;

public class Problem_8_24 {

    public static void main(String[] args) {
        // Read a Sudoku solution
        int[][] grid = readASolution();
        System.out.println(isValid(grid) ? "Valid solution" :
                "Invalid solution");
    }

    /**
     * Read a Sudoku solution from the console
     */
    private static int[][] readASolution() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        return grid;
    }

    /**
     * Check whether a solution is valid
     */
    private static boolean isValid(int[][] grid) {
        return isRowsValid(grid) && isColumnsValid(grid) && isSubRegionsValid(grid);
    }

    private static boolean isSubRegionsValid(int[][] grid) {
        for (int subRegionStartX = 0; subRegionStartX < grid.length; subRegionStartX += 3) {
            for (int subRegionStartY = 0; subRegionStartY < grid.length; subRegionStartY += 3) {
                boolean[] values = new boolean[9];
                boolean isValid = true;
                for (int xOffset = 0; xOffset < 3; xOffset++) {
                    for (int yOffset = 0; yOffset < 3; yOffset++) {
                        values[grid[subRegionStartX + xOffset][subRegionStartY + yOffset] - 1] = true;
                    }
                }
                for (boolean number : values) isValid &= number;
                if (!isValid) return false;
            }
        }
        //System.out.println("sub-regions checked");
        return true;
    }

    private static boolean isColumnsValid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            boolean[] values = new boolean[9];
            boolean isValid = true;
            for (int j = 0; j < grid[i].length; j++) {
                values[grid[j][i] - 1] = true;
            }
            for (boolean number : values) isValid &= number;
            if (!isValid) return false;
        }
        //System.out.println("Columns checked");
        return true;
    }

    private static boolean isRowsValid(int[][] grid) {
        for (int[] row : grid) {
            boolean[] values = new boolean[9];
            boolean isValid = true;
            for (int cell : row) {
                values[cell - 1] = true;
            }
            for (boolean number : values) isValid &= number;
            if (!isValid) return false;
        }
        //System.out.println("Rows Checked");
        return true;
    }


}
