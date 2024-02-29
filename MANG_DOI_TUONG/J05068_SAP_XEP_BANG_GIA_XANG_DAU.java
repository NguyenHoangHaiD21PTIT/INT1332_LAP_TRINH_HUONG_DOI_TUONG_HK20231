import java.util.*;
import java.io.*;
class XangDau{
    private String id, hangsx;
    private long sl, dongia, thue, thanhtien;
    public XangDau(String s){
        String []a = s.trim().split("\\s+");
        this.id = a[0];
        this.sl = Long.parseLong(a[1]);
        if(this.id.endsWith("BP")) this.hangsx = "British Petro";
        if(this.id.endsWith("ES")) this.hangsx = "Esso";
        if(this.id.endsWith("SH")) this.hangsx = "Shell";
        if(this.id.endsWith("CA")) this.hangsx = "Castrol";
        if(this.id.endsWith("MO")) this.hangsx = "Mobil";
        if(this.id.endsWith("TN")) this.hangsx = "Trong Nuoc";
        if(this.id.startsWith("X")){
            this.dongia = 128000;
            if(!this.id.endsWith("TN")) this.thue = Math.round(this.dongia * this.sl * 3.0/100);
        }
        if(this.id.startsWith("D")){
            this.dongia = 11200;
            if(!this.id.endsWith("TN")) this.thue = Math.round(this.dongia * this.sl * 3.5/100);
        }
        if(this.id.startsWith("N")){
            this.dongia = 9700;
            if(!this.id.endsWith("TN")) this.thue = Math.round(this.dongia * this.sl * 2.0/100);
        }
        this.thanhtien = this.dongia * this.sl + this.thue;
    }
    public long gettong(){
        return this.thanhtien;
    }
    public String toString(){
        return this.id + " " + this.hangsx + " " + this.dongia + " " + this.thue + " " + this.thanhtien;
    }
}
public class J05068_SAP_XEP_BANG_GIA_XANG_DAU {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        XangDau []a = new XangDau[n];
        for(int i = 0;i<n;i++) a[i] = new XangDau(sc.nextLine());
        Arrays.sort(a, new Comparator<XangDau>(){
            public int compare(XangDau a, XangDau b){
                if(a.gettong() > b.gettong()) return -1;
                else return 1;
            }
        });
        for(XangDau x: a) System.out.println(x);
    }
}
