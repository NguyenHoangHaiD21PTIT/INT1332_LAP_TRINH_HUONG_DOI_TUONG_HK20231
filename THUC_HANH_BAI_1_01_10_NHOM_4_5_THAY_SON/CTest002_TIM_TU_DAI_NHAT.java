package OnTap;
import java.util.*;
public class CTest002_TIM_TU_DAI_NHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = ""; int q = -1;
        while(sc.hasNext()){
            String s = sc.next();
            if(s.length()>q){
                q = s.length();
                ans = s;
            }
        }
        System.out.println(ans);
    }
}
