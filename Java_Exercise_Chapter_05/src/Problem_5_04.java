public class Problem_5_4 {

    public static void main(String[] args) {
        System.out.println("Miles     Kilometers");
        for (int i = 1; i <= 10; i++){
            double kilometers = i * 1.609;
            System.out.printf("%-4d%11.3f\n", i, kilometers);
        }
    }
}
