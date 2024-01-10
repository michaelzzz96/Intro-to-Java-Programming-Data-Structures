import java.util.ArrayList;
import java.util.Scanner;

public class Problem_11_17 {


    public static void main(String[] args) {
        int m = promptInteger();
        int n = findN(m);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));
    }

    private static int findN(int number) {
        ArrayList<Integer> factors = getFactors(number);
        ArrayList<Integer> oddCountFactors = getOddCountFactors(factors);
        return product(oddCountFactors);
    }

    private static int product(ArrayList<Integer> oddFactors) {
        int n = 1;
        for (Integer oddFactor : oddFactors) {
            n *= oddFactor;
        }
        return n;
    }

    private static ArrayList<Integer> getOddCountFactors(ArrayList<Integer> factors) {
        ArrayList<Integer> oddFactors = new ArrayList<>();
        for (Integer factor : factors) {
            int count = 0;
            for (Integer integer : factors) {
                if (integer.equals(factor)) count++;
            }
            if (count % 2 == 1 && !oddFactors.contains(factor)) oddFactors.add(factor);
        }
        return oddFactors;
    }

    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        while(number > 1){
            int i = 2;
            while (number % i != 0) i++;
            factors.add(i);
            number /= i;
        }
        return factors;
    }

    public static int promptInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        return scanner.nextInt();
    }



}
