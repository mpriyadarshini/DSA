
//write a function that takes n as size of array and after that takes n numbers as input.These numbers are stored in an array and then returned to the user

import java.util.*;

public class ReadArray {
    public static int[] takeArrayInput(int a) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result[] = takeArrayInput(n);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + "");
        }
    }
}