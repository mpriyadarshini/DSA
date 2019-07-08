import java.util.*;
import java.math.*;

public class AddBigInts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        String sum = addNumbersAsString(s1, s2);
        System.out.println(sum);

    }

    public static String addNumbersAsString(String a, String b) {
        BigInteger b1 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);

        return b1.add(b2).toString(10);
    }
}