import java.io.*;
import java.util.*;
class CaThi implements Comparable<CaThi> {
    private String id, ngaythi, giothi, room;
    private int ngay, thang, nam, gio, phut;
    public CaThi(int p, String ngaythi, String giothi, String room) {
        this.id = "C" + String.format("%03d", p);
        this.ngaythi = ngaythi;
        this.giothi = giothi;
        this.room = room;

        String[] d = ngaythi.split("/");
        this.ngay = Integer.parseInt(d[0]);
        this.thang = Integer.parseInt(d[1]);
        this.nam = Integer.parseInt(d[2]);

        String[] t = giothi.split(":");
        this.gio = Integer.parseInt(t[0]);
        this.phut = Integer.parseInt(t[1]);
    }
    @Override
    public int compareTo(CaThi other) {
        if (this.nam != other.nam) return this.nam - other.nam;
        if (this.thang != other.thang) return this.thang - other.thang;
        if (this.ngay != other.ngay) return this.ngay - other.ngay;
        if (this.gio != other.gio) return this.gio - other.gio;
        if (this.phut != other.phut) return this.phut - other.phut;
        return this.id.compareTo(other.id);
    }
    @Override
    public String toString() {
        return id + " " + ngaythi + " " + giothi + " " + room;
    }
}

public class J07059_DANH_SACH_CA_THI {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        CaThi[] a = new CaThi[n];
        for (int i = 0; i < n; i++) {
            String ngay = sc.nextLine();
            String gio = sc.nextLine();
            String room = sc.nextLine();
            a[i] = new CaThi(i + 1, ngay, gio, room);
        }
        Arrays.sort(a); 
        for (CaThi x : a) System.out.println(x);
    }
}
