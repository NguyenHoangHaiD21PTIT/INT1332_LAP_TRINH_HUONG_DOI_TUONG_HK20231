package VAO_RA_FILE;
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

class khachHang {
    private String maKH, hoTen, maPhong, ngayDen, ngayDi;
    private double tongTien;
    public khachHang(String maKH, String hoTen, String maPhong, String ngayDen, String ngayDi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }
    public long soNgay() {
        LocalDate batDau = LocalDate.parse(ngayDen, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate ketThuc = LocalDate.parse(ngayDi, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        long res = ChronoUnit.DAYS.between(batDau, ketThuc);
        return res;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String ma() {
        return "" + this.maPhong.charAt(2);
    }

    public String toString() {
        return this.maKH + " " + this.hoTen + " " + this.maPhong + " " + this.soNgay() + " " + String.format("%.2f", this.tongTien);
    }
}
public class J07047 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Admin\\OneDrive\\Desktop\\JAVA\\src\\VAO_RA_FILE\\DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Double> dg = new HashMap<>();
        HashMap<String, Double> ppv = new HashMap<>();
        while (t-- > 0) {
            String[] x = (sc.nextLine()).split("\\s+");
            dg.put(x[0], Double.parseDouble(x[2]));
            ppv.put(x[0], Double.parseDouble(x[3]));
        }
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<khachHang> kh = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            khachHang x = new khachHang("KH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.add(x);
        }
        for (khachHang x : kh) {
            double res = dg.get(x.ma()) * x.soNgay() * ppv.get(x.ma());
            double ans = dg.get(x.ma()) * x.soNgay();
            double kq = 0.0; 
            if (x.soNgay() >= 30) {
                kq = (res + ans) * 94.0 / 100.0;
            } else if (x.soNgay() >= 20) {
                kq = (res + ans) * 96.0 / 100.0;
            } else if (x.soNgay() >= 10) {
                kq = (res + ans) * 98.0 / 100.0;
            }else {
                if(x.soNgay()==0){ 
                    res = dg.get(x.ma()) * 1 * ppv.get(x.ma());
                    ans = dg.get(x.ma()) * 1;
                }
                kq = (res + ans) * 100 / 100.0;
            }
            x.setTongTien(kq);
        }
        Collections.sort(kh, new Comparator<khachHang>() {
            @Override
            public int compare(khachHang o1, khachHang o2) {
                if (o1.soNgay() < o2.soNgay()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (khachHang x : kh) {
            System.out.println(x);
        }
    }
}