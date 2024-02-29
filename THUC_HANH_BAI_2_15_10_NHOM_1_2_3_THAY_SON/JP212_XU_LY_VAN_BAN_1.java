package THUC_HANH_BAI_2_15_10_NHOM_1_2_3_THAY_SON;
import java.util.*;
import java.io.*;
public class JP212_XU_LY_VAN_BAN_1 {
    public static int check(String s){
        for(char x: s.toCharArray()){
            if(Character.isDigit(x)) return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String>a = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)==1) a.add(s);
        }
        for(String x: a) System.out.println(x);
    }
}
