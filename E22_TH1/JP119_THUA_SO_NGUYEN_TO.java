import java.util.*;
public class JP119_THUA_SO_NGUYEN_TO {
    static long p, k;
    static List<Long> prime = new ArrayList<>(); // Danh sách lưu các số nguyên tố
    static List<Long> a = new ArrayList<>(); // Danh sách các số nguyên tố nhỏ hơn p
    static long[] e = new long[1000005]; // Mảng để lưu thông tin về số nguyên tố
    static final long N = 1000005; // Giới hạn tối đa cho mảng e
    static void era() {
        for (long i = 0; i < N; i++) e[(int) i] = i; 
        for (long i = 2; i * i < N; i++) {
            if (e[(int) i] == i) {
                for (long j = i * i; j < N; j += i) e[(int) j] = i; // Đánh dấu rằng j không phải là số nguyên tố
            }
        }
        for (long i = 2; i < N; i++) {
            if (e[(int) i] == i) prime.add(i);
        }
    }
    static boolean check(long x) {
        for (long p : prime) {
            if (p * p > x) break;
            if (x % p == 0) return false; 
        }
        return true; 
    }
    static long solve(long limit) {
        long s = limit / p; 
        long sum = 0; 
        long last = 1 << a.size(); 
        for (long x = 1; x < last; x++) { 
            long g = p, cnt = 0; 
            for (long bit = 0; bit < a.size(); bit++) {
                if ((x >> bit & 1) != 0) { 
                    cnt++; 
                    g *= a.get((int) bit); 
                }
            }
            sum += (cnt % 2 != 0 ? 1 : -1) * (limit / g);
        }
        return s - sum; 
    }
    static void subtask1() {
        for (long i : prime) {
            if (i < p) a.add(i); 
        }
        long ans = 0, l = 1, r = 1000000000; 
        while (l <= r) { 
            long m = (l + r) / 2; 
            if (solve(m) >= k) {
                ans = m; 
                r = m - 1; 
            } else {
                l = m + 1; 
            }
        }
        System.out.println(ans); 
    }
    static void subtask2() {
        if (k == 1) { 
            System.out.println(p);
            return;
        }
        long cnt = 1; 
        for (long i = p; ; i--) { 
            if (i == 1) cnt++; 
            if (check(i)) cnt++; 
            if (p * i > 1e9) { 
                System.out.println(0); 
                return;
            }
            if (cnt == k) { 
                System.out.println(p * i);
                return;
            }
        }
    }
    static void sol() {
        era(); 
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextLong(); 
        p = scanner.nextLong(); 
        if (p <= 50) subtask1();
        else  subtask2();
    }
    public static void main(String[] args) {
        sol();
    }
}
