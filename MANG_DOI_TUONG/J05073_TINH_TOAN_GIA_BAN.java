import java.util.*;
import java.io.*;
class DienMay{
    private String id;
    private double sl, dongia, thue, tienChinh, vanchuyen, tongChiPhi, banra;
    public DienMay(String s){
        String []a = s.trim().split("\\s+");
        this.id = a[0];
        this.dongia = Double.parseDouble(a[1]);
        this.sl = Double.parseDouble(a[2]);
        this.tienChinh = this.sl * this.dongia;
        if(this.id.startsWith("T")){
            this.thue = this.tienChinh * 29.0/100.0;
            this.vanchuyen = this.tienChinh * 4.0/100.0;
        } else if(this.id.startsWith("C")){
            this.thue = this.tienChinh * 10.0/100.0;
            this.vanchuyen = this.tienChinh * 3.0/100.0;
        } else if(this.id.startsWith("D")){
            this.thue = this.tienChinh * 8.0/100.0;
            this.vanchuyen = this.tienChinh * 2.5/100.0;
        } else {
            this.thue = this.tienChinh * 2.0/100.0;
            this.vanchuyen = this.tienChinh * 0.5/100.0;
        }
        if(this.id.endsWith("C")) this.thue = this.thue - this.thue* 5.0/100.0;
        this.tongChiPhi = (this.tienChinh + this.thue + this.vanchuyen) * 120/100;
        this.banra = this.tongChiPhi /this.sl;
    }
    public String toString(){
        return this.id + " " + String.format("%.2f", this.banra);
    }
}
public class J05073_TINH_TOAN_GIA_BAN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        DienMay []a = new DienMay[n];
        for(int i = 0;i<n;i++){
            a[i] = new DienMay(sc.nextLine());
        }
        for(DienMay x: a) System.out.println(x);
    }
}
