import java.util.*;

public class Four {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        int result[] = swap(array);
        for (int i = 0; i < n; i++) {
            System.out.println(result[i] + "");
        }

    }

    public static int[] swap(int a[]) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
}