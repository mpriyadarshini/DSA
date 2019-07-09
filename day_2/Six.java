import java.util.*;

public class Six {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int result = profit(a);
        System.out.println(result);

    }

    public static int profit(int price[]) {
        int maxProfit = 0;
        for (int i = 0; i < price.length - 1; i++) {
            for (int j = i + 1; j < price.length; j++) {
                int difference = price[j] - price[i];
                if (difference > maxProfit) {
                    maxProfit = difference;
                }
            }
        }
        return maxProfit;
    }
}