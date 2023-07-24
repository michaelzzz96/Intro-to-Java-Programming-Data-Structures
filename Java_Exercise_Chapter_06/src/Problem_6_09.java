public class Problem_6_9 {

    public static void main(String[] args) {

        System.out.println("Feet         Meters          |     Meters        Feet");
        System.out.println("-------------------------------------------------------");

        for (double i = 1.0 , j = 20.0; i <= 10.0 && j <= 65 ; i += 1, j += 5) {

            double Meter = 0;
            double Foot = 0;

            Meter += footToMeter(i);
            Foot += meterToFoot(j);
            System.out.printf("%-7.1f %11.3f %10s %8.1f %15.3f\n", i, Meter, '|',j, Foot);
        }

    }

    public static double footToMeter(double foot){

        double meter = 0.305 * foot;
        return meter;

    }

    public static double meterToFoot (double meter){
        double foot = 3.279 * meter;
        return foot;
    }

}
