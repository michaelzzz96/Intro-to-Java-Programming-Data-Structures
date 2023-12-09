import java.math.BigInteger;

public class Problem_10_17 {

    public static void main(String[] args) {
        BigInteger i = new BigInteger(Long.MAX_VALUE + "");
        BigInteger end = i.add(new BigInteger("10"));

        // Display results
        for (i = new BigInteger(Long.MAX_VALUE + "");
             i.compareTo(end) <= 0;
             i = i.add(new BigInteger("1"))) {
            System.out.println(i.multiply(i));
        }
    }
}
