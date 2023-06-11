import java.util.Scanner;

public class Problem_4_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();
        char c = s.charAt(0);

        System.out.println("The length of the string is: " + s.length());
        System.out.println("The first character of the string is " + c);

    }

}
