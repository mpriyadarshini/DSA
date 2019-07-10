import java.util.*;

public class Five {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int a1[] = bubble_sort(a);
        int b1[] = selection_sort(a);
        int c1[] = insertion_sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a1[i] + "");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(b1[i] + "");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(c1[i] + "");
        }

    }

    public static int[] bubble_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;

    }

    public static int[] selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[small]) {
                    small = j;
                }
            }
            {
                int temp = arr[small];
                arr[small] = arr[i];
                arr[i] = temp;
            }

        }
        return arr;

    }

    public static int[] insertion_sort(int arr[]) {

        for (int i = 1; i < arr.length-1; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (temp < arr[j] && j >= 0) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = temp;
        }
        return arr;
    }

}