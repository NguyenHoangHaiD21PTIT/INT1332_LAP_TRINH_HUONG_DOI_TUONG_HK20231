package UNG_DUNG_JAVA_COLLECTIONS;
import java.util.*;
public class J08021_DAY_NGOAC_DUNG_DAI_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            int res = -1;
            Stack<Integer>st = new Stack<>();
            st.push(-1);
            String s = sc.nextLine();
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    st.push(i);
                } else { 
                    st.pop();
                    if(!st.empty()) res = Math.max (res, i - st.peek());
                    else st.push(i);
                }
            }
            System.out.println(res);
        }
    }
}
