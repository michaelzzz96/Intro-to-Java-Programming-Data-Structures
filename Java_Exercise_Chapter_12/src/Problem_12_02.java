import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem_12_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;


        do{
            try{
                System.out.print("Enter two integers: ");
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                int sum = number1 + number2;

                System.out.println("The sum is " + sum);

                continueInput = false;
            }
            catch(InputMismatchException ex){
                System.out.println("Try again. (" + "Incorrect input: an integer is required)");
                input.nextLine();
            }
        }while (continueInput);


    }


}
