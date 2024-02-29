import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024_SO_0_VA_SO_9 {
    static long[] f = new long[105]; // f[x] là số nhỏ nhất từ 0 và 9 chia hết cho x

    public static void gen() {
        // Bước 1: Khởi tạo
        Queue<String> q = new LinkedList<>();
        ArrayList<Long>v = new ArrayList<>();
        q.add("9");
        v.add(9L);

        // Bước 2: Lặp cho đến khi độ dài số <= 10 --> Tạo ra tập số chỉ chứa 0 và 9
        while (true) {
            String x = q.poll();
            if (x.length() == 11) break;
            String x1 = x + "0";
            String x2 = x + "9";
            q.add(x1);
            q.add(x2);
            v.add(Long.parseLong(x1));
            v.add(Long.parseLong(x2));
        }

        for (int i = 1; i <= 100; i++) {
            for (long j : v) {
                if (j % i == 0) {
                    f[i] = j;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        gen();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}






