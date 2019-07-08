import java.util.*;

public class AddIntegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        String sum = addNumbersAsString(s1, s2);
        System.out.println(sum);

    }

    public static String addNumbersAsString(String a, String b) {
        StringBuilder res = new StringBuilder();
        int l1 = a.length();
        int l2 = b.length();
        int minLen = Math.min(l1, l2);
        int carry = 0;
        for (int i = 0; i < minLen; i++) {
            int ind = l1 - i - 1;
            int c1 = a.charAt(ind) - '0';
            ind = l2 - i - 1;
            int c2 = b.charAt(ind) - '0';
            int add = c1 + c2 + carry;
            carry = add / 10;
            add = add % 10;
            res.append(add);
        }

        String longer = null;
        if (l1 < l2) {
            longer = b;
        } else if (l1 > l2) {
            longer = a;
        }
        if (longer != null) {
            int l = longer.length();
            for (int i = minLen; i < l; i++) {
                int c1 = longer.charAt(l - i - 1) - '0';
                int add = c1 + carry;
                carry = add / 10;
                add = add % 10;
                res.append(add);
            }
        }
        return res.reverse().toString();
    }
}