import java.math.BigInteger;
import java.util.Scanner;
public class J03039_CHIA_HET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            String []x = s.split("\\s+");
            String s1 = x[0], s2 = x[1];
            BigInteger a = new BigInteger(s1), b = new BigInteger(s2);
            if (a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
