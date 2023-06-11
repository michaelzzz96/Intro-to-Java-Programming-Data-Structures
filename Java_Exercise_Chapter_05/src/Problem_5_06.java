
public class Problem_5_6 {

    public static void main(String[] args) {
        System.out.println("Miles     Kilometers    |     Kilometers     Miles");
        for (int i = 1, j =20; i <= 10 && j <= 65; i++, j+=5) {
            double kilometers = i * 1.609;
            double miles = j / 1.609;
            System.out.printf("%-7d%8.3f%10s%7d%19.3f\n", i, kilometers, '|',j, miles);
            }
        }
    }

