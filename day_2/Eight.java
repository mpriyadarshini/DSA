import java.util.*;

public class Eight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arr[] = { 3, 1, 9, 7, 5, -1 };
        int n = arr.length;
        int sum = s.nextInt();
        pair(arr, n, sum);
    }

    public static void pair(int a[], int n, int target) {

        int low = 0;
        int high = n - 1;

        while (low < high) {
            if (a[low] + a[high] == target) {
                System.out.println("The pair is : (" + a[low] + ", " + a[high] + ")");
            }
            if (a[low] + a[high] > target) {
                high--;
            } else {
                low++;
            }
        }
    }
}