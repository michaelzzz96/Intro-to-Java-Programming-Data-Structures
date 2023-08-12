public class Problem_6_28 {

    public static void main(String[] args) {

        System.out.println("\np            2^p-1");
        System.out.println("--------------------");
        for (int i = 2; i <= 31; i++) {

            if (isPrime(i)) {
                System.out.printf("%-15d%d%n", i, mersennePrime(i));
            }
        }

    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }

        return true; // number is prime
    }


    public static int mersennePrime(int num) {
        return (int)Math.pow(2, num) - 1;
    }


}
