import java.io.*;
import java.util.*;
class KhachHang implements Comparable<KhachHang> {
    private String ma, ten;
    private int chiSoDau, chiSoCuoi, soDien;
    private long tien;
    public KhachHang(int x, String ten, int chiSoDau, int chiSoCuoi) {
        this.ma = String.format("KH%02d", x);
        this.ten = chuanHoaTen(ten);
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
        this.soDien = chiSoCuoi - chiSoDau;
        this.tien = tinhTien();
    }
    public static String chuanhoa1(String s){
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    public static String chuanHoaTen(String s){
        String []tmp = s.trim().split("\\s+");
        String res = "";
        for(String x: tmp) res+=chuanhoa1(x) + " ";
        return res.trim();
    }
    private long tinhTien() {
        int[][] bac = {{50, 1500}, {100, 2000}, {150, 2700}};
        int sd = soDien;
        long tong = 0;
        for (int[] b : bac) {
            if (sd == 0) break;
            int sl = Math.min(sd, b[0]);
            tong += 1L * sl * b[1];
            sd -= sl;
        }
        if (sd > 0) tong += 1L * sd * 3500;
        return tong;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.tien, this.tien);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + chiSoDau + " " + chiSoCuoi + " " + tien;
    }
}
public class FTEST001_TINH_TIEN_DIEN {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<KhachHang> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = in.nextLine();
            String[] cs = in.nextLine().trim().split("\\s+");
            int dau = Integer.parseInt(cs[0]);
            int cuoi = Integer.parseInt(cs[1]);
            ds.add(new KhachHang(i + 1, ten, dau, cuoi));
        }
        Collections.sort(ds);
        for(KhachHang x: ds) System.out.println(x);
    }
}
/*
3
 nGuyEn Hong Ngat
200 230
  Chu thi    minh
120 250
Lai thu  thuy
200 600
*/
