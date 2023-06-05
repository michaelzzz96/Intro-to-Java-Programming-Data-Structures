public class Problem_5_13 {

    public static void main(String[] args) {

        int n = 1;

        while(Math.pow(n,3) <= 12000){
            n++;
        }
        // n--;

        System.out.println("The smallest integer n such that n^3 > 12000: " + (n-1));
    }
}
