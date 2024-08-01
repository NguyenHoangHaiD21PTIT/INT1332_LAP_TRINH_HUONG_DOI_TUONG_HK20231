package javaapplication3;
import java.util.*;
import java.io.*;
public class J07077_TINH_GIA_TRI_BIEU_THUC {
    static int priority(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return 0;
    }

    static long calc(long x, long y, String s) {
        switch (s) {
            case "+": return y + x;
            case "-": return y - x;
            case "*": return y * x;
            default: return y / x;
        }
    }

    // Hàm kiểm tra xem chuỗi có phải là toán tử không
    static boolean toantu(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    // Chuyển biểu thức trung tố thành hậu tố
    static List<String> hauTo(String s) {
        Stack<Character> st = new Stack<>();
        List<String> res = new ArrayList<>();
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) { // Toán hạng
                num.append(s.charAt(i));
                if (i == s.length() - 1 || !Character.isDigit(s.charAt(i + 1))) { // Kết thúc một số
                    res.add(num.toString());
                    num = new StringBuilder();
                }
            } else if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') res.add(Character.toString(st.pop()));
                st.pop(); // Xoá nốt dấu mở ngoặc tương ứng
            } else { // Toán tử
                while (!st.isEmpty() && priority(st.peek()) >= priority(s.charAt(i))) res.add(Character.toString(st.pop()));
                st.push(s.charAt(i));
            }
        }
        while (!st.isEmpty()) res.add(Character.toString(st.pop()));
        return res;
    }

    // Tính toán giá trị biểu thức hậu tố
    static long kq(List<String> v) {
        Stack<Long> st = new Stack<>();
        for (String s : v) {
            if (!toantu(s)) {
                long x = Long.parseLong(s);
                st.push(x);
            } else {
                long x1 = st.pop();
                long x2 = st.pop();
                long x3 = calc(x1, x2, s);
                st.push(x3);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BIEUTHUC.in"));
        int t = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(kq(hauTo(s)));
        }
    }
}
