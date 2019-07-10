import java.util.*;

public class Eight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sum = s.nextInt();
        pair(arr, sum);
    }

    public static void pair(int a[], int target) {
        int n = a.length-1;
        Arrays.sort(a);
        int i = 0;
        while (i < n) {
            if (a[i] + a[n] == target) {
                System.out.println(a[i] + "," + a[n]);
                i++;
                n--;
            } else if (a[i] + a[n] < target) {
                i++;
            } else if(a[i]+a[n]>target) {
                n--;
            }
        }
    }
}