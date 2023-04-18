import java.util.Scanner;

public class Problem_3_24 {

    public static void main(String[] args) {

        int guess_rank = (int)((Math.random() * (14 - 1)) + 1);
        int guess_suit = (int)(Math.random() * 4);

        System.out.print("The card you picked is ");

        switch (guess_rank) {
            case 1:
                System.out.print("Ace");
                break;
            case 2:
                System.out.print(guess_rank);
                break;
            case 3:
                System.out.print(guess_rank);
                break;
            case 4:
                System.out.print(guess_rank);
                break;
            case 5:
                System.out.print(guess_rank);
                break;
            case 6:
                System.out.print(guess_rank);
                break;
            case 7:
                System.out.print(guess_rank);
                break;
            case 8:
                System.out.print(guess_rank);
                break;
            case 9:
                System.out.print(guess_rank);
                break;
            case 10:
                System.out.print(guess_rank);
                break;
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
                break;
        }
                System.out.print( " of ");
                switch (guess_suit) {
                    case 0:
                        System.out.print("Clubs");
                        break;
                    case 1:
                        System.out.print("Diamonds");
                        break;
                    case 2:
                        System.out.print("Hearts");
                        break;
                    case 3:
                        System.out.print("Spades");
                        break;
                }

                }


}
