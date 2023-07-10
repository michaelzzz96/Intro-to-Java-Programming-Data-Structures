import java.util.Scanner;

public class Problem_5_46 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter saving amount
        System.out.print("Enter a string:");
        String s = input.nextLine();
        String s2 = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);

        }

        System.out.println("The reversed string is " + s2);

    }

}
