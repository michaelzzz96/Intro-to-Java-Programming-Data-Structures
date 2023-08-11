public class Problem_6_27 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; count < 100; i++) {

            if (isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0 )
                    System.out.println();
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

    public static int reverse(int number){
        int reverse = 0;
        while (number > 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

}
