package UNG_DUNG_JAVA_COLLECTIONS;
import java.util.*;
public class J08023_HINH_CHU_NHAT_LON_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int []a = new int[n];
            for(int i = 0;i<n;i++) a[i] = sc.nextInt();
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
            System.out.println(res);
        }
    }
   
}
