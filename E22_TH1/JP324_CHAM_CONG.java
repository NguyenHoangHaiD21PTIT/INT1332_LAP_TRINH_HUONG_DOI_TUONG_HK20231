import java.util.*;
class CongNhan implements Comparable<CongNhan>{
    private String ma, ten, vao, ra;
    private int tongTG, gio, phut;
    private String status;
    public CongNhan(String ma, String ten, String vao, String ra) {
        this.ma = ma;
        this.ten = ten;
        this.vao = vao;
        this.ra = ra;
        String[] raTime = ra.split(":");
        String[] vaoTime = vao.split(":");
        int raHours = Integer.parseInt(raTime[0]), raMinutes = Integer.parseInt(raTime[1]), vaoHours = Integer.parseInt(vaoTime[0]), vaoMinutes = Integer.parseInt(vaoTime[1]);
        this.tongTG = (raHours * 60 + raMinutes) - (vaoHours * 60 + vaoMinutes) - 60;
        this.gio = this.tongTG / 60;
        this.phut = this.tongTG % 60;
        this.status = (this.tongTG >= 480) ? "DU" : "THIEU";
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gio + " gio " + phut + " phut " + status;
    }
    @Override
    public int compareTo(CongNhan o) {
       return  o.tongTG - this.tongTG;
    }
}
public class JP324_CHAM_CONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<CongNhan> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine(), ten = sc.nextLine(), vao = sc.nextLine(), ra = sc.nextLine();
            a.add(new CongNhan(ma, ten, vao, ra));
        }
        Collections.sort(a);
        for (CongNhan cn : a) System.out.println(cn);
    }
}
