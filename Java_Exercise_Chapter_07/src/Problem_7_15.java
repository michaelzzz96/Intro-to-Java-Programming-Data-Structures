import java.util.Scanner;

public class Problem_7_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];


        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        distinctNumbers(array);


    }

    public static void distinctNumbers(int[] arr){
        int count= 0;
        int i;
        System.out.print("The distinct numbers are: ");


        for (i = 0; i < arr.length; i++){
            int j;

            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    break;
            }

            if (i == j) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }

    }

}
