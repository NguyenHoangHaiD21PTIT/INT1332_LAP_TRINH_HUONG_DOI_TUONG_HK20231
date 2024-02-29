import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class J07003_TACH_DOI_VA_TINH_TONG {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in")); 
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