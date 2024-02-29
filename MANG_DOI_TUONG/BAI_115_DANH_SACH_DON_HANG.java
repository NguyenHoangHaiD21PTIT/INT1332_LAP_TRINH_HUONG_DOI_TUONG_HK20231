package MANG_DOI_TUONG;
import java.util.*;
class MatHang implements Comparable<MatHang>{
    private String ma, ten, dvt;
    private long giaNhap, giaBan, loiNhuan;
    public MatHang(int x, String ten, String dvt, long giaNhap, long giaBan) {
        this.ma = "DH" + String.format("%03d", x);
        this.ten = ten;
        this.dvt = dvt;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.loiNhuan = this.giaBan - this.giaNhap;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.dvt + " " + this.giaNhap + " " + this.giaBan + " " + this.loiNhuan;
    }
    public int compareTo(MatHang t) {
        if(this.loiNhuan!=t.loiNhuan) return Long.compare(t.loiNhuan, this.loiNhuan);
        return this.ma.compareTo(t.ma);
    }
}
public class BAI_115_DANH_SACH_DON_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MatHang []a = new MatHang[n];
        for(int i = 0;i<n;i++) a[i] = new MatHang(i + 1, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
        Arrays.sort(a);
        for(MatHang x: a) System.out.println(x);
    }
}
