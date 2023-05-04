import java.util.Scanner;

public class Problem_4_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int ASCII = input.nextInt();

        if (ASCII >= 0 && ASCII <= 127){
            char character = (char) ASCII;
            System.out.print("The character for ASCII code " + ASCII + " is " + character);
        }
        else{
            System.out.print("Value not within the range. ");
        }

    }

}
