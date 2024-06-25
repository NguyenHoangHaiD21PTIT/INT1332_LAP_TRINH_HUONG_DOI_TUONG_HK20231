package UNG_DUNG_JAVA_COLLECTIONS;
import java.util.*;
public class J08028_HINH_CHU_NHAT_DON_SAC {
    public static long kq(long[] a, int n) {
        long res = Long.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && a[i] <= a[st.peek()]) st.pop();
            if (st.empty()) r[i] = n - 1;
            else r[i] = st.peek() - 1;
            st.push(i);
        }
        st.clear();
        for (int i = 0; i < n; i++) {
            while (!st.empty() && a[i] <= a[st.peek()]) st.pop();
            if (st.empty()) l[i] = 0;
            else l[i] = st.peek() + 1;
            st.push(i);
        }
        for (int i = 0; i < n; i++) res = Math.max(res, (long) (r[i] - l[i] + 1) * a[i]);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = m - a[i];
        }
        long res = Long.MIN_VALUE;
        res = Math.max(res, kq(a, n));
        res = Math.max(res, kq(b, n));
        System.out.println(res);
    }
}
