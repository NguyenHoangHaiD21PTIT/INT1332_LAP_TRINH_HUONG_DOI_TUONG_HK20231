package THUC_HANH_BAI_2_15_10_NHOM_1_2_3_THAY_SON;
import java.util.*;
import java.io.*;
public class JP219_LOG_THOI_GIAN_TLE{
    public static boolean check(String s){
        if(s.trim().length()!=8) return false;
        if(s.charAt(2)!=':'&& s.charAt(5)!=':') return false;
        String []a = s.trim().split(":");
        int a0 = Integer.parseInt(a[0]), a1 = Integer.parseInt(a[1]), a2 = Integer.parseInt(a[2]);
        if(a0>=0&&a0<=23&&a1>=0&&a1<=59&&a2>=0&&a2<=59) return true;
        else return false;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNext()){
            String tmp = sc.next();
            s+=tmp+" ";
        }
        s = s.replace(".", " ");
        s = s.replace(",", " ");
        TreeSet<String>ts = new TreeSet<>();//lưu các xâu thời gian thỏa mãn
        String []a = s.trim().split("\\s+");
        for(String x: a){
            if(check(x)) ts.add(x);
        }
        for(String x: ts) System.out.println(x);
    }
} 