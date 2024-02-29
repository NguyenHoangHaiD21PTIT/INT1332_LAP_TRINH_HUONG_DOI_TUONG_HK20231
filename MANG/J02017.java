import java.util.*;
import java.io.*;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer>st = new Stack<>();
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i<n;i++) a[i] = sc.nextInt();
        for(int i = 0;i<n;i++){
            if(st.empty()){
                st.push(a[i]);
            } else {
                if((a[i] + st.peek()) % 2 ==0) st.pop();
                else st.push(a[i]);
            }
        }
        System.out.println(st.size());
    }
}
