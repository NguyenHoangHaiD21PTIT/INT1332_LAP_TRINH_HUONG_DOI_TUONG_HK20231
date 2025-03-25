import java.io.*;
import java.util.*;
public class JP331_CHU_SO_LON_NHAT_VA_NHO_NHAT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            String N = sc.next();  
            char maxDigit = '0';
            char minDigit = '9';
            for (char digit : N.toCharArray()) {
                if (digit > maxDigit) maxDigit = digit;
                if (digit < minDigit) minDigit = digit;
            }
            System.out.println(maxDigit + " " + minDigit);
        }
    }
}
