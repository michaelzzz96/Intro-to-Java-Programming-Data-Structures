import java.util.Scanner;

public class Problem_5_33 {

    public static void main(String[] args) {
        int i, sum = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("\n Please Enter any Number: ");
        int number = input.nextInt();

        for(i = 1 ; i < number ; i++) {
            if(number % i == 0)  {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.format("\n% d is a Perfect Number", number);
        }
        else {
            System.out.format("\n% d is NOT a Perfect Number", number);
        }
    }
}
