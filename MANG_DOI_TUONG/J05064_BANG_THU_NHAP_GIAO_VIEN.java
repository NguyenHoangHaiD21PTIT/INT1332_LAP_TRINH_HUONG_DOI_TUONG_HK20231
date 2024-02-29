import java.util.*;
import java.io.*;
class GiaoVien{
    private String ma, hoten;
    private long luongcb;
    private String chucvu;
    private long heso, phucap, thunhap;
    public GiaoVien(String ma, String hoten, long luongcb){
        this.ma = ma;
        this.hoten = hoten;
        this.luongcb = luongcb;
        this.chucvu = this.ma.substring(0, 2);
        this.heso = Long.parseLong(this.ma.substring(2));
        if (this.chucvu.equals("HT")){
            this.phucap = 2000000;
        } else if (this.chucvu.equals("HP")){
            this.phucap = 900000;
        } else {
            this.phucap = 500000;
        }
        this.thunhap = this.luongcb * this.heso + this.phucap;
    }
    @Override
    public String toString(){
        return this.ma + " " + this.hoten + " " + this.heso + " " + this.phucap + " " + this.thunhap;
    }
    public String getchuc(){
        return this.chucvu;
    }
}
public class J05064_BANG_THU_NHAP_GIAO_VIEN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GiaoVien []a = new GiaoVien[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        }
        LinkedHashMap<String, Integer>mp = new LinkedHashMap<>();
        for(GiaoVien x: a){
            String s = x.getchuc();
            if(mp.containsKey(s)) mp.put(s, mp.get(s) + 1);
            else mp.put(s, 1);
            if((s.equals("HT") && mp.get(s)<2) || (s.equals("HP") && mp.get(s)<3)|| s.equals("GV")) System.out.println(x);
        }
    }
} 