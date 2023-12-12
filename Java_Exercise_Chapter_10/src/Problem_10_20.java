import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem_10_20 {

    public static void main(String[] args) {
        BigDecimal e = new BigDecimal(BigInteger.ONE);
        BigDecimal item = new BigDecimal(BigInteger.ONE);
        for (BigDecimal i = new BigDecimal("2"); i.compareTo(new BigDecimal("1000")) < 1; i = i.add(BigDecimal.ONE)) {
            item = item.divide(i.subtract(BigDecimal.ONE), 25, BigDecimal.ROUND_HALF_UP);
            e = e.add(item);
            if (i.compareTo(new BigDecimal("100")) == 0
                    || i.compareTo(new BigDecimal("200")) == 0
                    || i.compareTo(new BigDecimal("1000")) == 0)
                System.out.printf("e @ i = %4s: %s%n", i.toString(), e.toString());
        }
    }

}
