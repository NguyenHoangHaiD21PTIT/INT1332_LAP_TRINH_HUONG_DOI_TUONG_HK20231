import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        int[] d = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            a.add(x);
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= n; i++) {
            while (!st.empty() && a.get(i) > a.get(st.peek())) {
                d[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while (!st.empty()) {
            d[st.peek()] = st.peek();
            st.pop();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
        long res = 0;
        for (int i = 1; i <= n; i++) {
//            System.out.println(i + " " + d[i]);
            if (i == n - 1 && d[i] == i) {
                res += 1;
            } else {
                res += (long) d[i] - (long)i;
            }
        }
        System.out.print(res);
    }
} 
