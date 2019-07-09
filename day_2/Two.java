import java.util.*;

public class Two {
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
       
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                return i;
            } 
        }
        return -1;
    }
}