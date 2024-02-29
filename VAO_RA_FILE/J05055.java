package VAO_RA_FILE;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
class vdv {
    private String maVDV, hoTen, ngaySinh, batDau, ketThuc, thucTe, uuTien, thoiGian;
    private int xepHang;
    public vdv(String maVDV, String hoTen, String ngaySinh, String batDau, String ketThuc) {
        this.maVDV = maVDV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        uuTien();
        tinhTong();
    }
    public int tuoi() {
        String[] x = this.ngaySinh.split("/");
        return 2021 - Integer.parseInt(x[2]);
    }
    public int getXepHang() {
        return xepHang;
    }
    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }
    public String getMaVDV() {
        return maVDV;
    }
    public void uuTien() {
        int t = tuoi();
        String res = "";
        if (t > 32) {
            res = "00:00:03";
        } else if (t >= 25) {
            res = "00:00:02";
        } else if (t >= 18) {
            res = "00:00:01";
        } else {
            res = "00:00:00";
        }
        this.uuTien = res;
    }
    public void tinhTong() {
        LocalTime x = LocalTime.parse(this.batDau, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime y = LocalTime.parse(this.ketThuc, DateTimeFormatter.ofPattern("HH:mm:ss"));
        Duration res = Duration.between(x, y);
        LocalTime resTime = LocalTime.MIDNIGHT.plus(res);
        this.thucTe = resTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
    public String tinhThoiGian() {
        LocalTime y = LocalTime.parse(this.thucTe, DateTimeFormatter.ofPattern("HH:mm:ss"));
        String []x = this.uuTien.split(":");
        return y.minusHours(Long.parseLong(x[0])).minusMinutes(Long.parseLong(x[1])).minusSeconds(Long.parseLong(x[2])).toString();
    }
    public String toString() {
        return this.maVDV + " " + this.hoTen + " " + this.thucTe + " " + this.uuTien + " " + tinhThoiGian() + " " + this.xepHang;
    }
}
public class J05055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<vdv> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            vdv x = new vdv("VDV" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            v.add(x);
        }
        Collections.sort(v, new Comparator<vdv>() {
            @Override
            public int compare(vdv o1, vdv o2) {
                if (o1.tinhThoiGian().compareTo(o2.tinhThoiGian()) < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        v.get(0).setXepHang(1);
        for (int i = 1; i < t; i++) {
            if (v.get(i).tinhThoiGian().equals(v.get(i - 1).tinhThoiGian())) {
                v.get(i).setXepHang(v.get(i - 1).getXepHang());
            } else {
                v.get(i).setXepHang(i + 1);
            }
        }
        Collections.sort(v, new Comparator<vdv>() {
            @Override
            public int compare(vdv o1, vdv o2) {
                return o1.getMaVDV().compareTo(o2.getMaVDV());
            }
        });
        for (vdv x : v) {
            System.out.println(x);
        }
    }
}
/*
4
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Van Hung
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
*/