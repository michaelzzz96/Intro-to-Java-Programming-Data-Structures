public class Problem_7_13 {

    public static void main(String[] args) {
        int num;
        for (int i = 1; i <= 100; i++) {
            num = getRandom(1, 100, 4, 8, 95, 93);
            if (i % 15 == 0) System.out.printf("%2d%n", num);
            else System.out.printf("%2d ", num);
        }

    }

    public static int getRandom(int... numbers) {
        int rand;
        do {
            rand = (int)(Math.random() * 100);
        } while (hasNumber(numbers, rand));
        return rand;
    }

    public static boolean hasNumber(int[] array, int number){
        for (int i : array) {
            if (i == number) return true;
        }
        return false;
    }

}
