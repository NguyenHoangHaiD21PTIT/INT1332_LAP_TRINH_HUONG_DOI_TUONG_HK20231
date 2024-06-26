package MANG;
import java.util.*;
/* TIM CAP SO CO DO CHENH LECH <K .
SX. Xet cac so sau a[i]: x sao cho x - a[i] <k --> x <= k + a[i]- 1 
--> Tim vi tri dau tien > k + a[i] - 1 --> upperbound --> Lui pos di 1
--> Cac so thoa man [i+1;pos-1] */
public class J02027_KHOANG_CACH_NHO_HON_K {
    public static int upperBound(long[] arr, int start, int end, long value) {
        int low = start;
        int high = end;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long[] a = new long[(int)n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            long ans = 0;
            for (int i = 0; i < n - 1; i++) {
                int pos = upperBound(a, i + 1, (int)n, k + a[i] - 1);
                long socap = (pos - 1) - (i + 1) + 1;
                ans += socap;
            }
            System.out.println(ans);
        }
    }
}
