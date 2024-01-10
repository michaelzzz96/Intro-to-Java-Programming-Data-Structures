import java.util.ArrayList;
import java.util.Scanner;

public class Problem_11_14 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //Add items to list1
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(scanner.nextInt());
        }

        //Add items to list2
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(scanner.nextInt());
        }

        ArrayList<Integer> union = union(list1, list2);
        printList(union);
    }

    private static void printList(ArrayList<Integer> list) {
        System.out.print("The combined list is");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
    }

    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> union = new ArrayList<>();
        union.addAll(list1);
        union.addAll(list2);
        return union;
    }


}
