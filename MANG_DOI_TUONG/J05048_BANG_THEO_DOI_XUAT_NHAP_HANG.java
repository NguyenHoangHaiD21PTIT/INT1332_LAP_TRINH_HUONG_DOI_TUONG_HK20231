import java.util.*;
import java.io.*;
class NongSan{
    private String id;
    private long slnhap, slxuat, dongia, tien, thue;
    public NongSan(String id, long slnhap){
        this.id = id;
        this.slnhap = slnhap;
        if(this.id.charAt(0)=='A'){
            this.slxuat = Math.round(this.slnhap * 6 / 10.0);
        } else {
            this.slxuat = Math.round(this.slnhap * 7 / 10.0);
        }
        if(this.id.charAt(4)=='Y'){
            this.dongia = 110000;
        } else {
            this.dongia = 135000;
        }
        this.tien = this.slxuat * this.dongia;
        if(this.id.charAt(0)=='A'&&this.id.charAt(4)=='Y'){
            this.thue = this.tien * 8/100;
        } else if (this.id.charAt(0)=='A'&&this.id.charAt(4)=='N'){
            this.thue = this.tien * 11/100;
        } else if (this.id.charAt(0)=='B'&&this.id.charAt(4)=='Y'){
            this.thue = this.tien * 17/100;
        } else {
            this.thue = this.tien * 22/100;
        }
    }
    public String toString(){
        return this.id + " " + this.slnhap + " " + this.slxuat + " " + this.dongia + " " + this.tien + " " + this.thue;
    }
}
public class J05048_BANG_THEO_DOI_XUAT_NHAP_HANG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NongSan []a = new NongSan[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new NongSan(sc.nextLine(), sc.nextLong());
        }
        for(NongSan x: a) System.out.println(x);
    }
} 
