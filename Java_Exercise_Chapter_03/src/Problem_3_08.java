import java.util.Scanner;

public class Problem_3_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 integers: ");
        int number1 = input.nextInt(); // 5
        int number2 = input.nextInt(); // 6
        int number3 = input.nextInt(); // 7


        if (number1 > number2){
            int temp1 = number1;
            number1 = number2;
            number2 = temp1;
        }

        if (number1 > number3){
            int temp2 = number1;
            number1 = number3;
            number3 = temp2;
        }

        if (number2 > number3){
            int temp3 = number2;
            number2 = number3;
            number3 = temp3;
        }


        System.out.print("The order is: " + number1 + " " + number2  + " " + number3);


    }


}
