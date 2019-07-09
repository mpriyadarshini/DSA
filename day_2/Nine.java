import java.util.*;

public class Nine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int target = s.nextInt();
        triplets(a, n, target);
    }

    public static void triplets(int arr[], int n, int target) {
        for (int i = 0; i < n - 1; i++) {
            HashSet<Integer> s = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int x = target- (arr[i] + arr[j]);
                if (s.contains(x)) {
                    System.out.printf("%d %d %d\n", x, arr[i], arr[j]);
                }
                else{
                    s.add(arr[j]);
                }
            }
        }

    }
}