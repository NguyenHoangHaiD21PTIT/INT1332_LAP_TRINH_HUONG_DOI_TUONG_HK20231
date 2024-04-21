import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] l = new int[n];
            int[] r = new int[n];
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Stack<Integer> st = new Stack<>();

            // Compute r[]
            for (int i = n - 1; i >= 0; i--) {
                while (!st.empty() && a[i] <= a[st.peek()]) st.pop();
                if (st.empty()) r[i] = n - 1;
                else r[i] = st.peek() - 1;
                st.push(i);
            }
            
            // Clear the stack
            st.clear();

            // Compute l[] using the same stack
            for (int i = 0; i < n; i++) {
                while (!st.empty() && a[i] <= a[st.peek()]) st.pop();
                if (st.empty()) l[i] = 0;
                else l[i] = st.peek() + 1;
                st.push(i);
            }

            long res = -1;
            for (int i = 0; i < n; i++) {
                res = Math.max(res, (long) (r[i] - l[i] + 1) * a[i]);
            }
            System.out.println(res);
        }
    }
}
