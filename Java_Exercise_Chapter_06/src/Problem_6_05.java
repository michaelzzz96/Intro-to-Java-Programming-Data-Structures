import java.util.Scanner;

public class Problem_6_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 integers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        displaySortedNumbers(number1, number2, number3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3){

        if (num1 > num2){
            double temp1 = num1;
            num1 = num2;
            num2 = temp1;
        }

        if (num1 > num3){
            double temp2 = num1;
            num1 = num3;
            num3 = temp2;
        }

        if (num2 > num3){
            double temp3 = num2;
            num2 = num3;
            num3 = temp3;
        }


        System.out.print("The order is: " + num1 + " " + num2  + " " + num3);


    }


}
