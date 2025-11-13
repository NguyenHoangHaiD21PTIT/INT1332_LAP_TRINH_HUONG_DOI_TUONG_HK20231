package KY_DONG_2025_12_11_CO_VAN_ANH;
import java.util.*;
interface ISach{
    double getGiaBan();
}
abstract class Sach implements ISach{
    protected String ma, ten, nhaXB;
    protected double gia, giaBan;
    private static int cnt = 0;
    public Sach() {   
    }
    protected String taoMa(String nhaXB){
        String []x = nhaXB.toUpperCase().trim().split("\\s+");
        String res = "";
        for(String y: x) res += y.charAt(0);
        cnt++;
        return String.format("%s%03d", res, cnt);
    }
    public String getTen(){
        return ten;
    }
    public void setTen (String ten){
        this.ten = ten;
    }
    public String getNhaXB() {
        return nhaXB;
    }
    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }
}
class SachGiaoKhoa extends Sach{
    private int lop;
    public SachGiaoKhoa (){
        super();
    }
    @Override
    public double getGiaBan(){
        double fin = this.gia;
        if (lop >= 1 && lop <= 5) fin = this.gia * 0.8;
        else if (lop >= 6 && lop <= 9) fin = this.gia * 0.9;
        this.giaBan = fin;
        return fin;
    }
    public void nhap(Scanner sc){
        this.ten = sc.nextLine();
        this.nhaXB = sc.nextLine();
        this.gia = Double.parseDouble(sc.nextLine());
        this.lop = Integer.parseInt(sc.nextLine());
        this.ma = taoMa(nhaXB);
        this.giaBan = getGiaBan();
    }
    public String toString(){
        return ma + " " + ten + " " + nhaXB + " " + lop + " " + Math.round(this.giaBan);
    }
}
public class KT2_A05_BAI_TOAN_QUAN_LY_SACH_GIAO_KHOA{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sach s = new SachGiaoKhoa();
        ((SachGiaoKhoa) s).nhap(in);
        System.out.println(s);
        ((SachGiaoKhoa) s).nhap(in);
        System.out.println(s);
    }
}
/*
tin hoc
giao duc
11000
4
ngu van
giao duc
19000
6
*/
