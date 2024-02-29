package UNG_DUNG_JAVA_COLLECTIONS;
import java.util.*;
public class JKT013_SO_LOC_PHAT_CACH_2 {
    static ArrayList<String>v = new ArrayList<>(); //lưu tất cả xâu dài k quá 14
    public static void gen() {
        // Bước 1: Khởi tạo
        Queue<String> q = new LinkedList<>();
        q.add("6"); q.add("8");
        v.add("6"); v.add("8");
        // Bước 2: Lặp cho đến khi độ dài số <= 10 --> Tạo ra tập số chỉ chứa 0 và 9
        while (true) {
            String x = q.poll();
            if (x.length() == 14) break;
            String x1 = x + "6";
            String x2 = x + "8";
            q.add(x1); q.add(x2);
            v.add(x1); v.add(x2);
        }
    }
    public static void main(String[] args) {
        gen();
        Collections.reverse(v);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.printf("%.0f", 2 * (Math.pow(2, n) - 1));
            System.out.println();
            for(int i = v.size() + 1 - (int)(2 * Math.pow(2, n) - 1);i<v.size();i++){
                System.out.print(v.get(i) + " ");
            }
            System.out.println();
        }
    }      
}