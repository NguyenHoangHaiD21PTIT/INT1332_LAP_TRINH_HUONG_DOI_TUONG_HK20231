import java.util.*;

public class J08025_QUAY_HINH_VUONG {
    static String rotateLeft(String s) {//413526
        StringBuilder tmp = new StringBuilder();
        tmp.append(s.charAt(3)).append(s.charAt(0)).append(s.charAt(2)).append(s.charAt(4)).append(s.charAt(1)).append(s.charAt(5));
        return tmp.toString();
    }

    static String rotateRight(String s) {//152463
        StringBuilder tmp = new StringBuilder();
        tmp.append(s.charAt(0)).append(s.charAt(4)).append(s.charAt(1)).append(s.charAt(3)).append(s.charAt(5)).append(s.charAt(2));
        return tmp.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] a = new int[6];
            int[] b = new int[6];
            StringBuilder st = new StringBuilder();
            StringBuilder en = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                a[i] = sc.nextInt();
                st.append(a[i]);
            }
            for (int i = 0; i < 6; i++) {
                b[i] = sc.nextInt();
                en.append(b[i]);
            }
            if (st.toString().equals(en.toString())) {
                System.out.println(0);
                continue;
            }
            //Bước 1: Khởi tạo
            Queue<String> q = new LinkedList<>();
            Map<String, Boolean> visited = new HashMap<>(); //visited[i] = true tức là trạng thái đó đã từng có
            Map<String, Integer> f = new HashMap<>(); //f[i] là số bước ít nhất để đến trạng thái i

            q.add(st.toString()); //Đưa cấu hình khởi tạo
            visited.put(st.toString(), true); //Đánh dấu đã xét nó
            f.put(st.toString(), 0); //Số bước ra cấu hình này là 0
            //Bước 2: Lặp
            while (!q.isEmpty()) {
                String tmp = q.poll();
                if (tmp.equals(en.toString())) {
                    System.out.println(f.get(en.toString()));
                    break;
                }
                String l = rotateLeft(tmp);
                if (!visited.containsKey(l)) {
                    q.add(l);
                    visited.put(l, true);
                    f.put(l, f.get(tmp) + 1);
                }
                String r = rotateRight(tmp);
                if (!visited.containsKey(r)) {
                    q.add(r);
                    visited.put(r, true);
                    f.put(r, f.get(tmp) + 1);
                }
            }
        }
    }
}