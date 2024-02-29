import java.util.*;
import java.io.*;

public class J08015_CAP_SO_CO_TONG_BANG_K {
    public static long lower_bound(long a[], long n, long l, long r, long x) {
        long res = n;
        while (l <= r) {
            long mid = (l + r) / 2;
            if (a[(int)mid] >= x) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), k = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            long kq = 0;
            for (int i = 0; i < n - 1; i++) {
                long x1 = lower_bound(a, n, i + 1, n - 1, k - a[i]);
                long x2 = lower_bound(a, n, i + 1, n - 1, k - a[i] + 1);
                kq += x2 - x1;
            }
            System.out.println(kq);
        }
    }
}
