import java.util.*;
import java.io.*;
class CongNhan{
    private String mnv, ten, chucvu;
    private long luongcb, day, luongthang, thuong, phucap, thunhap;
    public CongNhan(int x, String ten, String luongcb, String day, String chucvu){
        this.mnv = "NV" + String.format("%02d", x);
        this.ten = ten;
        this.luongcb = Long.parseLong(luongcb);
        this.day = Long.parseLong(day);
        this.chucvu = chucvu;
        this.luongthang = this.luongcb * this.day;
        if(this.day>=25){
            this.thuong = this.luongthang * 20 / 100;
        } else if (this.day>=22&&this.day<=24){
            this.thuong = this.luongthang * 10 / 100;
        } else {
            this.thuong = 0;
        }
        if(this.chucvu.equals("GD")){
            this.phucap = 250000;
        } else if(this.chucvu.equals("PGD")){
            this.phucap = 200000;
        } else if(this.chucvu.equals("TP")){
            this.phucap = 180000;
        } else {
            this.phucap = 150000;
        }
        this.thunhap = this.luongthang + this.thuong + this.phucap;
    }
    public long gettn(){
        return this.thunhap;
    }
    public String toString(){
        return this.mnv + " " + this.ten + " " + this.luongthang + " " + this.thuong + " " + this.phucap + " " + this.thunhap;
    }
}
public class J03058_BANG_KE_TIEN_LUONG {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        CongNhan []a = new CongNhan[n];
        for(int i = 0;i<n;i++){
            a[i] = new CongNhan(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        long tong = 0;
        for(CongNhan x: a){
            System.out.println(x);
            tong+=x.gettn();
        }
        System.out.println("Tong chi phi tien luong: " + tong);
    }
} 
