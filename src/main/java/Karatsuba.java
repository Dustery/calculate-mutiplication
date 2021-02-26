import java.math.BigInteger;

public class Karatsuba {

    public static void main(String[] args) {

        String alg = args[0];

        if (alg.equals("--alg1")) {
            BigInteger x = new BigInteger(args[1]);
            BigInteger y = new BigInteger(args[2]);
            useBigInteger(x, y);

            // TODO Karatsuba(string)
        } else {
            System.out.println("Incorrect argument");
        }
    }

    private static void useBigInteger(BigInteger x, BigInteger y) {
        BigInteger result = x.multiply(y);
        System.out.println(result);
    }
}