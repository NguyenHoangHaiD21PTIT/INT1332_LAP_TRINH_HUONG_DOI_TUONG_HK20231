import java.util.*;
import java.io.*;
class Donhang{
    private String ten, loai, ma, stt;
    private long dongia, soluong, giamgia, tong;
    public Donhang(String ten, String ma, long dongia, long soluong){ 
        this.ten = ten;
        this.ma = ma;
        this.dongia = dongia;
        this.soluong = soluong;
        this.stt = this.ma.substring(1, 4);
        if(this.ma.endsWith("1")){ 
            this.giamgia = this.dongia * this.soluong * 50/100;
            this.tong = this.dongia * this.soluong * 50/100;
        } else { 
            this.giamgia = this.dongia * this.soluong * 30/100;
            this.tong = this.dongia * this.soluong * 70/100;
        }
    }
    public String toString(){ 
        return this.ten + " " + this.ma + " " + this.stt + " " + this.giamgia + " " + this.tong;
    }
}
public class JP099_TRA_CUU_DON_HANG{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Donhang []a = new Donhang[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new Donhang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        for(Donhang x: a) System.out.println(x);
    }
}
