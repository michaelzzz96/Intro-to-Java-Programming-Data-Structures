import java.util.Scanner;

public class Problem_6_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);


        System.out.print("The number of occurrences of the character " + character + " is " + count(string, character));


    }

    public static int count (String str, char a){
        
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)) == a){
                count++;
            }
        }
        return count;
    }

}
