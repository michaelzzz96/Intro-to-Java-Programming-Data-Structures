import java.util.Scanner;

public class Problem_8_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of data pairs:");

        int[][] data = new int[input.nextInt()][2];

        System.out.print("Enter data pairs:");

        for (int i = 0; i < data.length; i++) {
            data[i][0] = input.nextInt();
            data[i][1] = input.nextInt();
        }
        sort(data);

        //Display sorted array
        System.out.println("The sorted array:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("{" + data[i][0]+ "," + data[i][1]+ "}");
        }


    }


    public static void sort(int[][] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMinRow = list[i][0];
            int currentMinCol = list[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                //test for min value in row
                if (currentMinRow > list[j][0] ) {
                    currentMinRow = list[j][0];
                    currentMinCol = list[j][1];
                    currentMinIndex = j;
                }else if(currentMinRow == list[j][0] && currentMinCol> list[j][1]) { //test for min value in col with
                    currentMinCol = list[j][1];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex][0] = list[i][0];
                list[i][0] = currentMinRow;
                list[currentMinIndex][1] = list[i][1];
                list[i][1] = currentMinCol;

            }
        }
    }


}
