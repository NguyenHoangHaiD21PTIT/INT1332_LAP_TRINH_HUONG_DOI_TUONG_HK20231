import java.math.BigInteger;
import java.util.Scanner;
public class J03014_TONG_SO_NGUYEN_LON_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        BigInteger c = new BigInteger(a), d = new BigInteger(b);
        System.out.println(c.add(d));
    }
}
