public class Problem_6_11 {

    public static void main(String[] args) {


        System.out.println("\n SalesAmount     Commission");
        System.out.println("-----------------------------");
        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.printf(" %-16.0f", salesAmount);
            System.out.printf("%8.1f\n", computeCommission(salesAmount));
        }

    }

    public static double computeCommission(double salesAmount){
        double commission;


        if (salesAmount > 10000) {
            commission = (5000 * 0.08) + (5000 * 0.1) + (salesAmount - 10000)
                    * 0.12;
        } else if (salesAmount > 5000) {
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
        } else {
            commission = salesAmount * 0.08;
        }

        return commission;
    }

}
