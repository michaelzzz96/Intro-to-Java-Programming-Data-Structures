import java.util.Scanner;

public class Problem_7_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myList = new int[10];


        System.out.print("Enter " + myList.length + " values: ");
        for(int i = 0; i < myList.length; i++){
            myList[i] = input.nextInt();
        }

        int[] list2 = reverse(myList);
        for(int i = 0; i < list2.length; i++ ){
            System.out.print(list2[i] + " ");
        }

    }

    public static int[] reverse (int[] list){
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j]  = list[i];
        }
        return result;
    }

}
