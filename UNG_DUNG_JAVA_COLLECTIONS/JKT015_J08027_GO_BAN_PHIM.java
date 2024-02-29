package UNG_DUNG_JAVA_COLLECTIONS;
import java.util.*;
public class JKT015_J08027_GO_BAN_PHIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character>left = new Stack<>();
        Stack<Character>right = new Stack<>();
        for(char x: s.toCharArray()){
            if(x=='<'){
                if(!left.isEmpty()) right.push(left.pop());
            } else if (x == '>'){ 
                if(!right.isEmpty()) left.push(right.pop());
            } else if (x=='-') { 
                if(!left.isEmpty()) left.pop();
            } else { 
                left.push(x);
            }
        }
        while(!left.isEmpty()) right.push(left.pop());
        while(!right.isEmpty()) System.out.print(right.pop());
    }
}
