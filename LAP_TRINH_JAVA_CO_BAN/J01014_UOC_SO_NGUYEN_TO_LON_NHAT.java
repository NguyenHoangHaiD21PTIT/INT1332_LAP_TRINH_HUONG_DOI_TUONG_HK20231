package LAP_TRINH_JAVA_CO_BAN;

import java.util.Scanner;
public class J01014_UOC_SO_NGUYEN_TO_LON_NHAT{
    public static long checknt(long n) {
        if (n <= 1) {
            return 0;
        } else {
            for (long i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return 0;
            }
            return 1;
        }
    }
    public static long uocnt(long n) {
        long x = 0;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (checknt(n / i) == 1) {
                    return n / i;
                } else if (checknt(i) == 1) {
                    x = i;
                }
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(uocnt(n));
        }
    }
}