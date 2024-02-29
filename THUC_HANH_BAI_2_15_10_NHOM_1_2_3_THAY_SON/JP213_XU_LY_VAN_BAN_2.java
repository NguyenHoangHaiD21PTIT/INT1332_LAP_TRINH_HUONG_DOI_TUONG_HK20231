package THUC_HANH_BAI_2_15_10_NHOM_1_2_3_THAY_SON;
import java.util.*;
import java.io.*;
public class JP213_XU_LY_VAN_BAN_2 {
    public static int check2(String s){
        String x = ".,!?:";
        for(char tmp: x.toCharArray()){
            if(s.contains(Character.toString(tmp))) return 0;
        }
        return 1;
    }
    public static int check1(String s){
        for(char x: s.toCharArray()){
            if(Character.isDigit(x)) return 1;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String>a = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check2(s)==1 && check1(s)==1) a.add(s);
        }
        for(String x: a) System.out.println(x);
    }
}

