import java.util.*;

public class One {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        int max = maxElement(array);
        System.out.println(max);

    }

    public static int maxElement(int a[]) {
        int big = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > big) {
                big = a[i];
            }
        }
        return big;
    }
}