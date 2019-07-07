
import java.util.*;

public class Six{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        boolean rev = reverse(string);
        System.out.println(rev);

    }

    public static boolean reverse(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        if(s.equals(reverse)){
            return true;
        }
        return false;
    }
}