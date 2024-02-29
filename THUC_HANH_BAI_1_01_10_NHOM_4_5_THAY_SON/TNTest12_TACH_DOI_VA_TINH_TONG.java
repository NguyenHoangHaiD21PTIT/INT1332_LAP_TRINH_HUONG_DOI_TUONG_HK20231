package THUC_HANH_1_01_10;
import java.util.*;
import java.math.BigInteger;
public class TNTest12_TACH_DOI_VA_TINH_TONG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();
        while (s.length() > 1) {
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2);
            BigInteger x = new BigInteger(s1);
            BigInteger y = new BigInteger(s2);
            BigInteger z = x.add(y);
            System.out.println(z);
            s = z.toString();
        }
    }
}