

public class Problem_5_3 {

    public static void main(String[] args) {

        System.out.println("Kilograms   Pounds");
        for (int i = 1; i < 200; i += 2) {
            double pounds = i * 2.2;
            System.out.printf("%-7d%11.1f\n", i, pounds);
        }
    }

}
