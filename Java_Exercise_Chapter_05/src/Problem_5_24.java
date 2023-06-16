public class Problem_5_24 {

    public static void main(String[] args) {

        double sum = 0.0;

        for (double i = 1; i <= 97.0; i += 2){
            sum = sum + i/(i +2) ;
        }

        System.out.println("Sum of the series: " + sum);

    }


}
