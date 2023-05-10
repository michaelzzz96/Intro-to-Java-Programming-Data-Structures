import java.util.Scanner;

public class Problem_4_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine();

        char ch  = letter.charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }

}
