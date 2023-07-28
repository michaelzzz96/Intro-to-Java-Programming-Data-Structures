public class Problem_6_13 {

    public static void main(String[] args) {

        System.out.println("\n i            m(i)");
        System.out.println("--------------------");
        for (double i = 1; i <= 20; i ++) {
            System.out.printf(" %-10.0f", i);
            System.out.printf("%8.4f\n", SumSeries(i));
        }

    }

    public static double SumSeries(double sum){

        double m = 0;
        for (double i = 1; i <= sum; i++) {
            m += i  / ( i + 1);

        }
        return m;

    }

}
