package KIEM_TRA_21_10_CA_13H_CO_VAN_ANH;
import java.util.*;
import java.io.*;
class ThiSinh implements Comparable<ThiSinh>{
    private String maThiSinh, ten, danToc, status;
    private double toan, ly, hoa, uuTien = 0, tongKUT, tong;
    private int giai;
    public ThiSinh(String maThiSinh, String ten, String danToc, double toan, double ly, double hoa, int giai) {
        this.maThiSinh = maThiSinh;
        this.ten = ten;
        this.danToc = danToc;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.giai = giai;
        
        if(this.maThiSinh.charAt(2) == '1') this.uuTien += 0;
        else if(this.maThiSinh.charAt(2)=='2') this.uuTien += 1;
        else this.uuTien += 2;

        if(this.giai == 0) this.uuTien += 0;
        else if(this.giai == 1) this.uuTien += 1.5;
        else if(this.giai == 2) this.uuTien += 1;
        else this.uuTien += 0.5;
            
        if(!this.danToc.equals("kinh")) this.uuTien +=1 ;
        this.tongKUT = this.toan + this.ly + this.hoa;
        this.tong = this.tongKUT + this.uuTien;
        
        if(this.tong >= 26.8) this.status = "TRUNG TUYEN";
        else this.status = "TRUOT";
    }
    public String toString(){
        String res = "";
        res += this.maThiSinh + " " + this.ten + " ";
        int x = (int)this.uuTien;
        if(this.uuTien != x) res += String.format("%.1f", this.uuTien) + " ";
        else res += String.format("%.0f", this.uuTien) + " ";
        
        int y = (int)this.tongKUT;
        if(this.tongKUT != y) res+=String.format("%.1f", this.tongKUT) + " ";
        else res += String.format("%.0f", this.tongKUT) + " ";
        res += this.status;
        return res;
    }
    public double getUuTien() {
        return uuTien;
    }
    public double getTong() {
        return tong;
    } 
    @Override
    public int compareTo(ThiSinh t) {
        if(this.tong!=t.tong){
            if(this.tong > t.tong) return -1;
            else return 1;
        } else {
            if(this.tongKUT > t.tongKUT) return -1;
            else return 1;
        }
    }
}
public class KT2_7_SAP_XEP_THI_SINH_THEO_TONG_DIEM {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ThiSinh []a = new ThiSinh[n];
        for(int i = 0;i<n;i++){
            sc.nextLine();
            a[i] = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextInt());
        }
        Arrays.sort(a);
        for(ThiSinh y: a) System.out.println(y);
    }
}
