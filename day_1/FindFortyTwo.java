import java.util.*;

public class FindFortyTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        
        int count = count(a, 42);

        System.out.println(count);
    }

    public static int count(int[] a, int value) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                count++;
            }
        }

        return count;
    }
}