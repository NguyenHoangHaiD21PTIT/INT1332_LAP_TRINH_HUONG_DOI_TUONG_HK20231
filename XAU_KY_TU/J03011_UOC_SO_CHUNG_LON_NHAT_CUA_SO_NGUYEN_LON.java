import java.math.BigInteger;
import java.util.Scanner;
public class J03011_UOC_SO_CHUNG_LON_NHAT_CUA_SO_NGUYEN_LON {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            BigInteger big1 = new BigInteger(s1);
            BigInteger big2 = new BigInteger(s2);
            System.out.println(big1.gcd(big2));
        }
    }
}



