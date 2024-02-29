import java.util.*;
class MatHang {
    protected String id, ten, loai;
    protected double laisuat;
    public MatHang(String id, String ten, String loai) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        if (this.loai.equals("A")) this.laisuat = 8.0 / 100.0;
        if (this.loai.equals("B")) this.laisuat = 5.0 / 100.0;
        if (this.loai.equals("C")) this.laisuat = 2.0 / 100.0;
    }
}
class DonHang extends MatHang {
    private long slNhap, donGiaNhap, slXuat, tongNhap, tongXuat;
    public DonHang(String id, String ten, String loai, long slNhap, long donGiaNhap, long slXuat) {
        super(id, ten, loai);
        this.slNhap = slNhap;
        this.donGiaNhap = donGiaNhap;
        this.slXuat = slXuat;
        this.tongNhap = this.slNhap * this.donGiaNhap;
        this.tongXuat = Math.round(this.slXuat * this.donGiaNhap * (1 + this.laisuat));
    }
    @Override
    public String toString() {
        return this.id + " " + this.ten + " " + this.tongNhap + " " + this.tongXuat;
    }
}
public class J05076_NHAP_XUAT_HANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = sc.nextInt();
        ArrayList<DonHang> b = new ArrayList<>();
        //Solve đơn hàng
        for (int i = 0; i < m; i++) {
            sc.nextLine();
            String id = sc.next();
            long slNhap = sc.nextLong(), donGiaNhap = sc.nextLong(), slXuat = sc.nextLong();
            for (MatHang matHang : a) {
                if (matHang.id.equals(id)) {
                    b.add(new DonHang(id, matHang.ten, matHang.loai, slNhap, donGiaNhap, slXuat));
                    break;
                }
            }
        }
        for (DonHang donHang : b) System.out.println(donHang);
    }
}







