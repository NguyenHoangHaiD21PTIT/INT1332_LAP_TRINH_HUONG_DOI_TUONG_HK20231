package THI_CUOI_KY_D21_Demo;
import java.util.*;
class Phim implements Comparable<Phim> {
    private String MaPhim, TheLoai, NgayChieu, TenPhim;
    private int SoTap, ngay, thang, nam;
    public Phim(int x, String TheLoai, String NgayChieu, String TenPhim, int SoTap) {
        this.MaPhim = "P" + String.format("%03d", x);
        this.TheLoai = TheLoai;
        this.NgayChieu = NgayChieu;
        this.TenPhim = TenPhim;
        this.SoTap = SoTap;
        String[] parts = this.NgayChieu.split("/");
        this.ngay = Integer.parseInt(parts[0]);
        this.thang = Integer.parseInt(parts[1]);
        this.nam = Integer.parseInt(parts[2]);
    }
    @Override
    public int compareTo(Phim o) {
        if (this.nam != o.nam) return this.nam - o.nam;
        else if (this.thang != o.thang) return this.thang - o.thang;
        else if (this.ngay != o.ngay) return this.ngay - o.ngay;
        else if (!this.TenPhim.equals(o.TenPhim)) return this.TenPhim.compareTo(o.TenPhim);
        else return o.SoTap - this.SoTap; 
    }

    @Override
    public String toString() {
        return MaPhim + " " + TheLoai + " " + NgayChieu + " " + TenPhim + " " + SoTap;
    }
}

public class JP499_DANH_SACH_PHIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> d = new HashMap<>();
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            String s = "TL" + String.format("%03d", i + 1);
            String s1 = sc.nextLine().trim();
            d.put(s, s1);
        }
        ArrayList<Phim> a = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String TheLoai = sc.nextLine().trim();
            String NgayChieu = sc.nextLine().trim();
            String TenPhim = sc.nextLine().trim();
            int SoTap = Integer.parseInt(sc.nextLine().trim());
            Phim tmp = new Phim(i, d.get(TheLoai), NgayChieu, TenPhim, SoTap);
            a.add(tmp);
        }
        Collections.sort(a); // Sắp xếp danh sách a
        for (Phim phim : a) System.out.println(phim);
    }
}
