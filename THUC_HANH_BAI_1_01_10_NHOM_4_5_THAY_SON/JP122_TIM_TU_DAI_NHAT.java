import java.util.*;
public class JP122_TIM_TU_DAI_NHAT {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String ans = ""; int q = -1;
        while(sc.hasNext()){
            String s = sc.next();
            if(s.length()>q){
                q = s.length();
                ans = s;
            }
        }
        System.out.println(ans + " - " + q);
    }
}
