

public class Problem_5_10 {

    // try stackoverflow nested for loop
    public static void main(String[] args) {

        int count = 0;

            for (int i = 100; i<= 1000; i++) {
                if (i % 5 == 0 && i % 6 == 0) {
                    System.out.print(i + " ");
                    count++;
                    if (count % 10 == 0){
                        System.out.println(i);
                    }
                }
            }
    }
}
