package UNG_DUNG_JAVA_COLLECTIONS;
import java.util.*;
public class J08028_HINH_CHU_NHAT_DON_SAC {
    public static long kq(long[] a, int n) {
        long res = Long.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < n) {
            if (st.empty() || a[i] > a[st.peek()]) {
                st.push(i);
                i++;
            } else {
                int idx = st.pop();
                if (st.empty()) {
                    res = Math.max(res, (long)i * a[idx]);
                } else {
                    res = Math.max(res, (long) a[idx] * (i - st.peek() - 1));
                }
            }
        }
        while (!st.empty()) {
            int idx = st.pop();
            if (st.empty()) {
                res = Math.max(res, (long)i * a[idx]);
            } else {
                res = Math.max(res, (long) a[idx] * (i - st.peek() - 1));
            }
        }
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

