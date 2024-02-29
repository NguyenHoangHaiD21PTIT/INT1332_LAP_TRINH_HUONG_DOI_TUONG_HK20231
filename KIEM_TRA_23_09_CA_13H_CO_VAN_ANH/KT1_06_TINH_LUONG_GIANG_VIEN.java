import java.util.*;
import java.io.*;
class Giangvien{
    private String maGv, ten, kk;
    private double hskk, soGio, hsluong, tongluong;
    public Giangvien(int x, String ten, double hsluong,String kk, double soGio) {
        this.maGv = String.format("PM%03d", x);
        this.ten = ten;
        this.hsluong = hsluong;
        this.kk = kk;
        if(this.kk.equals("A")) this.hskk = 1.5;
        if(this.kk.equals("B")) this.hskk = 1.2;  
        if(this.kk.equals("C")) this.hskk = 1.0;
        this.soGio = soGio;       
        this.tongluong = this.hsluong * this.hskk * 3000;
        if(this.soGio >= 0 && this.soGio <=100){
            this.tongluong = this.tongluong * 85.0/100.0;
        } else if(this.soGio >= 101 && this.soGio <=350){
            this.tongluong = this.tongluong * 90.0/100.0;
        } else if(this.soGio >= 351 && this.soGio <=499){
            this.tongluong = this.tongluong * 95.0/100.0;
        }
    }
    public String toString(){
        return this.maGv + " " + this.ten + " " + (this.hsluong + "") + " " + this.kk + " " + String.format("%.0f %.0f", this.soGio, this.tongluong);
    }
}
public class KT1_06_TINH_LUONG_GIANG_VIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Giangvien>a = new ArrayList<>();
        for(int i = 0; i<n;i++){
            a.add(new Giangvien(i + 1, sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        for(Giangvien x: a) System.out.println(x);
    }
}

