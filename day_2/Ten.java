import java.util.*;

public class Ten {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < b.length; i++) {
            b[i] = s.nextInt();
        }
        int[] result = sumOfArrayElements(a, b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(result[i]);
        }

    }

    public static int[] sumOfArrayElements(int[] a, int[] b) {
        int digits = Math.max(a.length, b.length);

        int[] result = new int[digits + 1];

        for (int i = 0; i < digits; i++) {
            int n1 = a.length - i - 1;
            int n2 = b.length - i - 1;
            int m = result.length - i - 1;

            int digitOfA = n1 >= 0 ? a[n1] : 0;
            int digitOfB = n2 >= 0 ? b[n2]: 0;

            int sum = digitOfA + digitOfB + result[m];

            int carry = sum / 10;
            result[m] = sum % 10;
            result[m - 1] += carry;
        }

        return result;
    }

}