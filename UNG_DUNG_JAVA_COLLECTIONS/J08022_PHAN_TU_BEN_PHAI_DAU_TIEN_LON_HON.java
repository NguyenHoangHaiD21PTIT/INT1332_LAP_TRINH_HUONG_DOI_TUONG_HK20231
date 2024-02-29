package UNG_DUNG_JAVA_COLLECTIONS;
import java.util.*;
public class J08022_PHAN_TU_BEN_PHAI_DAU_TIEN_LON_HON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int []a = new int[n]; int []r = new int [n];
            for(int i = 0;i<n;i++) a[i] = sc.nextInt();
            Stack<Integer>st = new Stack<>();
            for(int i = n-1;i>=0;i--){
                while(!st.empty()&&a[i] >= st.peek()) st.pop();
                if(st.empty()) r[i] = -1;
                else r[i] = st.peek();
                st.push(a[i]);
            }
            for(int i = 0;i<n;i++) System.out.print(r[i] + " ");
            System.out.println();
        }
    }
}
