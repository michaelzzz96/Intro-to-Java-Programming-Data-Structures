public class Problem_6_26 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i <= 1000; i ++) {
            if (PalindromicPrime(i)){
                count++;
                System.out.print(i + " ");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }

    public static boolean PalindromicPrime(int number){

        // Declare and initialize variables

        int temp, rem, i;
        int count = 0;
        int sum = 0;

        //store number in a temporary variable temp
        temp = number;

        //use for loop check whether number is prime or not
        for(i = 1; i <= temp; i++)
        {
            if(temp%i == 0)
            {
                count++;    //increment counter when the reminder is 0
            }
        }

        //use while loop to check whether the number is palindrome or not
        while(number > 0)
        {
            // get last digit of the number
            rem = number%10;

            // store the digit last digit
            sum = sum*10+rem;

            // extract all digit except the last
            number = number/10;
        }

        //check whether the number is palindrome and Prime or not
        if(temp == sum && count == 2){
            return true;
        }
        else{
            return false;
        }

    }

}
