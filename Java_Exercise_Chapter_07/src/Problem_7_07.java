public class Problem_7_7 {

    public static void main(String[] args) {

        int[] count = new int[10];

        for (int i = 0; i <= 100; i++){
            count[(int)(Math.random() * 10)]++;
        }

        System.out.println("Count for each number between 0 and 9:");
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + "s: " + count[i]);
        }

    }


}
