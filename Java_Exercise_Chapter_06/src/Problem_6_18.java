import java.util.Scanner;

public class Problem_6_18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Display Valid Password if rules are followed, Invalid Password otherwise
        System.out.println(
                (isPasswordValid(password) ? "Valid " : "Invalid ") + "Password");
    }

    public static boolean isPasswordValid(String password) {

        int length = password.length();
        int digit_count = 0;

        if (length < 8){
            return false;
        }
        else{
            for (int i = 0; i < length; i++) {
                char ch = password.charAt(i);
                if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                    return false;
                }
                if (ch >= '0' && ch <= '9') {
                    digit_count++;
                }
            }
            return digit_count >= 2;
        }
    }



}
