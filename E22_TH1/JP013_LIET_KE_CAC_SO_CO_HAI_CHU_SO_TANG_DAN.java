package E22_TH1;
import java.util.*;
public class JP013_LIET_KE_CAC_SO_CO_HAI_CHU_SO_TANG_DAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()%2==1) s = s.substring(0, s.length() - 1);
        TreeSet<Integer>a = new TreeSet<>();
        for(int i = 0;i<s.length();i+=2){
            int x = s.charAt(i) - '0', y = s.charAt(i + 1) - '0';
            a.add(x * 10 + y);
        }
        for(int x: a) System.out.print(x + " ");
    }
}
