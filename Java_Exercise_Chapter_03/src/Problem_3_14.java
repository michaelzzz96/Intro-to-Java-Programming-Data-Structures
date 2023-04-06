import java.util.Scanner;

public class Problem_3_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 0 (Heads) or 1 (Tails): ");
        int user_guess = input.nextInt();

        int computer_guess = (int) (Math.random() * 2);

        if(user_guess == computer_guess){
            System.out.println("Your guess was correct.");
        }
        else{
            System.out.println("Your guess was incorrect.");
        }
    }

}
