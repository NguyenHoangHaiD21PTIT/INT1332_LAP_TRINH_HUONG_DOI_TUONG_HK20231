import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Phong {
    private String type, ten;
    private double dgngay, phipv;

    public Phong(String type, String ten, double dgngay, double phipv) {
        this.type = type;
        this.ten = ten;
        this.dgngay = dgngay;
        this.phipv = phipv;
    }

    public String getType() {
        return type;
    }

    public double getPhipv() {
        return phipv;
    }

    public double getDgngay() {
        return dgngay;
    }
}

class Khach_Hang implements Comparable<Khach_Hang> {
    public static long chenhlech(String s1, String s2) {
        String[] a = s1.split("/");
        String[] b = s2.split("/");
        int nam1 = Integer.parseInt(a[2]), thang1 = Integer.parseInt(a[1]), ngay1 = Integer.parseInt(a[0]);
        int nam2 = Integer.parseInt(b[2]), thang2 = Integer.parseInt(b[1]), ngay2 = Integer.parseInt(b[0]);
        LocalDate d1 = LocalDate.of(nam1, thang1, ngay1);
        LocalDate d2 = LocalDate.of(nam2, thang2, ngay2);
        return ChronoUnit.DAYS.between(d1, d2);
    }

    private String maKH, tenKH, roomID, ngayDen, ngayDi;
    private long tongngay;
    private double dgngay, dgpv, tienphaitra, tienphucvu, payfinal;

    public Khach_Hang(int x, String tenKH, String roomID, String ngayDen, String ngayDi) {
        this.maKH = String.format("KH%02d", x);
        this.tenKH = tenKH;
        this.roomID = roomID;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.tongngay = chenhlech(this.ngayDen, this.ngayDi);
    }

    @Override
    public int compareTo(Khach_Hang t) {
        if (this.tongngay > t.tongngay) return -1;
        else return 1;
    }

    public void solve(double dgngay, double dgpv) {
        if(this.tongngay==0){
            this.tienphaitra = dgngay;
            this.tienphucvu = dgpv * dgngay;
        } else {
            this.tienphaitra = dgngay * this.tongngay;
            this.tienphucvu = dgpv * dgngay * this.tongngay;
        }
        this.payfinal = this.tienphaitra + this.tienphucvu;
        if (this.tongngay >= 10 && this.tongngay <= 19) {
            this.payfinal = this.payfinal * 98.0 / 100.0;
        } else if (this.tongngay >= 20 && this.tongngay <= 29) {
            this.payfinal = this.payfinal * 96.0 / 100.0;
        } else if (this.tongngay >= 30) {
            this.payfinal = this.payfinal * 94.0 / 100.0;
        } else {
            this.payfinal = this.payfinal * 100 / 100;
        }
    }

    public String getRoomID() {
        return roomID;
    }

    public String toString() {
        return this.maKH + " " + this.tenKH + " " + this.roomID + " " + this.tongngay + " " + String.format("%.2f", this.payfinal);
    }
}

public class J07047_QUAN_LY_KHACH_SAN {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt();
        Phong[] a = new Phong[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Phong(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
        }
        int m = sc.nextInt();
        Khach_Hang[] b = new Khach_Hang[m];
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            b[i] = new Khach_Hang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for (Khach_Hang x : b) {
            String s = Character.toString(x.getRoomID().charAt(2));
            for (Phong y : a) {
                if (y.getType().equals(s)) {
                    x.solve(y.getDgngay(), y.getPhipv());
                    break;
                }
            }
        }
        Arrays.sort(b);
        for (Khach_Hang x : b) System.out.println(x);
    }
}
