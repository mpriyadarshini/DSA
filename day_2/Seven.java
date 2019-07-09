import java.util.*;

public class Seven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int array1[] = new int[n1];

        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }
        int array2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }
        intersection(array1, array2, n1, n2);
    }

    public static void intersection(int a[],int b[], int l1, int l2) {
        int i = 0, j = 0;
        while (i < l1 && j < l2) {
            if (a[i] < b[j])
                i++;
            else if (b[j] < a[i])
                j++;
            else {
                System.out.print(b[j] + " ");
                i++;
                j++;
            }
        }

    }
}