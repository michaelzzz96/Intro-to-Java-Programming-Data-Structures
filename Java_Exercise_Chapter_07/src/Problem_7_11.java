import java.util.Scanner;

public class Problem_7_11 {

    public static void main(String[] args) {

        System.out.print("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standard deviation is " + deviation(numbers));

    }

    public static double mean(double[] x){

        double sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        return sum / x.length;

    }

    public static double deviation(double[] x){
        double mean = mean(x);
        double sumSq = 0;

        for (int i = 0; i < x.length; i++) {
            sumSq += Math.pow((x[i] - mean), 2);
        }

        return Math.sqrt(sumSq / (x.length - 1));

    }

}
