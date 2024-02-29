package CONTEST_1_LUYEN_TAP_LAP_TRINH_JAVA_CO_BAN;
import java.util.Scanner;
import java.util.TreeSet;
public class JP008_LIET_KE_TU_KHAC_NHAU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<String>t1 = new TreeSet<>();//Lưu tập từ khác nhau của Nhóm 1
        TreeSet<String>t2 = new TreeSet<>();//Lưu tập từ khác nhau của Nhóm 1
        while(n-- >0){
            String s = sc.nextLine();
            String []a = s.trim().split("\\s+");
            for(String x: a) t1.add(x.toLowerCase());
        }
        int m = sc.nextInt();
        sc.nextLine();
        while(m-- >0){
            String s = sc.nextLine();
            String []a = s.trim().split("\\s+");
            for(String x: a) t2.add(x.toLowerCase());
        }
        for(String x: t1){
            if(!t2.contains(x)) System.out.print(x + " ");
        }
        System.out.println();
        for(String x: t2){
            if(!t1.contains(x)) System.out.print(x + " ");
        }
    }
}
