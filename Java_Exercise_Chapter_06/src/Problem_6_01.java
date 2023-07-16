public class Problem_6_1 {

    public static void main(String[] args) {

     final int NUMBER_OF_PRIMES_PER_LINE = 10;

    System.out.println("The first 100 pentagonal numbers: ");

     for (int i = 1; i < 100; i++){
         if (i % NUMBER_OF_PRIMES_PER_LINE == 0) {
             System.out.printf("%7d\n", getPentagonalNumber(i));
         }
			else {
             System.out.printf("%7d", getPentagonalNumber(i));
         }
     }
     System.out.println(" ");

    }

    public static int getPentagonalNumber(int n){
       int side = 0;

       side = n * ( 3 * n - 1) / 2;

       return side;
    }

}
