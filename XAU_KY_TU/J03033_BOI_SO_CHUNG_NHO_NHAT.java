package LAP_TRINH_JAVA_CO_BAN;
import java.math.BigInteger;
import java.util.Scanner;
public class J03033_BOI_SO_CHUNG_NHO_NHAT {
    public static BigInteger BCNN(BigInteger a, BigInteger b){
         return a.multiply(b).divide(a.gcd(b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            BigInteger big1 = new BigInteger(s1);
            BigInteger big2 = new BigInteger(s2);
            System.out.println(BCNN(big1, big2));
        }
    }
}