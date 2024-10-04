import java.util.*;
public class JP317_SO_NGUYEN_THUY {
    static ArrayList<String> v = new ArrayList<>();
    public static void gen() {
        Queue<String> q = new LinkedList<>();
        q.add("4");
        q.add("5");
        while (true) {
            // Lấy đỉnh qe
            String top = q.poll();
            // Tạo xâu đảo ngược
            String tmp = new StringBuilder(top).reverse().toString();
            // Xâu mới được tạo thành từ xâu đầu và đảo xâu đó
            String x = top + tmp;
            v.add(x);
            if (v.size() > 10000) break;
            q.add(top + "4");
            q.add(top + "5");
        }
    }
    public static void main(String[] args) {
        gen();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) System.out.print(v.get(i) + " ");
            System.out.println();
        }
    }
}
