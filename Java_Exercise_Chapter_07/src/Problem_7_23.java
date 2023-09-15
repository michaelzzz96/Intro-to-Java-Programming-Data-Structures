public class Problem_7_23 {

    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        for (int student = 1; student <= 100; student++) {
            for (int locker = 0; locker < lockers.length; locker++) {
                if ((locker + 1) % student == 0) lockers[locker] = !lockers[locker];
            }
        }
        printLockers(lockers);
    }

    public static void printLockers(boolean[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) System.out.print((i + 1) + " ");
        }
    }

}
