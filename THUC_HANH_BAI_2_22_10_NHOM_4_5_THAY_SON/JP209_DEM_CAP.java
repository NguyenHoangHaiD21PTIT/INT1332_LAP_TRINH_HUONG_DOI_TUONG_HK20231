package baitap.java;
import java.util.*;
public class JP209_DEM_CAP {
    // Tìm vị trí đầu tiên >= x trong mảng đã sắp xếp xét trong đoạn chỉ số[L..R]
    public static int lowerBound(List<Integer> arr, int L, int x) {
        int R = arr.size() - 1;
        while (L < R) {
            int mid = (L + R) / 2;
            if (arr.get(mid) < x) L = mid + 1;
            else R = mid;
        }
        return L;
    }
    // Đếm số phần tử trong mảng đã sắp xếp không vượt quá giá trị x cho trước với chỉ số trong đoạn [L; R]
    public static int count(List<Integer> arr, int l, int x) {
        if (l >= arr.size() || arr.get(l) > x) return 0;
        int pos = lowerBound(arr, l, x);
        if (arr.get(pos) > x) pos -= 1;
        return pos - l + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>(), st1 = new Stack<>();
        int[] l = new int[n], r = new int[n];
        // Phần tử bên trái đầu tiên lớn hơn
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && a[st.peek()] <= a[i]) st.pop();
            l[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        // Phần tử bên phải đầu tiên lớn hơn
        for (int i = n - 1; i >= 0; i--) {
            while (!st1.isEmpty() && a[st1.peek()] <= a[i]) st1.pop();
            r[i] = st1.isEmpty() ? n : st1.peek();
            st1.push(i);
        }
        Set<Integer> s = new TreeSet<>();
        for (int x : a) s.add(x);
        List<Integer> z = new ArrayList<>(s); // z lưu những phần tử tăng dần phân biệt trong a
        // m[a[i]] lưu các index p mà a[p] = a[i] gốc lúc đầu
        // first[a[i]]: Chỉ số đầu tiên bắt đầu xét trong mảng m[a[i]]
        int[] first = new int[z.size() + 1];
        List<List<Integer>> m = new ArrayList<>(z.size());
        for (int i = 0; i < z.size(); i++) m.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            int pos = lowerBound(z, 0, a[i]); // Tìm vị trí phần tử a[i] trong mảng z
            a[i] = pos;
            m.get(a[i]).add(i);
        }
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] != -1) res += 1;
            if (r[i] != n) res += 1;
            int x = count(m.get(a[i]), first[a[i]], r[i] - 1);
            res += (long) (x - 1) * x / 2;
            first[a[i]] += x;
        }
        System.out.println(res);
    }
}
