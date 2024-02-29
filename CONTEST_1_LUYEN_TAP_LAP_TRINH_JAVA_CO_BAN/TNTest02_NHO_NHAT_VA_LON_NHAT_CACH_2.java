package CONTEST_1_LUYEN_TAP_LAP_TRINH_JAVA_CO_BAN;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class TNTest02_NHO_NHAT_VA_LON_NHAT_CACH_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if (n==0) break;
            BigInteger []a = new BigInteger[n];
            sc.nextLine();
            for(int i = 0;i<n;i++){
                String s = sc.next();
                a[i] = new BigInteger(s);
            }
            Arrays.sort(a);
            if (a[0].equals(a[n - 1])) System.out.println("BANG NHAU");
            else System.out.println(a[0] + " " + a[n- 1]);
        }
    }
}
