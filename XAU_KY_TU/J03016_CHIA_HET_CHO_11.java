import java.math.BigInteger;
import java.util.Scanner;
public class J03016_CHIA_HET_CHO_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = "11";
        BigInteger x = new BigInteger(tmp);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            BigInteger y = new BigInteger(s);
            if (y.mod(x).equals(BigInteger.ZERO)) System.out.println("1");
            else System.out.println("0");
        }
    }
}
