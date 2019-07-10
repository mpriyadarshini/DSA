import java.util.*;

public class Nine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int target = s.nextInt();
        triplets(a, target);
    }

    public static void triplets(int a[], int target) {
        int n = a.length - 1;
        Arrays.sort(a);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(k==j&&k==i){
                        continue;
                    }
                    else if((a[i]+a[j]+a[k])==target){
                        System.out.printf("%d %d %d\n",a[i],a[j],a[k]);

                    }
                    
                }
            }
        }
    }
}