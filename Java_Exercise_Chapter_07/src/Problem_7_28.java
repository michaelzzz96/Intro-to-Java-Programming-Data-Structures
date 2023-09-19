import java.util.Scanner;

public class Problem_7_28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        int[] list1 = new int[10];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }


        for (int i = 0; i < list1.length-1; i++) {
            for (int j = i+1; j < list1.length; j++) {
                System.out.print( list1[i] + "," + list1[j] + " ");
            }
            System.out.println();
        }

    }


}
