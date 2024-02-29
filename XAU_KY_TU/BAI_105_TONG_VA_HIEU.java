package XAU_KY_TU;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class BAI_105_TONG_VA_HIEU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
        BigInteger c = a.add(b), d = a.subtract(b);
        BigInteger tmp = new BigInteger("2");
        if(!c.mod(tmp).equals(BigInteger.ZERO)){ 
            System.out.println("NOT FOUND");
        } else { 
            System.out.println(c.divide(tmp) + " " + d.divide(tmp));
        }
    }
}
