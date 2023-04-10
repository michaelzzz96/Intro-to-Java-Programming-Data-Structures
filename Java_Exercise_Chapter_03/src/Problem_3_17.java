import java.util.Scanner;

public class Problem_3_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock(1), paper(2): ");

        int your_guess = input.nextInt();
        int computer_guess = (int) (Math.random() * 3);

        if( computer_guess == 0 && your_guess == 1){
            System.out.print("The computer is scissor. You are rock. You won.");
        }
        else if (computer_guess == 0 && your_guess == 2){
            System.out.print("The computer is scissor. You are paper. You lost.");
        }
        else if (computer_guess == 0 && your_guess == 0){
            System.out.print("The computer is scissor. You are scissor. It is a draw.");
        }
        else if (computer_guess == 1 && your_guess == 0){
            System.out.print("The computer is rock. You are scissor. You lost.");
        }
        else if (computer_guess == 1 && your_guess == 2){
            System.out.print("The computer is rock. You are paper. You won.");
        }
        else if (computer_guess == 1 && your_guess == 1){
            System.out.print("The computer is rock. You are rock. It is a draw.");
        }
        else if (computer_guess == 2 && your_guess == 0){
            System.out.print("The computer is paper. You are scissor. You won.");
        }
        else if (computer_guess == 2 && your_guess == 1){
            System.out.print("The computer is paper. You are rock. You lost.");
        }
        else if (computer_guess == 2 && your_guess == 2){
            System.out.print("The computer is paper. You are paper. It is a draw.");
        }
        else{
            System.out.print("Error");
        }
    }

}

/*
Scanner input = new Scanner(System.in);

		// Generate a random integer 0, 1, or 2
		int computer = (int)(Math.random() * 3);

		// Prompt the user to enter a number 0, 1, or 2
		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = input.nextInt();

		System.out.print("The computer is ");
		switch (computer)
		{
			case 0: System.out.print("scissor."); break;
			case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}

		System.out.print(" You are ");
		switch (user)
		{
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper ");
		}

		// Display result
		if (computer == user)
			System.out.println(" too. It is a draw");
		else
		{
			boolean win = (user == 0 && computer == 2) ||
							  (user == 1 && computer == 0) ||
							  (user == 2 && computer == 1);
			if (win)
				System.out.println(". You won");
			else
				System.out.println(". You lose");
		}
	}
 */
