import java.util.*;

public class Three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        int index = findElement(arr, target);
        System.out.println(index);
    }

    public static int findElement(int a[], int element) {

        int beg = 0;
        int end = a.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (a[mid] == element) {
                return mid;

            } else if (a[mid] < element) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}