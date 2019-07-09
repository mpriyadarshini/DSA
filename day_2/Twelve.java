import java.util.*;

public class Twelve{
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 0 }; 
        if(isInverse(arr)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static boolean isInverse(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[a[i]]==i){
                return true;
            }
        }
        return false;
    }
}