public class Problem_6_14 {

    public static void main(String[] args) {

        System.out.println("\n i            m(i)");
        System.out.println("--------------------");
        for (double i = 1; i <= 901; i+= 100) {
            System.out.printf(" %-10.0f", i);
            System.out.printf("%8.4f\n", SumSeries(i));
        }

    }

    public static double SumSeries(double sum) {

        double pi = 0;
        for (int i = 1; i <= sum; i++) {

            pi += Math.pow(-1, i + 1) / (2 * i - 1.0d);

        }
        pi *= 4;
        return pi;
    }



}
