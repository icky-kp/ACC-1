import java.math.BigInteger;

public class Karatsuba {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("12345678901234567890");
        BigInteger b = new BigInteger("98765432109876543210");
        System.out.println(a.multiply(b));
    }
}
