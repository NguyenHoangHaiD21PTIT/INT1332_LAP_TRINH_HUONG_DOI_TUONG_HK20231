import java.util.*;
public class JKT016_KIEM_TRA_CAU_VIET_DUNG_QUY_TAC {
    public static boolean valid(char a, char b) {
        return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}');
    }
    public static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') st.push(c);
            else if (c == ')' || c == ']' || c == '}') {
                if (st.isEmpty() || !valid(st.pop(), c)) return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine(); 
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
