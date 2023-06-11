

public class Problem_5_5 {

    public static void main(String[] args) {

        System.out.println("Kilograms   Pounds         |     Pounds     Kilograms");
        for (int i = 1 , j = 20; i < 200 && j <= 515 ; i += 2, j += 5) {
            double pounds = i * 2.2;
            double kilograms = j / 2.2;
            System.out.printf("%-7d %11.1f %10s %7d %15.2f\n", i, pounds, '|',j, kilograms);
        }
    }
}
