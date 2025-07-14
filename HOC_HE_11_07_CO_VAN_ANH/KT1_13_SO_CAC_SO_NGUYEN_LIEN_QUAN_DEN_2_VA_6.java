import java.util.*;
public class KT1_13_SO_CAC_SO_NGUYEN_LIEN_QUAN_DEN_2_VA_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int dem2 = 0, dem6 = 0;
        for(char x: s.toCharArray()){
            if(x == '2') dem2++;
            else if (x == '6') dem6++;
        }
        int res = dem2 + dem6;
        if(res == 2|| res == 6) System.out.println("YES");
        else System.out.println("NO");
    }
}
