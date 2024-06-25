package THI_CUOI_KY_D21_Demo;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class TONG_VA_TICH {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextBigInteger()){
            BigInteger tong = BigInteger.ZERO;
            BigInteger tich = BigInteger.ONE;
            while(sc.hasNextBigInteger()) {
                BigInteger number = sc.nextBigInteger();
                tong = tong.add(number);
                tich = tich.multiply(number);
            }
            System.out.println(tong);
            System.out.println(tich);
        }
    }
}
