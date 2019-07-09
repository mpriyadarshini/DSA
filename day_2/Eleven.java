import java.util.*;

public class Eleven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int result[] = mirrorInverse(arr);
        for(int i=0;i<n;i++){
            System.out.println(result[i]+" ");
        }

    }

    public static int[] mirrorInverse(int a[]) {
        int b[] = new int[a.length]; 
        for (int i = 0; i < a.length; i++) {
            b[a[i] - 1] = i + 1;

        }
        return b;
    }
}