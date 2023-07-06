import java.util.Scanner;

public class Problem_5_42 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salesAmount = 0.0;
        double commission = 0.0;
        double balance = 0.0;

        System.out.print("Enter Commission Sought: ");
        double COMMISSION_SOUGH = input.nextDouble();


        for (commission = 0.0,  balance =  0.0; commission < COMMISSION_SOUGH; salesAmount += 0.01) {

                commission = 0.0;
                balance =  0.0;

                if (salesAmount > 10000) {
                    commission += (balance = salesAmount - 10000) * 0.12;
                }

                if (salesAmount > 5000) {
                    commission += (balance -= balance = 5000) * 0.10;
                }

                if (salesAmount > 0) {
                    commission += balance * 0.08;
                }
            }

        System.out.printf("Minimum sales to earn $%.0f: $%.0f\n", commission, salesAmount);

    }

}
