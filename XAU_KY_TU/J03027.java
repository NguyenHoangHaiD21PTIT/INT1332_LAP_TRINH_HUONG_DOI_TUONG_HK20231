import java.util.*;
import java.io.*;
public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character>st = new Stack<>();
        for(int i = s.length() - 1;i>=0;i--){
            if(st.empty()){
                st.push(s.charAt(i));
            } else {
                if(st.peek()==s.charAt(i)) st.pop();
                else st.push(s.charAt(i));
            }
        }
        if(st.isEmpty()) System.out.println("Empty String");
        else {
            while(!st.empty()) System.out.print(st.pop());
        }
    }
}
