import java.util.*;
public class J08020_KIEM_TRA_DAY_NGOAC_DUNG {
    public static boolean valid(char a, char b) {
        return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}');
    }
    public static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '[' || i == '{') {
                st.push(i);
            } else { // Gap dau mo ngoac
                if (st.isEmpty()) return false; // Khong co dau dong
                if (valid(st.peek(), i)) st.pop(); // Cung loai --> Cho ra ngoai
                else return false; // Co dau dong nhung khong cung loai
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng trống sau số lượng test cases
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
