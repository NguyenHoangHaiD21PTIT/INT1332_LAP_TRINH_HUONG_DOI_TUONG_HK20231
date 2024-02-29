import java.util.*;
import java.io.*;
class Clothes{
    private String ten, ma, loai, stt;
    private long dongia, sl, giamgia, tong;
    public Clothes(String ten, String ma, long dongia, long sl){
        this.ten = ten;
        this.ma = ma;
        this.dongia = dongia;
        this.sl = sl;
        if(this.ma.endsWith("1")){
            this.giamgia = this.dongia * this.sl * 50 / 100;
            this.tong = this.dongia * this.sl * 50 / 100;
        } else {
            this.giamgia = this.dongia * this.sl * 30 / 100;
            this.tong = this.dongia * this.sl * 70 / 100;
        }
        this.stt = this.ma.substring(1, 4);
    }
    public String toString(){
        return this.ten + " " + this.ma + " " + this.stt + " " + this.giamgia + " " + this.tong;
    }
}
public class J05052_TRA_CUU_DON_HANG {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Clothes []a = new Clothes[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new Clothes(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        for(Clothes x: a) System.out.println(x);
    }
} 
