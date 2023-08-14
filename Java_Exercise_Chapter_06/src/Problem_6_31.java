import java.util.Scanner;

public class Problem_6_31 {


    public static void main(String[] args) {

        // Call the Scanner Class
        Scanner scan = new Scanner(System.in);


        //Input
        System.out.println("Enter a Credit Card Number as a long integer: ");
        long test = scan.nextLong();



        // If the card's remainder isn't 0
        if(isTheCardValid(test) == true)
        {
            // Output for the cards validity if valid
            System.out.println(test + " is Valid");
        }
        else
        {
            // Output for the cards validity if invalid
            System.out.println(test + " is not valid ");
        }



    }


    // Method to Calculate the Sum of the Cards odd digits from right to left
    public static int sumOfEvenNumberOfCard(long cardnumber) {

        // Local Data
        final int DIVIDE_EVENLY = 10;
        final int ROUND_VALUE = 100;
        int sum = 0;
        long testValueEven = 0;

        // Calculating the cards condition until the loop iterates
        while (cardnumber > 0)
        {
            testValueEven = cardnumber % ROUND_VALUE;
            sum += getTheCardsValue((int) (testValueEven / DIVIDE_EVENLY) * 2);
            cardnumber = cardnumber / ROUND_VALUE;
        }
        return sum;

    }



    // Method to get the length of number the card contains the string of numbers
    public  static int getTheCardIndividualDigits(long cardnumber)
    {

        // Local Data
        final int DIVIDE_EVENLY = 10;
        int CountCardsDigits = 0;

        // Calculating the cards condition until the loop iterates
        while (cardnumber > 0)
        {

            cardnumber = cardnumber / DIVIDE_EVENLY;
            CountCardsDigits = CountCardsDigits + 1;
        }

        return CountCardsDigits;

    }

    // Method to Calculate the Sum of the Cards even digits from right to left
    public static int SumOfOddNumbersOfCard(long number)
    {

        // Local Data
        final int DIVIDE_EVENLY = 10;
        final int ROUND_VALUE = 100;
        int SumOfOddNumbersRightToLeft = 0;


        // Calculating the cards condition until the loop iterates
        while (number > 0)
        {
            SumOfOddNumbersRightToLeft = SumOfOddNumbersRightToLeft +
                    (int) (number % DIVIDE_EVENLY);
            number = number / ROUND_VALUE;
        }

        return SumOfOddNumbersRightToLeft;
    }

    // Method to get the sum of the two digit number of the Card
    public static int getTheCardsValue(long cardnumber)
    {

        // Local Data
        final int DIVIDE_EVENLY = 10;

        // If two digits of the cards is less than 9, return its value
        if (cardnumber <= 9)
        {
            return (int) cardnumber;
        }
        //  If two digits of the cards is more than 10, sum the individual digits.
        else
        {

            int firstDigitOfCard = (int) (cardnumber % DIVIDE_EVENLY);
            int secondDigitOfCard = (int) (cardnumber / DIVIDE_EVENLY);

            return firstDigitOfCard + secondDigitOfCard;
        }
    }

    // Methods to checks the cards validity
    public static boolean isTheCardValid(long cardnumber)
    {
        // Local Data
        final int DIVIDE_EVENLY = 10;
        final int CARD_LENGTH_SMALL = 13;
        final int CARD_LENGTH_LARGE = 16;

        // Output of the Cards Sum of its value from right to left
        int total = sumOfEvenNumberOfCard(cardnumber) + SumOfOddNumbersOfCard(cardnumber);

        // Conditional if the cards digit remainder is 0.
        if ((total % DIVIDE_EVENLY == 0) == true
                && (getTheCardIndividualDigits(cardnumber) >= CARD_LENGTH_SMALL)
                && (getTheCardIndividualDigits(cardnumber) <= CARD_LENGTH_LARGE))
        {
            return true;
        }

        else

        {
            return false;
        }

    }




}
