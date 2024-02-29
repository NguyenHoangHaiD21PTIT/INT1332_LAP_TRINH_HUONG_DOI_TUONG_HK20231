import java.util.*;
import java.io.*;
public class KT1_14_TAP_TU_CHUNG_CUA_HAI_XAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            TreeSet<String>st1 = new TreeSet<>();
            TreeSet<String>st2 = new TreeSet<>();
            String s1 = sc.nextLine(), s2 = sc.nextLine();
            String []a = s1.trim().split("\\s+");
            String []b = s2.trim().split("\\s+");
            for(String x: a) st1.add(x);
            for(String x: b) st2.add(x);
            int check = 0;
            for(String x: st1){
                if(st2.contains(x)){
                    check = 1;
                    System.out.print(x + " ");
                }
            }
            if(check ==0) System.out.print("NO");
            System.out.println();
        }
    }
}
