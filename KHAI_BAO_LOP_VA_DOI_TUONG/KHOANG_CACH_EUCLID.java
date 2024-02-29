package KHAI_BAO_LOP_VA_DOI_TUONG;
import java.util.*;
import java.io.*;
public class KHOANG_CACH_EUCLID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s1 = sc.nextLine(), s2 = sc.nextLine();
            String []a = s1.trim().split("\\s+");
            String []b = s2.trim().split("\\s+");
            if(a.length!=b.length){
                System.out.println("INVALID");
                continue;
            }
            ArrayList<Integer>x = new ArrayList<>();
            for(String tmp: a) x.add(Integer.parseInt(tmp));
            ArrayList<Integer>y = new ArrayList<>();
            for(String tmp: b) y.add(Integer.parseInt(tmp));
            double res = 0.0;
            for(int i = 0;i<a.length;i++) res+=(x.get(i) - y.get(i)) * (x.get(i) - y.get(i));
            double ans = Math.sqrt(res);
            System.out.printf("%.5f", ans);
            System.out.println();
        }
    }
}
