// go back

public class Problem_6_30 {

    public static void main(String[] args) {

        craps();


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

    public static void craps() {

        int first = 0;

        // First roll

        first = roll();
        // check craps
        switch (first) {
            case 2:
            case 3:
            case 12:
                System.out.println("You lose");
                break;
            case 7:
            case 11:
                System.out.println("You win");
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
                } else {
                    System.out.println("You win");
                }

        }

    }



}
