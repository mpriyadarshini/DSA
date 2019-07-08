
import java.util.*;

public class Two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int target = 42;
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int result = check(a,target);
        System.out.println(result);
    }
    public static int check(int arr[],int number){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        return count;
    }
}