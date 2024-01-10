import java.util.ArrayList;
import java.util.Scanner;

public class Problem_11_12 {


    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextDouble());
        }
        System.out.println(sum(list));
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }
        return sum;
    }
}
