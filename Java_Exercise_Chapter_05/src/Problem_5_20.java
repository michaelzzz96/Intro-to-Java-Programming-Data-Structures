

public class Problem_5_20 {

    public static void main(String[] args) {

        final int NUMBER_OF_PRIMES = 1000;
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        int count = 0;
        int number =2;

        System.out.println("The first 50 prime numbers are \n");

        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES){
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            // Test whether number is prime
            for (int divisor =2; divisor <= number / 2; divisor++){
                if (number % divisor == 0){ // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            // Display the prime number and increase the count
            if (isPrime){
                count++; // Increase the count

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    // Display the number and advance to the new line
                    System.out.println(number);
                }
                else{
                    System.out.print(number + " ");
                }
            }

            // Check if the next number is prime
            number++;

        }

    }

}


/*
  1 2
  1 3

  1 2
  3 1

  2 1
  1 3

  2 1
  3 1

  ----------

  1 3
  1 2

  1 3
  2 1

  3 1
  1 2

  3 1
  2 1

  ---------

  1 2
  2 2

  2 1
  2 2

  -------

  2 1
  1 3

  2 1
  3 1

  1 2
  1 3

  1 2
  3 1

  -------

  2 2
  1 2

  2 2
  2 1

  --------

  3 1
  1 2

  1 3
  1 2

  1 3
  2 1

  3 1
  2 1

  -------

  4 1
  1 1

  1 4
  1 1


 */