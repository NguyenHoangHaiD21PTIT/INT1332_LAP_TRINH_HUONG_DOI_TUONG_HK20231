import java.math.BigInteger;
import java.util.Scanner;
public class J03012_TONG_SO_NGUYEN_LON_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s1 = sc.next(), s2 = sc.next();
            BigInteger a = new BigInteger(s1), b = new BigInteger(s2);
            System.out.println(a.add(b));
        }
    }
}
