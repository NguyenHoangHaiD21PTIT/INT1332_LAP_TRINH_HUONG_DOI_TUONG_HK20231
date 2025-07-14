import java.util.*;
public class KT1_05_SO_CAC_SO_NGUYEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int dem3 = 0, dem5 = 0;
        for(char x: s.toCharArray()){
            if(x == '3') dem3++;
            else if (x == '5') dem5++;
        }
        int res = dem3 + dem5;
        if(res == 3|| res == 5) System.out.println("YES");
        else System.out.println("NO");
    }
}
