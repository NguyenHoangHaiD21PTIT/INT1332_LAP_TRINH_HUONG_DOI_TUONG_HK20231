package KIEM_TRA_D22N06_BAI1;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class TONG_VA_TICH_CAC_SO_KHAC_NHAU{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeSet<BigInteger>ts = new TreeSet<>();
        while(sc.hasNextBigInteger()) ts.add(sc.nextBigInteger());
        BigInteger tong = BigInteger.ZERO, tich = BigInteger.ONE;
        for(BigInteger x: ts){
            tong = tong.add(x);
            tich = tich.multiply(x);
        }
        System.out.println(tong + "\n" + tich);
    }
}
