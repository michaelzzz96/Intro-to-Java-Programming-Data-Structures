import java.util.Scanner;

public class Problem_8_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number banks:");
        int n = input.nextInt();

        System.out.print("Enter the limit:");
        int limit = input.nextInt();

        double[] balance = new double[n];
        double[][] borrowers = new double[n][n];
        boolean[] unsafe = new boolean[n];

        for (int i = 0; i < n; i++) {
            // current bank's balance
            System.out.print("Enter the banks " + i + " asset info:");
            balance[i] = input.nextDouble();
            // number of banks that borrow money from current bank
            int m = input.nextInt();
            for (int j = 0; j < m; j++) {
                borrowers[i][input.nextInt()] = input.nextDouble();
            }
        }

        // Check for unsafe banks
        boolean unsafeFound = false;
        do {
            unsafeFound = false;
            for (int i = 0; i < n; i++) {
                // calculate bank i's asset
                double asset = balance[i];
                for (int j = 0; j < borrowers[i].length; j++) {
                    asset += borrowers[i][j];
                }

                if (asset < limit) {
                    unsafe[i] = true;
                    // reset debt of the unsafe bank to zero
                    for (int j = 0; j < borrowers.length; j++) {
                        if (borrowers[j][i] != 0) {
                            borrowers[j][i] = 0;
                            // go trough all the banks again if some debt go
                            // default
                            unsafeFound = true;
                        }
                    }
                }

            }

        } while (unsafeFound);

        // Print the result out

        System.out.print("The unsafe banks are:");
        for (int i = 0; i < unsafe.length; i++) {
            if (unsafe[i] == true) {
                System.out.print(i + " ");
            }

        }

    }

}
