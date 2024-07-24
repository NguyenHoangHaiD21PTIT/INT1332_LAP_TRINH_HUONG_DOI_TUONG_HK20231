package KIEM_TRA_GIUA_KY_3;
import java.util.*;
class CongNhan implements Comparable<CongNhan> {
    private String ma, ten, vao, ra, status;
    private int tongTG, gio, phut;
    public CongNhan(String ma, String ten, String vao, String ra) {
        this.ma = ma;
        this.ten = ten;
        this.vao = vao;
        this.ra = ra;
        String[] raParts = ra.split(":");
        String[] vaoParts = vao.split(":");
        int raHour = Integer.parseInt(raParts[0]);
        int raMinute = Integer.parseInt(raParts[1]);
        int vaoHour = Integer.parseInt(vaoParts[0]);
        int vaoMinute = Integer.parseInt(vaoParts[1]);
        this.tongTG = (raHour * 60 + raMinute) - (vaoHour * 60 + vaoMinute) - 60;
        this.gio = this.tongTG / 60;
        this.phut = this.tongTG % 60;
        if (this.tongTG >= 480) this.status = "DU";
        else this.status = "THIEU";  
    }
    @Override
    public int compareTo(CongNhan o) {
        return Integer.compare(o.tongTG, this.tongTG); // Sắp xếp giảm dần theo tổng thời gian
    }
    @Override
    public String toString() {
        return String.format("%s %s %d gio %d phut %s", ma, ten, gio, phut, status);
    }
}

public class PYHA008_Cham_cong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<CongNhan> danhSach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();
            danhSach.add(new CongNhan(ma, ten, vao, ra));
        }
        Collections.sort(danhSach); 
        for (CongNhan cn : danhSach) System.out.println(cn);
    }
}
