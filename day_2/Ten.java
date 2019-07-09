import java.util.*;

public class Ten {
    public static void main(String[] args) {
        int a[] = { 9, 3, 9 };
        int b[] = { 6, 1 };
        int m = a.length;
        int n = b.length;
        System.out.println(cal(a, b, m, n));
    }

    public static int cal(int a[], int b[], int m, int n) {
        if (m >= n) {
            return calculateSum(a, b, m, n);
        } else {
            return calculateSum(a, b, n, m);
        }
    }

    public static int calculateSum(int a[], int b[], int m, int n) {
        int sum[] = new int[m];
        int i = m - 1;
        int j = n - 1;
        int k = m - 1;
        int carry = 0, s = 0;
        while (j >= 0) {
            s = a[i] + b[j] + carry;
            sum[k] = s % 10;
            carry = s / 10;
            k--;
            i--;
            j--;
        }
        while (i >= 0) {
            s = a[i] + carry;
            sum[k] = s % 10;
            carry = s / 10;
            i--;
            k--;
        }
        int ans = 0;
        if (carry == 1) {
            ans = 10;
        }
        for (i = 0; i <= m - 1; i++) {
            ans += sum[i];
            ans *= 10;
        }

        return ans/10;

    }

}