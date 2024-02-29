import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class MatHang1{
    private String maMH, tenMH;
    private long giaBan, tgBaoHanh;
    public MatHang1(String maMH, String tenMH, long giaBan, long tgBaoHanh) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.giaBan = giaBan;
        this.tgBaoHanh = tgBaoHanh;
    }
    public String getMaMH() {
        return maMH;
    }
    public long getBaoHanh() {
        return this.tgBaoHanh;
    }
    public long getGiaBan() {
        return giaBan;
    }   
}
class KhachHang1 implements Comparable<KhachHang1>{
    public static String res(String s, long t){ //Hàm tính sau t tháng thì ngày s là ngày gì
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(s, dateFormat);
        LocalDate newLocalDate = localDate.plusMonths(t);
        String outputDate = newLocalDate.format(dateFormat);
        return outputDate;
    }
    private String maKH, tenKH, diaChi, maMH, ngayMua, ngayHetHan;
    private long slMua, thanhTien;
    public KhachHang1(int x, String tenKH, String diaChi, String maMH, long slMua, String ngayMua) {
        this.maKH = String.format("KH%02d", x);
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.maMH = maMH;
        this.slMua = slMua;
        this.ngayMua = ngayMua;
    }
    public void solve(String maMH, long giaBan, long tgBaoHanh){//Tính toán ngày hết hạn và tổng tiền
        this.thanhTien = this.slMua * giaBan;
        this.ngayHetHan = res(this.ngayMua, tgBaoHanh);
    }
    public String toString(){
        return this.maKH + " " + this.tenKH + " " + this.diaChi + " " + this.maMH +" " + this.thanhTien + " " + this.ngayHetHan;
    }
    @Override
    public int compareTo(KhachHang1 t) {
        String a = this.ngayHetHan.trim(), b = t.ngayHetHan.trim();
        String []c = a.split("/");String []d = b.split("/");
        int c0 = Integer.parseInt(c[0]), c1 = Integer.parseInt(c[1]), c2 = Integer.parseInt(c[2]);
        int d0 = Integer.parseInt(d[0]), d1 = Integer.parseInt(d[1]), d2 = Integer.parseInt(d[2]);
        if(c2!=d2) return c2 - d2;
        else if (c1!=d1) return c1 - d1;
        else if (c0!=d0) return c0 - d0;
        else return (this.maKH.compareTo(t.maKH));
    }
    public String getMaMH() {
        return maMH;
    } 
}
public class J07049_TINH_NGAY_HET_HAN_BAO_HANH {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner (new File("MUAHANG.in"));
        int m = sc.nextInt();
        MatHang1 []a = new MatHang1[m];
        for(int i = 0;i<m;i++){
            sc.nextLine();
            a[i] = new MatHang1(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
        }
        int n = sc.nextInt();
        sc.nextLine();
        KhachHang1 []b = new KhachHang1[n];
        for(int i = 0;i<n;i++) b[i] = new KhachHang1(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), sc.nextLine());
        for(KhachHang1 x: b){
            for(MatHang1 y: a){
                if(x.getMaMH().equals(y.getMaMH())){
                    x.solve(y.getMaMH(), y.getGiaBan(), y.getBaoHanh());
                    break;
                }
            }
        }
        Arrays.sort(b);
        for(KhachHang1 x: b) System.out.println(x);
    }
}
