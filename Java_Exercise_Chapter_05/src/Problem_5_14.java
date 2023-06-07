import java.util.Scanner;

public class Problem_5_14 {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int gcd = 1;

        do{
        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
         n1 = input.nextInt();
        System.out.print("Enter second integer: ");
         n2 = input.nextInt();

         gcd = 1; // Initial gcd is 1
        int k = 2; // Possible gcd
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // Update gcd
            k++;
        }
         if (n1 < 0 || n2 < 0){
             // Make another if for 0 and 0
             System.out.println("Number(s) you entered are negative. Try again");
         }
        } while (n1 < 0 || n2 < 0);
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
