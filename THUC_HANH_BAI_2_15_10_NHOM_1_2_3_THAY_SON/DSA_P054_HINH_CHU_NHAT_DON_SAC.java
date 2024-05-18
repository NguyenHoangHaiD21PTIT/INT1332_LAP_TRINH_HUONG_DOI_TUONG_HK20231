package THUC_HANH_BAI_2_15_10_NHOM_1_2_3_THAY_SON;
import java.util.*;
public class DSA_P054_HINH_CHU_NHAT_DON_SAC {
    public static long findMaxRectangle(long[] a, int n) {
        long[] l = new long[n];
        long[] r = new long[n];

        // Calculate the nearest smaller element positions to the right
        Stack<Integer> st1 = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st1.isEmpty() && a[i] <= a[st1.peek()]) {
                st1.pop();
            }
            r[i] = st1.isEmpty() ? n - 1 : st1.peek() - 1;
            st1.push(i);
        }

        // Calculate the nearest smaller element positions to the left
        Stack<Integer> st2 = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st2.isEmpty() && a[i] <= a[st2.peek()]) {
                st2.pop();
            }
            l[i] = st2.isEmpty() ? 0 : st2.peek() + 1;
            st2.push(i);
        }

        // Calculate the maximum rectangle area
        long res = -1;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, (r[i] - l[i] + 1) * a[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int n = scanner.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
            b[i] = m - a[i];
        }

        long res = -1;
        res = Math.max(res, findMaxRectangle(a, n));
        res = Math.max(res, findMaxRectangle(b, n));

        System.out.println(res);
        scanner.close();
    }
}
