import java.util.*;
import java.io.*;
class NguoiDung{
    private String loaisd, id;
    private long cu, moi, heso, thanhtien, phutroi, tong;
    public NguoiDung(int x, String loaisd, long cu, long moi){
        this.id = "KH" + String.format("%02d", x);
        this.loaisd = loaisd;
        this.cu = cu;
        this.moi = moi;
        if(this.loaisd.equals("KD")){
            this.heso = 3;
        } else if (this.loaisd.equals("NN")){
            this.heso = 5; 
        } else if (this.loaisd.equals("TT")){
            this.heso = 4 ; 
        } else {
            this.heso = 2;
        }
        this.thanhtien = (this.moi - this.cu) * this.heso * 550;
        long p = this.moi - this.cu;
        if(p < 50){
            this.phutroi = 0;
        } else if (p>=50 && p<=100){
            this.phutroi = Math.round(this.thanhtien * 35.0/100);
        } else{
            this.phutroi = this.thanhtien;
        }
        this.tong = this.phutroi + this.thanhtien;
    }
    public long gettong(){
        return this.tong;
    }
    public String toString(){
        return this.id + " " + this.heso + " " + this.thanhtien + " " + this.phutroi + " " + this.tong;
    }
}
public class J05051_SAP_XEP_BANG_TINH_TIEN_DIEN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NguoiDung []a = new NguoiDung[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new NguoiDung(i + 1, sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(a, new Comparator<NguoiDung>(){
            public int compare(NguoiDung a, NguoiDung b){
                if(a.gettong() > b.gettong()) return -1;
                else return 1;
            }
        });
        for(NguoiDung x: a) System.out.println(x);
    }
}
