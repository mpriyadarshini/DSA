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
        intersectionWithDuplicates(array1, array2);
        intersectionWithoutDuplicates(array1, array2);
    }

    public static void intersectionWithoutDuplicates(int a[], int b[]) {

        int i = 0;

        Arrays.sort(a);
        Arrays.sort(b);
        
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

    }

    public static void intersectionWithDuplicates(int a[], int b[]) {

        int i = 0;

        Arrays.sort(a);
        Arrays.sort(b);
       
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.println(a[i] + " " + b[j]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

    }
}