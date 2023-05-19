import java.util.Scanner;

public class Problem_4_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String employee = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double pay_rate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double tax_withholding = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double state_withholding = input.nextDouble();

        System.out.println("");

        System.out.println("Employee name " + employee );
        System.out.println("Hours worked " + hours);
        System.out.printf("Pay rate: $%4.2f\n" , pay_rate );

        // Gross pay
        double gross_pay = (hours * pay_rate);
        System.out.printf("Gross pay $%4.2f\n" , gross_pay );

        System.out.println("Deductions: ");

        // Federal Withholding (20.0%)
        double federal = (tax_withholding * (hours * pay_rate) );
        System.out.println("\tFederal Withholding (20.0%): " + "$" + federal);

        // State Withholding (9.0%)
        double state = (state_withholding * (hours * pay_rate) );
        System.out.println("\tState Withholding (9.0%): " + "$" +  state);

        // Total
        double total = federal + state;
        System.out.println("\tTotal Withholding (20.0%):" + "$" +  total );

        // Net
        double Net = gross_pay - total;
        System.out.printf("Net Pay: $%4.2f " ,Net);


    }

}
