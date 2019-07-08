
import java.util.*;

public class SumOfSmallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sum = sumOfSmallestTwoNumbers(arr);
        System.out.println(sum);
    }

    public static int sumOfSmallestTwoNumbers(int a[]) {
        int small = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == small) {
                second = small;
                small = a[i];
            } else if (a[i] < small) {

                second = small;
                small = a[i];
            } else if (a[i] < second && a[i] != small) {
                second = a[i];

            }
        }
        return small + second;
    }
}