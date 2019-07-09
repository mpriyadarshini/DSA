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
       
        int l = 0;
        int r = a.length-1;
        while(l<=r){
            int mid = l+(r-1)/2;
            if(a[mid]==element){
                return mid;
            }
            else if(a[m]<element){
                l=mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return -1;
    }
}