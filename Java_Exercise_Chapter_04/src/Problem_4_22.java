import java.util.Scanner;

public class Problem_4_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        boolean substring = s1.contains(s2);

        if (substring){
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
