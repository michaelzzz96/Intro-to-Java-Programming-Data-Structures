import java.util.Scanner;

public class Problem_7_37 {


    public static void main(String[] args) {
        int balls = getBallCount();
        int slots = getSlotCount();
        System.out.println();
        beanMachineSim(balls, slots);
    }

    public static int getBallCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of balls: ");
        return scanner.nextInt();
    }

    public static int getSlotCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of slots: ");
        return scanner.nextInt();
    }

    public static void beanMachineSim(int numberOfBalls, int numberOfSlots) {
        int[] slots = new int[numberOfSlots];
        int slot;
        for (int i = 0; i < numberOfBalls; i++) {
            slot = 0;
            for (int j = 0; j < numberOfSlots - 1; j++) {
                if (Math.random() < 0.5) {
                    System.out.print("L");
                } else {
                    System.out.print("R");
                    slot++;
                }
            }
            System.out.println();
            slots[slot]++;
        }
        System.out.println();
        printSlots(slots);
    }

    public static void printSlots(int[] slots) {
        int max = max(slots);
        for (int i = max; i >0; i--) {
            for (int slot : slots) {
                if (slot >= i) System.out.print("O");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
}
