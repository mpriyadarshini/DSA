import java.util.*;

public class Three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        boolean b = isSorted(a);
        System.out.println(b);

    }

    public static boolean isSorted(int arr[]) {
        if(arr == null) {
            
            return false;
        }
        else if(arr.length == 0) {
            return true;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}