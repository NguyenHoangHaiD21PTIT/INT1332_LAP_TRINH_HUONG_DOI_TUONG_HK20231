package UNG_DUNG_JAVA_COLLECTIONS;
import java.util.*;
public class JKT014_DAU_TU_CHUNG_KHOAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int []a = new int[n]; int []l = new int [n];
            for(int i = 0;i<n;i++) a[i] = sc.nextInt();
            Stack<Integer>st = new Stack<>();
            for(int i = 0;i<n;i++){
                while(!st.empty()&&a[i] >= a[st.peek()]) st.pop();
                if(st.empty()) l[i] = i + 1;
                else l[i] = i - st.peek();
                st.push(i);
            }
            for(int i = 0;i<n;i++) System.out.print(l[i] + " ");
            System.out.println();
        }
    }
}
