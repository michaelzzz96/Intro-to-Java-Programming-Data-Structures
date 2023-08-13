public class Problem_6_29 {

    public static void main(String[] args) {


        for (int i = 3; i <= 1000; i++) {

            if (isPrime(i)) {
                System.out.printf(" (%d,%d) %n", i, twinPrime(i));
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


    public static int twinPrime(int num) {
        int twinPrime = (num + 2);

        return twinPrime;
    }


}
