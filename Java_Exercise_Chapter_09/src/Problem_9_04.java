import java.util.Random;


public class Problem_9_4 {
    public static void main(String[] args) {

        Random random = new Random(1000);

        for (int i = 0; i < 50; i++) {

            System.out.printf("%3d ", random.nextInt(101)); // displays 1-99
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }


    }

}
