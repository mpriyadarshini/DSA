import java.util.*;

public class Four{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        swap(array);
        
    }
    public static void swap(int a[]){
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}