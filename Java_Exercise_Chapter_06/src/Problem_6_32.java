public class Problem_6_32 {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            if (craps() == 1)
                count++;
        }
        System.out.println("Number of winning games: " + count);

    }

    // Generate random number in integer
    public static int intRandom(int lowerBound, int upperBound) {
        return (int) (lowerBound + Math.random()
                * (upperBound - lowerBound + 1));
    }

    public static int roll() {
        int dice1 = intRandom(1, 6);
        int dice2 = intRandom(1, 6);
        int sum = dice1 + dice2;

        System.out.println("You roll " + dice1 + " + " + dice2 + " = " + sum);

        return sum;

    }

    public static int craps() {

        int first = 0;
        int status = 0; // 0 = neither lose or win, 1 = win , -1 = lose

        // First roll

        first = roll();
        // check craps
        switch (first) {
            case 2:
            case 3:
            case 12:
                System.out.println("You lose");
                status = -1;
                break;
            case 7:
            case 11:
                System.out.println("You win");
                status = 1;
                break;
            default:
                System.out.println("The point is " + first);
                // next roll
                int next;
                do {
                    next = roll();

                } while (!(next == first || next == 7));

                if (next == 7) {
                    System.out.println("You lose");
                    status = -1;
                } else {
                    System.out.println("You win");
                    status = 1;
                }

        }

        return status;

    }

}
